package filei.o;
import java.util.Scanner;

public  abstract class paths {
    public String create(){
        System.out.println("enter the path for file which you want to create");
        Scanner input=new Scanner(System.in);
        return input.nextLine();
    }
    public String output(){
        System.out.println("enter the path of filein  which you want to write");
        Scanner output=new Scanner(System.in);
        return output.nextLine();
    }
    public String append(){
        System.out.println("enter the append file path");
        Scanner append=new Scanner(System.in);
        return append.nextLine();
    }
    public String deletefilepath(){
        System.out.println("enter the delete file path");
        Scanner delete=new Scanner(System.in);
        return delete.nextLine();
    }
    public String read(){
        System.out.println("enter the path for the file which you want to read");
        Scanner input=new Scanner(System.in);
        return input.nextLine();
    }
}
