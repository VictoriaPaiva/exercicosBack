package br.org.generation.webmotors.bd;

import java.util.ArrayList;

import br.org.generation.webmotors.model.Veiculo;

public class BDVeiculo {
	private ArrayList<Veiculo> lista;

	public BDVeiculo() {
		lista = new ArrayList<Veiculo>();

	}

	// Corresponde ao CREAT
	public void gravar(Veiculo v) {
		this.lista.add(v);
	}

	// Corresponde ao READ
	public Veiculo buscar(int id) {
		Veiculo v = null;
		for (Veiculo veic : lista) {
			if (veic.getId() == id) {
				v = veic;
				break;
			}
		}
		return v;
	}

	// Corresponde ao UPDATE
	public void atualizar(Veiculo v) {
		int posicao = -1;
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getId() == v.getId()) {
				posicao = i;
				break;
			}
		}
		if (posicao >= 0) {
			lista.set(posicao, v);
		}
	}
	// Corresponde ao DELETE

	public boolean apagar(int id) {
		int posicao = -1;
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getId() == id) {
				posicao = i;
				break;
			}

		}
		if (posicao >= 0) {
			lista.remove(posicao);
			return true;
		}
		return false;

	}

	public ArrayList<Veiculo> buscarTodos() {
		return lista;
	}

}
