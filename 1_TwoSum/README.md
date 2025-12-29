# Two Sum

## Problem Description

Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to `target`.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

## Solution

The solution typically involves using a HashMap to store the numbers we have seen so far and their indices. For each number `x`, we check if `target - x` exists in the map. If it does, we have found the pair.
