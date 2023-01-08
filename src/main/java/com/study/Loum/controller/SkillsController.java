package com.study.Loum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //Controller 라는 것을 명시, RestController에서는 불가능.
@RequestMapping("/skills") // localhost:8080/skill 매칭
public class SkillsController {

    @GetMapping
    public String skill(Model model){
        //model.addAttribute("specialistL", specialistService.getAllSpecialist());
        return "skills";
    }
}
