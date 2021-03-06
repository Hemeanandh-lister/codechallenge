package Service;

public class SortingService {

    /**
     * @param inputArray - Array to be sorted
     * @return - Sorted Array
     */
    public int[] sortOddEvenNumbers(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i; j < inputArray.length; j++) {
                if (isFirstNumberLarger(inputArray[i], inputArray[j])) {
                    int temp = inputArray[i];
                    inputArray[i] = inputArray[j];
                    inputArray[j] = temp;
                }
            }
        }
        return inputArray;
    }

    /**
     * @param firstNumber  - Number to be compared
     * @param secondNumber - Number to be compared
     * @return - If both of the numbers are even or odd and first number is small returns true
     * - If numbers are combination of odd and even, then returns true if first number is odd.
     */
    private boolean isFirstNumberLarger(int firstNumber, int secondNumber) {
        if (isEven(firstNumber) && isEven(secondNumber)) {
            return firstNumber > secondNumber;
        } else if (!isEven(firstNumber) && !isEven(secondNumber)) {
            return firstNumber > secondNumber;
        } else if (isEven(firstNumber) && !isEven(secondNumber)) {
            return true;
        }
        return false;
    }

    /**
     * @param number - Input to be checked
     * @return -  true: If number is Even
     */
    private boolean isEven(int number) {
        return number % 2 == 0;
    }
}
