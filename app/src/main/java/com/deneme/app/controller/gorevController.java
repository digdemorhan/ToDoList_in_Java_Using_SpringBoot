/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.deneme.app.controller;


import com.deneme.app.entity.gorev;
import com.deneme.app.entity.kullanici;
import java.sql.SQLException;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
//import org.springframework.http.ResponseEntity;
import yapilacakliste.gorevEkle;
import yapilacakliste.gorevSil;
import yapilacakliste.kullaniciSil;



@RestController
@RequestMapping("gorev")
public class gorevController {
    
    private List<gorev> gorev = new ArrayList<>();
    private Random random = new Random();
    
    //Yeni görev eklemek için API
    /*@PostMapping("/gorev")
    public ResponseEntity<gorev> gorevEkle(){
        gorev gorev=new gorev();
        Long randomGorevId = random.nextLong();
        gorev.setgorevid(randomGorevId);
        gorev.add(gorev);
        return ResponseEntity.ok().body(gorev);
    }*/
    
    @PostMapping("/add")
    public String gorevEkle(@RequestBody gorev dto) throws SQLException {
        gorevEkle sinif = new gorevEkle();
        int status = sinif.gorevEkle(
                dto.getGorevid(),
                dto.getGorevİcerik(),
                dto.getGorevTarih(),
                dto.isGorevDurum()
        );
        return status == 1 ? "Kayit basarili" : "Kayit basarisiz";
    }
    
    //Görev silmek için API
    /*@DeleteMapping("/gorev/{gorevid}")
    public void gorevSil(@PathVariable Long gorevid){
        //gorev.removeIf(gorev -> gorev.getgorevid().equals(gorevid));
    }*/
    
    @DeleteMapping("ltd")
    public String gorevSil (@RequestBody gorev dto) throws SQLException {
        gorevSil sinif = new gorevSil();
        int status = sinif.gorevSil(
                dto.getGorevid()
        );
        return status == 1 ? "Silme basarili" : "Silme basarisiz";
    }
 

    //Rastgele bir gorevid atamak için API
    @GetMapping("rnd")
    public Long randomgorevid(){
        return random.nextLong();
 }
}
