package com.codingdojo.dojoninjas.repository;

import com.codingdojo.dojoninjas.model.Dojo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DojoRepository extends JpaRepository<Dojo, Long> {
}
