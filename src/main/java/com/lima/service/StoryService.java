package com.lima.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lima.entity.Story;
import com.lima.repository.StoryRepository;

@Service
public class StoryService {

	@Autowired
	private StoryRepository repository;
	
	public Story getStory(Long id) {
		return repository.getOne(id);
	}
	
	public List<Story> getStorys() {
		return repository.findAll();
	}
	
	public Story saveStory(Story Story) {
		return repository.save(Story);
	}
	
	public void deleteStory(Long id) {
		repository.delete(id);
	}

}
