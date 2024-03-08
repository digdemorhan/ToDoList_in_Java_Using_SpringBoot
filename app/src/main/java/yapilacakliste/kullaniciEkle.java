/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yapilacakliste;

import com.deneme.app.entity.kullanici;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class kullaniciEkle {

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

    public List<kullanici> getAllUser() {
        String query = "Select * From todolist.kullanici;";
        List<kullanici> all = new ArrayList<>();
        try (Connection con = dbCon()) {
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                kullanici temp = new kullanici();
                temp.setKullaniciAdi(rs.getString("kullaniciAdi"));
                temp.setKullaniciMail(rs.getString("kullaniciMail"));
                temp.setKullaniciSifre(rs.getString("kullaniciSifre"));
                all.add(temp);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return all;
    }

    //KULLANICI EKLEME METODU
    public int kullaniciEkle(int kullaniciID, String kullaniciAdi, String kullaniciMail, String kullaniciSifre) throws SQLException {
        Connection myConn = dbCon();
        String query = "Insert into todolist.kullanici (kullaniciID, kullaniciAdi, kullaniciMail, kullaniciSifre) "
                + "Values (?, ?, ?, ?)";
        PreparedStatement ps = myConn.prepareStatement(query);
        ps.setInt(1, kullaniciID);
        ps.setString(2, kullaniciAdi);
        ps.setString(3, kullaniciMail);
        ps.setString(4, kullaniciSifre);
        int durum = ps.executeUpdate();
        myConn.close();
        return durum;
    }
}
