package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;
import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;

import static javax.swing.JOptionPane.*;
public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

		boolean skreve = false;
		
		try {
			File file = new File(mappe + filnavn);
            PrintWriter skriver = new PrintWriter(file);
            skreve = true;

            skriver.println(samling.toString());
            skriver.close();

        } catch(FileNotFoundException e) {
            showMessageDialog(null, "Filen " + filnavn + " finnes ikke. \n" + e.getMessage());
        }
        return skreve;
    }
}

