package cl.darkos.Grupal06_1M6.model.dao;


import cl.darkos.Grupal06_1M6.model.entity.Cliente;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ClienteRepository {


   private final IClienteRepository crudRepository;

   public ClienteRepository(IClienteRepository crudRepository) {
      this.crudRepository = crudRepository;
   }

   public List<Cliente> getAll(){
      return (List<Cliente>) crudRepository.findAll();
   }

   public Optional<Cliente> getOne(int idCliente){
      return crudRepository.findById(idCliente);
   }


   public Cliente save(Cliente cliente){
      return crudRepository.save(cliente);
   }


}
