package auto;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import webprog.model.Kocsi;

@Controller
public class AutoController{
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
        return mav;
    }
}