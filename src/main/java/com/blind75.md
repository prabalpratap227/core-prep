# Blind 75 — Categorized by Pattern & Complexity

## 1. Array & Hashing
| Problem | Time | Space |
|---|---|---|
| Contains Duplicate | O(n) | O(n) |
| Valid Anagram | O(n) | O(n) |
| Two Sum | O(n) | O(n) |
| Group Anagrams | O(n·k log k) | O(n·k) |
| Top K Frequent Elements | O(n) (bucket sort) | O(n) |
| Product of Array Except Self | O(n) | O(1) extra (excl. output) |
| Valid Sudoku | O(1) (fixed 9x9) | O(1) |
| Encode and Decode Strings | O(n) | O(n) |
| Longest Consecutive Sequence | O(n) | O(n) |

## 2. Two Pointers
| Problem | Time | Space |
|---|---|---|
| Valid Palindrome | O(n) | O(1) |
| Two Sum II (sorted input) | O(n) | O(1) |
| 3Sum | O(n²) | O(n) (sort) |
| Container With Most Water | O(n) | O(1) |
| Trapping Rain Water | O(n) | O(1) |

## 3. Sliding Window
| Problem | Time | Space |
|---|---|---|
| Best Time to Buy & Sell Stock | O(n) | O(1) |
| Longest Substring Without Repeating Characters | O(n) | O(min(n, charset)) |
| Longest Repeating Character Replacement | O(n) | O(1) |
| Minimum Window Substring | O(n) | O(k) |
| Sliding Window Maximum | O(n) | O(n) (deque) |

## 4. Stack
| Problem | Time | Space |
|---|---|---|
| Valid Parentheses | O(n) | O(n) |
| Min Stack | O(1) per op | O(n) |
| Evaluate Reverse Polish Notation | O(n) | O(n) |
| Generate Parentheses | O(4ⁿ/√n) | O(4ⁿ/√n) |
| Daily Temperatures | O(n) | O(n) |
| Car Fleet | O(n log n) | O(n) |
| Largest Rectangle in Histogram | O(n) | O(n) |

## 5. Binary Search
| Problem | Time | Space |
|---|---|---|
| Binary Search | O(log n) | O(1) |
| Search a 2D Matrix | O(log(m·n)) | O(1) |
| Koko Eating Bananas | O(n log m) | O(1) |
| Find Minimum in Rotated Sorted Array | O(log n) | O(1) |
| Search in Rotated Sorted Array | O(log n) | O(1) |
| Time Based Key-Value Store | O(log n) per get | O(n) |
| Median of Two Sorted Arrays | O(log(min(m,n))) | O(1) |

## 6. Linked List
| Problem | Time | Space |
|---|---|---|
| Reverse Linked List | O(n) | O(1) |
| Merge Two Sorted Lists | O(n+m) | O(1) |
| Reorder List | O(n) | O(1) |
| Remove Nth Node From End of List | O(n) | O(1) |
| Copy List with Random Pointer | O(n) | O(n) |
| Add Two Numbers | O(max(n,m)) | O(max(n,m)) |
| Linked List Cycle | O(n) | O(1) |
| Find the Duplicate Number | O(n) | O(1) |
| LRU Cache | O(1) per op | O(capacity) |
| Merge K Sorted Lists | O(n log k) | O(k) (heap) |

## 7. Trees
| Problem | Time | Space |
|---|---|---|
| Invert Binary Tree | O(n) | O(h) |
| Maximum Depth of Binary Tree | O(n) | O(h) |
| Diameter of Binary Tree | O(n) | O(h) |
| Balanced Binary Tree | O(n) | O(h) |
| Same Tree | O(n) | O(h) |
| Subtree of Another Tree | O(n·m) | O(h) |
| Lowest Common Ancestor of a BST | O(h) | O(1) |
| Binary Tree Level Order Traversal | O(n) | O(n) |
| Binary Tree Right Side View | O(n) | O(n) |
| Count Good Nodes in Binary Tree | O(n) | O(h) |
| Validate Binary Search Tree | O(n) | O(h) |
| Kth Smallest Element in a BST | O(h+k) | O(h) |
| Construct Binary Tree from Preorder and Inorder | O(n) | O(n) |
| Binary Tree Maximum Path Sum | O(n) | O(h) |
| Serialize and Deserialize Binary Tree | O(n) | O(n) |

## 8. Tries
| Problem | Time | Space |
|---|---|---|
| Implement Trie (Prefix Tree) | O(k) per op | O(n·k) |
| Design Add and Search Words Data Structure | O(k) avg, O(26^k) worst | O(n·k) |
| Word Search II | O(m·n·4·3^L) | O(n·k) |

## 9. Heap / Priority Queue
| Problem | Time | Space |
|---|---|---|
| Kth Largest Element in a Stream | O(log k) per insert | O(k) |
| Last Stone Weight | O(n log n) | O(n) |
| K Closest Points to Origin | O(n log k) | O(k) |
| Kth Largest Element in an Array | O(n) avg (quickselect) | O(1) |
| Task Scheduler | O(n log 26) ≈ O(n) | O(1) |
| Design Twitter | O(log n) per op | O(n) |
| Find Median from Data Stream | O(log n) insert, O(1) find | O(n) |

