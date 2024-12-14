package com.oddsense.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "leagues")
public class League {
    @Id
    private Long id;
    private String name;
    private String country;
    private String logo;
    private String flag;
    private Integer season;
    private String round;

    // Getters and Setters

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
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return String return the logo
     */
    public String getLogo() {
        return logo;
    }

    /**
     * @param logo the logo to set
     */
    public void setLogo(String logo) {
        this.logo = logo;
    }

    /**
     * @return String return the flag
     */
    public String getFlag() {
        return flag;
    }

    /**
     * @param flag the flag to set
     */
    public void setFlag(String flag) {
        this.flag = flag;
    }

    /**
     * @return Integer return the season
     */
    public Integer getSeason() {
        return season;
    }

    /**
     * @param season the season to set
     */
    public void setSeason(Integer season) {
        this.season = season;
    }

    /**
     * @return String return the round
     */
    public String getRound() {
        return round;
    }

    /**
     * @param round the round to set
     */
    public void setRound(String round) {
        this.round = round;
    }

}
