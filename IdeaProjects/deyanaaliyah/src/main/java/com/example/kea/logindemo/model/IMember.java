package com.example.kea.logindemo.model;

import java.util.List;

public interface IMember {
    boolean create(Member memberToBeAdded);

    Member read(String email);

    List<Member> readAll();
}
