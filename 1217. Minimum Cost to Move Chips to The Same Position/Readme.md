# Problem
We have n chips, where the position of the ith chip is position[i].

We need to move all the chips to the same position. In one step, we can change the position of the ith chip from position[i] to:

position[i] + 2 or position[i] - 2 with cost = 0.
position[i] + 1 or position[i] - 1 with cost = 1.
Return the minimum cost needed to move all the chips to the same position.

 
# Intuition
The goal is to minimize the cost of moving all chips to the same position. The key insight is that chips at even positions (0-based index) can be moved to other even positions with zero cost, and similarly for chips at odd positions. So, the minimum cost is achieved by counting the number of chips at even and odd positions and returning the minimum of the two.

# Approach
1. Initialize two counters, `even` and `odd`, to count the number of chips at even and odd positions, respectively.
2. Iterate through the given array of chip positions and increment the corresponding counter based on whether the position is even or odd.
3. Return the minimum of `even` and `odd` as the result, as it represents the minimum cost to move all chips to the same position.

# Complexity
- Time complexity: O(n), where n is the number of chips. The algorithm iterates through the array once.
- Space complexity: O(1), as the algorithm uses only a constant amount of space for the counters `even` and `odd`.
