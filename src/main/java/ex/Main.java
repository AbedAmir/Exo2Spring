package ex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		// On crée le contexte
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		// On Cherche le bean 
		Robot robot = context.getBean(Robot.class);
		
		// Executer la methode qui lance l'application 
		robot.run();
	}

}
