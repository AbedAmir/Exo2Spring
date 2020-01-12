package ex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config-autowiring-constructor.xml");
		
		Robot robot = context.getBean("robot",Robot.class);
		
		robot.run();
		
	}

}
