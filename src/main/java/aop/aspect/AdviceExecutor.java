package aop.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class AdviceExecutor {

    @Before("PointCutSearcher.isServiceByAnnotation()")
    public void serviceByAnnotationAdvice(JoinPoint joinPoint){
        System.out.println("Action before @Service method: " + joinPoint.toShortString());
    }
    @After("PointCutSearcher.isControllerByName()")
    public void controllerByNameAdvice(JoinPoint joinPoint){
        System.out.println("Action after @Controller method "+joinPoint.toShortString());
    }
    @AfterThrowing(
            value= "PointCutSearcher.isRepositoryByPackage()",
            throwing = "error")
    public void repositoryByPackageAdvice(JoinPoint joinPoint,Throwable error){
        System.out.println("Log info: exception occurred "+error);
        System.out.println("Log info: method of exception "+joinPoint.getSignature());
    }
    @AfterReturning(
            value = "PointCutSearcher.isCalculationButNotService()",
            returning = "result")
    public void calculationButNotServiceAdvice(JoinPoint joinPoint,Object result){
        System.out.println("Log info: method: "+joinPoint.getSignature() + "\tResult - "+result);

    }
    @Around("PointCutSearcher.isMethodByName()")
    public Object methodByNameAdvice(ProceedingJoinPoint point){
        String methodController = point.toShortString();

        try{
            System.out.println("Action before call of - "+methodController);

            Object result = point.proceed();
            System.out.println("Action with result ("+result+")");
            return  result;
        }catch (Throwable e) {
            System.out.println("ERROR caught in Advice");
            throw new RuntimeException(e);
        }finally {
            System.out.println("Action after call of - "+methodController);
        }

    }
}
