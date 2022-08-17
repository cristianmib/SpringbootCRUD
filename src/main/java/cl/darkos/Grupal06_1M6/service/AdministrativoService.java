package cl.darkos.Grupal06_1M6.service;


import cl.darkos.Grupal06_1M6.model.dao.AdministrativoRepository;
import cl.darkos.Grupal06_1M6.model.entity.Administrativo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdministrativoService {

   private final AdministrativoRepository repository;

   public AdministrativoService(AdministrativoRepository repository) {
      this.repository = repository;
   }

   public List<Administrativo> getAll(){
      return repository.getAll();
   }

   public Optional<Administrativo> getOne(int idAdministrativo){
      return repository.getOne(idAdministrativo);
   }


   public Administrativo save(Administrativo administrativo){
      return repository.save(administrativo);
   }

}
