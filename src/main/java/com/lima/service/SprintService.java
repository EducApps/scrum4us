package com.lima.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lima.entity.Sprint;
import com.lima.repository.SprintRepository;

@Service
public class SprintService {

	@Autowired
	private SprintRepository repository;
	
	public Sprint getSprint(Long id) {
		return repository.getOne(id);
	}
	
	public List<Sprint> getSprints() {
		return repository.findAll();
	}
	
	public Sprint saveSprint(Sprint Sprint) {
		return repository.save(Sprint);
	}
	
	public void deleteSprint(Long id) {
		repository.delete(id);
	}

}
