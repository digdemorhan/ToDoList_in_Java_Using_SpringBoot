/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yapilacakliste;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Main {


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

    public static void main(String[] args) throws SQLException {

        gorevEkle object = new gorevEkle();
        object.gorevEkle(78, "eczaneye", "2022-07-12",true);


        /*
        gorevSil obj = new gorevSil();
        obj.gorevSil(57);*/


        kullaniciEkle obje = new kullaniciEkle();
        obje.kullaniciEkle(222,"el", "el@gmail.com", "75643");

        /*
        kullaniciSil ob = new kullaniciSil();
        ob.kullaniciSil(91);*/

        kullaniciSil obe = new kullaniciSil();
        obe.kullaniciSil(20);

        gorevSil obr = new gorevSil();
        obr.gorevSil(0);


        randomGorevId nesne = new randomGorevId();
        try {
            nesne.randomizeGorevIds();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        randomKullaniciId nsn = new randomKullaniciId();
        try {
            nsn.randomizeKullaniciIds();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
