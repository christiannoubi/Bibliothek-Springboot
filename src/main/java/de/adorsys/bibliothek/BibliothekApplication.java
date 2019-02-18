package de.adorsys.bibliothek;

import de.adorsys.bibliothek.domain.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BibliothekApplication {

	public static void main(String[] args) {
		SpringApplication.run(BibliothekApplication.class, args);

		// Iniatiliserung
		// Medien
		MedienVerwaltung mv = new MedienVerwaltung();
		Hoerbuch h1 = new Hoerbuch("Petra Panisch", "Das Super-Mega-Drama", 2007,"Dramaqueens", 8, 495);
		mv.add(h1);

		// Buch b1, b2, mv.add(bi) (s.o.)
		;
		Buch b1 = new Buch ("Christian", "Java", 1988, "Spring", BuchArt.SOFTWARE);
		Buch b2 = new Buch ("Francis", "C++", 1990, "Spring",  BuchArt.ROMANCE);


		Spiel s1 = new Spiel("Dixit", 2010, "Libellud", 3,6,8);
		mv.add(s1);

		// Personen
		BibMitgliederVerwaltung bmv = new BibMitgliederVerwaltung();
		BibMitglied.setMitgliederZaehler(1000);

		// BibMitglied bm1, bm2, bmv.add(bm1), bmv.add(bm2) (s.o.)
		BibMitglied bm1 = new BibMitglied("Sammer", "Nürnbergerstr.21, 90000 Nürnberg");
		BibMitarbeiter bma1 = new BibMitarbeiter("Frieda Fleissig", "Am Fleiss Bad Fleissman", "0.07", "ff@the-bib.net", "0123-4567");
		bmv.add(bma1);

		// Ausleihvorgaenge
		AusleihVorgangsVerwaltung av = new AusleihVorgangsVerwaltung();
		Datum leihBeginn = new Datum (23, 12, 2013);
		Datum leihEnde = new Datum (7, 1, 2014);
		AusleihVorgang av1 = new AusleihVorgang(bm1, b1, leihBeginn, leihEnde);
		av.add(av1);
		AusleihVorgang av2 = new AusleihVorgang(bm1, b2, leihBeginn, leihEnde);
		av.add(av2);
		AusleihVorgang av3 = new AusleihVorgang(bma1, s1, leihBeginn, leihEnde);
		av.add(av3);

		// Ausgabe aller Daten
		mv.print();
		bmv.print();
		av.print();
	}
}
