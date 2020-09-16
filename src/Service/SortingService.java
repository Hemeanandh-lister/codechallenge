package Service;

public class SortingService {

    public int[] sortOddEvenNumbers(int[] inputArray) {

        for(int i =0;i<inputArray.length; i++) {

            for(int j =0;j<inputArray.length; j++) {
                if(isFirstNumberSmaller(inputArray[i], inputArray[j])) {
                    int temp = inputArray[i];
                    inputArray[i] = inputArray[j];
                    inputArray[j] = temp;
                }
            }
        }

        return inputArray;

    }

    public boolean isFirstNumberSmaller(int firstNumber, int secondNumber) {
        if(isEven(firstNumber) && isEven(secondNumber) ) {
            return  firstNumber < secondNumber;
        } else if( isOdd(firstNumber) && isOdd(secondNumber)) {
            return firstNumber < secondNumber;
        } else if(isOdd(firstNumber) && isEven(secondNumber)) {
            return true;
        } else { // first number is even and second is odd
            return false;
        }
    }

    public boolean isEven(int number) {
        return  number %2 == 0;
    }

    public boolean isOdd(int number) {
        return  number %2 == 1;
    }


}
