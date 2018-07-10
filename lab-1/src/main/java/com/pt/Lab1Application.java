package com.pt;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lab1Application {

	public static void main(String[] args) {
		SpringApplication.run(Lab1Application.class, args);
	}
	
	@Autowired TeamRepository teamRepository;
	
	@PostConstruct
	public void init() {
		
		List<Team> list = new ArrayList<>();
		
		Set<Player> players = new HashSet<>();
		players.add(new Player("Big Easy", "Showman"));
		players.add(new Player("Buckets","Guard"));
		players.add(new Player("Dizzy", "Guard"));
		
		list.add(new Team("Dallas","Cowboys",players));
		list.add(new Team("San Francisco","49ers",null));
			
		teamRepository.saveAll(list);
	}
}
