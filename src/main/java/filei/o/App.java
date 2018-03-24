package filei.o;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        System.out.println( "Hello World!" );
        crud c=new crud();
       c.createfile();
       c.writefile();
        c.readfile();
        c.appendfile();
        c.deletefile();
    }
}
