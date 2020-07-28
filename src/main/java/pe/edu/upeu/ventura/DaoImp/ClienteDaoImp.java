package pe.edu.upeu.ventura.DaoImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.ventura.Dao.ClienteDao;
import pe.edu.upeu.ventura.Entity.Cliente;
@Repository

public class ClienteDaoImp implements ClienteDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public List<Cliente> readAll() {
		// TODO Auto-generated method stub
		return  jdbcTemplate.query("SELECT * FROM cliente", BeanPropertyRowMapper.newInstance(Cliente.class));
	}

	@Override
	public int create(Cliente cliente) {
		// TODO Auto-generated method stub
		String sql="INSERT INTO cliente  (dni, nomcliente, fenaci, sexo,  observacion) VALUES(?,?,?,?,?)";
		return 0;
	}

	@Override
	public int edit(Cliente cliente) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Cliente read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
