package com.example.oblig1data1700hoali8175.oblig2;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/billetter")
public class BillettController {

    private final List<Billett> billetter = new ArrayList<>();

    @PostMapping("/registrer")
    public ResponseEntity<String> registrerBillett(@RequestBody Billett billett) {
        billetter.add(billett);
        return new ResponseEntity<>("Billett registrert", HttpStatus.CREATED);
    }

    @GetMapping("/hentAlle")
    public ResponseEntity<List<Billett>> hentAlleBilletter() {
        return new ResponseEntity<>(billetter, HttpStatus.OK);
    }
}




