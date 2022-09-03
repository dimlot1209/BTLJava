/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.btl.controllers;

import javax.persistence.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Lọt
 */
@Controller
public class HomeController {
    
    @Autowired
    private LocalSessionFactoryBean sessionFactory;

    @RequestMapping("/")
    @Transactional
    public String index(Model model) {
        Session s = sessionFactory.getObject().getCurrentSession();
        Query q = s.createQuery("From Category");
        model.addAttribute("category", q.getResultList()); 
//        s.close();

        return "index";
    }
    
    @RequestMapping(path="/hello/{name}")
    public String hello(Model model, 
            @PathVariable(value="name") String name){
        model.addAttribute("message", "Welcome " + name + " !!!");
            
        return "hello";
    }
    
    
    @RequestMapping(path = "/test")
    public String testRedirect(Model model){
        model.addAttribute("testMsg", "WELCOME TO CON 2 NGAY DE CHAY DEADLINE");
        
        return "forward:/hello/Loc" ;
    }
}