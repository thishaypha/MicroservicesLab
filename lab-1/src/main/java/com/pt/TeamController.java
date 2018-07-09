package com.pt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@RestController
public class TeamController {
	
	@Autowired TeamRepository teamRepository;
	
/*	@GetMapping("/teams")
	public List<Team> getTeams() {
		
		List<Team> list = new ArrayList<>();
		
		Team team = new Team();
		team.setId(0l);
		team.setLocation("Dallas");
		team.setMascot("penguin");
		team.setName("Cowboys");
		list.add(team);
		
		team = new Team();
		team.setId(1l);
		team.setLocation("San Francisco");
		team.setMascot("duck");
		team.setName("49ers");
		list.add(team);
		
		return list;
	}*/
	
	@GetMapping("/teams")
	public Iterable<Team> getTeams() {
		return teamRepository.findAll();
	}
	
	@GetMapping("/teams/{id}")
	public Team getTeams(@PathVariable Long id) {
		return teamRepository.findById(id).get();
	}
	
}
