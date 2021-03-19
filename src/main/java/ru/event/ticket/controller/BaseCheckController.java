package ru.event.ticket.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseCheckController {

    @GetMapping("/")
    public String getInfo() {
        return "Event ticket service is running";
    }
}
