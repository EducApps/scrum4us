package com.lima.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lima.entity.Story;

public interface StoryRepository extends JpaRepository<Story, Long> {

}
