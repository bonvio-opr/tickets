package com.bonvio.staff.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class IndexController {
    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String methodLogin() {
        return "index";
    }

    @RequestMapping(value = "/403", method = RequestMethod.GET)
    public String method403() {
        return "403";
    }

    @RequestMapping(value = "/dashboard", method = RequestMethod.GET)
    public String methodDashboard() {
        return "index";
    }

    @RequestMapping(value = "/deals", method = RequestMethod.GET)
    public String methodDeal() {
        return "index";
    }

    @RequestMapping(value = "/tasks", method = RequestMethod.GET)
    public String methodTask() {
        return "index";
    }

    @RequestMapping(value = "/contacts", method = RequestMethod.GET)
    public String methodContact() {
        return "index";
    }

}