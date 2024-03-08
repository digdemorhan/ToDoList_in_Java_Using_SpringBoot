/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.deneme.app.entity;

import yapilacakliste.randomKullaniciId;


//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;


//@Entity
/*public class kullanici {
    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int kullaniciID;
    private String kullaniciAdi;
    private String kullaniciMail;
    private String kullaniciSifre;
    // Diğer alanlar ve getter/setter'lar

    public void setkullaniciID(Long randomKullaniciId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void add(kullanici kullanici) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getkullaniciID() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }*/
    
   
    
  //  @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    public class kullanici{
        private int kullaniciID;
        private String kullaniciAdi;
        private String kullaniciMail;
        private String kullaniciSifre;
        private int randomKullaniciId;
        // Diğer alanlar ve getter/setter'lar


        public int getKullaniciid() {
            return kullaniciID;
        }
        public void setKullaniciid(int kullaniciID) {
            this.kullaniciID = kullaniciID;
        }

        public String getKullaniciAdi() {
            return kullaniciAdi;
        }
        public void setKullaniciAdi(String kullaniciAdi) {
            this.kullaniciAdi = kullaniciAdi;
        }

        public String getKullaniciMail() {
            return kullaniciMail;
        }
        public void setKullaniciMail(String kullaniciMail) {
            this.kullaniciMail = kullaniciMail;
        }

        public String getKullaniciSifre() {
            return kullaniciSifre;
        }
        public void setKullaniciSifre(String kullaniciSifre) {
            this.kullaniciSifre = kullaniciSifre;
        }
    }
        
 

