package arrays_and_arraylists;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {
//        Create an empty array with 5 elements
        String[] hobbies = new String[5];
//        give each index in the array a value
        hobbies[0] = "reading";
        hobbies[1] = "playing video games";
        hobbies[2] = "hiking";
        hobbies[3] = "camping";
        hobbies[4] = "dogs";
//        print the entire array to the terminal (you will need to use the Array.toString() method)
        System.out.println(Arrays.toString(hobbies));
//        print the length of the array
        System.out.println(hobbies.length);


//        Create an array with 5 elements and give the values in-line
        int[] favNums = {8,18,23,11,3};

//        print the entire array to the terminal
        System.out.println(Arrays.toString(favNums));
//        print the length of the array
        System.out.println(favNums.length);
//        change a few values in each array and then print both arrays to the terminal again
        favNums[2] = 0;

        System.out.println(Arrays.toString(favNums));
        System.out.println("Hello World");
    }


}
