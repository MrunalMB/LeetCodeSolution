# Find All Duplicates in an Array

## Problem Description

Given an integer array `nums` of length `n` where all the integers of `nums` are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appear twice.

You must write an algorithm that runs in O(n) time and uses only constant extra space.

## Examples


```java
Input: nums = [4,3,2,7,8,2,3,1]
Output: [2,3]
Input: nums = [1,1,2]
Output: [1]
Input: nums = [1]
Output: []
```
## Intuition
First, we need to sort the array to identify the duplicate element. By using cyclic sort, we can achieve this with a time complexity of O(N).

## Approach
Iterate through the array and swap elements until each element is at its correct index. Once the array is rearranged, iterate through it again to find the indices where the element does not match its index.
these index elements are nothing but the duplicates. Add them into an BoldList and return it.

## Complexity
### Time complexity:
O(N), where N is the length of the input array. This is due to the cyclic sort, which operates in linear time.
### Space complexity:
O(1) as the algorithm uses a constant amount of extra space, not dependent on the input size.
