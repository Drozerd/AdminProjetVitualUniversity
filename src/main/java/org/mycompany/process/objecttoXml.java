package org.mycompany.process;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.mycompany.model.InfosCandidat;




public class objecttoXml implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		List<InfosCandidat> listeinfosCandidats =  exchange.getIn().getBody(ArrayList.class);
		for (int i = 0; i<listeinfosCandidats.size(); i++) {
			
			JAXBContext context = JAXBContext.newInstance(InfosCandidat.class);
			Marshaller masrheller = context.createMarshaller();
			masrheller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			masrheller.marshal(listeinfosCandidats.get(i),new File("InfosCandidats" + i +  ".xml" )) ;
			exchange.getIn().setBody(masrheller, InfosCandidat.class);
		}
		
		
		
		
	}

}
