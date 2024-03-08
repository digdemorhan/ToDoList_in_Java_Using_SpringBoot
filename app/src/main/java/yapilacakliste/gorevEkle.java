/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yapilacakliste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class gorevEkle {


    //VERİTABANI BAĞLANTISI
    public static Connection dbCon() {
        Connection con = null;
        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/todolist", "root", "");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return con;
    }


    //GÖREV EKLEME METODU
    public int gorevEkle( int gorevid, String gorevİcerik, String gorevTarih, Boolean gorevDurum) throws SQLException {
        Connection myConn = dbCon();
        String query = "Insert into todolist.gorev (gorevid, gorevİcerik, gorevTarih, gorevDurum) Values (?, ?, ?, ?)";
        PreparedStatement ps = myConn.prepareStatement(query);
        ps.setInt(1, gorevid);
        ps.setString(2, gorevİcerik);
        ps.setString(3, gorevTarih);
        ps.setBoolean(4, gorevDurum);
        int durum = ps.executeUpdate();
        myConn.close();
        return durum;
    }
}

