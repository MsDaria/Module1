public class HW1 {
    public static void task1(){
        int a = 1000000;
        byte b = 100;
        short c = 30000;
        long d = 900000000;
        float e = 4.5F;
        double f = 4.000001;
        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной c с типом short равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);
    }
    public static void task2(){
        int banana = 5;
        int bananaWeight = 80;
        int milk = 2;
        int milkWeight = 105;
        int icecream = 2;
        int icecreamWeight = 100;
        int eggs = 4;
        int eggsWeight = 70;
        int weight = banana*bananaWeight + milk*milkWeight + icecream*icecreamWeight + eggs*eggsWeight;
        float weightKg = weight/1000;
        System.out.println("Вес завтрака равен " + weight + " грамм");
        System.out.println("Вес завтрака равен " + weightKg + " кг");
    }

    public static void task3(){
        int salMasha = 67760;
        int salDenis = 83690;
        int salKris = 76230;
        int salNewMasha = salMasha*10/100 + salMasha;
        int salNewDenis = salDenis*10/100 + salDenis;
        int salNewKris = salKris*10/100 + salKris;
        System.out.println("Маша теперь получает " + salNewMasha + " рублей. Годовой доход вырос на " + (salNewMasha - salMasha)*12 + " рублей");
        System.out.println("Денис теперь получает " + salNewDenis + " рублей. Годовой доход вырос на " + (salNewDenis - salDenis)*12 + " рублей");
        System.out.println("Кристина теперь получает " + salNewKris + " рублей. Годовой доход вырос на " + (salNewKris - salKris)*12 + " рублей");
    }
}