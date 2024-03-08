    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.deneme.app.controller;

import com.deneme.app.dto.requestDto;
import com.deneme.app.entity.gorev;
import com.deneme.app.entity.kullanici;
import java.sql.SQLException;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
//import yapilacakliste.gorevEkle;
import yapilacakliste.kullaniciEkle;
import yapilacakliste.kullaniciSil;

@RestController
@RequestMapping("user")
public class kullaniciController {

    private static int idGen = 110;

    private List<kullanici> kullanici = new ArrayList<>();
    private Random random = new Random();

    //Yeni bir kullanıcı eklemek için API
    /*@PostMapping("/add")
    public kullanici kullaniciEkle(@RequestBody kullanici kullanici){     
        Long randomKullaniciId = random.nextLong();
        kullanici.setkullaniciID(randomKullaniciId);
        kullanici.add(kullanici);
        return kullanici;
    }*/
    @PostMapping("/dda")
    @CrossOrigin(origins = "http://127.0.0.1:5502")
    @ResponseBody
    public String kullaniciEkle(@RequestBody requestDto dto) throws SQLException { //Parametre olarak dene
        idGen++;
        kullanici temp = new kullanici();
        temp.setKullaniciAdi(dto.getName());
        temp.setKullaniciMail(dto.getMail());
        temp.setKullaniciSifre(dto.getPassword());
        temp.setKullaniciid(idGen);
        kullaniciEkle sinif = new kullaniciEkle();
        int status = sinif.kullaniciEkle(
                temp.getKullaniciid(),
                temp.getKullaniciAdi(),
                temp.getKullaniciMail(),
                temp.getKullaniciSifre()
        );
        return status == 1 ? "Kayit basarili" : "Kayit basarisiz";
    }

    //Kullanıcı silmek için API 
    /*@DeleteMapping("/kullanici/{kullaniciID}")
    public void kullaniciSil (@PathVariable(name = "id") Long kullaniciID){ 
        //kullanici.removeIf(kullanici -> kullanici.getkullaniciID().equals(kullaniciID));
    }*/
    @DeleteMapping("dlt")
    public String kullaniciSil(@RequestBody kullanici dto) throws SQLException {
        kullaniciSil sinif = new kullaniciSil();
        int status = sinif.kullaniciSil(
                dto.getKullaniciid()
        );
        return status == 1 ? "Silme basarili" : "Silme basarisiz";
    }

    //Rastgele bir kullanıcı id atamak için API
    @GetMapping("/{randomkullaniciID}")
    public Long randomkullaniciID(@PathVariable(name = "id") Long id) {
        return random.nextLong();
    }

    @GetMapping("all")
     @CrossOrigin(origins = "http://127.0.0.1:5502")
    public ResponseEntity<?> getAllUser() {
        return new ResponseEntity<>(new kullaniciEkle().getAllUser(), HttpStatus.OK);
    }
}
