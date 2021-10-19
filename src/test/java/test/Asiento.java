package test;
public class Asiento {
	String color;
	int precio;
	int registro;
	
	void cambiarColor(String colorSeleccionado) {
		colorSeleccionado.toLowerCase();
		if(colorSeleccionado.equals("rojo")){
			this.color = colorSeleccionado;
		}
		else if(colorSeleccionado.equals("verde")){
			this.color = colorSeleccionado;
		}
		else if(colorSeleccionado.equals("amarillo")){
			this.color = colorSeleccionado;
		}
		else if(colorSeleccionado.equals("negro")){
			this.color = colorSeleccionado;
		}
		else if(colorSeleccionado.equals("blanco")){
			this.color = colorSeleccionado;
		}
		else {
			return;
		}
	}
	
	
}
