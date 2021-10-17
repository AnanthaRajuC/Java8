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
		
		/*Functional interface - No Arguments, No Return Value*/
		FInoArgumentsNoReturnValue finanrv = () -> log.info("Functional interface - No Arguments, No Return Value");
		finanrv.doSomething();
		
		/*Functional interface - 2 Arguments, No Return Value*/
		FI2ArgumentsNoReturnValue fi2anrv = (v1, v2) -> {
															int result = v1+v2;
															log.info("Sum of v1, v2 = "+result);
														};
		fi2anrv.calculate(3, 20);	 											
	}
}
 