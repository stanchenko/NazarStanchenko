package lesson2;

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
        String nameMani = "Dmitro Dmitro Dmitro";
        String fullName = "Dmytro Kovalchuk ";
        String trimName = fullName.trim();

        boolean replaceInName = fullName.contains(name);
        String newName = name.replace("ro","riy");
        String newNameMani = nameMani.replace("ro","riy");
        System.out.println(newName);
        System.out.println(newNameMani);
        System.out.println(trimName);
        */ // изспользование реплейса символов в стринге и трим пробела




    }
}
