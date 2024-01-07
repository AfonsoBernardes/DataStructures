# Data Structures #

### Solutions of Coursera's "Data Structures" course, part of the "Data Structures and Algorithms Specialization"; offered by the University of California San Diego and HSE University. ###


<ins>WEEK 1</ins>

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
  
   - *Input Format*: The first line contains the number of nodes 𝑛. The second line contains 𝑛 integer numbers from −1 to 𝑛 − 1 — parents of nodes. If the 𝑖-th one of them (0 ≤ 𝑖 ≤ 𝑛 − 1) is −1, node 𝑖 is the root, otherwise it’s 0-based index of the parent of 𝑖-th node. It is guaranteed that there is exactly one root. It is guaranteed that the input represents a tree.
  
   - *Constraints*: 1 ≤ 𝑛 ≤ 10^5.
  
   - *Output Format*:

