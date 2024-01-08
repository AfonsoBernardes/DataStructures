# Data Structures #

## Solutions of Coursera's "Data Structures" course, part of the "Data Structures and Algorithms Specialization"; offered by the University of California San Diego and HSE University. ##


### Assignment 1 - Week 1 ###

<details>
<summary>1. CheckBrackets.java</summary>
   
   + **Description**: Priority is to find the first unmatched closing bracket which either does not have an opening bracket before it - like "]" in "]()" - or closes the wrong opening bracket - like "}" in "()[}". If there are no such mistakes, then it should find the first unmatched opening bracket without the corresponding closing bracket after it - like "(" in "{}([]". If there are no mistakes, the text editor should inform the user that brackets are correct.
     
   + **Input Format**: Input contains one string 𝑆 which consists of big and small Latin letters, digits, punctuation marks and brackets from the set "[]{}()".
     
   + **Constraints**: The length of 𝑆 is at least 1 and at most 10^5.
     
   + **Output Format**: If the code in 𝑆 uses brackets correctly, output “Success" (without the quotes). Otherwise,
   output the 1-based index of the first unmatched closing bracket, and if there are no unmatched closing
   brackets, output the 1-based index of the first unmatched opening bracket.
</details>

<details>
<summary>2. StackWithMax.java</summary>
   
   + **Description**: Implement a stack that also supports finding the maximum value (besides push and pop) and ensures that all operations still work in constant time.
  
   + **Input Format**: The first line of the input contains the number 𝑞 of queries. Each of the following 𝑞 lines specifies a query of one of the following formats: push v, pop, or max.
  
   + **Constraints**: 1 ≤ 𝑞 ≤ 400 000, 0 ≤ 𝑣 ≤ 10^5.
  
   + **Output Format**: For each max query, output (on a separate line) the maximum value of the stack.
</details>
  
<details>
<summary>3. TreeHeight.java</summary>
   
   + **Description**: Read a description of a rooted tree from the
input, implement the tree data structure, store the tree and compute its height. The height of a (rooted) tree is the maximum depth of a node or the maximum distance from a leaf to the root. You are given an arbitrary tree, not necessarily a binary tree.
  
   + **Input Format**: The first line contains the number of nodes 𝑛. The second line contains 𝑛 integer numbers from −1 to 𝑛 − 1 — parents of nodes. If the 𝑖-th one of them (0 ≤ 𝑖 ≤ 𝑛 − 1) is −1, node 𝑖 is the root, otherwise it’s the 0-based index of the parent of the 𝑖-th node. It is guaranteed that there is exactly one root. It is guaranteed that the input represents a tree.
  
   + **Constraints**: 1 ≤ 𝑛 ≤ 10^5.
  
   + **Output Format**: 1 ≤ 𝑛 ≤ 10^5.
</details>

-----

### Assignment 2 - Week 3 ###

<details>
<summary>1. ConvertArrayToHeap.java</summary>
   
   + **Description**: Implement the first step of the HeapSort algorithm and convert a given array of integers into a heap. That can be done by applying a certain number of swaps, i.e., exchange elements 𝑎<sub>𝑖</sub> and 𝑎<sub>j</sub> of the array **𝑎** for some **𝑖** and **𝑗**. Convert the array into a heap using only 𝑂(𝑛) swaps. Use a min-heap instead of a max-heap in this problem. 
  
   + **Input Format**: The first line of the input contains a single integer 𝑛. The next line contains 𝑛 space-separated integers 𝑎<sub>𝑖</sub>.

   + **Constraints**: 1 ≤ 𝑛 ≤ 100 000; 0 ≤ 𝑖, 𝑗 ≤ 𝑛 − 1; 0 ≤ 𝑎<sub>0</sub>, 𝑎<sub>1</sub>, . . . , 𝑎<sub>n-1</sub> ≤ 109. All 𝑎<sub>𝑖</sub> are distinct.
  
   + **Output Format**: The first line of the output should contain a single integer 𝑚 — the total number of swaps. 𝑚 must satisfy conditions 0 ≤ 𝑚 ≤ 4𝑛. The next 𝑚 lines should contain the swap operations used to convert the array 𝑎 into a heap. Each swap is described by a pair of integers 𝑖, 𝑗 — the 0-based indices of the elements to be swapped. After applying all the swaps in the specified order the array must become a heap, that is, for each 𝑖 where 0 ≤ 𝑖 ≤ 𝑛 − 1 the following conditions must be true:
     
      1. If 2𝑖 + 1 ≤ 𝑛 − 1, then 𝑎<sub>𝑖</sub> < 𝑎<sub>2𝑖+1</sub>.
      2. If 2𝑖 + 2 ≤ 𝑛 − 1, then 𝑎<sub>𝑖</sub> < 𝑎<sub>2𝑖+2</sub>.
         
   Note that all the elements of the input array are distinct.
