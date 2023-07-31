/* Задача3: - по желанию
Напишите программу, которая запрашивает у пользователя три числа и выполняет следующие проверки:

Если первое число больше 100, выбросить исключение NumberOutOfRangeException с сообщением "Первое число вне допустимого диапазона".

Если второе число меньше 0, выбросить исключение NumberOutOfRangeException с сообщением "Второе число вне допустимого диапазона".

Если сумма первого и второго чисел меньше 10, выбросить исключение NumberSumException с сообщением "Сумма первого и второго чисел слишком мала".

Если третье число равно 0, выбросить исключение DivisionByZeroException с сообщением "Деление на ноль недопустимо".

В противном случае, программа должна выводить сообщение "Проверка пройдена успешно".
- необходимо создать 3 класса собвстенных исключений */

import java.util.Scanner;

class NumberOutOfRangeException extends Exception
{
    public NumberOutOfRangeException (String massege)
    {
        super(massege);
    }
}

class NumberSumException extends Exception
{
    public NumberSumException (String massege)
    {
        super(massege);
    }
}

class DivisionByZeroException extends Exception
{
    public DivisionByZeroException (String massege)
    {
        super(massege);
    }
}


public class T3
{
    public static void main(String[] args) {
        try
        {
            int result1 = enterNumberOne();
            System.out.printf("Число %d корректно", result1);
            int result2 = enterNumberTwo();
            System.out.printf("Число %d корректно", result2);

        }
        catch (NumberOutOfRangeException ex)
        {
            System.out.println(ex.getMessage());
        }

/*         try
        {
            int result = numberSum();
            System.out.printf("Число %d корректно", result);
        }
        catch (NumberOutOfRangeException ex)
        {
            System.out.println(ex.getMessage());
        } */
    }

    public static int enterNumberOne() throws NumberOutOfRangeException
    {
        Scanner in = new Scanner(System.in);
        int number1 = in.nextInt();
        in.close();
        if (number1 > 100)
        {
            throw new NumberOutOfRangeException("Первое число вне допустимого диапазона");
        }
        return number1;
    }

    public static int enterNumberTwo() throws NumberOutOfRangeException
    {
        Scanner in = new Scanner(System.in);
        int number2 = in.nextInt();
        in.close();
        if (number2 < 0)
        {
            throw new NumberOutOfRangeException("Второе число вне допустимого диапазона");
        }
        return number2;
    }

    public static int numberSum(int a, int b) throws NumberSumException
    {

        if (a + b < 10)
        {
            throw new NumberSumException("Сумма первого и второго чисел мала");
        }
        return a + b;
    }

    public static int division() throws DivisionByZeroException
    {
        Scanner in = new Scanner(System.in);
        int c = in.nextInt();
        in.close();
        if (c == 0)
        {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        }
        return c;
    }
}

