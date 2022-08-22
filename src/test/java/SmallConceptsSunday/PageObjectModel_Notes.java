package SmallConceptsSunday;

public class PageObjectModel_Notes {

	/*Page Object Model
	 * given by Maven
	 * it is a design pattern, not a framework.It is GIVEN BY MAVEN TO USE IN FRAMEWORK.  (INTERVIEW)
	 * work page by page eg. 200 pages in an application. Benefit? 5 test cases for log in page, 5 for 	Contact page. If sth fails in contact page, we will look for contact page
	 * Test cases from individual pages should be in respective pages, 200 pages requiore 200 classes
	 * eg. 5 user story 5 feature file >>> 200 pages need 200 classes
	 * Advantages: everything separate so easy to read. Also easy to maintain, readable format, reusable scripts
	 * reusable: copy paste anywhere it will work
	 * Test case 1 : homepage,login,account
	 * launch url :homepage...one after another....3 pages for 1 test case.If any problem with account...go to account page..easy to find.We will know where it failed instead of looking at 5000 scripts
	 *will not use driver.blablabla....maven has syntax: @FindBy
	 *2 ways to implement: using normal approach(driver.findelement) and using PageFactory and @findBy (given by Maven)
	 *both we can use but maven suggests maven syntax (industry follows the same)
	 *POWER TO ORGANIZE TO DO THINGS AND REUSE THINGS
	 *
	 */
	
	/*Constructor is a special type of method that does not have any return value
	 * constructor name = classname
	 * wihtout constructor the framework will not work
	 * 
	 */
	
	/*Maven commands:(INTERVIEW)
	 * clean,compile,install,package,deploy
	 * package and deploy are used by developers
	 */
	
	/*Configuration file
	 * giving power to run the project smoothly
	 * configure our test data, inorder  to test we need these data
	 * save username/id/password
	 * reuse some activity
	 * save url
	 * save browser information
	 * set up
	 * made by hashMap...key or paired value
	 * eg: url1 = bankofmaerica.com, username = Jahan
	 * extension is dot properties (.properties)
	 */
	
	//Scenario: Verify User Log in successfully
	Given Launch url (homepage)
	Then Click login (homepage)
	Then Enter username and password (Login Page)
	Then Click Login (Login Page)
	Then Verify user login successfully (ProfilePage)
	
	//Maven says all the pages need separate classes, worry about 1 page...not all, every page has its own class
	
	/*Framework:
	 * create a maven project, delete src/main/ and under src/test delete the package
	 * create resource folder for feature >>> then folder
	 * create testng file >>> right click >>> testng >>>convert as testng
	 * 6 PACKAGES UNDER src/test: Test Runner, Step Definitions, Action, Configuration, Locator and Utility 
	 * check lecture#23 on your copy
	 * configure package: under src/test/java>>> com.falgun.configure
	 * same for locator, action, testrunner, 
	 * step deifinitions >>> no com.falgun
	 * Utility package >>> it is for using later sometimes whenever needed
	 * src/srouce folder for FEATURES
	 * 
	 * 
	 * webDriver folder: Driver>>> it will be under the project>>> right click on folder>>>create a folder
	 * Screenshot Folder>>> rightclick on poroject>>> folder>>>
	 * testNG.xml file
	 * update POM >>> change project name >>>>change suitexml >>>>right click on testng.xml go to properties, copy paste the location
	 * now go to testng.xml >>> copy paste>>>take package name of the test runner and class name of the test runner
	 * 16.29
	 */
	//update project to maven
	
	/* create configuration file >>> right click under confiuration file >>> new >>> file >>> configure.properties
	 * action & locator >>> in 1 test case working with 3 pages c:Home, login, profile.Hence under action, we need three classes since 3 pages
	 * for each of these classes, we need locators as well but the name should be the same
	 * 
	 */
	
	//JAva giving us paramter, create a method with parameter, make url dynamic, cannot pout it everytime, make it robust, it will be String
	//arg1 is a parameter....type URL >>>parameter is an argument >>>> String URL
	
	/* Utility package
	 * under this will be a class called parent class
	 * but industry uses a different name : base class
	 */
	
	
	
	
}
