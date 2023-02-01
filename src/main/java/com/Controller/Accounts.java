package com.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class Accounts {

        @PostMapping(path = "/generateToken")
        public String tokenGenerate(String message){

            return "Testing";
            // return Util.getResponse(response);
        }
    }


