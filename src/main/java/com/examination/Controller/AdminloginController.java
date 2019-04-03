package com.examination.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.examination.service.Adminloginservice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by MWL on 2017/11/25.
 */
@Controller
public class AdminloginController {
    @Autowired
    public Adminloginservice Adminloginservice;

    @RequestMapping(value = "/", method = {RequestMethod.POST, RequestMethod.GET})
    public String Adminlogin() {
        return "/login/login";
    }

    @RequestMapping(value = "/loginPage", method = {RequestMethod.POST, RequestMethod.GET})
    public String Adminlogin(HttpServletRequest request, HttpSession session) {
        String AdAccount = request.getParameter("AdAccount");
        String AdPassword = request.getParameter("AdPassword");
        System.out.println("你输入的用户名为：" + AdAccount);
        System.out.println("你输入的密码为：" + AdPassword);
        String tame = Adminloginservice.Adminlogin(AdAccount, AdPassword);
        session.setAttribute("tname",AdAccount);
        if (AdAccount == null) {
            return "redirect:/";
        } else {
            return "redirect:/index";
        }
    }

    @RequestMapping(value = "/index", method = {RequestMethod.POST, RequestMethod.GET})
    public String loginindex() {
        return "/login/test";

    }
}
