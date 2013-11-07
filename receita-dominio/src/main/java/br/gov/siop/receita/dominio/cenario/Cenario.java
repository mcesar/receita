package br.gov.siop.receita.dominio.cenario;

import javax.persistence.*;

import br.gov.siop.repository.*;

@Entity
public class Cenario {

	@Id
	private Integer id;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public static class Builder<T extends Builder<?>> extends AbstractBuilder<T> {

		private Cenario obj = new Cenario();

		@SuppressWarnings("unchecked")
		public T id(Integer id) {
			obj.id = id;
			lastProperty = "id";
			lastValue = id;
			return (T) this;
		}


		public Cenario build() {
			return obj;
		}
	}

	public static Builder<Builder<?>> builder() {
		return new Builder<Builder<?>>();
	}

}