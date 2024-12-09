package com.oddsense.model;

import jakarta.persistence.*;

@Entity
public class GameStats {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "game_id", referencedColumnName = "id")
    private Game game;

    private Integer homeGoals;
    private Integer awayGoals;
    private Integer homeLast5;
    private Integer awayLast5;
    private String absences;
    private String comments;

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
     * @return Game return the game
     */
    public Game getGame() {
        return game;
    }

    /**
     * @param game the game to set
     */
    public void setGame(Game game) {
        this.game = game;
    }

    /**
     * @return Integer return the homeGoals
     */
    public Integer getHomeGoals() {
        return homeGoals;
    }

    /**
     * @param homeGoals the homeGoals to set
     */
    public void setHomeGoals(Integer homeGoals) {
        this.homeGoals = homeGoals;
    }

    /**
     * @return Integer return the awayGoals
     */
    public Integer getAwayGoals() {
        return awayGoals;
    }

    /**
     * @param awayGoals the awayGoals to set
     */
    public void setAwayGoals(Integer awayGoals) {
        this.awayGoals = awayGoals;
    }

    /**
     * @return Integer return the homeLast5
     */
    public Integer getHomeLast5() {
        return homeLast5;
    }

    /**
     * @param homeLast5 the homeLast5 to set
     */
    public void setHomeLast5(Integer homeLast5) {
        this.homeLast5 = homeLast5;
    }

    /**
     * @return Integer return the awayLast5
     */
    public Integer getAwayLast5() {
        return awayLast5;
    }

    /**
     * @param awayLast5 the awayLast5 to set
     */
    public void setAwayLast5(Integer awayLast5) {
        this.awayLast5 = awayLast5;
    }

    /**
     * @return String return the absences
     */
    public String getAbsences() {
        return absences;
    }

    /**
     * @param absences the absences to set
     */
    public void setAbsences(String absences) {
        this.absences = absences;
    }

    /**
     * @return String return the comments
     */
    public String getComments() {
        return comments;
    }

    /**
     * @param comments the comments to set
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

}
