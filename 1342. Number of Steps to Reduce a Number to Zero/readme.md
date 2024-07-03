
# Reducing a Number to Zero

## Intuition
To reduce a given integer `num` to zero, we can utilize a straightforward approach:
1. If the current number is even, we divide it by 2.
2. If the current number is odd, we subtract 1 from it.
This approach leverages the properties of even and odd numbers to gradually reduce `num` to zero in the fewest steps.

## Approach
1. We create a helper function that takes two parameters: the current number `n` and a counter `c` to keep track of the steps.
2. If `n` is zero, we return the counter `c` as the result.
3. If `n` is even (i.e., `n % 2 == 0`), we divide it by 2 and increment the counter by 1.
4. If `n` is odd, we subtract 1 from `n` and increment the counter by 1.
5. We use recursion to continue the process until `n` becomes zero.

## Complexity
### Time Complexity
The time complexity of this approach is O(log n) because in the worst case, the number is divided by 2 at every step, reducing the size of the problem by half each time.

### Space Complexity
The space complexity is O(log n) due to the recursive call stack. Each recursive call reduces the number, leading to a logarithmic number of calls in terms of the input number.
