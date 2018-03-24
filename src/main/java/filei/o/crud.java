package filei.o;

import java.io.*;
import java.util.Scanner;

public class crud extends paths {
    public  void createfile() throws IOException {
        File file=new File(input());
      boolean b=  file.createNewFile();
      if(b==true)
          System.out.println("file crea/home/perky/Documents/test.txtted Sucssfully");
      else System.out.println("Sorry file not created");
      }
      public void readfile() throws IOException {
        String s;
        File f=new File(input());
          FileReader fr=new FileReader(f);
          BufferedReader br=new BufferedReader(fr);
          while(( s=br.readLine())!=null){
              System.out.println(s);
          }

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
    }
    public void appendfile() throws IOException {
        Scanner writ=new Scanner(System.in);
        File f=new File(append());
        FileWriter fw=new FileWriter(f,true);
        BufferedWriter bw =new BufferedWriter(fw);
        bw.write(writ.nextLine());
        bw.close();
    }
    public void deletefile(){
        File f=new File(deletef());
        f.delete();
    }
}
