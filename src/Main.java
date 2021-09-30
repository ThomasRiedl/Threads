public class Main {

    public static void main(String[] args)
    {
        DatePrinter dp = new DatePrinter();
        Thread t1 = new Thread(dp);

        CountPrinter cp = new CountPrinter();
        Thread t2 = new Thread(cp);

        t1.start();
        t2.start();
    }
}

//Die beiden Threads werden nacheinander geprinted obwohl sie gleichzeitig ablaufen

//Weil für eine so etwas einfaches nicht unbedingt zwei Prozessorkerne benötigt werden deshalb ist der Prozess direkt fertig abgelaufen und wird sofort geprinted

//Umso länger die Threads laufen desto mehr werden sie ineinander geprinted