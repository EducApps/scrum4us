package com.lima.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lima.entity.Sprint;
import com.lima.service.SprintService;

@RestController
@RequestMapping("/sprint")
public class SprintController {

	@Autowired
	private SprintService service;
	
	@GetMapping("/{id}")
	public Sprint getSprint(@PathVariable Long id) {
		return service.getSprint(id);
	}
	
	@GetMapping
	public List<Sprint> getSprints() {
		return service.getSprints();
	}
	
	@PutMapping
	public Sprint saveSprint(Sprint Sprint) {
		return service.saveSprint(Sprint);
	}

	@DeleteMapping
	public void deleteSprint(Long id) {
		service.deleteSprint(id);
	}
}
