import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class MagicSquareRunner{
    public static void main( String[] args ) throws IOException{
        Scanner kb = new Scanner(new File("/home/ayushmaan/Programming/AP Java(Eclipse)/51 Magic Square/magic1.dat"));
        int val = kb.nextInt();
        
        for(int i =0; i<val;i++){
            int size = kb.nextInt();
            kb.nextLine();
            String values = kb.nextLine();
            MagicSquare1 ms1 = new MagicSquare1(size,values);
            System.out.println(ms1);
        }
	}
}