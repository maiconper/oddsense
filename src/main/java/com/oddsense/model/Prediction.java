package com.oddsense.model;

import jakarta.persistence.*;

@Entity
public class Prediction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "game_id", referencedColumnName = "id")
    private Game game;

    private String mainPrediction;
    private String secondaryPrediction;
    private String justification;

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
     * @return String return the mainPrediction
     */
    public String getMainPrediction() {
        return mainPrediction;
    }

    /**
     * @param mainPrediction the mainPrediction to set
     */
    public void setMainPrediction(String mainPrediction) {
        this.mainPrediction = mainPrediction;
    }

    /**
     * @return String return the secondaryPrediction
     */
    public String getSecondaryPrediction() {
        return secondaryPrediction;
    }

    /**
     * @param secondaryPrediction the secondaryPrediction to set
     */
    public void setSecondaryPrediction(String secondaryPrediction) {
        this.secondaryPrediction = secondaryPrediction;
    }

    /**
     * @return String return the justification
     */
    public String getJustification() {
        return justification;
    }

    /**
     * @param justification the justification to set
     */
    public void setJustification(String justification) {
        this.justification = justification;
    }

}
