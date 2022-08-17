package cl.darkos.Grupal06_1M6.service;

import cl.darkos.Grupal06_1M6.model.entity.Capacitacion;
import cl.darkos.Grupal06_1M6.model.dao.CapacitacionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CapacitacionService {

   private final CapacitacionRepository repository;

   public CapacitacionService(CapacitacionRepository repository) {
      this.repository = repository;
   }

   public List<Capacitacion> getAll(){
      return repository.getAll();
   }

   public Optional<Capacitacion> getOne(int idCapacitacion){
      return repository.getOne(idCapacitacion);
   }


   public Capacitacion save(Capacitacion capacitacion){
      return repository.save(capacitacion);
   }

/*
   public boolean delete(int idCapacitacion){
      return getOne(idCapacitacion)
            .map(customer -> {
               repository.delete(idCapacitacion);
               return true;
            }).orElse(false);
   }
*/

}
