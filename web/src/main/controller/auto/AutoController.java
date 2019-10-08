package auto;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AutoController{
    @RequestMapping(value = "/")
    public String index(){
        return "index";

    }

    @RequestMapping(value = "/cica")
    public String cica(){
        System.out.println("EEEEEEEEE");
        return "proba";
    }
}