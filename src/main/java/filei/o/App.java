package filei.o;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{private static Logger logs = LogManager.getLogger(crud.class);
    public static void main( String[] args ) throws IOException {

        System.out.println( "Hello World!" );
        crud c=new crud();
        logs.debug("object for main class created");
    c.createfile();
    logs.info("file created");
       c.writefile();
        logs.info("data written into file");
        c.readfile();
        logs.info("data read from file");
        c.appendfile();
        logs.info("file appended to file");
        c.deletefile();
        logs.info("file deleted");
    }
}
