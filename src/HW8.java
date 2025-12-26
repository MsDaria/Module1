public class HW8 {
    public static void section1(){
        int result;
        result = Calculat.m(5, 8);
        System.out.println(result);

        result = Calculat.m(6, -2);
        System.out.println(result);

        result = Calculat.m(0, 8);
        System.out.println(result);

        result = Calculat.sumAll(5);
        System.out.println(result);

        Calculat.productInfo("Мандарин");
        Calculat.productInfo("Апельсин", 20.6, 5);

        result = Calculat.sumNum(256);
        System.out.println(result);

        result = Calculat.sumNum(1);
        System.out.println(result);

        result = Calculat.squareP(1);
        System.out.println(result);

        result = Calculat.squareP(2);
        System.out.println(result);

        result = Calculat.squareP(3);
        System.out.println(result);

        result = Calculat.squareP(4);
        System.out.println(result);

        result = Calculat.squareP(5);
        System.out.println(result);
    }
}
class Calculat {

    public static int m(int num1, int num2) {
        return num1 * num2;
    }

    public static int sumAll(int num){
        if(num < 0){
            return 0;
        }
        if(num <= 1){
            return num;
        }
        return  num + sumAll(num-1);
    }

    public static void productInfo(String name){
        System.out.println("Название: " + name);
    }

    public static void productInfo(String name, double price, int count){
        System.out.println("Название: " + name + " Цена: " + price + " Количество: " + count);
    }

    public static int sumNum(int num){
        if(num == 0){
            return 0;
        }
        return (num % 10)+ sumNum(num / 10);
    }

    public static int squareP(int side){
        return side * 4;
    }
}

