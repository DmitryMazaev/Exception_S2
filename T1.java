/* Задача 1:
Напишите программу, которая запрашивает у пользователя число и проверяет, 
является ли оно положительным. Если число отрицательное или равно нулю, 
программа должна выбрасывать исключение InvalidNumberException с сообщением "Некорректное число". 
В противном случае, программа должна выводить сообщение "Число корректно". */

import java.util.Scanner;

class CustomException extends Exception
{
    public CustomException (String massege)
    {
        super(massege);
    }
}

public class T1
{
    public static void main(String[] args) {
        try
        {
            //Scanner in = new Scanner(System.in);
            int result = enterNumber();
            System.out.printf("Число %d корректно", result);
        }
        catch (CustomException ex)
        {
            System.out.println(ex.getMessage());
        }
        System.out.println("Программа работает дальше");
    }

    public static int enterNumber() throws CustomException
    {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        in.close();
        if (number <= 0)
        {
            throw new CustomException("Некорректное число");
        }
        return number;
    }
}

