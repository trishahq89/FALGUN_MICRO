package SmallConceptsSunday;

public class Cucumber_Notes {
	//2 things to check before we start, cucumber plug in and testng must be ready
	/* Create a project, delete src main
	 * in Cucumber, need a src folder for feature file, so rightclick on project >>> Source folder >>> name it: src/test/resources
	 * inside that source folder, create a new folder >>> Features
	 * under the features file >>> right click >>> FILE >>> FILE NAME: cartNew.feature //without dot feature cucumber wont work with it>>need to use the extension
	 * put the scenarios in the feature file
	 * still not cucumber project, hence right click on project and go to CONFIGURE >>> CONVERT TO CUCUMBER PROJECT
	 * Then save it, will see yellow errors
	 * add the dependency
	 * make the step definition 
	 * create new package under src/test >>> stepdefi >>> class >>>> link your name with feature file since there could be many feature files
	 * 
	 */
	
	/*Manual test case:(do without login)                               //this test case will be converted to bdd test cases	
	*Verify user added item in  cart
	*step 1 : launch the application url
	*Step 2: click samsung S6
	*Step 3: click add to cart
	*Step 4: pop up, click ok, add to cart
	*Step 5: Verify item added in Cart
	*
	*/


/*Gherkin Language 
 * it is the language Cucumber uses to define test cases
 * it is non-technical (no coding)
 * Human readable
 * Gherkin SYNTAX: Given,When,But,Then,And,Or, etc.
 * with the help with these keywords we make test cases
 * incorporate these keywords in the test cases below
 * (INTERVIEW) What is Gherkin language? It is the language we use to write BDD format test cases in Cucumber, by using Gherkin keywords/syntax given, when, then, but, etc.
 */
	
	/*BDD Format test case:(do without login)                               //instead of steps we will write those keywords
	*Scenario: Verify user added item in  cart(test case name)      //BDD is popular bc it is plain english thats why these keywords, hr, manager has no coding knowledge but they will understand these test cases since its plain english
	*Given Launch the application url                              //first step is always given by default
	*Then click samsung S6
	*When click add to cart
	*Then pop up, click ok, add to cart
	*then Verify item added in Cart
	*
	*/
	
	//How will cucumber work? It will work with SE, write the code by SE and write the test cases by Cucumber BDD format
	//automation - Cucumber, manual -SE
	
	/*BDD (Behavior-driven Development)
	 * It is an extension of TDD (tdd framework made with testNG)
	 * it focuses on what to test, NOT how to test
	 * uses plain english to explain what is the exact requirement
	 * it uses Gherkin language
	 * 
	 */
	
	/*Cucumber
	 * it uses text file but uses the extension called .feature(dot feature) insetad of .txt(dot txt)
	 * if we are working on login, login feature/user story -10/20 test cases under 1 feature
	 * every user story has 1 feature
	 * for login, we will not only write 1 test case, we can write as many as we want
	 * the feature file name should be whatever userstory we are working on
	 * create a class, which is test runner class, need test runner to run the test. This class is for running the test only
	 * (INTERVIEW) what is test runner? Test runner class is where we run our test
	 */
	
	/* Step definition: it is everytime we write code for one step it is called step definition
	 * if there are 25 steps, write code 25 times, each time it is step definition
	 * it is a piece of program/code/method that defines the steps
	 * cucumber gives us the methods, we do not need to create it
	 * test runner class is responsible to run our tests, IT NEEDS TO KNOW WHERE IS THE TEST LOCATION >>CUCUMBEROPTIONS
	 * TAGS is for specific test case from feature file, if feature file has 5 test cases but I would like to run 1 test case at a time, give them some name and run it
	 */
	
	/*Cucumber Hooks(INTERVIEW)
	 * it is pre and post request
	 * if we have 20 test cases, launch the url 20 times, @Before
	 * after every test cases, url will be closed, then @After
	 * 
	 */
	
	
	/*Need library or dependency
	 * Cucumber needs bunch of dependency (Required jars)
	 */
	//need resource folder>>>right click on Project>>>source folder>>>type src/test/resources
	//inside this folder, create a normal folder
	
	/* how to make Cucumber file?(INTERVIEW)
	 * MAKE FILE WITH DOT FEATURE EXTENSION
	 * 
	 */
	
	
	/*testng.xml >>> this file created by testNG, follow rules what and how we are going to run
	 * right click on project>>> testng >>> convert to testNG
	 * Need two different information : 1. know the package name for test runner class >>>com.CucumberIntro.Cucumber
	 * 2. what is the test runner class name >>>Testrunner
	 * run as testng SUITE
	 * Run multiple classes, test cases at a time
	 * NOT FOR local, if want to run in multiple places
	 */
	
	
	
	/*suitexml >>> it is a testing.xml file given by testNG
	 * why we need this? this file tessting.xml file help us to run our code from JENKIN, CMD, multiple classes at a time
	 * how to create a testing.xml file?
	 * right click on Project >>> testNG>>> convert to testNG
	 * testng file will open...we need this one to run our code for different purpose...this file is made from xml code but need to add sth here
	 * 2 different info needed : add classes and test runner class name
	 * class name >>> need to know what is the p[ackage name for test runner class?
	 * class name >>> test runner class name
	 * run both ways...from left 
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
