package com.airbus.airfit.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "coach")
public class Coach {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String lastname;
    private String firstname;

    @OneToMany(mappedBy = "coach")
    private List<Session> sessionList;

    public Coach() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String name) {
        this.lastname = name;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public List<Session> getSessionList() {
        return sessionList;
    }

    public void setSessionList(List<Session> sessionList) {
        this.sessionList = sessionList;
    }
}
