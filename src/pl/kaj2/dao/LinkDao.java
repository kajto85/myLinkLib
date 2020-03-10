package pl.kaj2.dao;

import pl.kaj2.DB.ConProvider;
import pl.kaj2.model.Link;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LinkDao {

    private final static String create = "INSERT INTO link (link,title,description,user_id) VALUES (?,?,?,?);";
    private final static String select = "SELECT * FROM  link WHERE title=?;";
    /*private final static String update = "UPDATE link SET (link=?,title=?,description=?) WHERE title=?;";
    */
    public void create(Link link)throws SQLException {
        try(
                Connection con = ConProvider.getConnection();
                PreparedStatement prepStmn = con.prepareStatement(create)){
                prepStmn.setString(1,link.getLink());
                prepStmn.setString(2,link.getTitle());
                prepStmn.setString(3,link.getDescription());
                prepStmn.setInt(4,link.getUserId());

                prepStmn.executeUpdate();
                System.out.println("wpis udany");
        }
    }

    public Link read(String title)throws SQLException{
            Link searchlink = null;
        try(
                Connection con = ConProvider.getConnection();
                PreparedStatement prepStmn = con.prepareStatement(select)){
                prepStmn.setString(1,title);
                ResultSet rs = prepStmn.executeQuery();
                if (rs.next()) {
                    searchlink = new Link();
                    searchlink.setLink(rs.getString("link"));
                    searchlink.setTitle(rs.getString("title"));
                    searchlink.setDescription(rs.getString("description"));
                    System.out.println("odczyt udany");
                }
        }
        return searchlink;
    }

    public void update(Link link)throws SQLException{

    }

    public static boolean check(String title,String link){
        if (title.isEmpty()){
            return false;
        }else if (title.equals(" ")){
            return false;
        }else if (link.isEmpty()){
            return false;
        }else if (link.equals(" ")){
            return false;
        }else return true;
    }
/*
    public static boolean check1(String...words){
        boolean option=false;
        for (String word: words){
                if(word.isEmpty()){
                    option=false;
                }else option=true;
        }
        return option;
    }
*/

}
