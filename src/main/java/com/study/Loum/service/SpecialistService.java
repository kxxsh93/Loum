package com.study.Loum.service;

import com.study.Loum.Entity.Specialist;

import java.util.List;

public interface SpecialistService {
    Specialist createSpecialist(Specialist specialist);

    List<Specialist> getAllSpecialist();
}
