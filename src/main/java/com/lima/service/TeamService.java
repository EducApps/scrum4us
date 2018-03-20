package com.lima.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lima.entity.Team;
import com.lima.repository.TeamRepository;

@Service
public class TeamService {
	
	@Autowired
	private TeamRepository repository;

	public Team getTeam(Long id) {
		return repository.getOne(id);
	}
	
	public List<Team> getTeams() {
		return repository.findAll();
	}
	
	public Team saveTeam(Team team) {
		return repository.save(team);
	}
	
	public void deleteTeam(Long id) {
		repository.delete(id);
	}
	
}
