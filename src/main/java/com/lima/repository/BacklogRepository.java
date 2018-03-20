package com.lima.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lima.entity.Backlog;

public interface BacklogRepository extends JpaRepository<Backlog, Long> {

}
