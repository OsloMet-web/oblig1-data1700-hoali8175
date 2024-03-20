package com.example.oblig1data1700hoali8175.oblig2;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/billetter") // Legger til "/api" først
public class BillettController {

    private final List<Billett> billetter = new ArrayList<>();

    @PostMapping("/registrer") // Endrer til /registrer
    public String lagreBillett(@RequestBody Billett billett) {
        billetter.add(billett);
        return "Billett lagret!";
    }

    @GetMapping("/hentAlle") // Endrer til /hentAlle
    public List<Billett> hentBilletter() {
        return billetter;
    }

    @DeleteMapping("/slettAlle") // Endrer til /slettAlle
    public String slettBilletter() {
        billetter.clear();
        return "Alle billetter slettet!";
    }
}
