package com.oddsense.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.oddsense.model.Bet;
import com.oddsense.model.Fixture;
import com.oddsense.repository.BetRepository;

@Service
public class BetService {

    private BetRepository betRepository;

    public BetService(BetRepository betRepository) {
        this.betRepository = betRepository;
    }

    public List<Bet> getBetsByFixtureId(List<Fixture> fixtures) {

        // Extrair IDs únicos de fixtures
        List<Long> fixtureIds = fixtures.stream()
                .map(Fixture::getId) // Obter o ID de cada Fixture
                .distinct() // Garantir que sejam únicos
                .collect(Collectors.toList());

        // Aqui você pode usar fixtureIds para consultar as Bets
        List<Bet> bets = betRepository.findBetsByFixtureId(fixtureIds);

        return bets;
    }

}
