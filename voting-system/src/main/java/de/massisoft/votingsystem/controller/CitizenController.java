package de.massisoft.votingsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.massisoft.votingsystem.entity.Citizen;
import de.massisoft.votingsystem.repository.CitizenRepo;

@RestController
public class CitizenController {
	
	
	@Autowired
	CitizenRepo citizenRepo;
	
	@RequestMapping("/do")
	public String doAction() {
		Citizen c = new Citizen(1L, "Bob", "Hope") ;
		citizenRepo.save(c);
		
		return c.toString();
	}

}
