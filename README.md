# Software Engineering Problem Solving

Java implementations of common data structures, algorithms and coding interview problems. Each solution is a small, independent class with a focused JUnit test.

## Technology

- Java 21
- Maven
- JUnit 5

## Topics

Arrays and Strings · Hash Maps and Sets · Two Pointers and Sliding Window · Stacks and Queues · Linked Lists · Binary Search · Binary Trees · Graphs · Backtracking · Dynamic Programming

## Problem index

| No. | Problem | Topic | Approach | Time Complexity | Space Complexity | Solution |
| ---: | --- | --- | --- | --- | --- | --- |
| 1 | [Two Sum](https://leetcode.com/problems/two-sum/) | Arrays and Strings | Hash map | O(n) | O(n) | [TwoSum.java](src/main/java/com/sriram/dsa/arrays/TwoSum.java) |
| 2 | [Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/) | Arrays and Strings | Running minimum | O(n) | O(1) | [BestTimeToBuyAndSellStock.java](src/main/java/com/sriram/dsa/arrays/BestTimeToBuyAndSellStock.java) |
| 3 | [Contains Duplicate](https://leetcode.com/problems/contains-duplicate/) | Arrays and Strings | Hash set | O(n) | O(n) | [ContainsDuplicate.java](src/main/java/com/sriram/dsa/arrays/ContainsDuplicate.java) |
| 4 | [Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self/) | Arrays and Strings | Prefix and suffix products | O(n) | O(1) extra | [ProductOfArrayExceptSelf.java](src/main/java/com/sriram/dsa/arrays/ProductOfArrayExceptSelf.java) |
| 5 | [Maximum Subarray](https://leetcode.com/problems/maximum-subarray/) | Arrays and Strings | Kadane's algorithm | O(n) | O(1) | [MaximumSubarray.java](src/main/java/com/sriram/dsa/arrays/MaximumSubarray.java) |
| 6 | [Move Zeroes](https://leetcode.com/problems/move-zeroes/) | Arrays and Strings | Stable in-place compaction | O(n) | O(1) | [MoveZeroes.java](src/main/java/com/sriram/dsa/arrays/MoveZeroes.java) |
| 7 | [Merge Intervals](https://leetcode.com/problems/merge-intervals/) | Arrays and Strings | Sort and merge | O(n log n) | O(n) | [MergeIntervals.java](src/main/java/com/sriram/dsa/arrays/MergeIntervals.java) |
| 8 | [Rotate Array](https://leetcode.com/problems/rotate-array/) | Arrays and Strings | Three reversals | O(n) | O(1) | [RotateArray.java](src/main/java/com/sriram/dsa/arrays/RotateArray.java) |
| 9 | [Longest Consecutive Sequence](https://leetcode.com/problems/longest-consecutive-sequence/) | Arrays and Strings | Hash set run starts | O(n) expected | O(n) | [LongestConsecutiveSequence.java](src/main/java/com/sriram/dsa/arrays/LongestConsecutiveSequence.java) |
| 10 | [Valid Anagram](https://leetcode.com/problems/valid-anagram/) | Arrays and Strings | Character counts | O(n + U) | O(U) | [ValidAnagram.java](src/main/java/com/sriram/dsa/arrays/ValidAnagram.java) |
| 11 | [Group Anagrams](https://leetcode.com/problems/group-anagrams/) | Hash Maps and Sets | Sorted signature map | O(n m log m) | O(nm) | [GroupAnagrams.java](src/main/java/com/sriram/dsa/hashing/GroupAnagrams.java) |
| 12 | [Top K Frequent Elements](https://leetcode.com/problems/top-k-frequent-elements/) | Hash Maps and Sets | Frequency map and bounded heap | O(n + u log k) | O(u + k) | [TopKFrequentElements.java](src/main/java/com/sriram/dsa/hashing/TopKFrequentElements.java) |
| 13 | [Subarray Sum Equals K](https://leetcode.com/problems/subarray-sum-equals-k/) | Hash Maps and Sets | Prefix-sum frequencies | O(n) | O(n) | [SubarraySumEqualsK.java](src/main/java/com/sriram/dsa/hashing/SubarraySumEqualsK.java) |
| 14 | [First Unique Character in a String](https://leetcode.com/problems/first-unique-character-in-a-string/) | Hash Maps and Sets | Frequency count | O(n + U) | O(U) | [FirstUniqueCharacter.java](src/main/java/com/sriram/dsa/hashing/FirstUniqueCharacter.java) |
| 15 | [Isomorphic Strings](https://leetcode.com/problems/isomorphic-strings/) | Hash Maps and Sets | Bidirectional last-seen positions | O(n) | O(U) | [IsomorphicStrings.java](src/main/java/com/sriram/dsa/hashing/IsomorphicStrings.java) |
| 16 | [3Sum](https://leetcode.com/problems/3sum/) | Two Pointers and Sliding Window | Sort and two pointers | O(n²) | O(1) auxiliary | [ThreeSum.java](src/main/java/com/sriram/dsa/twopointers/ThreeSum.java) |
| 17 | [Container With Most Water](https://leetcode.com/problems/container-with-most-water/) | Two Pointers and Sliding Window | Shrink shorter wall | O(n) | O(1) | [ContainerWithMostWater.java](src/main/java/com/sriram/dsa/twopointers/ContainerWithMostWater.java) |
| 18 | [Valid Palindrome](https://leetcode.com/problems/valid-palindrome/) | Two Pointers and Sliding Window | Inward character scan | O(n) | O(1) | [ValidPalindrome.java](src/main/java/com/sriram/dsa/twopointers/ValidPalindrome.java) |
| 19 | [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/) | Two Pointers and Sliding Window | Sliding window | O(n) | O(U) | [LongestSubstringWithoutRepeatingCharacters.java](src/main/java/com/sriram/dsa/twopointers/LongestSubstringWithoutRepeatingCharacters.java) |
| 20 | [Minimum Size Subarray Sum](https://leetcode.com/problems/minimum-size-subarray-sum/) | Two Pointers and Sliding Window | Shrinking positive-sum window | O(n) | O(1) | [MinimumSizeSubarraySum.java](src/main/java/com/sriram/dsa/twopointers/MinimumSizeSubarraySum.java) |
| 21 | [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/) | Stacks and Queues | Expected-closing stack | O(n) | O(n) | [ValidParentheses.java](src/main/java/com/sriram/dsa/stackqueue/ValidParentheses.java) |
| 22 | [Min Stack](https://leetcode.com/problems/min-stack/) | Stacks and Queues | Value and minimum stacks | O(1) per operation | O(n) | [MinStack.java](src/main/java/com/sriram/dsa/stackqueue/MinStack.java) |
| 23 | [Daily Temperatures](https://leetcode.com/problems/daily-temperatures/) | Stacks and Queues | Monotonic stack | O(n) | O(n) | [DailyTemperatures.java](src/main/java/com/sriram/dsa/stackqueue/DailyTemperatures.java) |
| 24 | [Implement Queue Using Stacks](https://leetcode.com/problems/implement-queue-using-stacks/) | Stacks and Queues | Lazy two-stack transfer | O(1) amortized per operation | O(n) | [QueueUsingStacks.java](src/main/java/com/sriram/dsa/stackqueue/QueueUsingStacks.java) |
| 25 | [Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/) | Linked Lists | Iterative pointer reversal | O(n) | O(1) | [ReverseLinkedList.java](src/main/java/com/sriram/dsa/linkedlist/ReverseLinkedList.java) |
| 26 | [Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/) | Linked Lists | Sentinel and relinking | O(m+n) | O(1) | [MergeTwoSortedLists.java](src/main/java/com/sriram/dsa/linkedlist/MergeTwoSortedLists.java) |
| 27 | [Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/) | Linked Lists | Fast and slow pointers | O(n) | O(1) | [LinkedListCycle.java](src/main/java/com/sriram/dsa/linkedlist/LinkedListCycle.java) |
| 28 | [Remove Nth Node From End of List](https://leetcode.com/problems/remove-nth-node-from-end-of-list/) | Linked Lists | Lead and trailing pointers | O(n) | O(1) | [RemoveNthNodeFromEnd.java](src/main/java/com/sriram/dsa/linkedlist/RemoveNthNodeFromEnd.java) |
| 29 | [Binary Search](https://leetcode.com/problems/binary-search/) | Binary Search | Iterative binary search | O(log n) | O(1) | [BinarySearch.java](src/main/java/com/sriram/dsa/binarysearch/BinarySearch.java) |
| 30 | [Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/) | Binary Search | Sorted-half search | O(log n) | O(1) | [SearchInRotatedSortedArray.java](src/main/java/com/sriram/dsa/binarysearch/SearchInRotatedSortedArray.java) |
| 31 | [Find First and Last Position of Element in Sorted Array](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/) | Binary Search | Lower and upper bounds | O(log n) | O(1) | [FindFirstAndLastPosition.java](src/main/java/com/sriram/dsa/binarysearch/FindFirstAndLastPosition.java) |
| 32 | [Koko Eating Bananas](https://leetcode.com/problems/koko-eating-bananas/) | Binary Search | Binary search on speed | O(n log m) | O(1) | [KokoEatingBananas.java](src/main/java/com/sriram/dsa/binarysearch/KokoEatingBananas.java) |
| 33 | [Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/) | Binary Trees | Recursive depth-first traversal | O(n) | O(h) | [MaximumDepthOfBinaryTree.java](src/main/java/com/sriram/dsa/trees/MaximumDepthOfBinaryTree.java) |
| 34 | [Invert Binary Tree](https://leetcode.com/problems/invert-binary-tree/) | Binary Trees | Recursive child swap | O(n) | O(h) | [InvertBinaryTree.java](src/main/java/com/sriram/dsa/trees/InvertBinaryTree.java) |
| 35 | [Binary Tree Level Order Traversal](https://leetcode.com/problems/binary-tree-level-order-traversal/) | Binary Trees | Breadth-first search | O(n) | O(n) | [BinaryTreeLevelOrderTraversal.java](src/main/java/com/sriram/dsa/trees/BinaryTreeLevelOrderTraversal.java) |
| 36 | [Validate Binary Search Tree](https://leetcode.com/problems/validate-binary-search-tree/) | Binary Trees | Exclusive value bounds | O(n) | O(h) | [ValidateBinarySearchTree.java](src/main/java/com/sriram/dsa/trees/ValidateBinarySearchTree.java) |
| 37 | [Lowest Common Ancestor of a BST](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/) | Binary Trees | Follow BST split point | O(h) | O(1) | [LowestCommonAncestorOfBST.java](src/main/java/com/sriram/dsa/trees/LowestCommonAncestorOfBST.java) |
| 38 | [Diameter of Binary Tree](https://leetcode.com/problems/diameter-of-binary-tree/) | Binary Trees | DFS height aggregation | O(n) | O(h) | [DiameterOfBinaryTree.java](src/main/java/com/sriram/dsa/trees/DiameterOfBinaryTree.java) |
| 39 | [Number of Islands](https://leetcode.com/problems/number-of-islands/) | Graphs | DFS component flood-fill | O(RC) | O(RC) | [NumberOfIslands.java](src/main/java/com/sriram/dsa/graphs/NumberOfIslands.java) |
| 40 | [Clone Graph](https://leetcode.com/problems/clone-graph/) | Graphs | BFS and identity map | O(V+E) | O(V) | [CloneGraph.java](src/main/java/com/sriram/dsa/graphs/CloneGraph.java) |
| 41 | [Course Schedule](https://leetcode.com/problems/course-schedule/) | Graphs | Kahn topological traversal | O(V+E) | O(V+E) | [CourseSchedule.java](src/main/java/com/sriram/dsa/graphs/CourseSchedule.java) |
| 42 | [Rotting Oranges](https://leetcode.com/problems/rotting-oranges/) | Graphs | Layered BFS | O(RC) | O(RC) | [RottingOranges.java](src/main/java/com/sriram/dsa/graphs/RottingOranges.java) |
| 43 | [Flood Fill](https://leetcode.com/problems/flood-fill/) | Graphs | Recursive DFS | O(RC) | O(RC) stack worst case | [FloodFill.java](src/main/java/com/sriram/dsa/graphs/FloodFill.java) |
| 44 | [Subsets](https://leetcode.com/problems/subsets/) | Backtracking | Choose each next element | O(n·2ⁿ) | O(n·2ⁿ) output | [Subsets.java](src/main/java/com/sriram/dsa/backtracking/Subsets.java) |
| 45 | [Combination Sum](https://leetcode.com/problems/combination-sum/) | Backtracking | Reuse candidates recursively | Output-sensitive | O(L) stack plus output | [CombinationSum.java](src/main/java/com/sriram/dsa/backtracking/CombinationSum.java) |
| 46 | [Word Search](https://leetcode.com/problems/word-search/) | Backtracking | Board DFS with backtracking | O(RC·4ᴸ) worst case | O(L) stack | [WordSearch.java](src/main/java/com/sriram/dsa/backtracking/WordSearch.java) |
| 47 | [Climbing Stairs](https://leetcode.com/problems/climbing-stairs/) | Dynamic Programming | Two-value Fibonacci recurrence | O(n) | O(1) | [ClimbingStairs.java](src/main/java/com/sriram/dsa/dynamicprogramming/ClimbingStairs.java) |
| 48 | [House Robber](https://leetcode.com/problems/house-robber/) | Dynamic Programming | Rolling two-state DP | O(n) | O(1) | [HouseRobber.java](src/main/java/com/sriram/dsa/dynamicprogramming/HouseRobber.java) |
| 49 | [Coin Change](https://leetcode.com/problems/coin-change/) | Dynamic Programming | Bottom-up minimum count | O(amount·coins) | O(amount) | [CoinChange.java](src/main/java/com/sriram/dsa/dynamicprogramming/CoinChange.java) |
| 50 | [Longest Increasing Subsequence](https://leetcode.com/problems/longest-increasing-subsequence/) | Dynamic Programming | Binary-search tails | O(n log n) | O(n) | [LongestIncreasingSubsequence.java](src/main/java/com/sriram/dsa/dynamicprogramming/LongestIncreasingSubsequence.java) |

`n` is input length, `m` is the largest pile, `u` is the number of distinct values, `U` is the character range, `R` and `C` are grid dimensions, `V` and `E` are graph vertices and edges, `h` is tree height, and `L` is word length or the longest candidate combination, as applicable. Output storage is excluded where the table says auxiliary space.

## Run tests

Install a JDK 21 distribution and Maven 3.9 or newer, then run:

```bash
mvn clean test
```

## Repository layout

`src/main/java` contains topic-based implementations and shared node models. `src/test/java` contains JUnit tests grouped by topic. GitHub Actions runs the Maven test suite for pushes and pull requests targeting `main`.

## Author

Sriram Tenneti · [GitHub](https://github.com/sriramtenneti03)
