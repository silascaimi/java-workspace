package preparedstatement.insert;

public class Main {

	public static void main(String[] args) throws Exception {

		try {
			HrComponent comp = new HrComponent();

			int key = comp.addEmployee(
					"Williams", "Roger", "x104", 
					"rwilliams@classicmodelcars.com", "3",
					"Sales Manager (NA)");

			System.out.println("The auto-generated primary key = " + key);
		} catch (Exception exception) {
			util.ExceptionHandler.handleException(exception);
		}

	}
}
