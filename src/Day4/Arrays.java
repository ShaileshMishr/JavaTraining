// Arrays - Collection of similar data types

package JavaBasics.src.Day4;

public class Arrays {
    public static void main(String[] args){

        String message = "Multiple inheritance is not supported in java";

        int[] numbers = new int[6];  // This will block 24 bytes in memory
        System.out.println(numbers[2]); // output: 0

//        String[] number = new String[6];
//        System.out.println(number[2]);   output== nullS

        String[] words = new String[7];


        words = message.split("");

        for(int i=0;i< words.length;i++) {
            System.out.println(words[i]);
        }

        System.out.println(words[0]+":"+words[1]);
    }

}
