/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.deneme.app.entity;

//import jakarta.persistence.Entity;

import yapilacakliste.randomGorevId;

//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;


//@Entity
/*public class gorev{
  //  @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int gorevid;
    private String gorevİcerik;
    private String gorevTarih;
    private boolean gorevDurum;
    // Diğer alanlar ve getter/setter'lar

    
    public void setgorevid(Long randomGorevId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void add(gorev gorev) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getgorevid() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}*/

//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;


//@Entity
public class gorev{
  //  @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int gorevid;
    private String gorevİcerik;
    private String gorevTarih;
    private boolean gorevDurum;
    // Diğer alanlar ve getter/setter'lar

    /**
     * @return the gorevid
     */
    public int getGorevid() {
        return gorevid;
    }

    /**
     * @param gorevid the gorevid to set
     */
    public void setGorevid(int gorevid) {
        this.gorevid = gorevid;
    }

    /**
     * @return the gorevİcerik
     */
    public String getGorevİcerik() {
        return gorevİcerik;
    }

    /**
     * @param gorevİcerik the gorevİcerik to set
     */
    public void setGorevİcerik(String gorevİcerik) {
        this.gorevİcerik = gorevİcerik;
    }

    /**
     * @return the gorevTarih
     */
    public String getGorevTarih() {
        return gorevTarih;
    }

    /**
     * @param gorevTarih the gorevTarih to set
     */
    public void setGorevTarih(String gorevTarih) {
        this.gorevTarih = gorevTarih;
    }

    /**
     * @return the gorevDurum
     */
    public boolean isGorevDurum() {
        return gorevDurum;
    }

    /**
     * @param gorevDurum the gorevDurum to set
     */
    public void setGorevDurum(boolean gorevDurum) {
        this.gorevDurum = gorevDurum;
    }


}