package pe.edu.upeu.ventura.Dao;

import java.util.List;

import pe.edu.upeu.ventura.Entity.Cliente;

public interface ClienteDao {
	List<Cliente> readAll();
	int create(Cliente cliente);
	int edit(Cliente cliente);
	int delete(int id);
	Cliente read(int id);

}
