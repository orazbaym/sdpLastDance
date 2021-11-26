package com.facade;

import com.builder.User;
import com.builder.UserBuilder;
import com.singleton.DatabaseConnection;

import java.sql.*;

public class SQLQuery implements ISQLQuery{

    public long query() {
        User user = new UserBuilder ()
                .withAccount ( 1000 )
                .withCvv ( "123" )
                .withName ( "Name" )
                .withSurname ( "Surname" )
                .withUsername ( "namesurname" )
                .withAge ( 18 )
                .build ();
        /*
        *       private String name;
                private String surname;
                private String username;
                private String cvv;
                private int account;
                private int age;*/
        String query = "INSERT INTO Users(name, surname, cvv, account, age) VALUES" +
                "(?,?,?,?,?)";

        long id = 0;

        try (Connection connection = DatabaseConnection.getInstance ().getConnection ();
             PreparedStatement preparedStatement = connection.prepareStatement ( query , Statement.RETURN_GENERATED_KEYS )) {
            preparedStatement.setString ( 1 , user.getName () );
            preparedStatement.setString ( 2 , user.getSurname () );
            preparedStatement.setString ( 3 , user.getUsername () );
            preparedStatement.setString ( 4 , user.getCvv () );
            preparedStatement.setInt ( 5 , user.getAccount () );
            preparedStatement.setInt ( 6 , user.getAge () );


            int res = preparedStatement.executeUpdate ();

            if (res > 0) {
                try (ResultSet resultSet = preparedStatement.getGeneratedKeys ()) {
                    if (resultSet.next ()) {
                        id = resultSet.getLong ( 1 );
                    }
                } catch (SQLException e) {
                    System.out.println ( e.getMessage () );
                }
            }

        } catch (SQLException e) {
            System.out.println ( e.getMessage () );
        }

        return id;
    }
}
