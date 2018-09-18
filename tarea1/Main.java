public class Main{
	public static void main(String[]args){
		Empleado p1 = new Persona();
		Empleado p2 = new Persona();
		Empleado p3 = new Persona();
		Empleado p4 = new Persona();	
		p1.setSueldo(300);
		p1.setNombre("Poli");
		p1.setPuesto("trabajador");
		p2.setSueldo(200);
		p2.setNombre("Tavo");
		p2.setPuesto("trabajador");
		p3.setSueldo(100);
		p3.setNombre("Hector");
		p3.setPuesto("trabajador");
		p4.setSueldo(500);
		p4.setNombre("Jorge");
		p4.setPuesto("trabajador");

		System.out.println(p1.getSueldo());
		System.out.println(p1.getNombre());	
		System.out.println(p1.getPuesto());	
		System.out.println(p2.getSueldo());
		System.out.println(p2.getNombre());
		System.out.println(p2.getPuesto());
		System.out.println(p3.getSueldo());
		System.out.println(p3.getNombre());	
		System.out.println(p3.getPuesto());	
		System.out.println(p4.getSueldo());
		System.out.println(p4.getNombre());
		System.out.println(p4.getPuesto());
	}
}

//Atributo es una características
//Método constructor