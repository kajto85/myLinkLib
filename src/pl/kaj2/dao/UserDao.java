package pl.kaj2.dao;

import pl.kaj2.DB.ConProvider;
import pl.kaj2.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {

    private  final String selectQuery ="SELECT user_id FROM  user WHERE (username =? and password=?);";
    private  final String createQuery = "INSERT INTO user(username, password) VALUES(?,?);";

    public int readUser(String username, String password) {
        int userId = 0;
        try (Connection con = ConProvider.getConnection()) {
            PreparedStatement preparedStatement = con.prepareStatement(selectQuery);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                userId = rs.getInt(1);
            }else
                userId=0;
        } catch (SQLException e) {
            System.out.println("Połączenie z baza lipa auth");
            e.printStackTrace();
        }
        return userId;
    }

    public void createUser(User user){
        try(Connection con = ConProvider.getConnection()){
            PreparedStatement preparedStatement = con.prepareStatement(createQuery);
            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.executeUpdate();
            System.out.println("Nowy uzytkownik dodany");
        } catch (SQLException e) {
            System.out.println("Połączenie z baza lipa tworzenie uzytkownika");
            e.printStackTrace();
        }
    }






}
