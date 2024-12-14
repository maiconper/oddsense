package com.oddsense.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "scores")
public class Score {
    @Id
    private Long fixtureId;

    private Integer halftimeHome;
    private Integer halftimeAway;
    private Integer fulltimeHome;
    private Integer fulltimeAway;
    private Integer extratimeHome;
    private Integer extratimeAway;
    private Integer penaltyHome;
    private Integer penaltyAway;

    @OneToOne
    @MapsId
    @JoinColumn(name = "fixture_id")
    private Fixture fixture;

    /**
     * @return Long return the fixtureId
     */
    public Long getFixtureId() {
        return fixtureId;
    }

    /**
     * @param fixtureId the fixtureId to set
     */
    public void setFixtureId(Long fixtureId) {
        this.fixtureId = fixtureId;
    }

    /**
     * @return Integer return the halftimeHome
     */
    public Integer getHalftimeHome() {
        return halftimeHome;
    }

    /**
     * @param halftimeHome the halftimeHome to set
     */
    public void setHalftimeHome(Integer halftimeHome) {
        this.halftimeHome = halftimeHome;
    }

    /**
     * @return Integer return the halftimeAway
     */
    public Integer getHalftimeAway() {
        return halftimeAway;
    }

    /**
     * @param halftimeAway the halftimeAway to set
     */
    public void setHalftimeAway(Integer halftimeAway) {
        this.halftimeAway = halftimeAway;
    }

    /**
     * @return Integer return the fulltimeHome
     */
    public Integer getFulltimeHome() {
        return fulltimeHome;
    }

    /**
     * @param fulltimeHome the fulltimeHome to set
     */
    public void setFulltimeHome(Integer fulltimeHome) {
        this.fulltimeHome = fulltimeHome;
    }

    /**
     * @return Integer return the fulltimeAway
     */
    public Integer getFulltimeAway() {
        return fulltimeAway;
    }

    /**
     * @param fulltimeAway the fulltimeAway to set
     */
    public void setFulltimeAway(Integer fulltimeAway) {
        this.fulltimeAway = fulltimeAway;
    }

    /**
     * @return Integer return the extratimeHome
     */
    public Integer getExtratimeHome() {
        return extratimeHome;
    }

    /**
     * @param extratimeHome the extratimeHome to set
     */
    public void setExtratimeHome(Integer extratimeHome) {
        this.extratimeHome = extratimeHome;
    }

    /**
     * @return Integer return the extratimeAway
     */
    public Integer getExtratimeAway() {
        return extratimeAway;
    }

    /**
     * @param extratimeAway the extratimeAway to set
     */
    public void setExtratimeAway(Integer extratimeAway) {
        this.extratimeAway = extratimeAway;
    }

    /**
     * @return Integer return the penaltyHome
     */
    public Integer getPenaltyHome() {
        return penaltyHome;
    }

    /**
     * @param penaltyHome the penaltyHome to set
     */
    public void setPenaltyHome(Integer penaltyHome) {
        this.penaltyHome = penaltyHome;
    }

    /**
     * @return Integer return the penaltyAway
     */
    public Integer getPenaltyAway() {
        return penaltyAway;
    }

    /**
     * @param penaltyAway the penaltyAway to set
     */
    public void setPenaltyAway(Integer penaltyAway) {
        this.penaltyAway = penaltyAway;
    }

    /**
     * @return Fixture return the fixture
     */
    public Fixture getFixture() {
        return fixture;
    }

    /**
     * @param fixture the fixture to set
     */
    public void setFixture(Fixture fixture) {
        this.fixture = fixture;
    }

}
