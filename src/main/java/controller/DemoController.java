package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping("/home")
public class DemoController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
