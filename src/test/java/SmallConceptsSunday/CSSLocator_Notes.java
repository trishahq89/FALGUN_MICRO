package SmallConceptsSunday;

public class CSSLocator_Notes {

	
	/*CSS locator mostly used by developers
	 * Why need CSS? extra power to find web elements if id, name linktext all those fail
	 * Create a sticky for convenience
	 * 
	 * 
	 */
	
	
	/* CSS locator using single attribute
	 * SYNTAX: tagname[attribute='value']
	 * ex: input[id='username']
	 */
	
	/* CSS locator using ID and class name (use values) (MOSTLY USED)
	 * SYNTAX: tagname#id, ex: span#nav-link-accountList-nav-line-1
	 * SYNTAX: tagname.classname, ex: span.nav-line-1 nav-progressive-content
	 */
	
	/* CSS locator using ends with (need plain text)
	 * SYNTAX: tagname[attribute$='value']
	 * ex; h2[class$='a-color-base headline truncate-2line']
	 * ends with and start is not that popular
	 * partial text (ends with/starts with)
	 * starts with syntax: tagname[attribute^='value']
	 */
	
	/*CSS locator using Contains
	 * syntax: tagname[attribute*='value']
	 * div[class*="navbar-collapse"] >>> div[class*="navbar"] >>>1 of 1
	 */
	//CSS lcoator is one of the locators that we can use to find a web element 
	//Step definition is a method to define every cucumber steps of the tests eg. click on log in button 
	//Cucumber hoops: @Before and @After: prerequest and post request, before start the test launch the url and after every test case is complete close the url. It is done by testNG annotation @. TestNG is a small program that control our test
}
