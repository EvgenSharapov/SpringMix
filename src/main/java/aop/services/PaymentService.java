package aop.services;


import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public void payOrder(){
        System.out.println("PaymentService: your order was successfully payed off!");
    }
}
