package io.github.anantharajuc.j8f;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.anantharajuc.j8f.interfaces.functional.FI2ArgumentsNoReturnValue;
import io.github.anantharajuc.j8f.interfaces.functional.FInoArgumentsNoReturnValue;
import lombok.extern.log4j.Log4j2;

@Log4j2
@SpringBootApplication
public class Java8Application 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(Java8Application.class, args);
		
	   /*
		* 1. Functional interface - No Arguments, No Return Value
		*
		*/
		FInoArgumentsNoReturnValue finanrv = () -> log.info("1. Functional interface - No Arguments, No Return Value.");
		finanrv.doSomething();
		
	   /*
		* 2. Functional interface - 2 Arguments, No Return Value
		*
		*/
		FI2ArgumentsNoReturnValue fi2anrv = (v1, v2) -> {
															int result = v1+v2;
															log.info("2. Sum of v1, v2 = "+result+".");
														};
		fi2anrv.calculate(3, 20);	 			
		
	   /*
		* 3. Built-In Interface - Part of the Java Run Time - Interface part of the Multi-Threaded Architecture of Java.
		*
		*/		
		Runnable r1 = new Runnable()
									{   //Single Abstract Method - run()
										@Override
										public void run()
										{
											log.info("3. Running thread r1 via Inner Class.");
										}
									};
									
	    new Thread(r1).start();
	    
	   /*
		* 4. Implementing Built-In Interface with Lambda Expressions.
		*
		*/
	    Runnable r2 = () -> {
	    						try 
	    						{
									Thread.sleep(1000);
								} 
	    						catch (InterruptedException e) 
	    						{
	    							log.error("Thread Interrupted Exception", e);
									Thread.currentThread().interrupt();
								} 
	    						
	    						log.info("4. Running thread r2 via Lambda Expressions.");
	    					};
	    					
	    new Thread(r2).start(); 
	}
}
 