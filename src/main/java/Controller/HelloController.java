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

    @RequestMapping(method = RequestMethod.GET, path = "/hello")
    public ModelAndView printHello(ModelMap model) {
        // model.addAttribute("message", "Hello Spring MVC Framework!");
        Date date = new Date();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("data", date);
        modelAndView.setViewName("hello");
        return modelAndView;
    }

    @RequestMapping(method = RequestMethod.POST, path = "/login")
    public ModelAndView login(String name, String password) {
        ModelAndView modelAndView = new ModelAndView();
        if (name.equals("renchuan") && password.equals("123")) {
            modelAndView.addObject("password", password);
            modelAndView.setViewName("login");
            return modelAndView;
        }else {
            modelAndView.addObject("LoginFailed","Your password is not correct");
            modelAndView.setViewName("hello");
            return modelAndView;
        }

    }
}
