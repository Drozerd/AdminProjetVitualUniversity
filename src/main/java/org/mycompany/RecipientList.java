package org.mycompany;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.CamelContext;
import org.apache.camel.CamelContextAware;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.inti.Override;
import org.mycompany.model.CandidatProf;
import org.springframework.beans.factory.InitializingBean;

public class RecipientList extends RouteBuilder implements InitializingBean, CamelContextAware {
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
						CandidatProf candidatProf = new CandidatProf();
						List<CandidatProf> listCandidatProfs = new ArrayList<>();
					}
				}

	@Override
	public void setCamelContext(CamelContext camelContext) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CamelContext getCamelContext() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	

}


	@java.lang.Override
	public void setCamelContext(CamelContext camelContext) {
		// TODO Auto-generated method stub
		
	}

	@java.lang.Override
	public CamelContext getCamelContext() {
		// TODO Auto-generated method stub
		return null;
	}