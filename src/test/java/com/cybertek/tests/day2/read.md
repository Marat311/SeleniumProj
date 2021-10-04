Day 2 Note
Recap on

What's Selenium
How to set it up in Maven Project
How to run initial browser navigation
Recap on

Navigation methods :
driver.get("Your Full URL")
driver.navigate().to("Your Full URL")
driver.navigate().back()
driver.navigate().forward()
driver.navigate().refresh()
Close the browser :
driver.close()
driver.quit()
Window management methods
driver.manage().window().fullscreen();
`driver.manage().window().maximize();
Inspecting elements to learn about tag and attributes
findElement(By.id("unique id"))
findElement(By.name("name goes here"))
findElement(By.linkText("text of <a> tag"))
FaceBook Homework practice
Homework will be practice outside class, let's practice part of it again for now.

Steps :
Open Chrome and Navigate to https://facebook.com
Enter username invalid username into username box
Enter password some password password box
Click on the Login button and wait few seconds until error comes back
Navigate back to log in screen
Click on forget password link
Enter something into Mobile number text box 123456789
Click on the search button
Click on the cancel button
Quit the browser
If your Facebook page is behaving anything different that what you see, follow the actual screen and identify elements along the way and make your flow pass.

Here is the partial solution :

    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();

    driver.get("https://www.facebook.com/");

    // name : email , pass , login

    WebElement emailBox =  driver.findElement(By.id("email")) ;
    emailBox.sendKeys("some email here");

    WebElement passwordBox = driver.findElement(By.name("pass")) ;
    passwordBox.sendKeys("bla bla");

    WebElement loginBtn = driver.findElement(By.name("login")) ;
    loginBtn.click();

    Thread.sleep(5000);

    WebElement forgetLink = driver.findElement(By.linkText("Forgot Password?")) ;
    forgetLink.click();

    //TODO : Finish the rest
    
    // quit the browser
    driver.quit();
Find Element(s) by LinkText and Partial LinkText
There are two methods specifically designed to work with links(<a> tag)

For example in this class we did this

WebElement addOrRemoveLink = driver.findElement(By.linkText("Add/Remove Elements"));
addOrRemoveLink.click();

// click on "Home" link to go back to home
// if you don't have any need to store the element
// you can directly click as below
driver.findElement(By.linkText("Home")).click();

// or provide part of the link and use By.partialLinkText
WebElement addOrRemoveLnk2 = driver.findElement(By.partialLinkText("Add/Remove"));
addOrRemoveLnk.click();
findElement method will always return first match from the criteria defined. For example : if you use By.partialLinkText("A") , It will just return very first link from the top in html hierarchy.

Getting Text value in Element getText
It's possible to extract the text in the html element

<tagName> This Text I am talking about </tagName>
In previous example , we have identified element using partial link text and if we wanted to know the full link text, we could use getText() method on WebElement object.

WebElement addOrRemoveLnk = driver.findElement(By.partialLinkText("Add/Remove"));
System.out.println("addOrRemoveLnk.getText() = " + addOrRemoveLnk.getText() );
// or you could save it in a String variable
String fullText = addOrRemoveLnk.getText();
shortcut to quickly type below is addOrRemoveLnk.getText().soutv then hit Enter

We will learn more about getting attributes of elements in next class.

Finding Multiple Elements using findElements
What if we wanted to store all the elements that match the locator condition?

For example in above scenario we want to store all the links that have partial text of "A".

findElement	findElements
0 Matches	NoSuchElement Exception	return empty List<WebElement>
1 Matches	return WebElement object	return List<WebElement> with size() 1
2+ Matches	return firstWebElement object	return List<WebElement>
Now we can go ahead and use findElements to get all the links as below.

List<WebElement> allLinks = driver.findElements(By.partialLinkText("A"));
Since it's a List you can use any methods you already know for example : Get the size of this list, so we know how many link with partial text A

System.out.println("allLink.size() = " + allLinks.size());
Get the first item and get the text

WebElement firstItem = allLinks.get(0);
System.out.println("firstItem.getText() = " + firstItem.getText());
Get the second item and get the text

WebElement secondItem = allLinks.get(1) ;
System.out.println("secondItem.getText() = " + secondItem.getText());
Or iterate over the list and get all of them

for( WebElement eachElement :allLinks ){

    System.out.println("eachElement.getText() = " + eachElement.getText());

}
We will use both findElement and findElements more as we progress to learn different type of locators

Homework 1:
navigate to https://google.com
search for selenium
click google search button
identify the div that hold the search result count on next page About 95,900,000 results (0.58 seconds)
get the text of that element
Optionally , if you want some java practice , go ahead and extract the number of result and save it into long variable OPTIONALLy
get all the link that contain text selenium into a List
get the count
get the first one text
get the last one text
iterate over the list and print the text of each link
watch the short to learn more about findElement(By.tagName("tag here"))
watch the short to learn more about element.getAttribute("attribute goes here")
Homework 2
open chrome and navigate to http://zero.webappsecurity.com/
verify the title is Zero - Personal Banking - Loans - Credit Cards with if statement
click on signin button
verify the title is "Zero- Log in"
enter text as "username" into username box
enter text "password" into password box
submit by clicking login button
verify you are at "Zero - Account Summary" page by checking title
now use your imagination to play around here and explore , automate within the capacity we already have so far.