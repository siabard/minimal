/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.izelon.yanwenry.minimal.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author siabard
 */
@Controller
public class HomeController {
    @RequestMapping(value="/", method=RequestMethod.GET)
    public String home() {
        return "home";
    }
}
