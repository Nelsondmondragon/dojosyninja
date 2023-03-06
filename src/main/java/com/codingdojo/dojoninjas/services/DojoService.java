package com.codingdojo.dojoninjas.services;

import com.codingdojo.dojoninjas.model.Dojo;
import com.codingdojo.dojoninjas.repository.DojoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DojoService {

    private final DojoRepository dojoRepository;

    public void save(Dojo dojo) {
        this.dojoRepository.save(dojo);
    }


    public List<Dojo> findAll() {
        return this.dojoRepository.findAll();
    }


    public Dojo findById(Long id) {
        return this.dojoRepository.findById(id).orElseThrow(() -> new RuntimeException("Id dojo not exists."));
    }
}
