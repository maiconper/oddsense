package com.oddsense.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.oddsense.model.Bet;
import com.oddsense.model.Fixture;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface FixtureRepository extends JpaRepository<Fixture, Long> {

    @Query("SELECT f FROM Fixture f WHERE DATE(f.date) = DATE(:date)")
    List<Fixture> findFixturesByDate(LocalDateTime date);

    @Query("SELECT f FROM Fixture f WHERE DATE(f.date) = DATE('2024-12-10')")
    List<Fixture> findFixturesByHardcodedDate();

}
