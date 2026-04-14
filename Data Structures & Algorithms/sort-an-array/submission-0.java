class Solution {

    public int[] sortArray(int[] numbers) {
        if (numbers == null || numbers.length <= 1) {
            return numbers;
        }

        divideAndSort(numbers, 0, numbers.length - 1);
        return numbers;
    }

    private void divideAndSort(int[] numbers, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }

        int middleIndex = startIndex + (endIndex - startIndex) / 2;

        divideAndSort(numbers, startIndex, middleIndex);
        divideAndSort(numbers, middleIndex + 1, endIndex);

        mergeSortedHalves(numbers, startIndex, middleIndex, endIndex);
    }

    private void mergeSortedHalves(int[] numbers,
                                   int startIndex,
                                   int middleIndex,
                                   int endIndex) {

        int leftPointer = startIndex;
        int rightPointer = middleIndex + 1;

        int[] temporaryArray = new int[endIndex - startIndex + 1];
        int temporaryIndex = 0;

        while (leftPointer <= middleIndex && rightPointer <= endIndex) {
            if (numbers[leftPointer] <= numbers[rightPointer]) {
                temporaryArray[temporaryIndex++] = numbers[leftPointer++];
            } else {
                temporaryArray[temporaryIndex++] = numbers[rightPointer++];
            }
        }

        while (leftPointer <= middleIndex) {
            temporaryArray[temporaryIndex++] = numbers[leftPointer++];
        }

        while (rightPointer <= endIndex) {
            temporaryArray[temporaryIndex++] = numbers[rightPointer++];
        }

        for (int copyIndex = 0; copyIndex < temporaryArray.length; copyIndex++) {
            numbers[startIndex + copyIndex] = temporaryArray[copyIndex];
        }
    }
}