package cl.darkos.Grupal06_1M6.controller;

import cl.darkos.Grupal06_1M6.model.entity.Capacitacion;
import cl.darkos.Grupal06_1M6.service.CapacitacionService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/listarCapacitaciones")
public class CapacitacionController {

   Log logger = LogFactory.getLog(CapacitacionController.class);
   private final CapacitacionService service;

   public CapacitacionController(CapacitacionService service) {
      this.service = service;
   }

   @GetMapping
   public String getCapacitaciones(Model model){
      System.out.println(service.getAll().size());
      model.addAttribute("capacitaciones", service.getAll());
      return "listarCapacitaciones";
   }

   @GetMapping("/CrearCapacitacion")
   public String crearCapacitacion(Model model){
      Capacitacion capacitacion = new Capacitacion();
      model.addAttribute("capacitacion",capacitacion);
      return "crearCapacitacion";
   }

   @PostMapping("/guardar")
   public String crearCapacitacion(@ModelAttribute("capacitacion") Capacitacion capacitacion){
      service.save(capacitacion);
      return "redirect:/listarCapacitaciones";
   }

}
