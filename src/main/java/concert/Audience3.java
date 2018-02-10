package concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience3 {

	@Pointcut("execution(** concert.Performance.perform(..))")
	public void performance(){
		
	}
	
	@Around("performance()")
	public void watchPerformance(ProceedingJoinPoint jp){
		try {
			System.out.println("Silenging cell phones");
			System.out.println("Taking seats");
			jp.proceed();
			System.out.println("Clap Clap Clap");
		} catch (Throwable e) {
			e.printStackTrace();
			System.out.println("Demanding a refund");
		}
	}
}
