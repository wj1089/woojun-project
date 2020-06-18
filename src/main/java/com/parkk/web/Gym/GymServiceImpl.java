package com.parkk.web.Gym;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class GymServiceImpl implements GymService {
    @Autowired GymRepository gymRepository;

    public List<Gym> selectAll(){
        return gymRepository.findAll();
    }
}
