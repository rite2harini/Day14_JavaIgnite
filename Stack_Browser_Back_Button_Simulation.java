want the pseudo code for 
/*
A browser stores visited pages in a Stack.

Requirements:
Push 5 website names into a Stack.
Display all visited websites.
Simulate pressing the Back button twice.
Display the pages that were removed.
Display the current page after going back.
Concepts Tested:
Stack
push()
pop()
peek()

Instructions-
Create a Stack called browserHistory

Push the following websites into the Stack:
    google.com
    youtube.com
    github.com
    wikipedia.org
    stackoverflow.com

Display all visited websites

Print "Pressing Back Button..."

Remove the top website from the Stack
Store it in removedPage1

Remove the next top website from the Stack
Store it in removedPage2

Display removedPage1

Display removedPage2

Get the current page using peek()
Store it in currentPage

Display currentPage

*/
    1.create a Stack called browserHistory
    
2.then ask how many websites is needed to be pushed(Here qn says 5)
                                                    
3.then make a loop and run for the number of websites needed to be inputed....take the input and push it into the stack
    by using push() function
    
4.then display it by using sop(browserHistory)
    
5.print "Pressing Back Button..."
    
6.then by using pop() function remove the top website and store it in removed page1
    
7.repeat steps 5 & 6 to remove the 2nd website
and then print removedPage1 and removedPage2
    
8.print the current page using peek() and store it in currentpage and print it
