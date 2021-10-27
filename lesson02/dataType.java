package lesson2;

import java.util.Locale;
import java.util.Scanner;

public class dataType
{
     /*
    int x = 8;
    byte b = 2;
    short c = 3;
    long d = 4;

    double z = 3.4;
    float k = (float) 0.1; //4
    float y = 0.1F;

    char t =  'a'; //сохраняется число, значение с юникод таблицы

    boolean is = true; //логические операторы
    boolean no = false;
    // только латинские, имена переменных должны быть понятными, чтобы коллеги могли понять о чем идет речь
    boolean isMenuDisplayed = true; //Camelcase
    // 54 которые нельзя использовать
    // имя переменной не может начинаться с цифр
    // имя переменной должно начинаться с маленькой буквы
   */   //переменные

     /* комментирование
        System.out.println("Planeta");
        System.out.println("Mars");
    абзаца  */

    public static void main(String[] args) {

         /*
        Написати програму, яка виведе в консоль текст:
        “The height building ‘height’ m and ‘count’ floors”.
        ‘height’ і ‘count’ - це змінні які можна  вводити через Scanner, або налаштувати в конфігураціях, як на скріні.
         */
        System.out.println("please enter the height and number of floors in the house you want to build" );

        System.out.println("Please enter floors: = ");
        Scanner scan2 = new Scanner(System.in);
        int floors = scan2.nextInt();

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter height: = ");
        int height = scan.nextInt();

        System.out.println("Your house will have " + floors + " floors and height of about " + height + " meters");





        /*
        System.out.println("Planeta");
        System.out.println("Mars");

        System.out.print("Planeta"); //без ln выводится в один ряд
        System.out.println("Mars");
      */
        /*
        int x = 8;
        int y = 2;
        System.out.println(x % y);  // результат 0 потому что возращается остаток от деления
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        */
        /*
       int x = 8;
       x = x + 8; // x+=8 аналогичные записи
       x = x - 8; // x-=8
       x = x * 8; // x*=8
       x = x / 8;
      */

        /*
        int x = 7;

        System.out.println(x++); //присваивается а потом добавляется 1, поэтому результат 8
        System.out.println(++x); //префиксная форма 8+1=9

        System.out.println(x--); //результат будит 7 т.к. сначало выводим х=7 а потом отнимаем 1=6
        System.out.println(--x); //префиксная форма  берется значение из предыдущей операции и отнимаетя 1  8+1=9
        */  //префексная форма

        /*
     String a1 = "text";
     String a2 = a1 + "2";
     System.out.println(a1);
     System.out.println(a2);
     */  // вывод переменной стринг

        //работа со стрингой
        String a1 = "text";
        String a2 = "text2";

        /*
        boolean isTrue = a1 == a2;
        System.out.println(isTrue); //sout - быстрый вызов функции
        // != - не равняется
        // equals
        // ==

       */  // сравнение стринги

        /*
        int x = a2.length();
        System.out.println("Lenth a2 = " + x);
         */  // подсчет числа символов в стринге
        /*
        char a = a2.charAt(1);
        System.out.println(a);
         */  // вывод вывод определенного символа указав номер по счету в строке, индексация идет от нуля
        /*
        int pointAt = a2.codePointAt(0);
        int pointBefore = a2.codePointBefore(1);
        System.out.println("pointAt =" + pointAt);
        System.out.println("pointBefore =" + pointBefore);
        */  // получить юникод конкретного символа в строке, полезно иного при различных валидациях

        // F8 до дебаг поинта
        // F9
        // a2.concat()

        /*
        String name = "Dima";
        String fullName = "Dmytro Kovalchuk";

        boolean isFullNameContainsName = fullName.contains(name);
        System.out.println(isFullNameContainsName); // в этом методе берется стринга разбивается на символы и идет их сравнение, сравнение частичное
         */  // функция contains сравнение что значение одной стринги присутствует в другой

        /*
        String password = "123";
        if(password.length() < 8 )
            return false;
        */ // пример использования валидации на примере пароля

        /*
        String name = "";
        String fullName = "Dmytro Kovalchuk";

        boolean isFullNAmeContainseName = fullName.contains(name);
        if (name.isEmpty())
         */ // проверка что заполняемое поле не пустое

        // ctrl + / - закомитит выделенные рядки

        /*
        String name = "Dmitro";
        String name2 = "Dmitriy";
        String nameMani = "Dmitro Dmitro Dmitro";
        String fullName = "Dmytro Kovalchuk ";
        String trimName = fullName.trim();

        boolean containsInName = fullName.contains(name);
        String newName = name.replace("ro","riy");
        String newNameMani = nameMani.replace("ro","riy");
        String nameOneSubstring = name.substring(1);
        String nameSecondSubstring = name.substring(1,3);
        boolean startWithOne = name.startsWith("D");
        boolean endtWithOne = name2.endsWith("ro");
        String lowerCaseName = name.toLowerCase();
        String upperCaseName = name.toUpperCase();
        int ab = 2;
        String intAB = String.valueOf(ab);

        System.out.println(name);
        System.out.println(containsInName);
        System.out.println(newName);
        System.out.println("Change name Dmitro on Dmitriy: = " + newNameMani);
        System.out.println("Trime spase in the end line: = " + trimName);
        System.out.println("Substring variant one: = " + nameOneSubstring);
        System.out.println("Substring variant one: = " + nameSecondSubstring);
        System.out.println("Substring startWith: = " + startWithOne);
        System.out.println("Substring endWith: = " + endtWithOne);
        System.out.println("Substring lowerCase: = " + lowerCaseName);
        System.out.println("Substring upperCase: = " + upperCaseName);
        System.out.println("Int to string, now 2 is not number, it is string: = " + intAB);
        */ // изспользование реплейса и сабстринга символов в стринге и трим пробела

        /*
       System.out.println("Input int: = " );
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println("You input " + number);
         */ // введение числа в консоли и вывод введенного числа
        /*
        System.out.println("Input string: = " );
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
          Double line1 = scan.nextDouble(); // тим переменной должен соответствовать ожидаемым входным данным
          Boolean line2 = scan.nextBoolean();
          Byte line3 = scan.nextByte();
          Float line4 = scan.nextFloat();
        System.out.println("You input this string line: = " + line);
        */

        /*
        int result = Math.abs(-123);
        int result2 = Math.max(33,7);
        int result3 = Math.min(1,9);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);

        double a = Math.round(15);
        System.out.println(a);

         */ //работа с библиотекой Math

        /*
        int c = Integer.parseInt(args[0]); //парсим значение которое прийдет в тип данных integer
        System.out.println(c);

         */

        //psvm - входная точка в программу, отсюда идет ее начало

    }
}
