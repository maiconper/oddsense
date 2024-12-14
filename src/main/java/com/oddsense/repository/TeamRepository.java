package com.oddsense.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oddsense.model.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {

}
