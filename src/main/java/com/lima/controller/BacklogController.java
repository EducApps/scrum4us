package com.lima.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lima.entity.Backlog;
import com.lima.service.BacklogService;

@RestController
@RequestMapping("/backlog")
public class BacklogController {
	
	@Autowired
	private BacklogService service;
	
	@GetMapping("/{id}")
	public Backlog getBacklog(@PathVariable Long id) {
		return service.getBacklog(id);
	}
	
	@GetMapping
	public List<Backlog> getBacklogs() {
		return service.getBacklogs();
	}
	
	@PutMapping
	public Backlog saveBacklog(Backlog Backlog) {
		return service.saveBacklog(Backlog);
	}

	@DeleteMapping
	public void deleteBacklog(Long id) {
		service.deleteBacklog(id);
	}

}
