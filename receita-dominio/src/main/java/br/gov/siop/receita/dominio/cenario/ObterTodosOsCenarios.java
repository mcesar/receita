package br.gov.siop.receita.dominio.cenario;

import br.gov.siop.repository.*;

public class ObterTodosOsCenarios implements RunnableWithResult {

	public Object run(Repository repository, Object... args) throws Exception {
		return repository.matching(Cenario.builder().build());
	}

}