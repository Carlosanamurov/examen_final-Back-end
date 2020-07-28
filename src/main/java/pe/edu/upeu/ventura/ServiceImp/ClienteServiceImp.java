package pe.edu.upeu.ventura.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.ventura.Dao.ClienteDao;
import pe.edu.upeu.ventura.Entity.Cliente;
import pe.edu.upeu.ventura.Service.ClienteService;
 @Service
public class ClienteServiceImp implements ClienteService{
	@Autowired
	private ClienteDao clientedao;

	@Override
	public List<Cliente> readAll() {
		// TODO Auto-generated method stub
		return clientedao.readAll();
	}

}
