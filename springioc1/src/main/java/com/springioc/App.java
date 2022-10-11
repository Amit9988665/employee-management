package com.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        @SuppressWarnings("resource")
		ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml"); 
        
    	
        Employee s=(Employee)context.getBean("e");
        
        s.show(); 
        
    }
}
