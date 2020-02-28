/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BEAN.Home;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Vann
 */
public class HomeDAO implements DBInfo{
    public  static ArrayList<Home> getHome(){
        ArrayList<Home> ah = new ArrayList<>(); ;
        try {
            Class.forName(driverName);
            Connection con = DriverManager.getConnection(dbURL, userDB, passDB);
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("select AdminId, HomeId, HomeMainPic, HomeTitle, HomeContent, HomePic from Home");
            while (rs.next()) {                
                String AId = rs.getString(1);
                String HId = rs.getString(2);
                String MainP = rs.getString(3);
                String title = rs.getString(4);
                String content = rs.getString(5);
                String pic = rs.getString(6);
                Home h = new Home(AId, HId, MainP, title, content, pic);
                ah.add(h);
            }
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return ah;
    }
    
    public static void main(String[] args) {
        ArrayList<Home> ah = getHome();
        
        System.out.println(ah.toString());
    }
}
