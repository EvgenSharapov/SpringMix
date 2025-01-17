package aop;

import aop.config.AppConfig;
import aop.controllers.OrderController;
import aop.repositories.DataRepository;
import aop.services.CalculationService;
import aop.services.PaymentService;
import aop.util.Calculator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    private static DataRepository dataRepository;
    private static OrderController orderController;
    private static PaymentService paymentService;
    private static CalculationService calculationService;
    private static Calculator calculator;


    public static void main(String[] args) {
        init();

        before();
        after();
        afterThrowing();
        afterReturning();
        around();

    }

    private static void around() {
        System.out.println("@Around");
        try{
            calculationService.tripleDivision(27,3);
            calculationService.tripleDivision(27,0);

        } catch (RuntimeException e) {
            System.out.println("ERROR caught in Main");
        }
        System.out.println();
        System.out.println();
    }

    private static void afterReturning() {
        System.out.println("@AfterReturning");
        calculator.div(6,3);
        System.out.println();
        System.out.println();
    }

    private static void afterThrowing() {
        System.out.println("@AfterThrowing");
        try{
            dataRepository.getDataById(-5L);

        } catch (RuntimeException e) {
            System.out.println("Failed No data!");
        }
        System.out.println();
        System.out.println();
    }

    private static void after() {
        System.out.println("@After");
        orderController.showMainOrderPage();
        System.out.println();
        System.out.println();
    }

    private static void before() {
        System.out.println("@Before");
        paymentService.payOrder();
        System.out.println();
        System.out.println();
    }

    private static void init(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        dataRepository = (DataRepository) context.getBean("dataRepository");
        orderController = (OrderController) context.getBean("orderController");

        paymentService = (PaymentService) context.getBean("paymentService");

        calculationService = (CalculationService) context.getBean("calculationService");
        calculator = (Calculator) context.getBean("calculator");




    }
}
