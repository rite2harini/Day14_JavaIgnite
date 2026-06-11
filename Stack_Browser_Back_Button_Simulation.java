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
BEGIN

    // Step 1: Create Stack and push websites
    CREATE Stack browserHistory
    
    PUSH "google.com" TO browserHistory
    PUSH "youtube.com" TO browserHistory
    PUSH "github.com" TO browserHistory
    PUSH "wikipedia.org" TO browserHistory
    PUSH "stackoverflow.com" TO browserHistory
    
    // Step 2: Display all visited websites
    PRINT "Visited websites: " + browserHistory
    
    // Step 3: Simulate Back button twice
    PRINT "Pressing Back Button..."
    
    // First back press
    removedPage1 = POP from browserHistory
    PRINT "Removed: " + removedPage1
    
    // Second back press
    removedPage2 = POP from browserHistory
    PRINT "Removed: " + removedPage2
    
    // Step 4: Display current page
    currentPage = PEEK browserHistory
    PRINT "Current page: " + currentPage

END
