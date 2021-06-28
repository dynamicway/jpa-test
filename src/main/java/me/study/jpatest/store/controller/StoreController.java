package me.study.jpatest.store.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/store")
public class StoreController {

    @GetMapping("/heartbeat")
    public String heartbeat() {
        return "OK";
    }
}
