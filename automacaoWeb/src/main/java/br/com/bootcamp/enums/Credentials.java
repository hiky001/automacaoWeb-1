package br.com.bootcamp.enums;

import br.com.bootcamp.interfaces.CredentialsImp;

public enum Credentials implements CredentialsImp{
	
	CADASTRADO{
		@Override
		public String usuarioCliente() {
			return "henriqueauto@gg.com";
		}

		@Override
		public String senhaCliente() {
			return "Irineu";
		}
	},

	EMAIL_INVALIDO {
		@Override
		public String usuarioCliente() {
			return "invalido@email.com";
		}

		@Override
		public String senhaCliente() {
			return "1234Teste";
		}
	}
	;


}
