package com.oddsense.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String teamHome;
    private String teamAway;
    private LocalDateTime dateTime;
    private String location;
    private String competition;
    private String status;

    // Getters e Setters

    

    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return String return the teamHome
     */
    public String getTeamHome() {
        return teamHome;
    }

    /**
     * @param teamHome the teamHome to set
     */
    public void setTeamHome(String teamHome) {
        this.teamHome = teamHome;
    }

    /**
     * @return String return the teamAway
     */
    public String getTeamAway() {
        return teamAway;
    }

    /**
     * @param teamAway the teamAway to set
     */
    public void setTeamAway(String teamAway) {
        this.teamAway = teamAway;
    }

    /**
     * @return LocalDateTime return the dateTime
     */
    public LocalDateTime getDateTime() {
        return dateTime;
    }

    /**
     * @param dateTime the dateTime to set
     */
    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    /**
     * @return String return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return String return the competition
     */
    public String getCompetition() {
        return competition;
    }

    /**
     * @param competition the competition to set
     */
    public void setCompetition(String competition) {
        this.competition = competition;
    }

    /**
     * @return String return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

}
