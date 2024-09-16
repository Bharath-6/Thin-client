package com.example.Thin_client.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class Thinclientcontroller {

    @CrossOrigin(origins = "*")
    @GetMapping("/print")
    public ResponseEntity<String> getMessage() {
        return ResponseEntity.ok("Printer Opened");
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/cash-drawer")  // Updated the URL to follow proper naming conventions
    public ResponseEntity<String> getCash() {
        return ResponseEntity.ok("Cash Drawer is Opened");
    }
}
