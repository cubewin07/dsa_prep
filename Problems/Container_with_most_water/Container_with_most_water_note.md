Algorithm:
    Sliding window

Problem:
    Given a an array of height, find the container (2 iterates in the array form a container) contains the most water (area)
    - The "container" will be a rectangle so we can calculate the area using height*length.

Ideas:
    - Staring from both ends of the array
    - At each step, the container is formed by left and rights heights.
    - As we cannot slant the container, the height is limited by the shorter height so we take the minium of 2 heights
    - The length of the container is calculated by the position of the height in the array, then we take the product of length and height and update the maxium.
    - After that we move the pointer of the shorter line inward.
    - Repeating the process until covering all


Complexity: 
    O(n)