package test;
public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	int cantidadAsientos() {
		int cantidad = 0;
		for(int i = 0; i < asientos.length; i++){ 
			if(asientos[i]!=null){
				cantidad++;
			}
		}
		return cantidad;
	}
	
	
	String verificarIntegridad() {
		boolean integro = true;
		if(motor.registro!=this.registro) {
			integro=false;
		}
		for(int i = 0; i < asientos.length; i++){ 
			
			if(asientos[i]!=null) {
				if(asientos[i].registro!=this.registro) {
					integro=false;
				}
			}
			
			
		}
		if(integro==true){
			return "Auto original";
		}
		else {
			return "Las piezas no son originales";
		}
	}

		
			
}
