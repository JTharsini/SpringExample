package com.jeya.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
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
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring2.xml");
		context.registerShutdownHook();
		//getByIdDependencyInjection(context);
		//getByIdConstructorInjection(context);
		//getByAlias(context);
		//getByName(context);
		//injectingObjects(context);
		//collectionsAsAttributes(context);
		//autoWireByName(context);
		//autoWireByType(context);
		//autoWireByConstructor(context);
		//applicationContextAware(context);
		//beanNameAware(context);
		//beanDefinitionInheritancea(context);
		//callBackMethods(context);
		((ClassPathXmlApplicationContext) context).close(); // suitable only for desktop application
	}

	private static void beanDefinitionInheritancea(AbstractApplicationContext context) {
		//beanDefinitionInheritance(context);
		//beanDefinitionInheritanceWithCollectionOverride(context);
		//beanDefinitionInheritanceWithCollectionMerge(context);
		//beanDefinitionInheritanceParentClassAbstract(context);
	}

	private static void callBackMethods(AbstractApplicationContext context) {
		System.out.println("***************************************************************************************");
		//thingsToDoWhenInitializingBean(context);
		//thingsToDoWhenDisposingBean(context);
		//thingsToDoWhenInitializingBeanByXml(context);
		//thingsToDoWhenDestroyingBeanByXml(context);
	}

	private static void thingsToDoWhenDestroyingBeanByXml(AbstractApplicationContext context) {
		TriangleWithPoints14 triangleWithPoints14 = (TriangleWithPoints14) context.getBean("triangleWithPoints14");
		triangleWithPoints14.draw();
	}

	private static void thingsToDoWhenInitializingBeanByXml(AbstractApplicationContext context) {
		TriangleWithPoints13 triangleWithPoints13 = (TriangleWithPoints13) context.getBean("triangleWithPoints13");
		triangleWithPoints13.draw();
	}

	private static void thingsToDoWhenDisposingBean(AbstractApplicationContext context) {
		TriangleWithPoints12 triangleWithPoints12 = (TriangleWithPoints12) context.getBean("triangleWithPoints12");
		triangleWithPoints12.draw();
	}

	private static void thingsToDoWhenInitializingBean(AbstractApplicationContext context) {
		TriangleWithPoints11 triangleWithPoints11 = (TriangleWithPoints11) context.getBean("triangleWithPoints11");
		triangleWithPoints11.draw();
	}

	private static void beanDefinitionInheritanceParentClassAbstract(ApplicationContext context) {
		System.out.println("***************************************************************************************");
		//TriangleWithPoints10 triangleWithPoints10 = (TriangleWithPoints10) context.getBean("triangleWithPoints10");
		//Exception in thread "main" org.springframework.beans.factory.BeanIsAbstractException: Error creating bean with name 'triangleWithPoints10': Bean definition is abstract
	}

	private static void beanDefinitionInheritanceWithCollectionMerge(ApplicationContext context) {
		System.out.println("***************************************************************************************");
		TriangleWithPoints9 triangleWithPoints9 = (TriangleWithPoints9) context.getBean("triangleInherited9");
		triangleWithPoints9.draw();
		// child list elements are merged with parent definition list
	}

	private static void beanDefinitionInheritanceWithCollectionOverride(ApplicationContext context) {
		System.out.println("***************************************************************************************");
		TriangleWithPoints8 triangleWithPoints8 = (TriangleWithPoints8) context.getBean("triangleInherited8");
		triangleWithPoints8.draw();
		// override list elements by child definition
	}

	private static void beanDefinitionInheritance(ApplicationContext context) {
		System.out.println("***************************************************************************************");
		
		TriangleWithPoints7 triangleWithPoints71 = (TriangleWithPoints7) context.getBean("triangleInherited1");
		triangleWithPoints71.draw();
		
		System.out.println("***************************************************************************************");
		
		TriangleWithPoints7 triangleWithPoints72 = (TriangleWithPoints7) context.getBean("triangleInherited2");
		triangleWithPoints72.draw();
	}

	private static void beanNameAware(ApplicationContext context) {
		TriangleWithPoints6 triangleWithPoints6 = (TriangleWithPoints6) context.getBean("triangleWithPoints6");
	}

	private static void applicationContextAware(ApplicationContext context) {
		TriangleWithPoints5 triangleWithPoints5 = (TriangleWithPoints5) context.getBean("triangleWithPoints5");
		triangleWithPoints5.initializePoints();
		triangleWithPoints5.draw();
	}

	private static void autoWireByConstructor(ApplicationContext context) {
		TriangleWithPoints4 triangleWithPoints4 = (TriangleWithPoints4) context.getBean("triangleWithPoints4");
		triangleWithPoints4.draw();
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