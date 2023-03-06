package com.codingdojo.dojoninjas.repository;

import com.codingdojo.dojoninjas.model.Ninja;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NinjaRepository extends JpaRepository<Ninja, Long> {


    List<Ninja> findAllByDojosId(Long id);

}
