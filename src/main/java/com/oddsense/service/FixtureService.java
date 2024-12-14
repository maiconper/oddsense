package com.oddsense.service;

import org.springframework.stereotype.Service;

import com.oddsense.model.Bet;
import com.oddsense.model.Fixture;
import com.oddsense.model.FixtureBet;
import com.oddsense.repository.BetRepository;
import com.oddsense.repository.FixtureRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class FixtureService {

    private final FixtureRepository fixtureRepository;

    private final BetService betService;

    public FixtureService(FixtureRepository fixtureRepository, BetService betService) {
        this.fixtureRepository = fixtureRepository;
        this.betService = betService;
    }

    public List<FixtureBet> getFixturesForToday() {
        LocalDateTime startOfDay = LocalDate.now().atStartOfDay();
        List<Fixture> fixtures = fixtureRepository.findFixturesByHardcodedDate();
        List<Bet> bets = betService.getBetsByFixtureId(fixtures);

        Map<Long, List<Bet>> betsByFixtureId = bets.stream()
                .collect(Collectors.groupingBy(Bet::getFixtureId));

        // Criar lista de FixtureBet
        List<FixtureBet> fixturesBet = fixtures.stream()
                .map(fixture -> new FixtureBet(
                        fixture,
                        betsByFixtureId.getOrDefault(fixture.getId(), Collections.emptyList())))
                .collect(Collectors.toList());

        return fixturesBet;
    }
}
