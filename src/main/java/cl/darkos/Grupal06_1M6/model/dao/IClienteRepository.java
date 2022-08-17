package cl.darkos.Grupal06_1M6.model.dao;



import cl.darkos.Grupal06_1M6.model.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IClienteRepository extends CrudRepository<Cliente, Integer> {
}
