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

*/START

Create Stack browserHistory

Push "google.com" into browserHistory
Push "youtube.com" into browserHistory
Push "github.com" into browserHistory
Push "wikipedia.org" into browserHistory
Push "stackoverflow.com" into browserHistory

Display "Visited Websites:"
Display browserHistory

Display "Pressing Back Button..."

removedPage1 = Pop top element from browserHistory

removedPage2 = Pop top element from browserHistory

Display "Removed Page 1: " + removedPage1
Display "Removed Page 2: " + removedPage2

currentPage = Peek top element from browserHistory

Display "Current Page: " + currentPage

END
