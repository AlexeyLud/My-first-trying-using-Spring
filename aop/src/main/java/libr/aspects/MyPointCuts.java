package libr.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointCuts {

    @Pointcut("execution(* add*(..))")
    public void allAddMethods(){}

}
