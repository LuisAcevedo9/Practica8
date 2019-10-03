package herenciaabstracta;

public class Cilindro extends Circulo{
	private double altura;

	public Cilindro(){}

	public Cilindro(int x, int y, double radio, double valorAltura){
            super(x, y, radio);
            establecerAltura(valorAltura);
	}

	public void establecerAltura(double valorAltura){
            altura = valorAltura < 0.0 ? 0.0 : valorAltura;
	}

	public double obtenerAltura()
	{
            return altura;
	}
        

	public double obtenerArea(){
            return (2*Math.PI*obtenerRadio()*obtenerAltura())+2*(Math.PI*obtenerRadio()*obtenerRadio());
        }


	public double obtenerVolumen(){
            return (Math.PI * obtenerRadio() * obtenerRadio())*obtenerAltura();
        }


	public String obtenerNombre(){
            return "Cilindro";
        }
        public String toString(){
            return "Centro = " + super.toString() + ", Radio = "  + obtenerRadio()+", Altura: "+obtenerAltura();
        }
}
