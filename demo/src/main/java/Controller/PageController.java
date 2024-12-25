package Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class PageController {
    @RequestMapping ("/home")
    public String home( Model model)
    {
        System.out.println("Home page handler");
        model.addAttribute("name","Substring");
        model.addAttribute("main","value");
        return "home";
    }
   @RequestMapping("/about")
   public String abouPage(){
    System.out.println("About page loading");
    return "about";
   }

   @RequestMapping("/services")
   public String servicesPage(){
    System.out.println("About page loading");
    return "about";
   }
   // contact page
   @RequestMapping("/contact")
    public String contactpage(){
        return new String("contact");
    }



    }
}
 

