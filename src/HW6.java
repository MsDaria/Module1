import java.util.Arrays;

public class HW6 {
    public static void section1(){
        int[] numbers = {5, 6, 77, 87, 56, 3};
        int summ = 0;
        for (int i = 0; i < numbers.length; i++){
            summ += numbers[i];
        }
        System.out.println("Среднее значение: " + summ / numbers.length);
    }

    public static void section2(){
        int[] numbers = {-5, 6, 77, -87, 56, 3};
        System.out.println("Исходный массив: " + Arrays.toString(numbers));
        for ( int i= 0; i < numbers.length; i++){
            if (numbers[i] < 0){
                numbers[i] = numbers[i]*(-1);
            }
        }
        System.out.println("Изменённый массив: " + Arrays.toString(numbers));
    }

    public static void section3(){
        int [][] numbers = {
                {5, 6, 77, 87, 56, 3},
                {7, 85, 64, 72, 18, 6}
        };
        for (int i = 0; i < 2; i++){
            int summ = 0;
            for (int j = 0; j < 6; j++){
                summ = summ + numbers[i][j];
            }
            System.out.println("Сумма строки: " + summ);
        }
    }

    public static void section4(){
        int[] numbers = {5, 6, 77, 86, 56, 3};
        int max = numbers[0];
        int maxi = 0;
        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] > max){
                max = numbers[i];
                maxi = i;
            }
        }
        System.out.println("Индекс максимального элемента массива: " + maxi);
    }

    public static void section5(){
        int[] numbers = {5, 6, 77, 86, 56, 6};
        int a = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            for(int j = i+1; j < numbers.length; j++){
                if (numbers[i] == numbers[j]){
                    System.out.println("Есть повторяющиеся элементы");
                    break;
                }
            }
        }
    }
}
