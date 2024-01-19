public class hw2 {
    public static void main(String[] args) {
        task1(3);
        task1(14);
        task1(26);
        task2(12);
        task2(3);
        task2(7);
        task2(11);
        task3("abcde");
        task4("12345");
        task5(123);
        task6(784321);


    }
    public static void task1(int day) {
        if (day >= 1 && day <= 10) {
            System.out.println("Перша декада");
        } else if (day >= 11 && day <= 20) {
            System.out.println("Друга декада");
        } else if (day >= 21 && day <= 31) {
            System.out.println("Третя декада");
        } else{
            System.out.println("Помилка");
        }
    }
    public static void task2(int month) {
        if (month == 1 || month == 2 || month == 12) {
            System.out.println("It`s winter");
        } else if (month >= 3 && month <= 4) {
            System.out.println("It`s spring");
        } else if (month >= 5 && month <= 8) {
            System.out.println("It`s summer");
        } else if (month >= 9 && month <= 11) {
            System.out.println("It`s autumn");
        } else {
            System.out.println("error");
        }
    }
    public static void task3(String b) {
        if (b.charAt(0) == 'a') {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void task4(String a) {
        char first = a.charAt(0);
        if (first == '1' || first == '2' || first == '3') {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void task5(int num){
        if (num >= 100 && num <= 999){
            int num1 = num/100;
            int num2 = num/10%10;
            int num3 = num%10;

            int sum = num1+num2+num3;
         System.out.println("Сума чисел: "+sum);
        }else {
          System.out.println("Error");
        }
    }

    public static void task6(int num){
        if (num >= 100000 && num<= 999999){

            int num1 = num/100000;
            int num2 = num/10000%10;
            int num3 = num/1000%10;
            int num4 = num%1000/100;
            int num5 = num%100/10;
            int num6 = num%10;

            int sum1 = num1+num2+num3;
            int sum2 = num4+num5+num6;

            if (sum1==sum2){
                System.out.println("Yes");
            }else
                System.out.println("No");
        }else
            System.out.println("Error");
    }
}