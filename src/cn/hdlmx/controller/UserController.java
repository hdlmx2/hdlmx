package cn.hdlmx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Controller
public class UserController {
    @RequestMapping(value = "/signin")
    public ModelAndView signin(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println(parameterString(request, response));
        ModelAndView modelAndView = new ModelAndView("success");
        modelAndView.setViewName("success");
        modelAndView.addObject("欢迎", "韩东");
        return modelAndView;

    }

    //获取请求的URL，URI，以及请求参数。并拼接成一个完整的链接
    public StringBuffer parameterString(HttpServletRequest request, HttpServletResponse response) {
        StringBuffer parameterString = new StringBuffer();
        StringBuffer requestURl = request.getRequestURL();
        parameterString.append(requestURl).append("?");

        //获取请求参数
        Map<String, String[]> paramMap = request.getParameterMap();
        for (Map.Entry<String, String[]> entry : paramMap.entrySet()) {
            String[] values = entry.getValue();
            for (String value : values) {
                parameterString.append(entry.getKey()).append("=").append(value);
            }
            parameterString.append("&");
        }
        return parameterString;

    }

    @RequestMapping("/sign")
    public String sign(Model model, HttpServletRequest request, HttpServletResponse response) {
        model.addAttribute("user", "hdlmx");
        return "success";
    }
}
