package com.example.oblig1data1700hoali8175.oblig2;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/billetter")
public class BillettController {

    private final List<Billett> billetter = new ArrayList<>();

    @PostMapping("/lagreBillett")
    public String lagreBillett(@RequestBody Billett billett) {
        billetter.add(billett);
        return "Billett lagret!";
    }

    @GetMapping("/hentBilletter")
    public List<Billett> hentBilletter() {
        return billetter;
    }

    @DeleteMapping("/slettBilletter")
    public String slettBilletter() {
        billetter.clear();
        return "Alle billetter slettet!";
    }
}

