package pe.edu.upeu.ventura.Entity;

public class Cliente {
	private int idcliente;
	private String dni;
	private String nomcliente;
	private String fenaci;
	private String sexo;
	private String observacion;
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cliente(int idcliente, String dni, String nomcliente, String fenaci, String sexo, String observacion) {
		super();
		this.idcliente = idcliente;
		this.dni = dni;
		this.nomcliente = nomcliente;
		this.fenaci = fenaci;
		this.sexo = sexo;
		this.observacion = observacion;
	}
	public int getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNomcliente() {
		return nomcliente;
	}
	public void setNomcliente(String nomcliente) {
		this.nomcliente = nomcliente;
	}
	public String getFenaci() {
		return fenaci;
	}
	public void setFenaci(String fenaci) {
		this.fenaci = fenaci;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	
	

}
