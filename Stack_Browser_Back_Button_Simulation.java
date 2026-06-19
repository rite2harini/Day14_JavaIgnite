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
INITIALIZE Stack as browserHistory

PUSH "google.com" onto browserHistory
PUSH "youtube.com" onto browserHistory
PUSH "github.com" onto browserHistory
PUSH "wikipedia.org" onto browserHistory
PUSH "stackoverflow.com" onto browserHistory

PRINT "Visited websites: " + browserHistory

PRINT "Pressing Back Button..."

SET removedPage1 = POP from browserHistory
SET removedPage2 = POP from browserHistory

PRINT "Removed Page 1: " + removedPage1
PRINT "Removed Page 2: " + removedPage2

SET currentPage = PEEK from browserHistory

PRINT "Current Page: " + currentPage
