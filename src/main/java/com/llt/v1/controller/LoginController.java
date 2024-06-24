package com.llt.v1.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    /**
     * 관리자 로그인 페이지
     */
    @RequestMapping(value = "/gomanager")
    public String loginAdmin(HttpServletRequest request, ModelMap model) throws Exception {

        String url = request.getRequestURL().toString();
        HttpSession session = request.getSession();

        String errorMessage =  (String) request.getSession().getAttribute("errorMessage");
        request.setAttribute("errorMessage", errorMessage);
        request.getSession().setAttribute("errorMessage","");

        return "/mgr/login.html";
    }

}
