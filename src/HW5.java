import java.util.Arrays;

public class HW5 {
    public static void section1(){
        int[] numbers = {1, 2, 3 ,4, 5, 6, 7};
        for(int number: numbers){
            System.out.println(number);
        }

        System.out.println();

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = numbers[i] * 2;
            System.out.println(numbers[i]);
        }
    }
}
