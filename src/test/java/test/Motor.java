package test;
public class Motor {
	int numeroCilindros;
	String tipo;
	int registro;
	
	void cambiarRegistro(int cambio) {
		registro = cambio;
	}
	
	void asignarTipo(String tipoMotor) {
		if(tipoMotor=="electrico") {
			tipo = tipoMotor;
		}
		else if(tipoMotor=="gasolina") {
			tipo = tipoMotor;
		}
		else {
			return;
		}
		
	}
}
