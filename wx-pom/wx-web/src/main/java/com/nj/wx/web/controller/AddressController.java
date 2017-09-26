package com.nj.wx.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/addr")
public class AddressController extends BaseController {
    
    @RequestMapping(value="/my", method=RequestMethod.GET)
    public String my(ModelMap model) {
        return "html/my/myAddr.html";
    }
    
    @RequestMapping(value="/myFlow", method=RequestMethod.GET)
    public String myFlow(ModelMap model) {
        return "html/my/myAddrFlow.html";
    }
    
    

}
