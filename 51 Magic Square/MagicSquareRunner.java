import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class MagicSquareRunner{
    public static void main( String[] args ) throws IOException{
        System.out.println("1");
        Scanner kb = new Scanner(new File("C:\\Users\\ayush\\Programming\\ApJava2020\\51 Magic Square\\magic1.dat"));
        int val = kb.nextInt();
        for(int i =0; i<val;i++){
            MagicSquare1 ms1 = new MagicSquare1(kb.nextInt(),kb.nextLine());
            System.out.println(ms1);
        }
	}
}