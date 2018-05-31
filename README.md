# ProductOfArrayWithoutUsingDivide
Given an array of integers, return a new array such that each element at index i of the new array  is the product of all the numbers in the original array except the one at i.

For example, if our input was
 [1, 2, 3, 4, 5],
 the expected output would be
 [120, 60, 40, 30, 24].
 If our input was [3, 2, 1], the expected output would be [2, 3, 6].

 Follow-up: what if you can't use division?
 
 SOLUTION:
1) Construct a temporary array left[] such that left[i] contains product of all elements on left of arr[i] excluding arr[i].
2) Construct another temporary array right[] such that right[i] contains product of all elements on on right of arr[i] excluding arr[i].
3) To get prod[], multiply left[] and right[].
