package com.codedecode.testemail.Controller;


import com.codedecode.testemail.Service.SendEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @Autowired
    private SendEmail sendEmail;

    @GetMapping("/sendEmail")
    public String sendEmail(){

        sendEmail.sendEmail("bjornironside176@gmail.com","Testing","Testing");
        return "Success";
    }
}
