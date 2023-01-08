public class Main
{
    public static long silnia(int n) throws BlednaWartoscDlaSilniException
    {
        if (n < 0)
        {
            throw new BlednaWartoscDlaSilniException("Liczba nie może być ujemna");
        }

        long result = 1;
        for (int i = 1; i <= n; i++)
        {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args)
    {
        try
        {
            int number = 5;
            long factorial = silnia(number);
            System.out.println(number + "! = " + factorial);
        }
        catch (BlednaWartoscDlaSilniException e)
        {
            System.out.println(e.getMessage());
        }
    }
}

class BlednaWartoscDlaSilniException extends Exception
{
    public BlednaWartoscDlaSilniException(String message)
    {
        super(message);
    }
}
-------------------------------------------------------------------------

public class Main
{
    public static long silnia(int n) throws BlednaWartoscDlaSilniException
    {
        if (n < 0)
        {
            throw new BlednaWartoscDlaSilniException("Liczba nie może być ujemna");
        }

        long result = 1;
        for (int i = 1; i <= n; i++)
        {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args)
    {
        try
        {
            int number = 5;
            long factorial = silnia(number);
            System.out.println(number + "! = " + factorial);
        }
        catch (BlednaWartoscDlaSilniException e)
        {
            System.out.println(e.getMessage());
        }
    }
}

class BlednaWartoscDlaSilniException extends Exception
{
    public BlednaWartoscDlaSilniException(String message)
    {
        super(message);
    }
}
