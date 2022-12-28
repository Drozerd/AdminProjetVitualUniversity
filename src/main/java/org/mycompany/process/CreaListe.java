package org.mycompany.process;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.mycompany.model.InfosCandidat;

public class CreaListe implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		exchange.getIn().getBody();
		List<InfosCandidat> listeCandidats = new ArrayList<>();
		InfosCandidat candidats1 = new InfosCandidat(1, "Jean", false, 0);
		InfosCandidat candidats2 = new InfosCandidat(2, "Roger", true, 5);
		InfosCandidat candidats3 = new InfosCandidat(3, "Natasha", false, 0);
		InfosCandidat candidats4 = new InfosCandidat(4, "Marie", true, 2);
		listeCandidats.add(candidats1);
		listeCandidats.add(candidats2);
		listeCandidats.add(candidats3);
		listeCandidats.add(candidats4);
		exchange.getIn().setBody(listeCandidats);
		
	}

}
