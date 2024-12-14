package com.oddsense.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.oddsense.model.Bet;

@Repository
public interface BetRepository extends JpaRepository<Bet, Long> {

    @Query(value = "SELECT * FROM bets WHERE fixture_id IN (:fixtureIds)", nativeQuery = true)
    List<Bet> findBetsByFixtureId(@Param("fixtureIds") List<Long> fixtureIds);

}
