# Data Structures #

### Solutions of Coursera's "Data Structures" course, part of the "Data Structures and Algorithms Specialization"; offered by the University of California San Diego and HSE University. ###


<ins>Assignment 1 - WEEK 1</ins>

1. **CheckBrackets.java**:
   
   - *Description*: Priority is to find the first unmatched closing bracket which either does not have an opening bracket before it - like "]" in "]()" - or closes the wrong opening bracket - like "}" in "()[}". If there are no such mistakes, then it should find the first unmatched opening bracket without the corresponding closing bracket after it - like "(" in "{}([]". If there are no mistakes, the text editor should inform the user that brackets are correct.
  
   - *Input Format*: Input contains one string 𝑆 which consists of big and small Latin letters, digits, punctuation marks and brackets from the set "[]{}()".
  
   - *Constraints*: The length of 𝑆 is at least 1 and at most 10^5.
  
   - *Output Format*: If the code in 𝑆 uses brackets correctly, output “Success" (without the quotes). Otherwise,
output the 1-based index of the first unmatched closing bracket, and if there are no unmatched closing
brackets, output the 1-based index of the first unmatched opening bracket.

2. **StackWithMax.java**:
   
   - *Description*: Implement a stack that also supports finding the maximum value (besides push and pop) and ensures that all operations still work in constant time.
  
   - *Input Format*: The first line of the input contains the number 𝑞 of queries. Each of the following 𝑞 lines specifies a query of one of the following formats: push v, pop, or max.
  
   - *Constraints*: 1 ≤ 𝑞 ≤ 400 000, 0 ≤ 𝑣 ≤ 10^5.
  
   - *Output Format*: For each max query, output (on a separate line) the maximum value of the stack.
  
3. **TreeHeight.java**:
   
   - *Description*: Read a description of a rooted tree from the
input, implement the tree data structure, store the tree and compute its height. The height of a (rooted) tree is the maximum depth of a node or the maximum distance from a leaf to the root. You are given an arbitrary tree, not necessarily a binary tree.
  
   - *Input Format*: The first line contains the number of nodes 𝑛. The second line contains 𝑛 integer numbers from −1 to 𝑛 − 1 — parents of nodes. If the 𝑖-th one of them (0 ≤ 𝑖 ≤ 𝑛 − 1) is −1, node 𝑖 is the root, otherwise it’s the 0-based index of the parent of the 𝑖-th node. It is guaranteed that there is exactly one root. It is guaranteed that the input represents a tree.
  
   - *Constraints*: 1 ≤ 𝑛 ≤ 10^5.
  
   - *Output Format*: 1 ≤ 𝑛 ≤ 10^5.


<ins>Assignment 1 - WEEK 3</ins>

1. **ConvertArrayToHeap.java**:
   
   - *Description*: Implement the first step of the HeapSort algorithm and convert a given array of integers into a heap. That can be done by applying a certain number of swaps, i.e., exchange elements 𝑎<sub>𝑖</sub> and 𝑎<sub>j</sub> of the array **𝑎** for some **𝑖** and **𝑗**. Convert the array into a heap using only 𝑂(𝑛) swaps. Use a min-heap instead of a max-heap in this problem. 
  
   - *Input Format*: The first line of the input contains a single integer 𝑛. The next line contains 𝑛 space-separated integers 𝑎<sub>𝑖</sub>.

   - *Constraints*: 1 ≤ 𝑛 ≤ 100 000; 0 ≤ 𝑖, 𝑗 ≤ 𝑛 − 1; 0 ≤ 𝑎<sub>0</sub>, 𝑎<sub>1</sub>, . . . , 𝑎<sub>n-1</sub> ≤ 109. All 𝑎<sub>𝑖</sub> are distinct.
  
   - *Output Format*: The first line of the output should contain a single integer 𝑚 — the total number of swaps. 𝑚 must satisfy conditions 0 ≤ 𝑚 ≤ 4𝑛. The next 𝑚 lines should contain the swap operations used to convert the array 𝑎 into a heap. Each swap is described by a pair of integers 𝑖, 𝑗 — the 0-based indices of the elements to be swapped. After applying all the swaps in the specified order the array must become a heap, that is, for each 𝑖 where 0 ≤ 𝑖 ≤ 𝑛 − 1 the following conditions must be true:
     
      1. If 2𝑖 + 1 ≤ 𝑛 − 1, then 𝑎<sub>𝑖</sub> < 𝑎<sub>2𝑖+1</sub>.
      2. If 2𝑖 + 2 ≤ 𝑛 − 1, then 𝑎<sub>𝑖</sub> < 𝑎<sub>2𝑖+2</sub>.
         
Note that all the elements of the input array are distinct.
