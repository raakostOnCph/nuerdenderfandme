import java.util.Scanner;

public class Input
{


    public  String getString(String s)
    {

        System.out.print(s + " : ");

        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine();

    }
}
