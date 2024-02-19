# Problem Statement - Pluse one
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.
# Example
Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].


Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
# Intuition
The goal is to increment a large integer represented as an array of digits by one. The idea is to start from the least significant digit, add 1 to it, and propagate the carry if needed.

# Approach
1. Start iterating through the digits array from the least significant digit (rightmost).
2. If the current digit is less than 9, simply increment it by 1 and return the modified array.
3. If the current digit is 9, set it to 0 and continue the loop to the next left digit.
4. If the loop completes, it means there was a carry to the leftmost digit. In this case, create a new array with a size one more than the original array and set the leftmost digit to 1.

# Complexity
- Time complexity: O(n), where n is the length of the digits array. The algorithm iterates through the array once.
- Space complexity: O(n), as the algorithm may create a new array in the worst case (when there is a carry to the leftmost digit). The space required for the result array is proportional to the size of the input array.
