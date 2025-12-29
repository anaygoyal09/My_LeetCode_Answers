# Roman to Integer

## Problem Description

Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Given a roman numeral, convert it to an integer.

## Solution

Iterate through the string. If the current value is less than the next value, subtract it from the total. Otherwise, add it.
