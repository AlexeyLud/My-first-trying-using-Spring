package libr.aspects;

import libr.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

    //-------------------------------------------------------------------------------------------------------
    //-------------------------------------------------------------------------------------------------------

//    @Pointcut("execution(* *(..))")
//    private void allMethodsFromUniversity(){}
//
//    @Pointcut("execution(* returnMagazine())")
//    private void returnMagazineFromUniversity(){}
//
//    @Pointcut("allMethodsFromUniversity() && !returnMagazineFromUniversity()")
//    private void allMethodsWithoutReturnMagazine(){}
//
//    @Before("allMethodsWithoutReturnMagazine()")
//    public void beforeAllMethodsWithoutReturnMagazineLoggingAdvice(){
//        System.out.println("beforeAllMethodsWithoutReturnMagazineLoggingAdvice: writing Log #0");
//    }

    //-------------------------------------------------------------------------------------------------------
    //-------------------------------------------------------------------------------------------------------

//    @Pointcut("execution(* get*())")
//    private void allGetMethodsFromUniversity(){}
//
//    @Pointcut("execution(* return*())")
//    private void allReturnMethodsFromUniversity(){}
//
//    @Pointcut("execution(* add*())")
//    private void allAddMethodsFromUniversity(){}
//
//    //==========================================================================
//    //Комбинирование pointcuts
//    @Pointcut("allGetMethodsFromUniversity() || allReturnMethodsFromUniversity()")
//    private void allGetAndReturnMethodsFromUniversity(){}
//    //==========================================================================
//
//    @Before("allGetMethodsFromUniversity()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: writing Log #1");
//    }
//
//    @Before("allReturnMethodsFromUniversity()")
//    public void beforeReturnLoggingAdvice(){
//        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
//    }
//
//    @Before("allAddMethodsFromUniversity()")
//    public void beforeAddLoggingAdvice(){
//        System.out.println("beforeAddLoggingAdvice: writing Log #3");
//    }
//
//    //==========================================================================
//    @Before("allGetAndReturnMethodsFromUniversity()")
//    public void beforeGetAndReturnLoggingAdvice(){
//        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log #4");
//    }
//    //==========================================================================
//

    //-------------------------------------------------------------------------------------------------------
    //-------------------------------------------------------------------------------------------------------

    @Before("libr.aspects.MyPointCuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint){

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.method = " + methodSignature.getMethod());
        System.out.println("methodSignature.returnType= " + methodSignature.getReturnType());
        System.out.println("methodSignature.name = " + methodSignature.getName());

        if(methodSignature.getName().equals("addBook")){
            Object[] args = joinPoint.getArgs();
            for(Object object : args){
                if(object instanceof Book){
                    Book book = (Book) object;
                    System.out.println("Info about book:");
                    System.out.println("Name: " + book.getName());
                    System.out.println("Author: " + book.getAuthor());
                    System.out.println("YearPublish: " + book.getYearPublication());
                }
                else{
                    System.out.println("Person: " + object.toString());
                }
            }
        }


        System.out.println("beforeAddLoggingAdvice: логирование попытки получить книгу/журнал");
        System.out.println("-------------------------------------");
    }

//    @Before("execution(public * return*())")
//    public void beforeReturnAdvice(){
//        System.out.println("beforeReturnAdvice: попытка вернуть книгу/журнал");
//    }

    //-------------------------------------------------------------------------------------------------------

}
