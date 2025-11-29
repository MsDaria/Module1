public class HW4 {
    public static void section1(){
        int x = 0;
        while (x <= 50){
            if (x % 2 == 0){
                System.out.println(x);
            }
            x++;
        }
    }


    public static void section2() {
        int number = 1;
        int count = 0;
        do {
            if (number % 7 == 0) {
                count++;
            }
            number++;
        } while (number <= 100);
        System.out.println(count);
    }

    public static void section3(){
        int number = 0;
        int sum = 0;
        while (number <= 100){
            sum += number;
            number++;
        }
        System.out.println(sum);
    }

    public static void section4(){
        int randomNumber = 0;
        int count = 0;
        do{
            randomNumber = (int) (Math.random() * 20)+1;
            count++;
        } while (randomNumber != 15);
        System.out.println(count);
    }
}
