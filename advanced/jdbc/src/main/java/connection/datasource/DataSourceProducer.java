package connection.datasource;

import javax.enterprise.inject.Produces;
import javax.sql.DataSource;

import com.mysql.cj.jdbc.MysqlDataSource;

public class DataSourceProducer {

	public MysqlDataSource mySqldataSource = null;

	@Produces
	@MySqlDataSource
	public DataSource produceDataSource() {
		// read properties from somewhere here

		if (mySqldataSource == null) {
			mySqldataSource = new MysqlDataSource();
			mySqldataSource.setPassword("admin");
			mySqldataSource.setUser("root");
			mySqldataSource.setURL("jdbc:mysql://localhost:3306/classicmodels?serverTimezone=UTC");
		}
		return mySqldataSource;
	}
}
