package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	private Innlegg[] innleggTabell;
	private int nesteLedig;

	public Blogg() {
		
		innleggTabell = new Innlegg[20];
		nesteLedig = 0;
	}

	public Blogg(int lengde) {
		
		innleggTabell = new Innlegg[lengde];
		nesteLedig = 0;
	}

	public int getAntall() {
		
		return nesteLedig;
	}
	
	public Innlegg[] getSamling() {
		
		return innleggTabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {

		for(int i = 0; i < nesteLedig; i++) {
			if(getSamling()[i].erLik(innlegg)) {
				return i;
			}
		}
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		
		for(int i = 0; i < nesteLedig; i++) {
			if(getSamling()[i].erLik(innlegg)) {
				return true;
			}
		}
		return false;
	}

	public boolean ledigPlass() {
		
		for(int i = 0; i < getSamling().length; i++) {
			if(getSamling()[i] == null) {
				return true;
			}
		}
		return false;
	}
	
	public boolean leggTil(Innlegg innlegg) {

		if (!finnes(innlegg) && ledigPlass()) {
			innleggTabell[nesteLedig] = innlegg;
			nesteLedig++;
			return true;
		}
		return false;
	}
	
	public String toString() {
		String tabelldata ="";
		for (int i = 0; i < nesteLedig; i++) {
			tabelldata += getSamling()[i].toString();
		}
		return nesteLedig + "\n" + tabelldata;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}