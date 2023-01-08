package com.study.Loum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //Controller 라는 것을 명시, RestController에서는 불가능.
@RequestMapping("/location") // localhost:8080/location 매칭
public class LocationController {

    @GetMapping
    public String location(Model model){
        //model.addAttribute("specialistL", specialistService.getAllSpecialist());
        return "location";
    }
}
