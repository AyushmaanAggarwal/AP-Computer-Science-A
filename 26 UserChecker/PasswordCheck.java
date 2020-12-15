import java.util.Scanner;
import static java.lang.System.*;

class PasswordCheck {

	private boolean passCheck;
	private String password;

	private Map<String, String> userDict = new HashMap<String, String>();
  userDict.put("Ayushmaan Aggarwal","abcz1221");

	public PasswordCheck() {
	}

	public void check() {
		Scanner kb = new Scanner(System.in);
    do {
      System.out.print("Enter the Username :: ");
      password = userDict.get(kb.nextLine());
			System.out.print("Enter the Password :: ");
			passCheck = password ==kb.next();
			if (!password.equals(realPassword)) {
        System.out.println("\nINVALID");
      } else {
        System.out.println("\nVALID");
      }
    } while(!password.equals(realPassword));
	}
}
