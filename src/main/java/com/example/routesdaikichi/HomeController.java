package com.example.routesdaikichi;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/daikichi")
public class HomeController {
    @RequestMapping( value = "", method = RequestMethod.GET)
    public String index() {
        return "Hello World!";
    }
    @RequestMapping(value="/today", method = RequestMethod.GET)
    public String today() {
        return "Today you will find luck in all your endeavors!";
    }
    @RequestMapping(value="/tomorrow", method = RequestMethod.GET)
    public String tomorrow() {
        return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
    }

    @RequestMapping(value="/travel/{destination}", method = RequestMethod.GET)
    public String travel(@PathVariable String destination) {
        return "Congratulations! You will soon travel to " + destination;
    }

    @RequestMapping(value="/lotto/{number}", method = RequestMethod.GET)
    public String lotto(@PathVariable int number) {
        return (number %2 == 0) ? "You will take a grand journey in the near future, but be wory of tempting ofers" : "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends..";
    }
}

