import java.util.Date;

public class DatePrinter implements Runnable
{
    private int i = 0;
    public void run()
    {
        while (i < 20)
        {
            Date date = new Date();
            System.out.println(date);
            i++;
        }
    }
}

