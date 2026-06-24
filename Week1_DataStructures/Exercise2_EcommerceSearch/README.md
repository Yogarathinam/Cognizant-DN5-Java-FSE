# E-Commerce Search Notes

**Big O Basics:** This just measures the worst-case scenario. It tells us how the code holds up when the amount of data gets huge.

## 1. The Algorithms

* **Linear Search**
    - What it does: Goes through every single item one by one. Good for random, unsorted stuff.
    - Speed: Best case O(1) | Worst case O(N)

* **Binary Search**
    - What it does: Keeps cutting the list in half to find what you need.
    - The catch: The list has to be sorted first.
    - Speed: Best case O(1) | Worst case O(log N)

## 2. Why it matters for online stores

Why do big sites rely on Binary Search?
Imagine you have 1,000,000 products to look through:

- Linear Search: Could take up to 1,000,000 checks. (Really slow)
- Binary Search: Finds the item in 20 checks or less. (Super quick)

*Quick tip:* Always remember to sort your data first (like using `Arrays.sort()` and `Comparable`) before trying a binary search.
