package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@Controller
@RequestMapping("/demo")
public class HelloController {

    @RequestMapping(method = RequestMethod.GET,path = "/hello")
    public ModelAndView printHello(ModelMap model) {
       // model.addAttribute("message", "Hello Spring MVC Framework!");
        Date date = new Date();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("data",date);
        modelAndView.setViewName("hello");
        return modelAndView;
    }
}
