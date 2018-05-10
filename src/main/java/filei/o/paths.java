package filei.o;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public  abstract class paths {
    private static Logger log = LogManager.getLogger(paths.class);
    public String create(){
        System.out.println("enter the path for file which you want to create");
        Scanner input=new Scanner(System.in);
        log.info("file path will be entered for creating file" );
        return input.nextLine();
    }
    public String output(){
        System.out.println("enter the path of file in  which you want to write");
        Scanner output=new Scanner(System.in);
        log.info("file path will be entered for writing file");
        return output.nextLine();
    }
    public String append(){
        System.out.println("enter the append file path");
        Scanner append=new Scanner(System.in);
        log.info("file path will be entered for appending in file");
        return append.nextLine();
    }
    public String deletefilepath(){
        System.out.println("enter the delete file path");
        Scanner delete=new Scanner(System.in);
        log.info("file path will be entered for deleting a file");
        return delete.nextLine();
    }
    public String read(){
        System.out.println("enter the path for the file which you want to read");
        Scanner input=new Scanner(System.in);
        log.info("file path will be entered for reading a file");
        return input.nextLine();
    }
}
