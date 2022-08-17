package cl.darkos.Grupal06_1M6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/contacto")
public class ContactoController {

   @GetMapping
   public String contacto(){
      return "contacto";
   }

}
