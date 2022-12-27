package org.mycompany;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.CamelContext;
import org.apache.camel.CamelContextAware;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.mycompany.model.InfosCandidat;
import org.mycompany.model.NumCandidat;
import org.springframework.beans.factory.InitializingBean;

public class CandidatsRouter extends RouteBuilder implements InitializingBean, CamelContextAware {
	private CamelContext camelContext;


	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		if (camelContext == null) {
			// this.addRoutesToCamelContext(camelContext);
			camelContext.addRoutes(this);
		}

	}

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		from("timer:myTimer?fixedRate=true&period=10000")

				.process(new Processor() {
					@Override
					public void process(Exchange exchange) throws Exception {
						NumCandidat numCandidat = new NumCandidat();
						List<InfosCandidat> listInfosCandidats = new ArrayList<>();
						numCandidat.additem("Jean" , false, 2);
						numCandidat.additem("Roger" , true, 4);
						numCandidat.additem("Marie" , false, 5);
						numCandidat.additem("Jeanne" , true, 1);
						exchange.getIn().setBody(numCandidat);
					}
				}).to("direct:candidat");
	}


	@java.lang.Override
	public void setCamelContext(CamelContext camelContext) {
		// TODO Auto-generated method stub
		
	}

	@java.lang.Override
	public CamelContext getCamelContext() {
		// TODO Auto-generated method stub
		return null;
	}}