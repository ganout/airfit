package com.airbus.airfit.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "session")
public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String date;
    @Column(name = "start_time")
    private String startTime;
    @Column(name = "end_time")
    private String endTime;

    @ManyToMany
    @JoinTable(name = "participants",
            joinColumns = @JoinColumn(name = "session_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))
    private List<User> participants;

    @ManyToOne
    @JoinColumn(name = "coach_id")
    private Coach coach;

    @ManyToOne
    @JoinColumn(name = "sports_hall_id")
    private SportsHall sportsHall;

    public Session() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public List<User> getParticipants() {
        return participants;
    }

    public void setParticipants(List<User> participants) {
        this.participants = participants;
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public SportsHall getSportsHall() {
        return sportsHall;
    }

    public void setSportsHall(SportsHall sportsHall) {
        this.sportsHall = sportsHall;
    }
}
