package com.example.oblig1data1700hoali8175.oblig2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/billetter")
public class BillettController {

    // Simulert lagring av billetter i minnet
    private List<Billett> billetter = new ArrayList<>();

    // Metode for å registrere en billett
    @PostMapping("/registrer")
    public void registrerBillett(@RequestBody Billett billett) {
        billetter.add(billett);
    }

    // Metode for å hente alle billetter
    @GetMapping("/hentAlle")
    public List<Billett> hentAlleBilletter() {
        return billetter;
    }

    // Metode for å slette alle billetter
    @DeleteMapping("/slettAlle")
    public void slettAlleBilletter() {
        billetter.clear();
    }
}
