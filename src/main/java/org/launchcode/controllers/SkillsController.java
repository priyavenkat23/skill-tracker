package org.launchcode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

@RequestMapping(value="")
@ResponseBody
public String skillTracker(){
        String skills = "<h1>Skills Tracker</h1>"+
                "<h2>These are the skills we would like to learn!</h2>"+
                "<ol>"+
                "<li>Java </li>"+
                "<li>Javascript </li>"+
                "<li> SQL </li>"+
                "<li> HTML </li>"+
                "</ol>";

        return skills;
    }
    @GetMapping("form")
    public String skillsForm(){
        return "<html>"+
                "<body>"+
                "<form method='post'>"+
                "<label> Name: </label><br>"+
                "<input type='text' name='name'><br>"+
                "<label>My favorite language: </label>"+
                "<br><select name='firstchoice'><br>"+
                "<option value='Java'>Java</option>"+
                "<option value='Javascript'>Javascript</option>"+
                "<option value='Python'>Python</option>"+
                "</select><br>"+
                "<label>My second favorite language: </label>"+
                "<br><select name='secondchoice'><br>"+
                "<option value='Java'>Java</option>"+
                "<option value='Javascript'>Javascript</option>"+
                "<option value='Python'>Python</option>"+
                "</select><br>"+
                "<label>My third favorite language: </label>"+
                "<br><select name='thirdchoice'><br>"+
                "<option value='Java'>Java</option>"+
                "<option value='Javascript'>Javascript</option>"+
                "<option value='Python'>Python</option>"+
                "</select>"+
                "<br><input type='submit' value='Submit'>"+
                "</form>"+
                "</body>" +
                "</html>";
    }
    @PostMapping("form")
    public String skillsChoices(@RequestParam String name, String firstchoice, String secondchoice, String thirdchoice){
        return "<h1>"+name+"</h1>"+
                "<ol><li>"+firstchoice+"</li>"+
                "<li>"+secondchoice+"</li>"+
                "<li>"+thirdchoice+"</li></ol>";
    }


}
