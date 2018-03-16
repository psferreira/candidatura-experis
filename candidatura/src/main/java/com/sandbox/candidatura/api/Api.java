package com.sandbox.candidatura.api;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api {

	protected Logger logger = Logger.getLogger(Api.class.getName());

	private static final String PAULO_FERREIRA="Candidato Selecionado: https://www.linkedin.com/in/paulosilvaferreira";

	public Api() {
	}
	
	@RequestMapping("/candidatura")
	public final String getCandidate(@RequestParam("webservicesTechnologies") final Boolean webservicesTechnologies,
									 @RequestParam("buildAutomationTools") final Boolean buildAutomationTools,
									 @RequestParam("dinamismo") final Boolean dinamismo,
									 @RequestParam("webservicesTechnologies") final Boolean espiritoEquipa,
									 @RequestParam("boaDisposicao") final Boolean boaDisposicao) {

			logger.info(String.format("Candidatura.getCandidate()"));

			String ret="";

			if (webservicesTechnologies && buildAutomationTools && dinamismo && espiritoEquipa && boaDisposicao) {
				ret = PAULO_FERREIRA;
			}
			return ret;
	}
}
