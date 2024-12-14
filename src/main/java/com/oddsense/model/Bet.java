package com.oddsense.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "bets")
public class Bet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fixture_id", nullable = false)
    private Long fixtureId;

    @Column(name = "house_name", nullable = false, length = 100)
    private String houseName;

    @Column(name = "home_odd", nullable = false, precision = 5, scale = 2)
    private BigDecimal homeOdd;

    @Column(name = "draw_odd", nullable = false, precision = 5, scale = 2)
    private BigDecimal drawOdd;

    @Column(name = "away_odd", nullable = false, precision = 5, scale = 2)
    private BigDecimal awayOdd;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    @Column(name = "updated_at")
    private LocalDateTime updatedAt = LocalDateTime.now();

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFixtureId() {
        return fixtureId;
    }

    public void setFixtureId(Long fixtureId) {
        this.fixtureId = fixtureId;
    }

    /**
     * @return String return the houseName
     */
    public String getHouseName() {
        return houseName;
    }

    /**
     * @param houseName the houseName to set
     */
    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    /**
     * @return BigDecimal return the homeOdd
     */
    public BigDecimal getHomeOdd() {
        return homeOdd;
    }

    /**
     * @param homeOdd the homeOdd to set
     */
    public void setHomeOdd(BigDecimal homeOdd) {
        this.homeOdd = homeOdd;
    }

    /**
     * @return BigDecimal return the drawOdd
     */
    public BigDecimal getDrawOdd() {
        return drawOdd;
    }

    /**
     * @param drawOdd the drawOdd to set
     */
    public void setDrawOdd(BigDecimal drawOdd) {
        this.drawOdd = drawOdd;
    }

    /**
     * @return BigDecimal return the awayOdd
     */
    public BigDecimal getAwayOdd() {
        return awayOdd;
    }

    /**
     * @param awayOdd the awayOdd to set
     */
    public void setAwayOdd(BigDecimal awayOdd) {
        this.awayOdd = awayOdd;
    }

    /**
     * @return LocalDateTime return the createdAt
     */
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt the createdAt to set
     */
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return LocalDateTime return the updatedAt
     */
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    /**
     * @param updatedAt the updatedAt to set
     */
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

}
