package com.lima.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lima.entity.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {

}
