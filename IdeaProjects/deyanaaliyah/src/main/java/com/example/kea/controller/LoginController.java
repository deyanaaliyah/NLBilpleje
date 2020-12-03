package com.example.kea.controller;

import com.example.kea.logindemo.model.IMember;
import com.example.kea.logindemo.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @Autowired
    IMember memberRepository;

    @GetMapping("/logindemo")
    public String loginIndex(HttpSession session) {
        if (session.getAttribute("isLoggedIn") != null) {
            return "/login/logged-in";
        }

        return "login/index";
    }

    @PostMapping("/logindemo")
    public String login(@ModelAttribute Member member, Model model, HttpSession session) {
        //check credentials is from the arraylist
        Member memberEmailToLogIn = memberRepository.read(member.getEmail());

        if (memberEmailToLogIn != null) {
            session.setAttribute("isLoggedIn", "yes");
            model.addAttribute("members", memberRepository.readAll());

            return "/login/logged-in";
        }
        return "/login/index";
    }

    @GetMapping("/logindemo/logout")
    public String logOutSession(HttpSession session) {
        session.removeAttribute("isLoggedIn");

        if (session.getAttribute("isLoggedIn") != null) {
            return "/login/logged-in";
        }

        return "login/index";
    }
}
