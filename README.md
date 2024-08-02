# Searching-Sorting

### Searching Algorithms

**Searching algorithms** are methods for finding a particular item or group of items within a dataset. These algorithms are fundamental in computer science and are used in a variety of applications.

1. **Linear Search**:
   - **Description**: This is the simplest search algorithm. It checks each element in the list one by one until the desired element is found or the list ends.
   - **Time Complexity**: O(n), where n is the number of elements in the list.
   - **Use Case**: Suitable for small or unsorted lists.

2. **Binary Search**:
   - **Description**: This algorithm is more efficient but requires the list to be sorted. It repeatedly divides the search interval in half, starting in the middle of the list.
   - **Time Complexity**: O(log n), where n is the number of elements in the list.
   - **Use Case**: Ideal for large, sorted lists.

### Sorting Algorithms

**Sorting algorithms** arrange the elements of a list in a particular order (usually ascending or descending). Sorting is a common operation that prepares data for searching or for other processing.

1. **Bubble Sort**:
   - **Description**: A simple comparison-based algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.
   - **Time Complexity**: O(n²), where n is the number of elements.
   - **Use Case**: Simple to implement but inefficient for large datasets.

2. **Selection Sort**:
   - **Description**: Another simple comparison-based algorithm that repeatedly finds the minimum element from the unsorted part of the list and moves it to the beginning.
   - **Time Complexity**: O(n²).
   - **Use Case**: More efficient than bubble sort for small datasets but still not suitable for large lists.

3. **Insertion Sort**:
   - **Description**: Builds the final sorted array one item at a time, placing each new item into its proper place among the previously sorted items.
   - **Time Complexity**: O(n²).
   - **Use Case**: Efficient for small or nearly sorted datasets.

4. **Merge Sort**:
   - **Description**: A divide-and-conquer algorithm that splits the list into halves, recursively sorts each half, and then merges the sorted halves back together.
   - **Time Complexity**: O(n log n).
   - **Use Case**: Suitable for large datasets and offers stable sorting.

5. **Quick Sort**:
   - **Description**: Another divide-and-conquer algorithm that selects a 'pivot' element and partitions the other elements into two sub-arrays according to whether they are less than or greater than the pivot. The sub-arrays are then sorted recursively.
   - **Time Complexity**: O(n log n) on average, but O(n²) in the worst case.
   - **Use Case**: Very efficient for large datasets and generally faster in practice compared to merge sort.

6. **Counting Sort**:
   - **Description**: Non-comparison-based algorithm suitable for sorting integers within a specific range. It counts the occurrences of each unique element and uses this information to place the elements in the correct position.
   - **Time Complexity**: O(n + k), where n is the number of elements and k is the range of input.
   - **Use Case**: Efficient for lists with a small range of integer values.

7. **Radix Sort**:
- **Description**: A non-comparative sorting algorithm that sorts integers by processing individual digits. It processes the least significant digit first (LSD) or the most significant digit first (MSD).
- **Steps**:
Sort numbers by the least significant digit (LSD) using a stable counting sort or bucket sort.
Repeat the process for each digit, moving towards the most significant digit.
- **Time Complexity**: O(d * (n + k)), where d is the number of digits, n is the number of elements, and k is the range of the digit values (usually 10 for decimal digits).
- **Usage**: Efficient for sorting large numbers or strings. Suitable when the length of the keys is fixed or bounded
