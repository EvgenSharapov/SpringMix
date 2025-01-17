package aop.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class OrderController {

    public String showMainOrderPage(){
        System.out.println("Welcome to main order page!");
        return "order";
    }
}
