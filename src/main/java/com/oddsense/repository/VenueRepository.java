package com.oddsense.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oddsense.model.Venue;

public interface VenueRepository extends JpaRepository<Venue, Long> {

}
