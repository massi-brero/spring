package de.massisoft.spring.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import de.massisoft.spring.domain.Journal;

public interface JournalRepository extends JpaRepository<Journal, Long> {

}
