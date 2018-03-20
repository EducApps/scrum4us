package com.lima.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lima.entity.Team;
import com.lima.service.TeamService;

@RestController
@RequestMapping("/team")
public class TeamController {

	@Autowired
	private TeamService service;
	
	@GetMapping("/{id}")
	public Team getTeam(@PathVariable Long id) {
		return service.getTeam(id);
	}
	
	@GetMapping
	public List<Team> getTeams() {
		return service.getTeams();
	}
	
	@PutMapping
	public Team saveTeam(Team team) {
		return service.saveTeam(team);
	}

	@DeleteMapping
	public void deleteTeam(Long id) {
		service.deleteTeam(id);
	}
	
}
