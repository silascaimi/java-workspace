package connection.classforname;


import java.sql.DriverManager;
import java.sql.Connection;

public class ProductsComponent {

	public boolean tryConnection() throws Exception {	

		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels?user=root&password=admin&serverTimezone=UTC");			
			
		boolean isValid = connection.isValid(2);
			
		connection.close();
		
		return isValid;
		

    }
}