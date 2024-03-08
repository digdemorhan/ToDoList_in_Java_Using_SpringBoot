/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yapilacakliste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class gorevSil {

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

    //GÖREV SİLME METODU
    public int gorevSil(int gorevid) throws SQLException {
        Connection myConn = dbCon();
        String query = "DELETE FROM todolist.gorev WHERE gorevid = ?";
        PreparedStatement ps = myConn.prepareStatement(query);
        ps.setInt(1, gorevid);
        int durum = ps.executeUpdate();
        myConn.close();
        return durum;
    }
}

