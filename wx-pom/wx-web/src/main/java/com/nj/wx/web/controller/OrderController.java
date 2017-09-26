package com.nj.wx.web.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/order")
public class OrderController extends BaseController {
    
    @RequestMapping(value="/dtl", method=RequestMethod.GET)
    public String show(ModelMap model) {
        return "html/order/orderDetail.html";
    }
    
    @RequestMapping(value="/go", method=RequestMethod.GET)
    public void go(ModelMap model, HttpServletResponse resp) throws IOException {
        
        
        super.ajaxOutput(resp, "");
    }
    
    

}
