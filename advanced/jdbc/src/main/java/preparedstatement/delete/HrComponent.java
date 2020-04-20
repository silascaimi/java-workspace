package preparedstatement.delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class HrComponent {

	public boolean deleteEmployee(String employeeNumber) throws Exception {

		try (Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/classicmodels?user=root&password=admin&serverTimezone=UTC");

				PreparedStatement preparedStatement = connection
						.prepareStatement("DELETE FROM employees WHERE employeeNumber = ?");) {

			preparedStatement.setString(1, employeeNumber);

			int count = preparedStatement.executeUpdate();

			return count > 0 ? true : false;
		}
	}
}
