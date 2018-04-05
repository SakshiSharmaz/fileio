package filei.o;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.*;
import java.util.Scanner;

public class crud extends paths {
    private static Logger logger =LogManager.getLogger(crud.class);
    public  void createfile() throws IOException {
        File file=new File(create());
      boolean b=  file.createNewFile();
      if(b==true)
      { System.out.println("file creaTed Sucssfully");
      logger.info("file got created"); }
      else {System.out.println("Sorry file not created"); logger.warn("you did something wrong");}
      }
      public void readfile() throws IOException {
        String s;
        File f=new File(read());
          FileReader fr=new FileReader(f);
          BufferedReader br=new BufferedReader(fr);
          while(( s=br.readLine())!=null){
              System.out.println(s);
          }
          logger.info("file was read");
      }
    public void writefile() throws IOException {
Scanner writ=new Scanner(System.in);
String s1;
        File f=new File(output());
        FileWriter fw=new FileWriter(f);
        BufferedWriter bw =new BufferedWriter(fw);
        System.out.println("enter the data to be entered in file");
        s1=writ.nextLine();
        bw.write(s1);
        bw.close();
        logger.info("data was written into file");
    }
    public void appendfile() throws IOException {
        Scanner writ=new Scanner(System.in);
        File f=new File(append());
        FileWriter fw=new FileWriter(f,true);
        BufferedWriter bw =new BufferedWriter(fw);
        System.out.println("enter the data to be append in file");
        bw.write(writ.nextLine());
        bw.close();
        logger.info("data was appended into file");
    }
    public void deletefile(){
        File f=new File(deletefilepath());
        f.delete();
        logger.info("file was deleted");
    }
}
