package aparelhoMultifuncional;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, Navegador {

	@Override
	public void navegarInternet() {
		System.out.println("Navegando na internet!");
		
	}

	@Override
	public void fazerLigacao() {
		System.out.println("Fazendo ligação!");
		
	}

	@Override
	public void reproduzirMusica() {
		System.out.println("Reproduzindo música");
		
	}

}
