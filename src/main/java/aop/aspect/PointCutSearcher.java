package aop.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
public class PointCutSearcher {

    @Pointcut("@within(org.springframework.stereotype.Service)")
    public void isServiceByAnnotation(){}

    @Pointcut("within(org..*Controller)")
    public void isControllerByName(){}

    @Pointcut("within(org..Calc*)")
    public void isCalculationByName(){}

    @Pointcut("within(org..repositories.*)")
    public void isRepositoryByPackage(){}

    @Pointcut("within(isCalculationByName()&&! isServiceByAnnotation()")
    public void isCalculationButNotService(){}

    @Pointcut("execution(public * org..Calc*.tripleDivision(*,*)")
    public void isMethodByName(){}

}
