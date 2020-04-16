package varargs;

public class TesteVarargs {

	public static void main(String[] args) {

		enviarEmails("email1@email.com", "email2@email.com");

	}

	public static void enviarEmails(String... strings) {
		
		for (String string : strings) {
			System.out.println(string);
		}
	}
}
