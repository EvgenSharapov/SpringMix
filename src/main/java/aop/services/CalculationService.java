package aop.services;


import aop.util.Calculator;
import org.springframework.stereotype.Service;

@Service
public class CalculationService {

    private final Calculator calculator;

    public CalculationService(Calculator calculator){
        this.calculator=calculator;
    }

    public int tripleDivision(int divided,int divider){
        int result=divided;

        for(int i=0;i<3;i++){
            result=calculator.div(result,divider);
        }
        return  result;
    }
}
