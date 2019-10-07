package auto;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AutoController{
    @RequestMapping(value = "/")
    public String index(){
        return "index.jsp";

    }

    @RequestMapping(value = "/cica")
    public String cica(){
        System.out.println("EEEEEEEEE");
        return "proba";
    }
}