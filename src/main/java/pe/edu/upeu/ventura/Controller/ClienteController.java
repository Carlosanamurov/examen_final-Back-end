package pe.edu.upeu.ventura.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.ventura.Entity.Cliente;
import pe.edu.upeu.ventura.Service.ClienteService;
@CrossOrigin(origins="http://localhost:4200")
@RestController("clientes")
public class ClienteController {
	@Autowired
	private ClienteService clienteService;
	@GetMapping("/clienteall")
	public List<Cliente> readList(){
		return  clienteService.readAll();
	}
	

}
