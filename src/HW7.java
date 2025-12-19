public class HW7 {
    public static void section1(){
        String str = "Good morning!";
        String firstSymbol = String.valueOf(str.charAt(0));

        System.out.println("Длина строки: " + str.length());
        System.out.println("Первый символ: "+ firstSymbol);

        int index = str.indexOf("Java");
        if (index == -1){
            System.out.println("Содержит Java: нет");
        }
        else {
            System.out.println("Содержит Java: да");
        }
    }

    public static void section2(){
        String str = "Good morning!";
        String  substr = str.substring(6, 8);
        System.out.println(substr);

        int index = str.indexOf("Good");
        System.out.println(index);

        System.out.println(str.toUpperCase());
    }

    public static void section3(){
        String productName = "мандарин";
        int productQty = 5;
        float productPrice = 3.6F;
        System.out.println("Вы купили " + productName + ", количество: " + productQty + ", итоговая стоимость: " + productPrice * productQty);
    }
}
