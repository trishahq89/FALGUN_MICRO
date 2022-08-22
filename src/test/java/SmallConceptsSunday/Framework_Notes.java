package SmallConceptsSunday;

public class Framework_Notes {

	/*Tag name is very important for sanity testing and regression testing
	 * Every feature file has a tage name...there could be 20/30 test cases
	 * if tag name is incorrect in test runner, hard for cucumber to find feature file
	 * Every feature file needs separate step definitions
	 * 20 scenarios has 100 steps under 1 class, does not look organized
	 * we need only 1 Test Runner
	 * 
	 */
	
	
	/*Pre-set up for framework
	 * Selenium
	 * TestNG
	 * Maven
	 * Apache poi
	 * cucumber
	 * Gherkin
	 * Screenshot
	 * Logs
	 * Cucumber HTML report
	 
	 /* Parent class - inheritance concept
	 * we will set up browser - any child can use the browser
	 * will have constructor to connect with configuration file - any child can get the url, username and password
	 * will have method for launching the browser - any chold can come here and launch the browser
	 * in the parent class we will have our webdriver static and global
	 * why global? if parents have everything any child can go and take it
	 * 
	 */
	
	
	/*Apache poi
	 * fileinputstream class - resposible to read the file
	 * properties class - java - respinsible to connect with properties, load the file
	 */
	
	
	//we need constrcutor to initialize the configuration value we are declaring, we are dec value data in config file that is  userid password...constructor is initializing that 
	//then we use fileinputstream class and properties class
	//properties class respisible for working with the file\
	//fileinputstream class - res for going into the file and read
	
	
	
	
	
	
}
