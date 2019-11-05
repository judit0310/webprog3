package auto;


import dao.DAOJSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import webprog.model.Allapot;
import webprog.model.Kivitel;
import webprog.model.Kocsi;

import java.io.IOException;

@Controller
public class AutoController{

    @Autowired
    DAOJSON dao;

    @RequestMapping(value = "/")
    public ModelAndView index(){
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("message","Szia");
        return mav;

    }

    @RequestMapping(value = "/cica")
    public String cica(){
        System.out.println("EEEEEEEEE");
        return "proba";
    }

    @RequestMapping(value = "/addKocsi", method = RequestMethod.GET)
    public ModelAndView addAutoForm(){
        ModelAndView mav = new ModelAndView("kocsiForm", "command",new Kocsi());
        mav.addObject("kivitelTipusok", Kivitel.values());
        mav.addObject("allapotTipusok", Allapot.values());
        return mav;
    }

    @RequestMapping(value = "/addKocsi", method = RequestMethod.POST)
    public String addAuto(@ModelAttribute Kocsi kocsi) throws IOException {
        System.out.println(kocsi);
        dao.addKocsi(kocsi);
        return "index";
    }
}