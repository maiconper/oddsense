package com.oddsense.model;

import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.oddsense.dto.FixtureBetSerializer;

//@JsonSerialize(using = FixtureBetSerializer.class)
public class FixtureBet {

    private Fixture fixture;
    private List<Bet> fixtureBets;

    public FixtureBet() {

    }

    public FixtureBet(Fixture fixtureObject, List<Bet> fixtureBetsObject) {
        if (fixtureObject == null) {
            throw new IllegalArgumentException("Fixture cannot be null");
        }
        if (fixtureBetsObject == null) {
            throw new IllegalArgumentException("FixtureBets cannot be null");
        }
        this.fixture = fixtureObject;
        this.fixtureBets = fixtureBetsObject;
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

    /**
     * @return List<Bet> return the fixtureBets
     */
    public List<Bet> getFixtureBets() {
        return fixtureBets;
    }

    /**
     * @param fixtureBets the fixtureBets to set
     */
    public void setFixtureBets(List<Bet> fixtureBets) {
        if (fixtureBets == null || fixtureBets.isEmpty()) {
            throw new IllegalArgumentException("FixtureBets cannot be null or empty");
        }
        this.fixtureBets = fixtureBets;
    }

    @Override
    public String toString() {
        return "FixtureBet{" +
                "fixture=" + fixture +
                ", fixtureBets=" + fixtureBets +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        FixtureBet that = (FixtureBet) o;

        if (!fixture.equals(that.fixture))
            return false;
        return fixtureBets.equals(that.fixtureBets);
    }

    @Override
    public int hashCode() {
        int result = fixture.hashCode();
        result = 31 * result + fixtureBets.hashCode();
        return result;
    }

}
