package filei.o;
import java.util.Scanner;

public class paths {
    public String input(){
        System.out.println("enter the input file path");
        Scanner input=new Scanner(System.in);
        return input.nextLine();
    }
    public String output(){
        System.out.println("enter the output file path");
        Scanner output=new Scanner(System.in);
        return output.nextLine();
    }
    public String append(){
        System.out.println("enter the append file path");
        Scanner append=new Scanner(System.in);
        return append.nextLine();
    }
    public String deletef(){
        System.out.println("enter the delete file path");
        Scanner delete=new Scanner(System.in);
        return delete.nextLine();
    }
}
