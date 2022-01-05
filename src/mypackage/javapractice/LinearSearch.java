package mypackage.javapractice;

import java.util.Scanner;

public class LinearSearch {

    public int linearSearching(int [] inputData, int searchingElement){

        int elementIndex = -1;

        for(int i=0;i<inputData.length;i++){
            if(inputData[i]==searchingElement){
                elementIndex =  i;
                break;
            }
        }
        return elementIndex;
    }
}
