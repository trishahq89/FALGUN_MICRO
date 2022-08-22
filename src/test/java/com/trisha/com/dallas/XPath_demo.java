package com.trisha.com.dallas;

import org.openqa.selenium.By;

public class XPath_demo {

	/*Xpath is one of the most important locators used in Selenium for identifying web elements
	 * Types of Xpath : Absolute xpath and Relative xpath
	 * How do you use locator? we have multiple locators, id, name, linktext, xpath, css locator, first we will use id if not then name if not then linktext
	 * however if we do not find the element then we will go for XPATH (INTERVIEW)
	 * 
	 */
	
	/*ABSOLUTER XPATH:
	 * Copy and paste - not creating them (right click - Copy as full Xpath)
	 * It starts with HTML tag - html is mother tag
	 * It starts with one slash /
	 * Problem: Takes very long time to find the location we are looking for
	 * /html/body/main/section[1]/header/div[2]/div[2]/nav/ul/li[3]/a/span >>> table sometimes changes automatically,hence will not work
	 * if there are any changes made in the path of the element then that Xpath gets failed
	 * it is so long that the code can also break
	 * eg. DAL-HUS-ALT-LA-NJ-NY(Scenario: If no choice sometimes, we can use this)
	 */
	
	/*RELATIVE XPATH:
	 * It is a customized xpath, make our own eg. DAL-NY
	 * It starts with double forward slash //, which means it can search the element anywhere in the webpage
	 * Xpath Functions: contains(), starts-with(),text() >>> functions
	 * 
	 */
	
	/* SYNTAX FOR RELATIVE XPATH:
	 * //TAGNAME[@ATTRIBUTE='VALUE'] = //a[@href='//www.delltechnologiescapital.com'],//a[@role="menuitem"] (205 items)
	 * //TAGNAME[TEXT()='TEXT VALUE'] >>> plain text = //span[text()='Checking']
	 * //TAGNAME[CONTAINS(TEXT(),'TEXT VALUE)] = //a[contains(text(),'CATEGORIES')] dell>>categogire>>> SEE BELOW
	 * //a[contains(text(),'CA')]
	 * look for unique location, eg delivery for food (1 of 1)>>>se tells the webdriver go to unique location and do some action
	 */
	
>> if text() function, linktext or attribute does not work, try contains() function	but the location has to be unique
	>>however, if none works, we can always copy paste that is go for Absolute Xpath
			 
//	<a role="menuitem" href="//www.delltechnologiescapital.com" data-tier-id="7" tabindex="0">Dell Technologies Capital</a>
	/*you can go with linktext, plain text, attribute value
	 * 4 attributes are there is this <a>
	 * href here is an Attribute, value is the link
	 * //a[@role="menuitem"]
	 * if it doesnt work go for text() function
	 *
	 */
			 
//if 1 of 2, selenium will be confused which one to take, in this scenario attribute function will not work			 
	
	 
	 /* contains() function >>> need plain text, inside contains() function there is text() function
	  * //p[contains(text(),'IMPROVED HELP &')]>>> part of whole text
	  * 
	  * 
	  */
	 
// why using single quotation for attributes?
	//driver.findelement(By.xpath("//a[@role=\"menuitem\"])); >>> it is showing extra backward slash which will be problematic
	
	
	
	
	
	
	
	
	
}
