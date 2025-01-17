package aop.util;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class Calculator {

    public int div(int divided,int divider){
        return divided/divider;
    }
}
