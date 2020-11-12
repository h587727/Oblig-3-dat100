package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;


public class SkrivBlogg {

	private static String MAPPE = System.getProperty("user.dir") + "/src/no/hvl/dat100/jplab11/tests/";

	public static boolean skriv(Blogg blogg, String filnavn) {

		try {
		var writer = new PrintWriter(MAPPE +filnavn);
		
		writer.println(blogg.toString());
		writer.close();
		return true;
		
	} catch (FileNotFoundException e) {
		System.out.println("Finner ikke filen" + e.getMessage());
	}
		return false;
	}
		
		
}
