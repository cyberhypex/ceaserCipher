package com.CeaserCipher.ceaserCipher.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.CeaserCipher.ceaserCipher.service.CeaserCipher;

@RestController
@RequestMapping("")
public class CeaserController {

    @Autowired
    private CeaserCipher ceaserCipher;

    @GetMapping("/health")
    public String health(){
        return "Health check";
    }

    @GetMapping("/encrypt")
    public String encryptMessage(
            @RequestParam String text,
            @RequestParam(defaultValue = "3") Integer shift
    ){
        return ceaserCipher.encrypt(text,shift);
    }

    @GetMapping("/decrypt")
    public String decryptMessage(
            @RequestParam String text ,
            @RequestParam(defaultValue = "3") Integer shift
    ){
        return ceaserCipher.decrypt(text,shift);
    }
}
