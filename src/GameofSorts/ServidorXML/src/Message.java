import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {
	

private String nombre;
private int edad;
private int resistencia;
private int velocidad;

public Message() {
	
}

public Message(String nombre, int edad, int resistencia, int velocidad) {
	this.edad = edad;
	this.nombre = nombre;
	this.resistencia = resistencia;
	this.velocidad = velocidad;
	
}


public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}
public int getResistencia() {
	return resistencia;
}
public void setResistencia(int resistencia) {
	this.resistencia = resistencia;
}
public int getVelocidad() {
	return velocidad;
}
public void setVelocidad(int velocidad) {
	this.velocidad = velocidad;
}

}
