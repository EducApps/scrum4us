package com.lima.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lima.entity.Sprint;

public interface SprintRepository extends JpaRepository<Sprint, Long> {

}
