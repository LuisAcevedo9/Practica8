package relacionjerarquica;
public class Circulo extends Punto{
	private double radio;

	public Circulo(){}

	public Circulo(int valorX, int valorY, double valorRadio){
		super(valorX, valorY);
		establecerRadio ( valorRadio );
	}

	public void establecerRadio ( double valorRadio){
		radio = (valorRadio < 0.0 ? 0.0 : valorRadio );
	}

	public double obtenerRadio(){
		return radio;
	}

	public double obtenerDiametro(){
		return 2 * obtenerRadio();
	}

	public double obtenerCircunferencia(){
		return Math.PI * obtenerDiametro();
	}

	public double obtenerArea(){
		return Math.PI * obtenerRadio() * obtenerRadio();
	}

	public String toString(){
		return "Centro = " + super.toString() + ", Radio = "  + obtenerRadio();
	}
}
