package sample.monitor;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceMonitor {
 //j dois changer le nom
	@AfterReturning("execution(* sample.simple.*.*.*(..))")
	public void logServiceAccess(JoinPoint joinPoint) {
		System.out.println("Completed: " + joinPoint);
	}
	@Before("execution(* sample.simple..*)")
	public void logServiceAccess2(JoinPoint joinPoint) {
		System.out.println("executing: " + joinPoint);
	}

}