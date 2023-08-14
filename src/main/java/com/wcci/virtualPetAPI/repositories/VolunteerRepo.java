package com.wcci.virtualPetAPI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wcci.virtualPetAPI.entities.Volunteer;


@Repository
public interface VolunteerRepo extends JpaRepository<Volunteer, String> {
    
}