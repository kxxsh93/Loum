package com.study.Loum.controller;

import com.study.Loum.service.SpecialistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller //Controller 라는 것을 명시, RestController에서는 불가능.
@RequestMapping("/specialist") // localhost:8080/specialist 매칭
public class SpecialistController {
    @Autowired
    private SpecialistService specialistService;

    @GetMapping
    public String specialistL(Model model){
        model.addAttribute("specialistL", specialistService.getAllSpecialist());
        return "specialist";
    }

    /*
    @PostMapping("/list")
    public String addPageMoim(@ModelAttribute Moim moim, Model model) { // C
        moimService.createMoim(moim);
        return "moim";
    }

    @RequestMapping(value = "/detail")
    public String getspecDetailList(Model model) {
        model.addAttribute("moimList", moimService.getAllMoims()); // R
        return "moim/list";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/getMethod") //localhost:8080/api/getMethod
    public String getRequest(){
        return "Hi getMethod";
        //@RequestMaping인데 method를 설정해줌으로 주소 하위 메소드로 들어감
        //여기서 return 한 것이 웹에 띄워짐
        //요청이 들어오면 이 안으로 옴
    }


    @GetMapping("/getParameter") //localhost:8080/api/getParameter?id=1234&password=abcd 물음표 뒤부터가 파라미터터
    public String getParameter(@RequestParam String id, @RequestParam String password){

        //만약에 여기서 password라는 변수가 쓰인다면 매개변수는 다른 이름으로 password를 받아야함.
        //그렇게 되면 매핑이 안되므로 @RequestParam(name = "password") pwd이렇게 해주면
        // 들어오는 인자는 password라는 이름으로 매핑될거야 라는 뜻.
        System.out.println("id :"+id);
        System.out.println("password :"+password);

        return id+password; //여기서 return 한 것들이 web에 띄워짐
    }

    //localhost:8080/api/getMultiParameter?account=abc&email=study@gmail.com&page=10
    @GetMapping("/getMultiParameter")
    public SearchParam getMultiParameter(SearchParam searchParam){
        System.out.println(searchParam.getAccount());
        System.out.println(searchParam.getEmail());
        System.out.println(searchParam.getPage());
        //{ "account" : "", "email" : "", "page" : 0} 형태로 바꿔주기 위해 객체리턴
        //기본적으로 gson 내포하므로 객체 리턴한다면 기본적으로 json 리턴
        return searchParam;
    } */


}
