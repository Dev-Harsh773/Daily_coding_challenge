## Problem: Palindrome Linked List

### Problem Statement (in my words):
Check whether a given singly linked list is a palindrome — same forwards and backwards.

### Approach:
1. Traverse the linked list and convert each node’s value to a string.
2. Append the values in forward and reverse order using two StringBuilders.
3. Compare both strings to check for palindrome.

### Time Complexity:
- O(n), where n is the number of nodes in the list.

### Space Complexity:
- O(n), for storing values in ArrayList and StringBuilders.
