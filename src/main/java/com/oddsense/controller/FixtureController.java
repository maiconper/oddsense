package com.oddsense.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oddsense.model.FixtureBet;
import com.oddsense.service.FixtureService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class FixtureController {

    private final FixtureService fixtureService;

    public FixtureController(FixtureService fixtureService) {
        this.fixtureService = fixtureService;
    }

    @GetMapping("/api/fixtures/today")
    public List<FixtureBet> getFixturesForToday() {
        return fixtureService.getFixturesForToday();
    }

    @GetMapping("/api/fixtures/events")
    public List<FixtureBet> getFixturesEvents() {
        return fixtureService.getFixturesForToday();
    }
}
