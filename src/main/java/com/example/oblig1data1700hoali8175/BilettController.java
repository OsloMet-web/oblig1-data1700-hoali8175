package com.example.oblig1data1700hoali8175;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;


@RestController
@RequestMapping("/api/tickets")
public class BilettController {
    private ArrayList<Bilett> biletter = new ArrayList<>();

    @PostMapping("/book")
    public String bookTicket(@RequestBody Bilett bilett) {
        biletter.add(bilett);
        return ("Ticket booked successfully!");
    }

    @GetMapping("/all")
    public ArrayList<Bilett> getAllTickets() {
        return biletter;
    }
}
