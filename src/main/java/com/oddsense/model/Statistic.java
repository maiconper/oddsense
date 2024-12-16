package com.oddsense.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "statistics")
public class Statistic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fixture_id", nullable = false)
    @JsonIgnore
    private Fixture fixture;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "team_id", nullable = false)
    private Team team;

    @Column(name = "shots_on_goal")
    private Integer shotsOnGoal;

    @Column(name = "shots_off_goal")
    private Integer shotsOffGoal;

    @Column(name = "total_shots")
    private Integer totalShots;

    @Column(name = "blocked_shots")
    private Integer blockedShots;

    @Column(name = "shots_inside_box")
    private Integer shotsInsideBox;

    @Column(name = "shots_outside_box")
    private Integer shotsOutsideBox;

    @Column(name = "fouls")
    private Integer fouls;

    @Column(name = "corner_kicks")
    private Integer cornerKicks;

    @Column(name = "offsides")
    private Integer offsides;

    @Column(name = "ball_possession", length = 10)
    private String ballPossession;

    @Column(name = "yellow_cards")
    private Integer yellowCards;

    @Column(name = "red_cards")
    private Integer redCards;

    @Column(name = "goalkeeper_saves")
    private Integer goalkeeperSaves;

    @Column(name = "total_passes")
    private Integer totalPasses;

    @Column(name = "passes_accurate")
    private Integer passesAccurate;

    @Column(name = "passes_percentage", length = 10)
    private String passesPercentage;

    @Column(name = "expected_goals", precision = 5, scale = 2)
    private BigDecimal expectedGoals;

    @Column(name = "goals_prevented", precision = 5, scale = 2)
    private BigDecimal goalsPrevented;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    @Column(name = "updated_at")
    private LocalDateTime updatedAt = LocalDateTime.now();

    @PreUpdate
    public void setUpdatedAt() {
        this.updatedAt = LocalDateTime.now();
    }

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Fixture getFixture() {
        return fixture;
    }

    public void setFixture(Fixture fixture) {
        this.fixture = fixture;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Integer getShotsOnGoal() {
        return shotsOnGoal;
    }

    public void setShotsOnGoal(Integer shotsOnGoal) {
        this.shotsOnGoal = shotsOnGoal;
    }

    public Integer getShotsOffGoal() {
        return shotsOffGoal;
    }

    public void setShotsOffGoal(Integer shotsOffGoal) {
        this.shotsOffGoal = shotsOffGoal;
    }

    public Integer getTotalShots() {
        return totalShots;
    }

    public void setTotalShots(Integer totalShots) {
        this.totalShots = totalShots;
    }

    public Integer getBlockedShots() {
        return blockedShots;
    }

    public void setBlockedShots(Integer blockedShots) {
        this.blockedShots = blockedShots;
    }

    public Integer getShotsInsideBox() {
        return shotsInsideBox;
    }

    public void setShotsInsideBox(Integer shotsInsideBox) {
        this.shotsInsideBox = shotsInsideBox;
    }

    public Integer getShotsOutsideBox() {
        return shotsOutsideBox;
    }

    public void setShotsOutsideBox(Integer shotsOutsideBox) {
        this.shotsOutsideBox = shotsOutsideBox;
    }

    public Integer getFouls() {
        return fouls;
    }

    public void setFouls(Integer fouls) {
        this.fouls = fouls;
    }

    public Integer getCornerKicks() {
        return cornerKicks;
    }

    public void setCornerKicks(Integer cornerKicks) {
        this.cornerKicks = cornerKicks;
    }

    public Integer getOffsides() {
        return offsides;
    }

    public void setOffsides(Integer offsides) {
        this.offsides = offsides;
    }

    public String getBallPossession() {
        return ballPossession;
    }

    public void setBallPossession(String ballPossession) {
        this.ballPossession = ballPossession;
    }

    public Integer getYellowCards() {
        return yellowCards;
    }

    public void setYellowCards(Integer yellowCards) {
        this.yellowCards = yellowCards;
    }

    public Integer getRedCards() {
        return redCards;
    }

    public void setRedCards(Integer redCards) {
        this.redCards = redCards;
    }

    public Integer getGoalkeeperSaves() {
        return goalkeeperSaves;
    }

    public void setGoalkeeperSaves(Integer goalkeeperSaves) {
        this.goalkeeperSaves = goalkeeperSaves;
    }

    public Integer getTotalPasses() {
        return totalPasses;
    }

    public void setTotalPasses(Integer totalPasses) {
        this.totalPasses = totalPasses;
    }

    public Integer getPassesAccurate() {
        return passesAccurate;
    }

    public void setPassesAccurate(Integer passesAccurate) {
        this.passesAccurate = passesAccurate;
    }

    public String getPassesPercentage() {
        return passesPercentage;
    }

    public void setPassesPercentage(String passesPercentage) {
        this.passesPercentage = passesPercentage;
    }

    public BigDecimal getExpectedGoals() {
        return expectedGoals;
    }

    public void setExpectedGoals(BigDecimal expectedGoals) {
        this.expectedGoals = expectedGoals;
    }

    public BigDecimal getGoalsPrevented() {
        return goalsPrevented;
    }

    public void setGoalsPrevented(BigDecimal goalsPrevented) {
        this.goalsPrevented = goalsPrevented;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
