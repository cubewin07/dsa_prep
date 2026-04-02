Solving this problem has 3 ways:

1. O(n*n)
    Using brute force with 2 loops and check if the numbers sum matches target.
2. O(n)
    Using 2 pointers - Work only with sorted array

        if equal target return left and right
        Checking if sum is larger => right --
        otherwise left++
3. O(n)
    Using hashmap
        Store each value as key and index as value (We use array's value and hashmap is optimized for key)

        Then on each index, checking if the complement exist => return the indexes