package com.oskar.mailer.controller;


import com.oskar.mailer.model.Mail;
import com.oskar.mailer.repository.MailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.spring5.context.webflux.IReactiveDataDriverContextVariable;
import org.thymeleaf.spring5.context.webflux.ReactiveDataDriverContextVariable;

@Controller
public class MailController {

    @Autowired
    MailRepository mailRepository;

    @PostMapping("/sendMail")
    ResponseEntity sendMail(@RequestBody Mail mail) {
        System.out.println(mail);
        mailRepository.save(mail);
        return new ResponseEntity(HttpStatus.OK);

    }

    @GetMapping("/sendMail")
    ResponseEntity sendFakeMail(){
        Mail mail = new Mail("ood@wp.pl", "Dzień dobry");
        mailRepository.save(mail);
        return new ResponseEntity(mail, HttpStatus.OK);
    }

    @RequestMapping("/")
    public String index(final Model model) {

        // loads 1 and display 1, stream data, data driven mode.
        IReactiveDataDriverContextVariable reactiveDataDrivenMode =
                new ReactiveDataDriverContextVariable(mailRepository.findAll(), 1);

//        model.addAttribute("mails", reactiveDataDrivenMode);
        model.addAttribute("mails", mailRepository.findAll());
        return "index";



}
}
