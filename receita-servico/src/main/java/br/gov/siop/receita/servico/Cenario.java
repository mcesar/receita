package br.gov.siop.receita.servico;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import repository.*;
import br.gov.siop.receita.dominio.cenario.*;

@Path("cenarios")
public class Cenario {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() throws Exception {
    	Repository repository = new VoltRepository();
    	repository.execute(new TodosOsCenarios());
        return "Got it!";
    }

}