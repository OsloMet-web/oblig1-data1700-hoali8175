package com.example.oblig1data1700hoali8175.oblig2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import webprog4.Kunde2;

import java.util.ArrayList;

@RestController
public class BillettController {
    private final ArrayList<Billett> alleBilletter = new ArrayList<>();

    @PostMapping("/lagre")
    public void lagreKunde(Billett billett){
        alleBilletter.add(billett);
    }
    @GetMapping("/hentAlle")
    public ArrayList<Billett> hentAlle(){
        return alleBilletter;
    }
    @GetMapping("/slettAlle")
    public void slettAlle(){
        alleBilletter.clear();
    }
}
