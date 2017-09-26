package com.nj.wx.web.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/appoint")
public class AppointController extends BaseController {
    
    @RequestMapping(value="/show", method=RequestMethod.GET)
    public String show(ModelMap model) {
        return "html/appoint/appoint.html";
    }
    
    @RequestMapping(value="/submit", method=RequestMethod.GET)
    public String submit(ModelMap model, HttpServletResponse resp) throws IOException {
        return "html/order/submitOrder.html";
    }
    
    

}
