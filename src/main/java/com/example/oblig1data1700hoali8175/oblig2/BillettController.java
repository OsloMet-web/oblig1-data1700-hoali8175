package com.example.oblig1data1700hoali8175.oblig2;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/billetter")
public class BillettController {

    private final List<Billett> billetter;

    public BillettController(List<Billett> billetter) {
        this.billetter = billetter;
    }

    @PostMapping("/registrer")
    public void registrerBillett(@RequestBody Billett billett) {
        billetter.add(billett);
    }

    @GetMapping("/hentAlle")
    public List<Billett> hentAlleBilletter() {
        return billetter;
    }

    @DeleteMapping("/slettAlle")
    public void slettAlleBilletter() {
        billetter.clear();
    }
}
