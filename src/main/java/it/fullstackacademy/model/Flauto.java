package it.fullstackacademy.model;

public class Flauto extends StrumentoAstratto {
	
	protected Flauto(String nomeStrumento) {
		super(nomeStrumento);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void suona() {
		System.out.println("Suono il flauto");
	}
}
