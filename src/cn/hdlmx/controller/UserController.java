package cn.hdlmx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController {
    @RequestMapping(value = "/signin", method = RequestMethod.GET)
    public ModelAndView signin(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println(request.getContextPath());
        ModelAndView modelAndView = new ModelAndView("success");
        modelAndView.setViewName("success");
        modelAndView.addObject("欢迎", "韩东");
        return modelAndView;

    }

    @RequestMapping("/sign")
    public String sign(Model model, HttpServletRequest request, HttpServletResponse response) {
        model.addAttribute("user", "hdlmx");
        return "success";
    }
}
