package com.rafael.ProjetoFinalEtapa3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "conta_corrente")
public class ContaCorrente extends Conta {
	@Id
	@Column(name = "numero")
	private int numero;

	@Column(name = "saldo")
	private double saldo;

	@Override
	public boolean sacar(double valor) {
		if (super.getSaldo() <= 0) {
			return false;
		}
		super.sacar(valor);
		return true;
	}

}
