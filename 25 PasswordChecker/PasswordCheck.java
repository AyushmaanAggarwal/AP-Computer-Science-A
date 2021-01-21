import java.util.Scanner;
import static java.lang.System.*;

class PasswordCheck {

	private String password;
  private String realPassword="abcz1221";

	public PasswordCheck() {
	}

	public void check() {
		Scanner kb = new Scanner(System.in);
    do {
      System.out.print("Enter the password :: ");
      password = kb.next();
      if (!password.equals(realPassword)) {
        System.out.println("\nINVALID");
      } else {
        System.out.println("\nVALID");
      }

    }while(!password.equals(realPassword));
	}
}
