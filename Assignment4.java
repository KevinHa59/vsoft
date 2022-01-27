package assignment;
import java.util.*;

public class Assignment4 {
    public static void main(String[] args) {
        Q1CalcAverageOfArray();
        Q2FindValueInArray(4);
        Q3FindIndexOfElement(3);
        Q4RemoveValueInArray(3);
        Q5FindMaxAndMin();
        Q6ReverseArray();
        Q7FindDuplicateValues();
        Q8FindDuplicateOfStringValues();
        Q9FindCommonValuesOf2Arrays();
        Q10RemoveDuplicateValuesInArray();
        Q11FindSecondLargestValueFromArray();
        Q12FindSecondSmallestValueFromArray();
        Q13SeparateEvenAndOddNumbers();
        Q14FindKLargestValuesInArray(3);
        Q15FindKSmallestValuesInArray(3);
        Q16Swap2ArraysWithTempVariable();
        Q17Swap3ArraysWithTempVariable();
        Q18CopyAnArrayToAnother();
        Q19FindTheFrequencyOfEachElementOfArray();
        Q20PrintArrayInReverseOrder();
        Q21PrintValuesInEvenPosition();
        Q22PrintValuesInOddPosition();
        Q23SumAllValuesInArray();
        Q24SortArrayInAscendingOrder();
        Q25SortArrayInDescendingOrder();
    }

    static void Q1CalcAverageOfArray(){
        int[] arr = {1,2,3,4,6};
        int sum = 0;
        int size = arr.length;
        for(int i : arr){
            sum += i;
        }
        System.out.println("Q1. Average value of Array: " +((double)sum/(double)size));
    }

    static void Q2FindValueInArray(int value){
        boolean found = false;
        int[] arr = {1,2,3,4,6};
        for(int i : arr){
            if(i== value){
                found = true;
            }
        }
        if (found == true)
            System.out.println("Q2. Value " + value + " found");
        else
            System.out.println("Q2. Value " + value + " not found");
    }

