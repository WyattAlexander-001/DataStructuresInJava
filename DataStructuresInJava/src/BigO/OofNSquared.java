package BigO;

public class OofNSquared {
    public static void main(String[] args) {
        // O(n^2) since we are going through num TWICE!
        int[] num = {22,11,23,4,5,6,12,1213};
        for(int first : num){
            for(int second: num){
                System.out.println(first + "//" + second);
            }
        }
    }
}
