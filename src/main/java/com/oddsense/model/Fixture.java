package com.oddsense.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "fixtures")
public class Fixture {
    @Id
    private Long id;
    private String referee;
    private String timezone;
    private LocalDateTime date;
    private Long timestamp;

    @ManyToOne
    @JoinColumn(name = "venue_id")
    private Venue venue;

    @ManyToOne
    @JoinColumn(name = "league_id")
    private League league;

    @ManyToOne
    @JoinColumn(name = "home_team_id")
    private Team homeTeam;

    @ManyToOne
    @JoinColumn(name = "away_team_id")
    private Team awayTeam;

    private String statusLong;
    private String statusShort;
    private Integer elapsed;
    private String extra;

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
     * @return String return the referee
     */
    public String getReferee() {
        return referee;
    }

    /**
     * @param referee the referee to set
     */
    public void setReferee(String referee) {
        this.referee = referee;
    }

    /**
     * @return String return the timezone
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     * @param timezone the timezone to set
     */
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * @return LocalDateTime return the date
     */
    public LocalDateTime getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    /**
     * @return Long return the timestamp
     */
    public Long getTimestamp() {
        return timestamp;
    }

    /**
     * @param timestamp the timestamp to set
     */
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * @return Venue return the venue
     */
    public Venue getVenue() {
        return venue;
    }

    /**
     * @param venue the venue to set
     */
    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    /**
     * @return League return the league
     */
    public League getLeague() {
        return league;
    }

    /**
     * @param league the league to set
     */
    public void setLeague(League league) {
        this.league = league;
    }

    /**
     * @return Team return the homeTeam
     */
    public Team getHomeTeam() {
        return homeTeam;
    }

    /**
     * @param homeTeam the homeTeam to set
     */
    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    /**
     * @return Team return the awayTeam
     */
    public Team getAwayTeam() {
        return awayTeam;
    }

    /**
     * @param awayTeam the awayTeam to set
     */
    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    /**
     * @return String return the statusLong
     */
    public String getStatusLong() {
        return statusLong;
    }

    /**
     * @param statusLong the statusLong to set
     */
    public void setStatusLong(String statusLong) {
        this.statusLong = statusLong;
    }

    /**
     * @return String return the statusShort
     */
    public String getStatusShort() {
        return statusShort;
    }

    /**
     * @param statusShort the statusShort to set
     */
    public void setStatusShort(String statusShort) {
        this.statusShort = statusShort;
    }

    /**
     * @return Integer return the elapsed
     */
    public Integer getElapsed() {
        return elapsed;
    }

    /**
     * @param elapsed the elapsed to set
     */
    public void setElapsed(Integer elapsed) {
        this.elapsed = elapsed;
    }

    /**
     * @return String return the extra
     */
    public String getExtra() {
        return extra;
    }

    /**
     * @param extra the extra to set
     */
    public void setExtra(String extra) {
        this.extra = extra;
    }

}
