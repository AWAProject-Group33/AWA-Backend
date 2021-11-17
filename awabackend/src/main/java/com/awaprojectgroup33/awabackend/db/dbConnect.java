package com.awaprojectgroup33.awabackend.db;

import java.sql.*;

public class dbConnect {

    public void connectionMethod() {

        String url = "jdbc:postgresql://localhost/awa_database";
        String user = "postgres";
        String password = "secure";

        try(Connection connection = DriverManager.getConnection(url, user, password)) {
            try(Statement statement = connection.createStatement()){
                String sql = "select * from consumer";
                try(ResultSet result = statement.executeQuery(sql)){
                    while(result.next()) {
                        String fname = result.getString("first_name");
                        int   consumer_id  = result.getInt  ("consumer_id");

						System.out.println(fname);
						System.out.println(consumer_id);
                    }
                }
				
                /* this insert works!
				sql = "insert into consumer values (DEFAULT, 'test1fname', 'test1lname', 'test1@test.com')";
				statement.executeUpdate(sql);
                */
				
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } 
    }
}