    static void Q3FindIndexOfElement(int value){
        int[] arr = {1,2,3,4,6};
        int index = -1;
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] == value){
                index = i;
            }
        }
        if (index >= 0)
            System.out.println("Q3. Index of value " + value + " is " + index);
        else
            System.out.println("Q3. Value " + value + " is not existed in array");
    }

    static void Q4RemoveValueInArray(int value){
        int[] arr = {1,2,3,4,6};

        int[] newArr = new int[arr.length-1];
        int pointer = 0;
        for(int i = 0 ; i < arr.length; i++){
            if(value != arr[i]){
                newArr[pointer] = arr[i];
                pointer++;
            }
        }
        System.out.print("Q4. Remove value " + value + ": ");
        for(int i : newArr){
            System.out.print(i + " ");
        }
    }

    static void Q5FindMaxAndMin(){
        int[] arr = {2,3,8,4,1,6};
        int max = arr[0];
        int min = arr[0];

        for(int i = 1 ; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }

            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println("\nQ5. Max: " + max + " - Min: " + min);

    }

    static void Q6ReverseArray(){
        int[] arr = {1,2,3,4,5};
        int len = arr.length;
        int temp  = 0;
        for(int i = 0 ; i < len/2; i++){
            temp = arr[i];
            arr[i] = arr[len-i-1];
            arr[len-i-1] = temp;
        }

        System.out.print("Q6. Array after reverse: ");
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    static void Q7FindDuplicateValues(){
        int[] arr = {7,1,2,3,7,4,3,5};
        Dictionary<Integer, Integer> dic = new Hashtable<>();
        System.out.print("\nQ7. Duplicate values: ");
        for(int i = 0 ; i< arr.length; i++){
            if(dic.get(arr[i]) == null){
                dic.put(arr[i], 1);
            }else{
                int value = dic.get(arr[i]) + 1;
                dic.put(arr[i], value);
                System.out.print(arr[i] + " ");
            }

        }

    }

    static void Q8FindDuplicateOfStringValues(){
        String[] arr = {"apple","orange","banana","melon","grape","orange","potato","melon"};
        Dictionary<String, Integer> dic = new Hashtable<>();
        System.out.print("\nQ8. Duplicate string values: ");
        for(int i = 0 ; i< arr.length; i++){
            if(dic.get(arr[i]) == null){
                dic.put(arr[i], 1);
            }else{
                int value = dic.get(arr[i]) + 1;
                dic.put(arr[i], value);
                System.out.print(arr[i] + ", ");
            }

        }
    }

    static void Q9FindCommonValuesOf2Arrays(){
        int[] arr1 = {1,3,5,7,9,7,11};
        int[] arr2 = {2,4,5,6,8,9,10};

        Dictionary<Integer, Integer> dict = new Hashtable<>();

        System.out.print("\nQ9. Common Values Of 2 Arrays: ");
        for(int i = 0 ; i < arr1.length; i++){
            if(dict.get(arr1[i]) == null){
                dict.put(arr1[i], 1);
            }
        }
        for(int i = 0 ; i < arr2.length; i++){
            if(dict.get(arr2[i]) == null){
                dict.put(arr2[i], 1);
            }else {
                int value = dict.get(arr2[i]) + 1;
                dict.put(arr2[i], value);
                System.out.print(arr2[i] + ", ");
            }
        }
    }

    static  void Q10RemoveDuplicateValuesInArray(){
        int[] arr = {1,3,5,7,9,7,11,3};
        Set<Integer> s = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            s.add(arr[i]);
        }
        int[] newArr = new int[s.size()];
        int index = 0;
        for(int i: s){
            newArr[index++] = i;
        }
        System.out.print("\nQ10. Remove duplicate values from Arrays: ");
        for(int i = 0; i < newArr.length; i++){
            System.out.print(newArr[i] + " ");
        }
    }

    static void Q11FindSecondLargestValueFromArray(){
        int[] arr = {2,3,8,4,1,10,6};
        Arrays.sort(arr);
        System.out.println("\nQ11. Second Largest Value: " + arr[arr.length-2]);
    }
    static void Q12FindSecondSmallestValueFromArray(){
        int[] arr = {2,3,8,4,1,10,6};
        Arrays.sort(arr);
        System.out.println("Q12. Second Smallest Value: " + arr[1]);
    }
    static void Q13SeparateEvenAndOddNumbers(){
        int[] arr = {2,3,7,8,5,4,1,10,6};
        int left = 0;
        int right = arr.length-1;
        int temp = 0;
        while(left < right){
            if(arr[left]%2!=0 && arr[right]%2==0){
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
            if (arr[left]%2==0){
                left++;
            }
            if(arr[right]%2!=0){
                right--;
            }
        }

        System.out.print("Q13. Separate Even And Odd Numbers: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void Q14FindKLargestValuesInArray(int k){
        int[] arr = {2,3,7,8,5,4,1,10,6};
        Arrays.sort(arr);
        System.out.print("\nQ14. Find K Largest Values In Array: ");
        for(int i = arr.length- k; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    static void Q15FindKSmallestValuesInArray(int k){
        int[] arr = {2,3,7,8,5,4,1,10,6};
        Arrays.sort(arr);
        System.out.print("\nQ14. Find K Smallest Values In Array: ");
        for(int i = 0; i < k; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void Q16Swap2ArraysWithTempVariable(){
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};
        int temp = 0;
        for(int i = 0 ; i < arr1.length; i++){
            temp = arr1[i];
            arr1[i] = arr2[i];
            arr2[i] = temp;
        }
        System.out.println("\nQ16. Swap 2 Arrays using Temp variable: ");
        System.out.print("-Array 1: ");
        for(int i: arr1){
            System.out.print(i + " ");
        }
        System.out.print("\n-Array 2: ");
        for(int i: arr2){
            System.out.print(i + " ");
        }
    }

    static void Q17Swap3ArraysWithTempVariable(){
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};
        int[] arr3 = {11,12,13,14,15};

        int temp = 0;
        for(int i = 0 ; i < arr1.length; i++){
            temp = arr1[i];
            arr1[i] = arr2[i];
            arr2[i] = arr3[i];
            arr3[i] = temp;
        }

        System.out.println("\nQ17. Swap 3 Arrays using Temp variable: ");
        System.out.print("-Array 1: ");
        for(int i: arr1){
            System.out.print(i + " ");
        }
        System.out.print("\n-Array 2: ");
        for(int i: arr2){
            System.out.print(i + " ");
        }
        System.out.print("\n-Array 3: ");
        for(int i: arr3){
            System.out.print(i + " ");
        }
    }

    static void Q18CopyAnArrayToAnother(){
        int[] arr = {1,2,3,4,5};
        int[] newArr;
        newArr = arr;

        System.out.print("\nQ18. Copy An Array to Another: ");
        for(int i: newArr){
            System.out.print(i + " ");
        }
    }

    static void Q19FindTheFrequencyOfEachElementOfArray(){
        int[] arr = {2,3,7,8,5,4,1,10,6,3,6,3};
        Dictionary<Integer, Integer> dict = new Hashtable<>();
        for(int i = 0 ; i < arr.length; i++){
            if(dict.get(arr[i]) == null){
                dict.put(arr[i], 1);
            }else {
                int value = dict.get(arr[i]) + 1;
                dict.put(arr[i], value);
            }
        }
        System.out.println("\nQ19. Find The Frequency Of Each Element Of Array: ");
        for(int i = 0 ; i< arr.length; i++){
            if(dict.get(arr[i])!=null){
                System.out.println("-Value "+arr[i] + " [" + dict.get(arr[i])+"]");
                dict.remove(arr[i]);
            }
        }
    }

    static void Q20PrintArrayInReverseOrder(){
        int[] arr = {1,2,3,4,5};
        System.out.print("Q20. Print Array In Reverse Order: ");
        for(int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
    }
    static void Q21PrintValuesInEvenPosition(){
        int[] arr = {1,2,3,4,5};
        System.out.print("\nQ21. Print Values In Even Position: ");
        for(int i = 0; i < arr.length; i+=2){
            System.out.print(arr[i] + " ");
        }
    }

    static void Q22PrintValuesInOddPosition(){
        int[] arr = {1,2,3,4,5};
        System.out.print("\nQ22. Print Values In Odd Position: ");
        for(int i = 1; i < arr.length; i+=2){
            System.out.print(arr[i] + " ");
        }
    }
    static void Q23SumAllValuesInArray(){
        int[] arr = {1,2,3,4,5};
        int sum = 0;
        for(int i : arr){
            sum+=i;
        }
        System.out.print("\nQ23. Sum All Values In Array: " + sum);

    }
    static void Q24SortArrayInAscendingOrder(){
        int[] arr = {3,1,2,5,4};
        int temp = 0;
        for(int i = 0 ; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("\nQ24. Sort Array In Ascending Order: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    static void Q25SortArrayInDescendingOrder(){
        int[] arr = {3,1,2,5,4};
        int temp = 0;
        for(int i = 0 ; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] < arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("\nQ24. Sort Array In Ascending Order: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
