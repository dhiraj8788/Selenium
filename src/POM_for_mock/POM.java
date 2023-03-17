package POM_for_mock;

public class POM 
{
	/*
	 * 					Page Object Model (POM)
	 * 	
	 * 	it is java design pattern used to design of classes in test scripts
	 * 
	 * WebPages are represented as classes like (No of WebPages = no of classes)
	 * 
	 * The WebElements represents as variables in class
	 * 
	 * POM follows Encapsulation concept like
	 * - Variables should be declare as globally with private access specifier using @findBy Annotation 
	 * 
	 * - @FindBy annotation is used to locate and declare WebElements using different locators in page factory
	 * 
	 * 
	 * 
	 * 		To use POM
	 *  Step 1. 
	 *  	create classes respective Web pages
	 *     
	 *  Step 2.
	 *  	declare variables respective WebELement on which we perform action by using @FindBy annotation
	 *  
	 *  Step 3. 
	 *  	Initialize public parameterized constructor using page factory and pass object of WebDriver as parameter of constructor
	 *  
	 *  Step 4.
	 *  	call the static initElements(); present ppageFactory class in block of constructor
	 */
	

}
