package com.OfficeHoures.day3;

public class Notes {
    /*

- WebTables

        Tables are made of <thead> and <tbody>

        	<thead> --> this is the table header, here we have table column names
        		<tr> table row, indicates one whole row
        			<th> --> this tag indicates a cell that is used for table headers

        	<tbody> this is where the data is
        		<tr> table row, indicates one whole row
        			<td> --> cell in a table body



- iFrame
        1.NameOrID
    		        driver.switchTo().frame("nameOrId");
    	2.Index
    		        driver.switchTo().frame(0); // index  starts from  0,1,2,3,4,5,6,7 etc...
    	3.WebElement
             		WebElement iframe=driver.findElement(By.tagName("iframe"));
    			    driver.switchTo().frame(iframe);

    	== Turning Back to Parent Or Main Page ==
    	1. First way to switch Parent Frame / Main HTML ONLY One step back
    		driver.switch().parent();

    	2. Turning back first frame (Main HTML) when we have multiple iframes
    		driver.switchTo().defaultContent();

  Examples :

  HTML(Default Content)

  	0frame-top(parent frame)
  		0 left
  		1 middle
  		2 right
  	1frame-bottom

    NOTE :
        - We can only switch one at a time, cannot switch to grandchild directly.
		- Cannot switch to siblings, only parent to child


- FileUpload

    - How to get the Path of the file ?

     		MAC

    			1.Right click on the file
    			2.Hold option key
    			3.Select option Copy "file.txt" as Pathname

    		WINDOWS

    			1.Hold Shift button
    			2.Right click on file
    			3.Copy as Path



- Windows and Tabs

    - In selenium there is no difference between tabs and windows.
    - By default selenium controls one html page.
    - When we open the page first time it points that page only.
    - When we open a new tab/window, it will still be looking at the old window.
    - To do any interaction with the new window we have to switch to new window.

   How ?

    - driver.switchTo().window(handle);

        handle--> unique identifier for windows    CD......

    	driver.getWindowHandle() --> returns the handle of the current windows

    	driver.getWindowHandles()--> returns the set of the all open windows.


- Action

    - Actions class is used to do advanced user interactions like mouse hover, double click, drag and drop etc.
    - Actions class is a class comes from selenium and is created by passing the webdriver object as constructor.

        Syntax :   Actions actions = new Actions(driver) ;







- JSExecutor
    - JavaScriptExecutor and WebDriver both are interfaces.
    - The only relationship between them is, both are implemented in RemoteWebDriver class.
    - When we want to run JavaScript we type cast the driver to JavaScriptExecutor then we call executeScript method.

    Syntax :
        - JavascriptExecutor jse = (JavascriptExecutor) driver;




- Explicit Wait

        - Sometimes we might locate the element but we cannot interact with it within certain time.
    	- We have to wait until it is visible, clicikble, enabled,has certains text or dissapear.
    	- When we have to wait for these cases, we will use explicit wait.

        Syntax :
            WebDriverWait wait = new WebDriverWait(driver,10);
            wait.until(ExpectedConditions.elementToBeClickable(inputBox));

       - ExpectedConditions-->contains conditions for wait that we can wait using WebDriverWait
       - Explicit wait waits for the condition to complete, once the condition is met, it will stop waiting(dynamic) .


    IMPLICITLY WAIT
        - call it once,(set of driver)
        - waits while trying to findElement
        - wait until element found or time runs out(dynamic)
        - applies for all findElement methods

    EXPLICITLY WAIT
        - call every time you need it
        - wait until condition is met or time runs out(dynamic)
        - waits for different conditions(interactible,visible,invisible,text,clicible etc)
?? 2021 GitHub, Inc.
     */
}
