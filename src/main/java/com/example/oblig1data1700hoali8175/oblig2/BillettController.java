package com.example.oblig1data1700hoali8175.oblig2;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class BillettController {

    private final ArrayList<Billett> billetter = new ArrayList<>();

    @PostMapping("/registrerBillett")
    public void registrerBillett(@RequestBody Billett innBillett) {
        billetter.add(innBillett);
    }

    @GetMapping("/hentAlleBilletter")
    public ArrayList<Billett> hentAlleBilletter() {
        return billetter;
    }
}

