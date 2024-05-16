package BigO;

public class OofN {
    public static void main(String[] args) {
        // O(n) scales linearly with input
        // O(n+2+100+4004) => (n+ 4106) => O(n) because the c constants are nothing....
        // O(2 * n ) => O(n)
        // Two inputs of n => O(n+m) => O(n)
        int[] arr = {7, 4, 11, 4, 5, 6, 12, 8, 22, 37};
        log(arr);

        for(int i=0; i<100;i++){
            System.out.println("*****");
            System.out.println("***");
            System.out.println("****");
            System.out.println("*****");
            System.out.println("*****");

        }

    }

    public static void log(int[] numbers){
        for(int i=0; i<numbers.length; i++){
            System.out.println("This is index: " + i + " number is: " + numbers[i]);
        }
    }
}
