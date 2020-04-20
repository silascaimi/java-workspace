package preparedstatement.insert;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class HrComponent {

	public int addEmployee(String lastName, String firstName, String extension, String email, String officeCode,
			String jobTitle) throws Exception {

		try (Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/classicmodels?user=root&password=admin&serverTimezone=UTC");

				PreparedStatement preparedStatement = connection.prepareStatement(
						"INSERT INTO employees " + "(lastName, firstName, extension, email, officeCode, jobTitle) "
								+ "VALUES (?, ?, ?, ?, ?, ?)",
								
						// informa que queremos a chave primaria gerada automaticamente
						Statement.RETURN_GENERATED_KEYS);) { 

			preparedStatement.setString(1, lastName);
			preparedStatement.setString(2, firstName);
			preparedStatement.setString(3, extension);
			preparedStatement.setString(4, email);
			preparedStatement.setString(5, officeCode);
			preparedStatement.setString(6, jobTitle);

			preparedStatement.executeUpdate();

			// obter o valor de incremento automatico
			try (ResultSet resultSet = preparedStatement.getGeneratedKeys();) {

				int autogenkey = 0;

				if (resultSet.next()) {
					autogenkey = resultSet.getInt(1);
				}

				return autogenkey;
			}
		}
	}
}
