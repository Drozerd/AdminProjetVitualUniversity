package org.mycompany.process;

import org.mycompany.model.InfosCandidat;

public class RecipientList {
	
	public String AttributionCandidats(InfosCandidat infosCandidat) 
	{
		if (infosCandidat.isBac() == true)
		return "seda:deuxièmeSelection";
		else
			return "seda:Reconversion";
	}

}
