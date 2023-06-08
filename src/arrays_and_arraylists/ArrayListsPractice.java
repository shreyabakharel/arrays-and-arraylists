package arrays_and_arraylists;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListsPractice {
    public static void main(String[] args) {
//        Create an ArrayList
        ArrayList<String> favMovies = new ArrayList<>();
//        add 5 elements to it
        favMovies.add("Super Troopers");
        favMovies.add("Gladiator");
        favMovies.add("Baseketball");
        favMovies.add("Little Mermaid");


//        print the entire ArrayList to the terminal
        System.out.println(favMovies);
//        print the length of it
        System.out.println(favMovies.size());
//        remove some elements from the ArrayList
        favMovies.remove("Little Mermaid");
        System.out.println(favMovies);

//        print the entire ArrayList again
//        change some values in the ArrayList
        favMovies.set(2, "Airplane!");
//        print it again to see your changes
        System.out.println(favMovies);

//        Create an ArrayList with 5 elements and give the value in-line (you will need to use Arrays.asList())
        Integer[] evenNumsArr = {2,4,6,8,10};

        ArrayList<Integer> evenNums = new ArrayList<>(Arrays.asList(evenNumsArr));

        System.out.println(evenNums);
//        mess around with a couple methods for ArrayLists. Just type out the ArrayList variable name you made and then put a "." and scroll through the list of methods.
//        read the information it shows you and try to figure out how to use it.
//        create different conditionals using "if-else" statements to test different methods. For example:
//        lambda expression
        evenNums.forEach(num -> {
            if(num % 2 == 0){
                System.out.println(num);
            }
        });

        if (evenNums.contains(6)){
            System.out.println("THIS HAS NUMBER 6");
        }
//        print out whatever you need to the terminal to check and see if the methods work the way you think they should.

        System.out.println("Print something from arraylists practice");


    }
}
