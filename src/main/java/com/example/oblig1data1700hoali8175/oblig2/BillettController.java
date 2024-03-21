package com.example.oblig1data1700hoali8175.oblig2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import webprog4.Kunde2;

import java.util.ArrayList;

@RestController
public class BillettController {
    private final ArrayList<Kunde2> alleKunder = new ArrayList<>();

    @PostMapping("/lagre")
    public void lagreKunde(Kunde2 innKunde2){
        alleKunder.add(innKunde2);
    }
    @GetMapping("/hentAlle")
    public ArrayList<Kunde2> hentAlle(){
        return alleKunder;
    }
    @GetMapping("/slettAlle")
    public void slettAlle(){
        alleKunder.clear();
    }
}
