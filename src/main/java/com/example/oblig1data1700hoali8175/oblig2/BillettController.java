package com.example.oblig1data1700hoali8175.oblig2;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class BillettController {

    private final ArrayList<Bilett> billetter = new ArrayList<>();

    @PostMapping("/registrerBillett")
    public void registrerBillett(@RequestBody Bilett innBilett) {
        billetter.add(innBilett);
    }

    @GetMapping("/hentAlleBilletter")
    public ArrayList<Bilett> hentAlleBilletter() {
        return billetter;
    }
}

