package spring.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import spring.service.UserService;


import java.util.List;

/**
 * Created by Damian Stępniak on 09.03.2017.
 */

@Controller
@RequestMapping("/")
public class AppController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public String index(){
        return "index";
    }



}