</details>

<details>
<summary>2. ParallelProcessing.java</summary>
   
   + **Description**: A program which is parallelized uses 𝑛 independent threads to process the given list of 𝑚 jobs. Threads take jobs in the order they are given in the input. If there is a free thread, it immediately takes the next job from the list. If a thread has started processing a job, it doesn’t interrupt or stop until it finishes processing the job. If several threads try to take jobs from the list simultaneously, the thread with the smaller index takes the job. For each job, it is known exactly how long will it take any thread to process this job, and this time is the same for all the threads. For each job, determine which thread will process it and when will it start processing the job.
  
   + **Input Format**: The first line of the input contains integers 𝑛 and 𝑚.
The second line contains 𝑚 integers t<sub>i</sub> — the times in seconds it takes any thread to process 𝑖-th job. The times are given in the same order as they are in the list from which threads take jobs. Threads are indexed starting from 0.
     
   + **Constraints**: 1 ≤ 𝑛 ≤ 10^5; 1 ≤ 𝑚 ≤ 10^5; 0 ≤ t<sub>i</sub> ≤ 10^9
     
   + **Output Format**: Output exactly 𝑚 lines. 𝑖-th line (0-based index is used) should contain two space-separated integers — the 0-based index of the thread which will process the 𝑖-th job and the time in seconds when it will start processing that job.
</details>

----

### Assignment 3 - Week 4 ###

<details>
<summary>1. HashingWithChains.java</summary>

   
   + **Description**: Implement a hash table with list chaining. You are already given the number of buckets 𝑚 and the hash function. The program should support the following kinds of queries:

      + add *string* — insert *string* into the table. If there is already such a string in the hash table, then just ignore the query.

      + del *string* — remove *string* from the table. If there is no such string in the hash table, then just ignore the query.

      + find *string* — output “yes" or “no" (without quotes) depending on whether the table contains *string* or not.

      + check *𝑖* — output the content of the 𝑖-th list in the table. Use spaces to separate the elements of the list. If 𝑖-th list is empty, output a blank line.
   
   The hash function is polynomial, as seen below.

   <p width="100%" align="center"> <img width="347" alt="Equation" src="https://github.com/AfonsoBernardes/DataStructures/assets/84087794/48763ea3-f2d3-47fb-b177-98a862b52988"> </p>

   where 𝑆[𝑖] is the ASCII code of the 𝑖-th symbol of 𝑆, 𝑝 = 1 000 000 007 and 𝑥 = 263. 

When inserting a new string into a hash chain, it must be inserted in the beginning of the chain
  
   + **Input Format**: There is a single integer 𝑚 in the first line — the number of buckets you should have. The next line contains the number of queries 𝑁. It’s followed by 𝑁 lines, each of which contains one query in the format described above.

   + **Constraints**: 1 ≤ 𝑁 ≤ 10^5; 𝑁/5 ≤ 𝑚 ≤ 𝑁. All the strings consist of Latin letters. Each of them is non-empty and has a length of at most 15.
  
   + **Output Format**: Print the result of each of the "find" and "check" queries, one result per line, in the same order as these queries are given in the input.
</details>

<details>
<summary>2. PhoneBook.java</summary>
   
   + **Description**:  Implement a simple phone book manager. It should be able to process the following types of queries:
     
      + add *number* *name*: It means that the user adds a person with name *name* and phone number *number* to the phone book. If a user with such a *number* already exists, then your manager has to overwrite the corresponding *name*.

      + del *number*: It means that the manager should erase a person with the number *number* from the phone book. If there is no such person, then it should just ignore the query.

      + find *number*: It means that the user looks for a person with a phone number *number*. The manager should reply with the appropriate *name*, or with the string “not found" (without quotes) if there is no such person in the book.
  
   + **Input Format**: There is a single integer 𝑁 in the first line — the number of queries. It’s followed by 𝑁 lines, each of them containing one query in the format described above.
     
   + **Constraints**: 1 ≤ 𝑁 ≤ 10^5. All phone numbers consist of decimal digits, they don’t have leading zeros, and each has no more than seven digits. All names are non-empty strings of Latin letters, each of which has a length of at most fifteen. It’s guaranteed that there is no person with the name “not found".
     
   + **Output Format**: Print the result of each "find" query — the name corresponding to the phone number or “not found" (without quotes) if there is no person in the phone book with such a phone number. Output one result per line in the same order as the find queries given in the input.
</details>
