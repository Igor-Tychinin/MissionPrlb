import java.util.Scanner;

public class ProgramPrlb {

    //Задание 1. Параметр weekday принимает true , если сейчас будний день иначе выходные.
    //Парамер vacation говоритб что мы в отпуске.
    public static boolean sleepln(boolean weekday, boolean vacation){
        return (weekday == true) && (vacation == false) ? false : true;
    }

    //Задание 2. Вернуть сумму чисел a и b, если они не равны.
    // Иначе вернуть двойную сумму этих чисел.
    public static int sumDouble(int a, int b) {
        return a == b ? (a+b)*2 : a+b;
    }

    //Задание 3. Вернуть строку, которая состоит из пар индексов 0,1 4,5 8,9 и т.д.
    public static String altPairs(String str){
        String vstr="";
        StringBuilder builder = new StringBuilder(vstr);
        char[] chArr = str.toCharArray();
        for(int i = 0; i < chArr.length; i=i+4){
            builder.append(chArr[i]);
            if ((i+1)<chArr.length) builder.append(chArr[i+1]); //Проверка на выход из диапазона
            else break;
        }
        return builder.toString();
    }


    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        System.out.println("Задание 1");
        System.out.print("Введите целое число a: ");
        int A = in.nextInt();
        System.out.print("Введите целое число b: ");
        int B = in.nextInt();
        //Вывод задания 1
        System.out.println("Вывод: " + sumDouble(A,B));

        System.out.println("\nЗадание 2");
        boolean dayweek = true, vacat = true;
        System.out.println("Сегодня будний день? 1. Да 2. Нет");
        int day = in.nextInt();
        switch(day) {
            case 1:
                dayweek = true;
                break;
            case 2:
                dayweek = false;
                break;
            default:
        }
        System.out.println("Вы в отпуске? 1. Да 2. Нет");
        int vac = in.nextInt();
        switch(vac) {
            case 1:
                vacat = true;
                break;
            case 2:
                vacat = false;
                break;
            default:
        }
        //Вывод задания 2
        System.out.println("Вывод: " + sleepln(dayweek,vacat));

        Scanner inner = new Scanner(System.in);
        System.out.println("\nЗадание 3");
        System.out.println("Введите строку :");
        String strin = inner.nextLine();
        //Вывод задания 3
        System.out.println(altPairs(strin));

    }
}
