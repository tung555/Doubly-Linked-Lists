
deleteSubsection - The big O complexity of this method is O(n^2) 
since it iterates through the list and looks for the elements which 
are the range to be delete, then called the deleteItem method to 
delete the element. The loop in this method times the loop in 
deleteItem which make it has a overall big O complexity of O(n^2).

reverseList - The big O complexity for this method is O(n) since it 
puts two pointer in the list, one in the front and one in the back, 
when the two pointers meet in the middle of the list, the loop stops. 
The algorithm has a big O complexity of O(n/2) which makes it an 
overall O(n).

swapAlternate - The big O complexity for this method is O(n) since 
it iterates through the list then swap the first and second elements, 
third and fourth elements, so on and so for. The method only iterates 
the list once, therefore the overall big O complexity of the method is 
O(n).