## 10. Backtracking
| Problem | Time | Space |
|---|---|---|
| Subsets | O(n·2ⁿ) | O(n·2ⁿ) |
| Combination Sum | O(2ⁿ) | O(target/min) |
| Permutations | O(n·n!) | O(n!) |
| Subsets II | O(n·2ⁿ) | O(n·2ⁿ) |
| Word Search | O(m·n·4^L) | O(L) |
| Palindrome Partitioning | O(n·2ⁿ) | O(n) |
| Letter Combinations of a Phone Number | O(4ⁿ) | O(n) |
| N-Queens | O(n!) | O(n²) |

## 11. Graphs
| Problem | Time | Space |
|---|---|---|
| Number of Islands | O(m·n) | O(m·n) |
| Clone Graph | O(V+E) | O(V) |
| Max Area of Island | O(m·n) | O(m·n) |
| Pacific Atlantic Water Flow | O(m·n) | O(m·n) |
| Surrounded Regions | O(m·n) | O(m·n) |
| Rotting Oranges | O(m·n) | O(m·n) |
| Walls and Gates | O(m·n) | O(m·n) |
| Course Schedule | O(V+E) | O(V+E) |
| Course Schedule II | O(V+E) | O(V+E) |
| Redundant Connection | O(n·α(n)) (union-find) | O(n) |
| Number of Connected Components in Undirected Graph | O(V+E) | O(V+E) |
| Graph Valid Tree | O(V+E) | O(V+E) |
| Word Ladder | O(n²·L) | O(n·L) |

## 12. 1-D Dynamic Programming
| Problem | Time | Space |
|---|---|---|
| Climbing Stairs | O(n) | O(1) |
| Min Cost Climbing Stairs | O(n) | O(1) |
| House Robber | O(n) | O(1) |
| House Robber II | O(n) | O(1) |
| Longest Palindromic Substring | O(n²) | O(1) (or O(n²) DP table) |
| Palindromic Substrings | O(n²) | O(1) |
| Decode Ways | O(n) | O(1) |
| Coin Change | O(n·amount) | O(amount) |
| Maximum Product Subarray | O(n) | O(1) |
| Word Break | O(n²) | O(n) |
| Longest Increasing Subsequence | O(n log n) | O(n) |
| Partition Equal Subset Sum | O(n·sum) | O(sum) |

## 13. 2-D Dynamic Programming
| Problem | Time | Space |
|---|---|---|
| Unique Paths | O(m·n) | O(n) |
| Longest Common Subsequence | O(m·n) | O(m·n) |
| Best Time to Buy/Sell Stock with Cooldown | O(n) | O(1) |
| Coin Change II | O(n·amount) | O(amount) |
| Target Sum | O(n·sum) | O(sum) |
| Interleaving String | O(m·n) | O(m·n) |
| Longest Increasing Path in a Matrix | O(m·n) | O(m·n) |
| Distinct Subsequences | O(m·n) | O(m·n) |
| Edit Distance | O(m·n) | O(m·n) |
| Burst Balloons | O(n³) | O(n²) |
| Regular Expression Matching | O(m·n) | O(m·n) |

## 14. Greedy
| Problem | Time | Space |
|---|---|---|
| Maximum Subarray | O(n) | O(1) |
| Jump Game | O(n) | O(1) |
| Jump Game II | O(n) | O(1) |
| Gas Station | O(n) | O(1) |
| Hand of Straights | O(n log n) | O(n) |
| Merge Triplets to Form Target Triplet | O(n) | O(1) |
| Partition Labels | O(n) | O(1) |
| Valid Parenthesis String | O(n) | O(1) |

## 15. Intervals
| Problem | Time | Space |
|---|---|---|
| Insert Interval | O(n) | O(n) |
| Merge Intervals | O(n log n) | O(n) |
| Non-overlapping Intervals | O(n log n) | O(1) |
| Meeting Rooms | O(n log n) | O(1) |
| Meeting Rooms II | O(n log n) | O(n) |
| Minimum Interval to Include Each Query | O((n+q) log n) | O(n) |

## 16. Math & Geometry
| Problem | Time | Space |
|---|---|---|
| Rotate Image | O(n²) | O(1) |
| Spiral Matrix | O(m·n) | O(1) |
| Set Matrix Zeroes | O(m·n) | O(1) |
| Happy Number | O(log n) | O(log n) |
| Plus One | O(n) | O(1) |
| Pow(x, n) | O(log n) | O(log n) |
| Multiply Strings | O(m·n) | O(m+n) |
| Detect Squares | O(n) per query | O(n) |

## 17. Bit Manipulation
| Problem | Time | Space |
|---|---|---|
| Single Number | O(n) | O(1) |
| Number of 1 Bits | O(1) (32 bits) | O(1) |
| Counting Bits | O(n) | O(n) |
| Reverse Bits | O(1) (32 bits) | O(1) |
| Missing Number | O(n) | O(1) |
| Sum of Two Integers | O(1) (32 bits) | O(1) |
| Reverse Integer | O(1) | O(1) |

---

### Notes on how to use this
- **n** = input size (array/string length), **m** = second dimension where relevant, **h** = tree height, **V/E** = graph vertices/edges, **k** = target/word length.
- Patterns are roughly ordered by how often they combine: Two Pointers and Sliding Window often overlap; many Tree problems reuse the same DFS/BFS template; DP problems build directly on the Greedy/Array intuition once you spot overlapping subproblems.
- A common study order: Array & Hashing → Two Pointers → Sliding Window → Stack → Binary Search → Linked List → Trees → Heap → Backtracking → Graphs → 1-D DP → 2-D DP → Greedy → Intervals → Math → Bit Manipulation.
