package com.abbhish.springBootTut04REST.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.abbhish.springBootTut04REST.dao.IAlienRepo;
import com.abbhish.springBootTut04REST.model.Alien;

@RestController
public class AlienController {
	@Autowired
	IAlienRepo repo;
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@PostMapping("/postAlien")
	public Alien post(@RequestBody Alien alien) {
		repo.save(alien);
		return alien;
	}
	@GetMapping("/getAliens")
	public List<Alien> get() {
		return repo.findAll();
	}
	@GetMapping("/getAlienById/{aId}")
	public Optional<Alien> getAlienById(@PathVariable("aId") int aId){
		return repo.findById(aId);
	}	
	@DeleteMapping("/deleteAlien/{aId}")
	public String deleteAlien(@PathVariable("aId") int aId) {
		Alien alien=repo.getOne(aId);
		repo.delete(alien);
		return "deleted";
	}
	@PutMapping("/putAlien")
	public Alien saveOrUpdateAlien(@RequestBody Alien alien){
		repo.save(alien);
		return alien;
	}

}
