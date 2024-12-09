package com.oddsense.controller;

import com.oddsense.model.Game;
import com.oddsense.model.GameStats;
import com.oddsense.model.Prediction;
import com.oddsense.repository.GameRepository;
import com.oddsense.repository.GameStatsRepository;
import com.oddsense.repository.PredictionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/games")
public class GameController {

    @Autowired
    private GameRepository gameRepository;

    @Autowired
    private GameStatsRepository gameStatsRepository;

    @Autowired
    private PredictionRepository predictionRepository;

    @Autowired
    @GetMapping("/today")
    public List<Game> getTodayGames() {
        LocalDateTime startOfDay = LocalDate.now().atStartOfDay();
        LocalDateTime endOfDay = startOfDay.plusDays(1).minusSeconds(1);
        return gameRepository.findByDateTimeBetween(startOfDay, endOfDay);
    }

    @GetMapping("/{id}")
    public Game getGameDetails(@PathVariable Long id) {
        return gameRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Game not found with id: " + id));
    }

    @GetMapping("/{id}/stats")
    public GameStats getGameStats(@PathVariable Long id) {
        return gameStatsRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Game not found with id: " + id));
    }

    @PostMapping("/{id}/predict")
    public Prediction generatePrediction(@PathVariable Long id) {
        Game game = gameRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Game not found with id: " + id));

        Prediction prediction = new Prediction();
        prediction.setGame(game);
        prediction.setMainPrediction("Vitória do Mandante");
        prediction.setSecondaryPrediction("Mais de 2.5 gols");
        prediction.setJustification("Time A está invicto e o Time B tem 3 desfalques importantes.");

        return predictionRepository.save(prediction);
    }

}
