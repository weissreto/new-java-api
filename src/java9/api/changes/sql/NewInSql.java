package java9.api.changes.sql;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ConnectionBuilder;
import java.sql.DatabaseMetaData;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLType;
import java.sql.ShardingKey;
import java.sql.ShardingKeyBuilder;
import java.sql.Statement;
import java.util.stream.Stream;

import javax.sql.DataSource;

public class NewInSql 
{
	public void connectionBuilder() throws SQLException
	{
		ConnectionBuilder builder = null;
		String username = null;
		String password = null;
		ShardingKey shardingKey = null;
		ShardingKey superShardingKey = null;

		builder.user(username);
		builder.password(password);
		builder.shardingKey(shardingKey);
		builder.superShardingKey(superShardingKey);
		Connection connection = builder.build();
	}
	
	public void dataSource() throws SQLException
	{
		DataSource ds = null;
		
		ConnectionBuilder createConnectionBuilder = ds.createConnectionBuilder();
		ShardingKeyBuilder createShardingKeyBuilder = ds.createShardingKeyBuilder();
		
		int loginTimeout = ds.getLoginTimeout();
		ds.setLoginTimeout(loginTimeout);
		
		PrintWriter logWriter = ds.getLogWriter();
		ds.setLogWriter(logWriter);
		
		// same for CommonDataSource, ConnectionPoolDataSource, XADataSource
	}
	
	public void connection() throws SQLException
	{
		Connection connection = null;
		
		connection.beginRequest();
		connection.endRequest();
		
		ShardingKey shardingKey = null;
		connection.setShardingKey(shardingKey);
		ShardingKey superShardingKey = null;
		connection.setShardingKey(shardingKey, superShardingKey);
		int timeout = 0;
		connection.setShardingKeyIfValid(superShardingKey, timeout);
		connection.setShardingKeyIfValid(shardingKey, superShardingKey, timeout);
	}
	
	public void databaseMetaData() throws SQLException
	{
		DatabaseMetaData metaData = null;
		metaData.supportsSharding();
	}
	
	public void driverManager()
	{
		DriverManager manager = null;
		Stream<Driver> drivers = manager.drivers();
	}
	
	public void shardingKeyBuilder() throws SQLException
	{
		ShardingKeyBuilder builder = null;
		
		Object subkey = null;
		SQLType subkeyType = null;
		builder.subkey(subkey, subkeyType);
		builder.build();
	}
	
	public void statement() throws SQLException
	{
		Statement statement = null;
		
		boolean alwaysQuote = false;
		String identifier = "IWA_Task";
		String enquoteIdentifier = statement.enquoteIdentifier(identifier, alwaysQuote);
		
		String enquoteLiteral = statement.enquoteLiteral("Hello");
		
		String enquoteNCharLiteral = statement.enquoteNCharLiteral("Hello");
		
		boolean simpleIdentifier = statement.isSimpleIdentifier(identifier);
	}
}
