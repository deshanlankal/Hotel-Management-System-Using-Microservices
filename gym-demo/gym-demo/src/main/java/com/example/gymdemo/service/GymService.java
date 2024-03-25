package com.example.gymdemo.service;

import com.example.gymdemo.data.Gym;
import com.example.gymdemo.data.GymRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class GymService {
    @Autowired
    private GymRepository gymRepository;

    @GetMapping(path = "/gyms")
    public List<Gym> getAllGyms() {
        return gymRepository.findAll();
    }


    public Gym getAllGyms(Gym gym) {
        return gymRepository.save(gym);
    }

    public Gym getGymById(int id) {
        Optional<Gym> gym = gymRepository.findById(id);
        if(gym.isPresent()){
            return gym.get();
        }
        return null;
    }

    public void deleteGym(int id) {
        gymRepository.deleteById(id);
    }

    public Gym updateGym(Gym gym) {
        return gymRepository.save(gym);
    }
}
