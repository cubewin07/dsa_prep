Logic: 
    - We need to remove the duplicate and put the unique value in that making it a swapping problem. Therefore, we need to know the index of value that is duplicated and the unique, representing a 2 pointers.
    - Because we only need to care about the unqiue and the duplicate, 2 pointers is the best algorithm here.
    - For especially keeping the index of the duplicate and find the unique one, fast-and-slow 2 pointers can be used.

Fast-and-slow 2 pointers:
    - Treat everything equally (left = 0, right = 0)
        - Fast is the one finding satisfied value
        - While left holds the index of unsatisfied one.
        - When find satisfied value, we swap/replace the satisfied value with the unsatisfied one. Then move left upward.

        -Because we only move left upward on satisfied value, the gap between left and right is the unsatisfied one/garbage that we dont care and need to be replaced. 
        -Satisfied one is stored before left.
            - Gap: Right - left.
            - Satisfied values quantities are left
    - Treat the first value is valid (left = 0, right = 1)
        - Fast remains its mission
        - While left now marks the position of the last satisfied value (index)
        - Meaning left++ should be replaced if a satisfied one is found. After swapping/replacing, we increase the left, marking the last position of satisfied value.
        - Because of the change in the meaning of left, 
            - Gap (unsatisfied quantities): Right - 1 - left
            - Satisfied values quantities are left + 1