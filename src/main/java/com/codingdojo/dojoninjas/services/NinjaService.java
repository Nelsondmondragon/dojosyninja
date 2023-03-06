package com.codingdojo.dojoninjas.services;

import com.codingdojo.dojoninjas.model.Ninja;
import com.codingdojo.dojoninjas.repository.NinjaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NinjaService {

    private final NinjaRepository ninjaRepository;


    public void save(Ninja ninja) {
        this.ninjaRepository.save(ninja);
    }


    public List<Ninja> findAllByDojosId(Long id) {
        return ninjaRepository.findAllByDojosId(id);
    }

}
