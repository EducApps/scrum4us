package com.lima.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lima.entity.Backlog;
import com.lima.repository.BacklogRepository;

@Service
public class BacklogService {

	@Autowired
	private BacklogRepository repository;
	
	public Backlog getBacklog(Long id) {
		return repository.getOne(id);
	}
	
	public List<Backlog> getBacklogs() {
		return repository.findAll();
	}
	
	public Backlog saveBacklog(Backlog Backlog) {
		return repository.save(Backlog);
	}
	
	public void deleteBacklog(Long id) {
		repository.delete(id);
	}


}
