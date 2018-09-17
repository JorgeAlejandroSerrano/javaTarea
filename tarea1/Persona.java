public class Empleado{
	private float sueldo;
	private String nombre;
	private String puesto;
	static int contador=0;


	/*public Empleado(int edad, String nombre){
		//inicializa el objeto
		this.edad = edad;
		this.nombre = nombre;
		contador++;
	}*/

	public Persona(){

	}

	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public float getSueldo(){
		return edad;
	}
	public void setSueldo(float sueldo){
		this.edad = edad;
	}
	public String getPuesto(){
		return puesto;
	}
	public void setPuesto(String puesto){
		this.puesto = puesto;
	}
	public static int getContador(){
		return contador;
	}
}