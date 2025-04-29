# Plan for Testing the Program

The test plan lays out the actions and data I will use to test the functionality of my program.

Terminology:

- **VALID** data values are those that the program expects
- **BOUNDARY** data values are at the limits of the valid range
- **INVALID** data values are those that the program should reject

---

## Player name collection 

Do the player names get stored correctly for later use 

### Test Data To Use

Run the program and see if it'll display player names 

### Expected Test Result

The program should print out both player one and player twos username  



## Can the boundaries be used 

Do coins get randomly shuffled into the beginning and end slots (slot 1 and 15)

### Test Data To Use

if the coins cannot be placed on the boundaries then the coins cannot be moved into slot one and then be removed,
making the game unplayable and unwinnable 

### Expected Test Result

Coins get randomly shuffled into the end slots  

---

## Can the user move and remove coins 

When a player enter a coin to move does the code move it. When a player wants to remove a coin does the code remove. 


### Test Data To Use

Enter a move request and enter a remove request. 

### Expected Test Result

Coins move spaces and get removed when asked 

