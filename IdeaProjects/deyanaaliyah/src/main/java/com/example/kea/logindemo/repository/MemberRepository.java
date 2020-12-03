package com.example.kea.logindemo.repository;

import com.example.kea.logindemo.model.IMember;
import com.example.kea.logindemo.model.Member;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

// for login demo
@Repository
public class MemberRepository implements IMember {
    List<Member> members;


    public MemberRepository() {
        this.members = new ArrayList<>();
        this.members.add(new Member("Laurel Doe", "LaurelDoe@mail.com", "1SecurePassword"));
        this.members.add(new Member("Yanny Yates", "YannyYates@mail.com", "2SecurePassword"));
        this.members.add(new Member("Oliver Bram", "OliverBram@mail.com", "3SecurePassword"));
        this.members.add(new Member("Fake Person", "fake@mail.com", "4SecurePassword"));
    }

    @Override
    public boolean create(Member memberToBeAdded) {
        return false;
    }

    @Override
    public Member read(String email) {
        for (Member memberToReturn : members) {
            if (memberToReturn.getEmail().equals(email)) {
                return memberToReturn;
            }
        }
        return null;
    }

    @Override
    public List<Member> readAll() {
        return this.members;
    }
}
