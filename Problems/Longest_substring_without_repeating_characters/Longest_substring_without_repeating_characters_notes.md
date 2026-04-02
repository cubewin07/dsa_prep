algorithms:
    Sliding window

Logic:
   1. (Prepare state) I use a Set, an variable for storing longest length and a pointer starting from beginning
   2. Implementaion:
        a. Loop from the start
        b. Checking if the Set contains that char
            - if not: add it to Set => update longest length using Mat.max()
            - if yet: Remove the character before the duplicate until only one current character is present in the substring (set) * Maintain substring *. How can we do that?? 
                From the index that we detect duplicate (current index in the loop), we respectively remove the character from the start until we finally get rid of the duplication (remove character using chatAt(left) in Set), giving a substring with no duplication. Then, we can continue adding character to the substring (Set).
    3. Return longest length

Limitations:
    We respectively remove the character from the start until the duplicated position => waste time. WHy dont we store the index of each character, so that when we find a duplicate, we can start right from the index after the duplicate in the previous substring