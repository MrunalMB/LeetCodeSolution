# Reverse String

## Problem Description

You are given an array of characters `s` representing a string. Write a function `reverseString` to reverse the string in-place. You must modify the array `s` in-place with O(1) extra memory.

## Example

**Input:**  
`["h","e","l","l","o"]`

**Output:**  
`["o","l","l","e","h"]`

**Input:**  
`["H","a","n","n","a","h"]`

**Output:**  
`["h","a","n","n","a","H"]`

## Intuition

To reverse the string in-place, you can utilize a two-pointer approach. Initialize two pointers, one pointing to the beginning of the array (`left`) and the other pointing to the end of the array (`right`). Swap the characters at these pointers iteratively until they meet in the middle. This method allows you to reverse the string without using any extra space.

## Approach

1. Define a method `reverseString` that takes a char array `s` as input.
2. Inside `reverseString`, define a helper method `reverse` that takes three parameters: the char array `s`, the left index `left`, and the right index `right`.
3. In the `reverse` method, implement a recursive approach:
   - If `left` is greater than `right`, return.
   - Swap the characters at `s[left]` and `s[right]`.
   - Recur with updated indices: `left + 1` and `right - 1`.
4. In the `reverseString` method, call the `reverse` method with `left = 0` and `right = s.length - 1`.
5. The array `s` will be reversed in-place after calling `reverseString`.

## Complexity Analysis

The time complexity of this approach is O(n), where n is the length of the input string. This is because the algorithm iterates through half of the array to perform the swapping operation.

The space complexity is O(1) since the algorithm modifies the input array in-place without using any additional space.
