package com.petproject.coffeshopmanager.service;

import com.petproject.coffeshopmanager.model.Variety;
import com.petproject.coffeshopmanager.repository.VarietyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VarietyService {
    private final VarietyRepository varietyRepository;

    @Autowired
    public VarietyService(VarietyRepository varietyRepository) {
        this.varietyRepository = varietyRepository;
    }

    public Variety findById(Long id){
        return varietyRepository.getOne(id);
    }

    public List<Variety> findAll(){
        return varietyRepository.findAll();
    }

    public Variety saveVariety(Variety variety){
        return varietyRepository.save(variety);
    }

    public void deleteById(Long id){
        varietyRepository.deleteById(id);
    }
}
