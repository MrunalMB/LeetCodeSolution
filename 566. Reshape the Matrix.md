# Problem 566: Reshape the Matrix

## Problem Statement
In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a new one with a different size r x c keeping its original data.

You are given an m x n matrix mat and two integers r and c representing the number of rows and the number of columns of the wanted reshaped matrix.

The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.

If the reshape operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.

## Intuition
The goal is to reshape the given matrix to a new size while maintaining the order of the elements in row-traversing order.

## Approach
The code checks if it is possible to reshape the matrix by comparing the total number of elements in the original matrix with the product of the desired number of rows and columns. If possible, it reshapes the matrix using a nested loop to fill the new matrix with the original elements in the specified order. If not possible, it returns the original matrix.

## Time Complexity
The time complexity is O(n * m), where n is the number of rows in the original matrix and m is the number of columns in the original matrix.

## Space Complexity
The space complexity is O(r * c), where r is the number of rows in the reshaped matrix and c is the number of columns in the reshaped matrix.
