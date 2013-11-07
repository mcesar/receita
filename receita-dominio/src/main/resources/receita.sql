CREATE TABLE Cenario (
   Id Integer Unique NOT NUll,
   Nome VARCHAR(100) NOT NULL,
   ExercicioInicial Integer,
   ExercicioFinal Integer,
   MesInicialProjecao Integer,
   ExercicioInicialProjecao Integer,
   PRIMARY KEY (Id)
);

CREATE TABLE CenarioValor (
	Id Integer Unique NOT NUll,
	Cenario Integer NOT NULL,
	Natureza VARCHAR(20),
	UnidadeOrcamentaria VARCHAR(20),
	Fonte VARCHAR(20),
	Esfera VARCHAR(20),
	Valores VARCHAR(10000),
	PRIMARY KEY (Id)
);

CREATE PROCEDURE FROM CLASS br.gov.siop.receita.dominio.cenario.ObterTodosOsCenarios_;

IMPORT CLASS br.gov.siop.repository.voltdb.CollectionFactory;