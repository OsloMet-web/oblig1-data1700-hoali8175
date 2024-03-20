package com.example.oblig1data1700hoali8175.oblig2;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class BillettServiceImpl implements BillettService {

    private List<Billett> billetter = new ArrayList<>();

    @Override
    public void registrerBillett(Billett billett) {
        billetter.add(billett);
    }

    @Override
    public List<Billett> hentAlleBilletter() {
        return billetter;
    }
}

