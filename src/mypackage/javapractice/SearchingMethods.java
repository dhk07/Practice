package mypackage.javapractice;

import java.util.Scanner;

public class SearchingMethods {

    static int [] inputData = null;
    static int searchingElement = 0;

    public static void main(String[] args) {

        callLinearSearch();
        callBinarySearch();
    }

    public static void callLinearSearch(){
        System.out.println("###################### LINEAR SEARCH ######################");
        takeInput();
        LinearSearch objLinearSearch = new LinearSearch();
        int result = objLinearSearch.linearSearching(inputData, searchingElement);
        displayOutput(result, "Linear Search");
    }
    public static void callBinarySearch(){
        System.out.println("###################### BINARY SEARCH ######################");
        takeInput();
        BinarySearch objBinarySearch = new BinarySearch();
        int result = objBinarySearch.binarySearching(inputData, 0, inputData.length-1, searchingElement);
        displayOutput(result, "Binary Search");
    }

    public static void takeInput(){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Please enter array length: ");
            int arrayLength = scanner.nextInt();

            inputData = new int[arrayLength];
            System.out.println("Enter values : ");
            for (int i = 0; i < arrayLength; i++) {
                inputData[i] = scanner.nextInt();
            }
            System.out.print("Enter searching element: ");
            searchingElement = scanner.nextInt();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void displayOutput(int result, String searchingAlgoName){
        System.out.println("Element is being searched by using "+searchingAlgoName+" algorithm....");
        if (result == -1) {
            System.out.println("Element is not available in data");
        } else {
            System.out.println("Element is available at index: " + result);
        }
    }
}
