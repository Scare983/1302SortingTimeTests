TO COMPILE:
javac -d classes -cp ./junit-4.12.jar src/main/java/cs1302/lists/*.java src/test/java/cs1302/lists/*.java

*/
To EXCECUTE DRIVER CLASS:
go into DIRECTORY classes/
type 
$java Driver










/* Created by Kevin Linnane (811190857)
* #include "Driver.java"
* #include "List.java"
* #include "Node.java"
* #include "ArrayList.java"
* #include "LinkedList.java"
* #include "DoubleLinkedList.java"
* 
*/

Data is in TIME(MicroSeconds): 
The person searching for was not in the list to make sure it was worst case scenario.
FIGURE 1.1 - Data
 ___________________________________________________________________
|  ArrayList Records	|Prepend | Append | Get	  | Remove | Search |
|  10			| 8.7	 | 6.3    | 5.0   | 6.3    | 17.7   |
|  1,000		| 34.1   | 29.6   | .73	  | 36.6   | 411.9  |
|  10,000		| 360.2  | 362.0  | 1.5   | 391.0  | 772.2  |
|  100,000		| 1212.6 | 3325.2 |1.7    | 3230.8 | 3618.4 |	
|			|	 |	  |	  |	   |	    |   
|_______________________|________|________|_______|________|________|


FIGURE 1.2
 ___________________________________________________________________
|  LinkedList Records	|Prepend | Append | Get	  | Remove | Search |
|  10			| 6.8    | 5.3    | 6.3   | 3.5    |  10.3  |
|  1,000		| 1.0    | 1.0    | 9.0	  | 11.8   | 58.3   |
|  10,000		| 4.0    | 2.2    | 101.0 | 116.7  | 526.8  |
|  100,000		| 9.4    | 3.4    | 1038.1| 1145.2 | 4650.5 |	
|			|	 |	  |	  |	   |	    |   
|_______________________|________|________|_______|________|________|


FIGURE 1.3
 ___________________________________________________________________
|  DLinkedList Records	|Prepend | Append | Get	  | Remove | Search |
|  10			| 3.5	 | 3.0    | 6.7   | 3.6    | 10.6   |
|  1,000		| 1.5    |  .60   | 13.0  | 9.8    | 51.1   |
|  10,000		| 2.7    | 0.60   | 133.5 | 141.0  | 845.0  |
|  100,000		| 7.6    |  .762  |2081.3 | 962.0  | 3841.3 |	
|			|	 |	  |	  |	   |	    |   
|_______________________|________|________|_______|________|________|

THESE WERE THE INPUTS:
populated an array of 10000 People:
Prepending Jackie Chan
Appending John Cena 
Getting person at index 5000  
Removing person at index 5000 
Search for person not in list
__________________________________________________________________________________________________________________________________________

/*
*Introduction/Speed
*/
	To start off with, I decided on using People Object for the type within the Arrays. For each person, 
they had a Name, Proffession, and a Height.  This was to ensure that the time to run a method would be larger than
an integer/string/primative datatype because more memory is being passed around.  To my surprise, the
time it took to iterate and end a method was astonishingly fast at 100,000, I had to change the orignal milliseconds
to nanoseconds to get a better judge of time. While doing this, I could more accurately see where I had lost time,
however becuase the numbers are so small, on each run proccess, it could change dramatically.  While it was 
fast, I could not finish the run process when there were 1,000,000 people.  Nike would always timeout and I couldn't get the
data I wanted.  

___________________________________________________________________________________________________________________________________________

/*
*A closer Look at my methods
* Typedef WorstCaseScenario = wcs
*/
__________
ArrayList |
__________|
	Prepend::O(N) Method contains one for loop and the the parameters within the loop don't change the #of loops.
	Append:: O(N) Method contains one for loop and the the parameters within the loop don't change the #of loops.
	Add::    O(N)  Method contains one for loop and the the parameters within the loop don't change the #of loops.
	Get::    O(1) Gets the location.  No loop needed, always runs once.
	Remove:: O(N) Goes through loop, recopying array into a temp array, and avoiding the one it is supposed to remove.
	Search:: O(N)  If it finds what it is looking for, it leaves loop, otherwise wcs it looks at entire array.
	
	Total = 5(N)
	When compared to Actual table's average and wcs: 
	Add/Prepend/Append:: O(N) wcs O(N)
	Get::    	     O(1) wcs O(1)
	Remove::	     O(N) wcs O(N)
	Search:: 	     O(N) wcs O(N)

	My Results: 
	Implementation: Spot on!

___________
LinkedList | 
___________|
	Prepend:: O(1) calls add method, which runs once because index is 0 and no loop within add method.
	Append::  O(1) No Loops within method and executes once no matter what.
	Add::     O(1) No Loops within method and executes once no matter what.
	Get::	  O(N) starts from the beggining and loops until at the index, if index at the end, then wcs.
	Remove::  O(N)  Runs through each Node until it gets to the right index. 
	Search::  O(N)  If it finds what it is looking for, it leaves loop, otherwise wcs it looks at every node.

	When compared to Actual table's average and wcs:
	Add/Prepend/Append:: O(1) wcs O(1)
	Get::   	     O(N) wcs O(N)
	Remove::	     O(1) wcs O(1)
	Search::	     O(N) wcs O(N)

	Total = 3(N)
	My Results:
	Implementation: Remove method was off by *N. 	  
 
