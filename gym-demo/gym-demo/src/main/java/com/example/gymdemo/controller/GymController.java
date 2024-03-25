package com.example.gymdemo.controller;


import com.example.gymdemo.data.Gym;
import com.example.gymdemo.service.GymService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GymController {
    @Autowired
    private GymService gymService;

    @GetMapping(path = "/gyms")
    public List<Gym> getAllGyms() {
        return gymService.getAllGyms();
    }

    @PostMapping(path = "/gyms")
    public Gym createGym(@RequestBody Gym gym){
        return gymService.getAllGyms(gym);
    }

    @GetMapping(path = "/gyms/{id}")
    public Gym getGymById(@PathVariable int id){
        return gymService.getGymById(id);
    }

    @DeleteMapping(path = "/gyms/{id}")
    public void deleteGymById(@PathVariable int id){
        gymService.deleteGym(id);
    }

    @PutMapping(path = "/gym")
    public Gym UpdateGym(@RequestBody Gym gym){
        return gymService.updateGym(gym);
    }

}
