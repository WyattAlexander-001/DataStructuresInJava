package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    //Lookup = 0(1)
    //Insert = O(n)
    //Delete = O(n) //https://dev.to/ggorantala/array-strengths-weaknesses-and-big-o-complexity-analysis-4aho#:~:text=In%20computer%20science%2C%20we%20only,from%20the%200%20th%20index.
    public static void main(String[] args) {
        int[] numbers = new int[5];
        System.out.println(numbers); //gives memory address, numbers is just a pointer!
        System.out.println(Arrays.toString(numbers)); //converts to a string so you can see it, it'll be all zeroes
        numbers[0] = 666; //index at 0 duh
        numbers[numbers.length-1] = 777; //Getting to the end

        //numbers[22] = 56; out of bounds error dood

        System.out.println(numbers.length); //5
        System.out.println(numbers[numbers.length-1]); //777
        System.out.println(Arrays.toString(numbers)); //[666, 0, 0, 0, 777]

        int[] faveNumbers = {2,7,666,21,777};
        System.out.println(Arrays.toString(faveNumbers));
        System.out.println("\n========================================================================================\n");

        //Testing Array Homemade:
        Array something = new Array(3);
        something.insert(10);
        something.insert(20);
        something.insert(40);
        something.insert(20);
        something.insert(20);
        something.insert(20);
        something.insert(20);
        something.insert(20);

        something.removeAt(1);

        System.out.println(something.indexOf(40));
        System.out.println(something.indexOf(200));


        something.print();
        //Dynamic Array Homemade automatically increase/shrink:
//        Array example = new Array(3);
//        example.insert(10);
//        example.insert(400000);
//        example.insert(33);
//        exmaple.removeAt(3);
//        example.print();
//        System.out.println(example.indexOf(33));

        //There's other Arrays built in: Vector (syncho)  100% growth/ArrayList 50% growth
        System.out.println("\n========================================================================================\n");

        ArrayList<String> dynamicArr = new ArrayList<String>();
        dynamicArr.add("Wyatt");
        dynamicArr.add("Anni");
        System.out.println(dynamicArr);
        System.out.println(dynamicArr.size());
        System.out.println(dynamicArr.indexOf("Anni"));
        System.out.println(dynamicArr.contains("Wyatt"));
        

    }
}