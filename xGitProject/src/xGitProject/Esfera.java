package xGitProject;

import java.util.Scanner;

/**
 * La clase Esfera tiene 4 variables miembro: - radio privada - Pi constante
 * estatica - cantidad estatica y publica
 * 
 * Tiene que tener metodos get y set para radio. Un constructor vacio y otro que
 * reciba el radio. Tiene funciones para calcular Perimetro del circulo.
 * Superficie de la esfera. Volumen de la esfera. Area del circulo
 * 
 * @author Jesus Sanchez Cuevas
 *
 */

public class Esfera {

	// Variables miembros
	private float radio;
	public final static double PI = 3.14159;
	public static int cantidad;

	// Contructor Esfera
	public Esfera() {
		radio = 1;
		cantidad++;
	}

	public Esfera(int valorRadio) {
		this.radio = valorRadio;
	}

	// Getters and setters para devolver el valor del radio.
	public float getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	// Variable miembro donde se calcula el perimetro
	public double calcularPerimentro() {

		double perimetro;

		perimetro = 2 * PI * this.radio;

		return perimetro;
	}

	// Variable miembro donde se calcula la superficie
	public double calcularSuperficie() {

		double superficie;

		superficie = 4 * PI * this.radio * this.radio;

		return superficie;
	}

	// Variable miembro donde se calcula el volumen
	public double calcularVolumen() {

		double volumen;

		volumen = 4 / 3 * PI * this.radio * this.radio * this.radio;

		return volumen;
	}

	// Variable miembro donde se calcula el area
	public double calcularArea() {

		double area;

		area = PI * this.radio * this.radio;

		return area;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Se crea una esfera
		Esfera esf1 = new Esfera();
		Scanner teclado = new Scanner(System.in);

		// Pedimos que se introduzca el radio
		System.out.print("Introduzca el radio de la esfera (cm): ");
		esf1.radio = teclado.nextFloat();

		// Mostramos por pantalla el resultado de las operaciones pedidas
		System.out.println("El perimetro de la circunferencia de la esfera es: " + esf1.calcularPerimentro() + " cm");
		System.out.println("El area de la circunferencia de la esfera es: " + esf1.calcularArea() + " cm2");
		System.out.println("La superficie de la esfera es: " + esf1.calcularSuperficie() + " cm2");
		System.out.println("El volumen de la esfera es: " + esf1.calcularVolumen() + " cm3");

		System.out.println("Eres todo un matematico.");
		// Cerramos el objeto teclado para ahorrar recursos.
		teclado.close();
	}

}
