package org.example;

import config.AppConfig;
import entity.*;
import lombok.var;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SuppressWarnings("DuplicatedCode")
public class Main {
    public static void main(String[] args) {
        var acac = new AnnotationConfigApplicationContext(AppConfig.class);

        BuyingInterface buy = acac.getBean("customer", Customer.class);
        SellingInterface sell = acac.getBean("staff", Staff.class);
        ProductInterface store = acac.getBean("product", Product.class);

        store.soldOut();
        store.boughtIt();


    }
}