package Arrays;

import java.util.Arrays;

public class Main {
    //Lookup = 0(1)
    //Insert = O(n)
    //Delete = O(n) //https://dev.to/ggorantala/array-strengths-weaknesses-and-big-o-complexity-analysis-4aho#:~:text=In%20computer%20science%2C%20we%20only,from%20the%200%20th%20index.
    public static void main(String[] args) {
        int[] numbers = new int[5];
        System.out.println(numbers); //gives memory address
        System.out.println(Arrays.toString(numbers)); //converts to a string so you can see it, it'll be all zeroes
        numbers[0] = 666; //index at 0 duh
        numbers[numbers.length-1] = 777; //Getting to the end
        //numbers[22] = 56; out of bounds error dood
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers));

        int[] faveNumbers = {2,7,666,21,777};
        System.out.println(Arrays.toString(faveNumbers));
        System.out.println("\n==================\n");

        //Exercises:
        
    }
}