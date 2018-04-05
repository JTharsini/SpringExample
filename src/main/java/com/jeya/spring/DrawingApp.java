package com.jeya.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		/*		
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Triangle triangle = (Triangle)factory.getBean("triangle");
		triangle.draw();
		
		deprecated: spring.xml file should be placed in root directory of project
		ApplicationContext is used to do the same job by BeanFactory and it provides
		some additional features also
		
		BeanFactory is suitable only when resources are so crucial
		*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		//getByIdDependencyInjection(context);
		//getByIdConstructorInjection(context);
		//getByAlias(context);
		//getByName(context);
		//injectingObjects(context);
		//collectionsAsAttributes(context);
		//autoWireByName(context);
		autoWireByType(context);
		((ClassPathXmlApplicationContext) context).close();
	}

	private static void autoWireByType(ApplicationContext context) {
		User user = (User) context.getBean("user");
		user.print();
	}

	private static void autoWireByName(ApplicationContext context) {
		TriangleWithPoints3 triangleWithPoints3 = (TriangleWithPoints3) context.getBean("triangleWithPoints3");
		triangleWithPoints3.draw();
	}

	private static void collectionsAsAttributes(ApplicationContext context) {
		TriangleWithPoints2 triangleWithPoints2 = (TriangleWithPoints2) context.getBean("triangleWithPoints2");
		triangleWithPoints2.draw();
	}

	private static void injectingObjects(ApplicationContext context) {
		TriangleWithPoints triangleWithPoints = (TriangleWithPoints) context.getBean("triangleWithPoints");
		triangleWithPoints.draw();
	}

	private static void getByName(ApplicationContext context) {
		Triangle8 triangle8 = (Triangle8) context.getBean("triangle-name");
		triangle8.draw();
	}

	private static void getByAlias(ApplicationContext context) {
		Triangle7 triangle7 = (Triangle7) context.getBean("triangle-alias");
		triangle7.draw();
	}

	// Set Attribute By Setter
	private static void getByIdDependencyInjection(ApplicationContext context) {
		Triangle triangle = (Triangle) context.getBean("triangle"); // get by id
		triangle.draw();
	}

	private static void getByIdConstructorInjection(ApplicationContext context) {
		constructorInjectionWithSingleArgumentConstructor(context);
		constructorInjectionWithTwoConstructorsWithDifferentNumberOfArguments(context);
		constructorInjectionWithTwoConstructorsWithSameNumberOfArgumentsSetPrimitiveValue(context);
		constructorInjectionWithTwoConstructorsWithSameNumberOfArgumentsSetObjectValue(context);
		constructorInjectionUsingIndex(context);
	}

	private static void constructorInjectionUsingIndex(ApplicationContext context) {
		Triangle6 triangle6 = (Triangle6) context.getBean("triangle6");
		triangle6.draw();
	}

	private static void constructorInjectionWithTwoConstructorsWithSameNumberOfArgumentsSetObjectValue(
			ApplicationContext context) {
		Triangle5 triangle5 = (Triangle5) context.getBean("triangle5");
		triangle5.draw();
	}

	private static void constructorInjectionWithTwoConstructorsWithSameNumberOfArgumentsSetPrimitiveValue(
			ApplicationContext context) {
		Triangle4 triangle4 = (Triangle4) context.getBean("triangle4");
		triangle4.draw();
	}

	private static void constructorInjectionWithTwoConstructorsWithDifferentNumberOfArguments(
			ApplicationContext context) {
		Triangle3 triangle3 = (Triangle3) context.getBean("triangle3");
		triangle3.draw();
	}

	private static void constructorInjectionWithSingleArgumentConstructor(ApplicationContext context) {
		Triangle2 triangle2 = (Triangle2) context.getBean("triangle2");
		triangle2.draw();
	}
}