package com.example.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;    // извлечение параметров запроса в методе greeting

@Controller // ->
public class GreetingController {

    @GetMapping("/greeting")    //  -> po etomy puti slushaet zaprosi i vozvrashaet data
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model    /*skladivaem data which will return to user*/) { // metod wait parametr name
        model.addAttribute("name", name);   // in pole  lozhim to shto poluchili   is    ^
        return "greeting";  // vozvrashaet fail shablona   (name of file we want to show)
    }

}