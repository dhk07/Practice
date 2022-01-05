package mypackage.javapractice;

public class BinarySearch {

    public int binarySearching(int[] inputData, int lowerIndex, int upperIndex, int searchingElement){

        if (lowerIndex <= upperIndex) {
            int mid = lowerIndex + (upperIndex - lowerIndex) / 2;

            if (inputData[mid] == searchingElement)
                return mid;
            if (inputData[mid] > searchingElement)
                return binarySearching(inputData, lowerIndex, mid-1, searchingElement);
            else
                return binarySearching(inputData, mid + 1, upperIndex, searchingElement);
        }
        return -1;
    }
}
