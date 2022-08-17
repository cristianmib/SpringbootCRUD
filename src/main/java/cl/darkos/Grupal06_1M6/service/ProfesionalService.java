package cl.darkos.Grupal06_1M6.service;

import cl.darkos.Grupal06_1M6.model.dao.ProfesionalRepository;
import cl.darkos.Grupal06_1M6.model.entity.Profesional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfesionalService {

   private final ProfesionalRepository repository;

   public ProfesionalService(ProfesionalRepository repository) {
      this.repository = repository;
   }

   public List<Profesional> getAll(){
      return repository.getAll();
   }

   public Optional<Profesional> getOne(int idProfesional){
      return repository.getOne(idProfesional);
   }


   public Profesional save(Profesional profesional){
      return repository.save(profesional);
   }

}
