package it.fullstackacademy.model;

public abstract class StrumentoAstratto implements Strumento {
	
	private String nomeStrumento;
	
	protected StrumentoAstratto(String nomeStrumento) {
		this.nomeStrumento = nomeStrumento;
	}
	
	@Override
	public void suona() {
		System.out.println("Suonando: "+nomeStrumento);
	}
}
