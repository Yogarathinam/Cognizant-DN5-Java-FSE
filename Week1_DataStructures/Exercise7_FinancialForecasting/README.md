# Financial Forecasting Notes

**Recursion Basics:** This is when a piece of code calls itself to solve a smaller piece of the same problem. It helps avoid messy loops.

## 1. How Recursion Works

Every recursive function needs two main things:
- Base Case: The stopping point (like when periods hit 0) so it doesn't run forever.
- Recursive Step: The part that changes the input and runs the function again, getting closer to the stopping point.

## 2. Speed and Risks

- Standard Linear Recursion: If it just counts down by 1 each time, it runs N times. Time complexity is O(N).
- The Danger Zone: If the code branches out (like adding the last two days to predict a stock price), the time it takes explodes to O(2^N). This causes huge slowdowns and crashes.

## 3. Making it Faster (Memoization)

To stop the code from doing the same math over and over, we use a cache (like a HashMap).
Before doing the math for a certain period, the code checks the cache. If it already figured out that answer earlier, it just grabs it instantly in O(1) time. This makes the whole thing run way faster.
