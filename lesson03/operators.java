
import com.sun.prism.shader.Solid_ImagePattern_Loader;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;




public class operators
{
    public static void main(String[] args) {

        /*
 ---------------------------   Задача 1:    -----------------------
    Дано масив {15, 8, 24, 41, 9, 84}.
    Необхідно отримати випадкове число з масива. Якщо число парне,
    вивести напис “I am lucky”, в протилежному випадку “Run again”.
 ------------------------------------------------------------------
 */  //Задача 1

        int[] array1 = {15, 8, 24, 41, 9, 84};
        int min = 0;
        int max = 5;
        int diff = max - min;

        Random random = new Random();
        int i = random.nextInt(diff + 1) + min;
        System.out.println("Random value = " + i);
        System.out.println("Value from massiv = " + array1[i]);
        int z =   i % 2;
        System.out.println("Value after % 2 = " + z);
        System.out.println(z);
        if ( z == 0) {

            System.out.println("I am lucky");
        } else {

            System.out.println("Run again");
        }




        //--------------------------------------------------------------------------------------------------

        /*
 ---------------------------   Задача 2:    ----------------------------------
    Є загадка “If I drink, I die. If I eat, I am fine. What am I?”
    Відповідь на питання треба ввести з консолі;
    Є три спроби відповісти на питання, після чого програма закінчуєтся;
    Якщо ввести “Fire”, в консоль віводится “Great!” та закінчуется цикл
    Якщо ввести “I don’t know”, в консоль виводиться “Answer: Fire”
    та закінчується циклІнша відповідь, то виводиться в консоль “Think again”
    та продовжується цикл
 -----------------------------------------------------------------------------
 */  // Задача 2

        /*
        {

            String zagadka = "If I drink, I die. If I eat, I am fine. What am I?";
            System.out.println(zagadka);

            int a = 0;
            do {
                a++;
                System.out.println("Please enter answer: = ");
                Scanner scan1 = new Scanner(System.in);
                String line = scan1.nextLine();
                String answer1 = "Fire";
                String answer2 = "I do not know";

                if (line.contains(answer1)) //пишем оператор а в скобках условие
                {
                    System.out.println("Great!");
                    break;
                }
                else if (line.contains(answer2))
                {
                    System.out.println("Answer: Fire");
                    break;
                }
                else
                {
                    System.out.println("Think again");
                }

            } while (a<3);

 }

 */  //ANSWER FOR Задача 2

        //=================================================================================================

        //----------------ИНФОРМАЦИЯ ПРО МЕТОДЫ------------------------------------------------------------

        /*

        public String say(String name) {
            String fullName = "My name " + name;
            //в подсказке было что сделать метод типа void который не возвращает ни какие данные
            // или добавить return
            return fullName;
        }
        // добавим еще один метод
        public void testName() {
            //сделаем что наша стринга fullName будит равняться методу say
            String fullName = say("dime"); // необходимо зажать (соmmand - mac, ctrl - win) чтобы перейди в родительский метод

        }
        public static void main(String[] args) {

            String fullName;
            System.out.println(fullName);
        }

         */

        /*
    public String name = "Dima";
    public static void main(String[] args)
    {

        {
            // переменная одного метода не может быть использована в другом
            String lastNameN = "Stanchenko";
            System.out.println(lastNameN);
        }
    }
    public void addName(int a)
    {
        int b = 2;
        System.out.println(b);
    }

     */

        //addName - название метода, параметр метода void - параметр который указывает что метод ничего не возвращает
        //(int a) - место где перечисляюстя входные данные, {} - тело метода
        //методы находятся в середине классов
        //классы состоят из переменных и методов, методов может быть много в одном классе
        //в методах описываются действия
        //результат работы одного метода можем использовать в другом методе
        //метод предоставляет атомарность, когда код большой проще его дебажить
        //не выводит(в консоль) есть результат котогый используется, например ввести логин и не возвращает это разные вещи - метод void
        //чтобы в тесте ввести имя пользователя можно использовать метот void
        //чтобы получить имя пользователя использовать метот стринг 36 минута

        /*
    public String say()
    {
        return "a";
    } // результат этого метода в итоге ровняется букве а

    public void say2()
    {
        String full = "b" + say();
        System.out.println(full);
    }


    public static void main(String[] args)
    {
        String name = "Dima";
        String lastName = "Kovalchuk";

        String fullName = name + " " + lastName;

        System.out.println(fullName);

    }
      */

        //============================ ИСПОЛЬЗОВАНИЕ ЛОГИЧЕСКИХ ОПЕРАТОРОВ ==================================

        /*
        boolean a = true && false;
        System.out.println(a);
        boolean b = true || false;
        System.out.println(b);
        boolean c = !true;
        System.out.println(c);

         */ // Пример 1 использования логических операций

        /*   String one = "a";
        String two = "d";

        String words = "drive";

        boolean conteinsInWord1 = words.contains(one) && words.contains(two);
        boolean ta = words.contains(two) ? true : false;
        String ts = words.contains(one) ? "yes" : "no"; // до знака вопроса идет условие

        boolean conteinsInWord2 = words.contains(one) || words.contains(two);

        boolean conteinsInWord3 = words.contains(one);
        boolean conteinsInWord4 = !words.contains(one);

        System.out.println("&& " + conteinsInWord1); // && - логическое сравнение & - побитовое сравнение
        System.out.println("|| " + conteinsInWord2);
        System.out.println(" " + conteinsInWord3);
        System.out.println("! " + conteinsInWord4);
        System.out.println("ternar " + ta);
        System.out.println("ternar " + ts);
         }
         */  // Пример 2 использования логических операций



        // ======================================  ЦИКЛЫ ===================================================

        /*
    public static void main(String[] args)

    {
        // ЦИКЛ WHILE   - проверить условие а после выполнить действие
        /*
        int a = 2;
        while (a < 9) // цикл while, сначало идет сравнение а потом прибавление
            {
                a++;
                System.out.println(a);  // действия в скобках будут выполняться пока условие верно
    }
    */  //можно использовать на количество введенных паролей



        // ЦИКЛ DO WHILE  -  выполнять действие пока выполняется условие
        /*
        int a = 0;
        do {
            a++;
            System.out.println(a);
        } while (a < 9);
        */  // Пример использования цикла do while

        // ЦИКЛ FOR  -  цикл со счетчиком, ипользуется когда знаем сколько раз будит выполняться действие
        /*
        for (int i=0; i < 3; i++)    // условие выполнения цикла
        {
            System.out.println("for");  //  в кавычках перечень действий которые выполняет цикл
        }
        */ // Пример использования цикла  for

        // ЦИКЛ FOREACH + работа с массивом
        /*

        int [] array = {15, 8, 24, 41, 9, 84}; // Массив, (типы данных должны совпадать если тут int или стринг)
        for (int i : array)     // Цикл, который перебирает массив (то и тут тоже должен быть int или стринг)
                                // цикл по порядку берет каждый элимент и выводит в консоль
                               // пример изспользования, когда есть список имен и нам его надо перебрать
                               // или когда надо указать ренж от 1 до  1000
        {
            System.out.println(i);
        }
       */ // Пример использования цикла

        //ЦИКЛ IF ELSE
        /*
            int a = 1;

            if (a == 1) //пишем оператор а в скобках условие
            {
                System.out.println("Number 1");
            }
            else
            {
                System.out.println("Number ??");
            }
        */ // Пример использования цикла

        // ЦИКЛ IF ELSE IF
        /*
        int a = 3;
        if (a == 1) //пишем оператор а в скобках условие
            {
              System.out.println("Number 1");
            }

        else if (a == 2)
            {
                System.out.println("Number 2");
            }
        else if (a == 3)
            {
                 System.out.println("Number 3");
            }
        else
            {
                 System.out.println("Number ??");
            }
            */ // Пример использования цикла

        /*
        String country = "AU";
        switch (country)
        {
            case "UA":
                System.out.println("Ukraine");
                 break;
            case "IT":
                 System.out.println("Italy");
                 break;      // если убрать break то выполнится и следующий шаг т.е. выведется Италия и Германия
            case "DE":
                 System.out.println("Germany");
                 break;
            case "PL":
                 System.out.println("Poland");
                 break;
            default:
                System.out.println("Incorrect country");
                break;  // последний break можно не писать
        }
        */ // Пример использования цикла switch case

        //====================================  РАБОТА С МАССИВАМИ  ============================================

        /*
        int [] array1 = {5, 17, 350}; // данные в массиве могут быть только указанного типа
        String [] array2 = {"Java", "PHP"}; // Java имеет 0 индекс
            // каждый массив имеет длинну
            // каждый элимент массива имеет свой индекс, значение индекса начинается с 0
            // индексы необходимы что-бы работать с конкретными элиментами массива
        System.out.println(array2[0]); //если после []. поставить . то увидим все методы для работы со стрингой
        */ // вводное ифно по массивам


        /*
        // есть возможность создать массив определенного размера и после заполнить значениями
        String [] newArray = new String[3];
        //------наполнение массива -------
        newArray[0] = "a";
        newArray[1] = "b";
        newArray[2] = "c";
        //   newArray[3] = "d"; не можем добавлять больше элементов чем мы изначально задали
        // int [] secondArray; не является созданием массива тк не задан его размер (для массивов выдел память)
             int [] secondArray = new int[2]; //создание числового массива
         newArray[0] = "a";
        newArray[1] = "b";

        // -------------------- вывод массива в разной формате --------------------
        System.out.println("Output newArray - " + newArray); // вывод массива в виде кэша
        System.out.println(Arrays.toString(newArray)); //вывод массива в виде стринги
        System.out.println(secondArray);

        // ---------- вывод массива с помощью цикла------------------
        for(String s : newArray)
            System.out.println(s); // вариант вывода 1
        //-----------------------------------------------------------
        String [] array3 = {"Java", "PHP"};
        for (String element : array3) {
            System.out.println(element);} // вариант вывода 2
        // ----------------------------------------------------------
        for(int i = 0; i < array3.length; i++)
            System.out.println(array3[i]); // варифнт вывода 3
        // ----------------------------------------------------------

*/
    }
}


