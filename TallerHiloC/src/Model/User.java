package Model;

public class User {
	
	public String name;
	public String cedula;
	
	
	
	public User() {
		super();
	}

	public User(String name, String cedula) {
		super();
		this.name = name;
		this.cedula = cedula;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	@Override
	public String toString() {
		return name+  "  " + cedula ;
	}
	
	

}
