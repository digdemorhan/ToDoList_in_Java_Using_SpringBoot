/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yapilacakliste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class kullaniciSil {

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

    //KULLANICI SİLME METODU
    public int kullaniciSil(int kullaniciID) throws SQLException {
        Connection myConn = dbCon();
        String query = "DELETE FROM todolist.kullanici WHERE kullaniciID = ?";
        PreparedStatement ps = myConn.prepareStatement(query);
        ps.setInt(1, kullaniciID);
        int durum = ps.executeUpdate();
        myConn.close();
        return durum;
    }
}
