/* Задача 2:
Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление. 
Если второе число равно нулю, программа должна выбрасывать исключение DivisionByZeroException 
с сообщением "Деление на ноль недопустимо". В противном случае, программа должна выводить результат деления.
Обратите внимание, что в обоих задачах используются собственные исключения, которые наследуются от класса Exception. 
Это позволяет нам определить специфическую причину ошибки и передать информацию об ошибке для последующей обработки. */

import java.util.InputMismatchException;
import java.util.Scanner;

class DivisionByZeroException extends Exception
{
    public DivisionByZeroException (String massege)
    {
        super(massege);
    }
}

public class T2
{
    public static void main(String[] args) {
        try
        {
            int result = division();
            System.out.println(result);
        }
        catch (DivisionByZeroException ex)
        {
            System.out.println(ex.getMessage());
        }
        System.out.println("Программа работает дальше");
        
    }

    public static int division() throws DivisionByZeroException
    {
        Scanner in = new Scanner(System.in);
        int divident = in.nextInt();
        int divisor = in.nextInt();
        in.close();
        if (divisor == 0)
        {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        }
        return divident/divisor;
    }
}

