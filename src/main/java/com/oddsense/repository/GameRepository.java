package com.oddsense.repository;

import com.oddsense.model.Game;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {
    // Métodos personalizados, se necessário
     List<Game> findByDateTimeBetween(LocalDateTime start, LocalDateTime end);
}
