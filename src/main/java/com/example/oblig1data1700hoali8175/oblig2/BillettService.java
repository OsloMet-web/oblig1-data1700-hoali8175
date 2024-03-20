package com.example.oblig1data1700hoali8175.oblig2;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BillettService {

    private final List<Billett> billetter = new ArrayList<>();

    public void registrerBillett(Billett billett) {
        billetter.add(billett);
    }

    public List<Billett> hentAlleBilletter() {
        return billetter;
    }

    public void slettAlleBilletter() {
        billetter.clear();
    }
}

