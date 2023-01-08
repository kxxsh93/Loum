package com.study.Loum.service;

import com.study.Loum.Entity.Specialist;
import com.study.Loum.Repository.SpecialistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //빈을 찾지 못하는 에러
public class SpecialistServiceImp implements SpecialistService{
    @Autowired
    private SpecialistRepository specialistRepository;

    @Override
    public Specialist createSpecialist(Specialist specialist) {
        return specialistRepository.save(specialist); //C
    };

    @Override
    public List<Specialist> getAllSpecialist() {
        return specialistRepository.findAll(); //R
    };

    //U

    //D
}