____________
DLinkedList |
____________|

	Prepend:: O(1) Runs once. Contains 3 if statements and no loops
	Append::  O(1) Runs once.  No loops included  
	Add::	  O(N) Runs once if index is at 0 or at end, otherwise runs N number of times.
	Get::     O(N) Mixed it up and added a do while loop to get to the right node based off the index.  
	Remove::  O(N) if index is 0 or index is the last size, method runs once, otherwise goes into while loop N times.
	Search::  O(N) If it finds what it is looking for, it leaves loop, otherwise wcs it looks at every node.

	Total = 4(N)
	When compared to Actual table's average and wcs:
	Add/Prepend/Append:: O(1) wcs O(1)
	Get::   	     O(N) wcs O(N)
	Remove::	     O(1) wcs O(1)
	Search::	     O(N) wcs O(N)

	My  Results:
	Remove and add were off by *N


___________________________________________________________________________________________________________________________________________

/*
*Analysis
*/
	Based on our bigO notations listed above, we can expect that LinkedList will be the fastest as the array is larger, followed by DLinkedList and lastely ArrayList.
However this was not the case.  Figures 2.1 to 2.5(shown below) shows a side by side comparisons of each method that was called to each of the list classes implemented.
For the most part, DLinkedList shown to execute the fastest or closest to the fastest, in multiple populations and methods (except get).  Overall becuase the time is in microseconds,
these results can vary by a large amount on each run.  However, LinkedList and DlinkedList do show to be similiar in speed for each method.  The ArrayList is considerablly slower 
than the two other lists except within the get method, which it excels in speed.

	Overall, if you were coding for a database that doesn't move memory around a whole bunch and just gets information, then the arrayList would be the best option.  However, 
if the job calls for consistent memory change, then LinkedList or DLinkedList would be the better option.  A DlinkedList in general takes up more memory because each node has knowledge of 
it's previous and next node, while the LinkedList only has information based on its next Node.  This means that you can get to any node and can move reverse, while a LinkedList is linear and will only let you
move forward.  



___________________________________________________________________________________________________________________________________________
FIGURE 2.1 - Comparisons
Preppending:
 __________________________________________________________
| 			|               Preppending        |
|_______________________|____10_____1000____10000___100000_|
|  ArrayList Records	| 8.7	 | 34.1   | 360.2 | 1212.6 |
|  LinkedList Records	| 6.8    | 1.0    | 4.0   | 9.4    | 
|  DLinkedList Records 	| 3.5    | 1.5    | 2.7   | 7.6    | 
| 			|        |        |       |        | 
|			|	 |	  |	  |	   |   
|_______________________|________|________|_______|________|

Figure 2.2 
Appending:
 __________________________________________________________
| 			|               Appending          |
|_______________________|____10_____1000____10000___100000_|
|  ArrayList Records	| 6.3	 | 29.6   | 362.0 | 3325.2 |
|  LinkedList Records	| 5.3    |  1.0   |   2.2 | 3.4    | 
|  DLinkedList Records 	| 3.0    |   .60  |    .60| .762   | 
| 			|        |        |       |        | 
|			|	 |	  |	  |	   |   
|_______________________|________|________|_______|________|

Figure 2.3
Get:
 __________________________________________________________
| 			|               Get                |
|_______________________|____10_____1000____10000___100000_|
|  ArrayList Records	| 5.0	 |  .73   | 1.5   | 1.7    |
|  LinkedList Records	| 6.3    |  9.0   | 101.0 | 1038.1 | 
|  DLinkedList Records 	| 2.7    | 0.60   | 133.5 | 141.0  | 
| 			|        |        |       |        | 
|			|	 |	  |	  |	   |   
|_______________________|________|________|_______|________|

Figure 2.4:
Remove:
 __________________________________________________________
| 			|               Remove             |
|_______________________|____10_____1000____10000___100000_|
|  ArrayList Records	| 6.3	 | 36.6   | 391.0 | 3280.8 |
|  LinkedList Records	| 3.5    |  11.8  | 116.7 | 1145.2 | 
|  DLinkedList Records 	| 3.6    | 9.8    | 141.0 | 962.0  | 
| 			|        |        |       |        | 
|			|	 |	  |	  |	   |   
|_______________________|________|________|_______|________|

Figure 2.5
Search:
 __________________________________________________________
| 			|               Search             |
|_______________________|____10_____1000____10000___100000_|
|  ArrayList Records	| 17.7	 | 411.9  | 772.2 | 3618.4 |
|  LinkedList Records	| 10.3   |  58.3  | 526.8 | 3650.5 | 
|  DLinkedList Records 	| 10.6   | 51.1   | 845.0 | 3841.3 | 
| 			| 7.6    |  .762  |2081.3 | 962.0  | 
|			|	 |	  |	  |	   |   
|_______________________|________|________|_______|________|
