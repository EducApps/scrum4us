package com.lima.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lima.entity.Story;
import com.lima.service.StoryService;

@RestController
@RequestMapping("/story")
public class StoryController {

	@Autowired
	private StoryService service;
	
	@GetMapping("/{id}")
	public Story getStory(@PathVariable Long id) {
		return service.getStory(id);
	}
	
	@GetMapping
	public List<Story> getStorys() {
		return service.getStorys();
	}
	
	@PutMapping
	public Story saveStory(Story Story) {
		return service.saveStory(Story);
	}

	@DeleteMapping
	public void deleteStory(Long id) {
		service.deleteStory(id);
	}
	
}
