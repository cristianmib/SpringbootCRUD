package cl.darkos.Grupal06_1M6.service;


import cl.darkos.Grupal06_1M6.model.dao.ClienteRepository;
import cl.darkos.Grupal06_1M6.model.entity.Cliente;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

   private final ClienteRepository repository;

   public ClienteService(ClienteRepository repository) {
      this.repository = repository;
   }

   public List<Cliente> getAll(){
      return repository.getAll();
   }

   public Optional<Cliente> getOne(int idCliente){
      return repository.getOne(idCliente);
   }


   public Cliente save(Cliente cliente){
      return repository.save(cliente);
   }

}
