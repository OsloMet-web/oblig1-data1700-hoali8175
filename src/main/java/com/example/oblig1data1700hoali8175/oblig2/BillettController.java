package com.example.oblig1data1700hoali8175.oblig2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/billetter") // Endre URL-mapping til dette nivået
public class BillettController {

    @Autowired
    private BillettService billettService;

    @PostMapping("/registrer") // Endre URL-mapping til dette nivået
    public ResponseEntity<?> registrerBillett(@RequestBody Billett billett) {
        billettService.registrerBillett(billett);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/hentAlle") // Endre URL-mapping til dette nivået
    public ResponseEntity<List<Billett>> hentAlleBilletter() {
        List<Billett> billetter = billettService.hentAlleBilletter();
        return new ResponseEntity<>(billetter, HttpStatus.OK);
    }
}
