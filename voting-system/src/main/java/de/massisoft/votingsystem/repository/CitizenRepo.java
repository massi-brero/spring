package de.massisoft.votingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import de.massisoft.votingsystem.entity.Citizen;

@Repository
@EnableJpaRepositories
public interface CitizenRepo extends JpaRepository<Citizen, Integer>{
	
}
