
public class Televisao {
	private String marca;
	private int voltagem;
	private int tamanho;
	private boolean ligada;
	private int volume;
	private int canal;

	public Televisao() {

	}

	public Televisao(String marca, int voltagem, int tamanho) {
		this.marca = marca;
		this.voltagem = voltagem;
		this.tamanho = tamanho;
		this.ligada = false;
		this.volume = 5;
		this.canal = 1;
	}

	public Televisao(String marca, int voltagem, int tamanho, boolean ligada, int volume, int canal) {
		this.marca = marca;
		this.voltagem = voltagem;
		this.tamanho = tamanho;
		this.ligada = ligada;
		this.volume = volume;
		this.canal = canal;
	}

	public int getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(int _voltagem) {
		this.voltagem = _voltagem;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int _tamanho) {
		this.tamanho = _tamanho;
	}

	public boolean isLigada() {
		return ligada;
	}

	public void setLigada(boolean _ligada) {
		this.ligada = _ligada;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int _volume) {
		this.volume = _volume;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int _canal) {
		this.canal = _canal;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String _marca) {
		this.marca = _marca;
	}

	void switchPower() {
		ligada = !ligada;
		System.out.println("A TV " + marca + " esta " + ((ligada) ? "ligada" : "desligada"));
		// operador ternario de atribução condicional
		/*
		 * ( <TesteLogico> )? <ValorSeTesteForVerdadeiro> : <ValorSeTesteForFalso>
		 */
	}

	void aumentarVolume() {
		if (ligada == true) {
			if (volume < 10) {
				volume++;
				System.out.println("A TV " + marca + " esta no volume " + volume);
			} else {
				System.out.println("Volume Máximo");
			}
		} else {
			System.out.println("Você precisa ligar a TV");
		}
	}

	void diminuirVolume() {
		if (ligada == true) {
			if (volume > 0) {
				volume--;
				System.out.println("A TV " + marca + " esta no volume " + volume);
			} else {
				System.out.println("Volume Mudo");
			}
		} else {
			System.out.println("Você precisa ligar a TV");
		}
	}

	void avancarCanal() {
		if (ligada == true) {
			if (canal > 9) {
				canal = 1;
				System.out.println("A TV " + marca + " esta no canal " + canal);
			} else {
				canal++;
				System.out.println("A TV " + marca + " esta no canal " + canal);
			}
		} else {
			System.out.println("Voce precisa ligar a TV");
		}
	}

	void voltarCanal() {
		if (ligada == true) {
			if (canal < 2) {
				canal = 10;
				System.out.println("A TV " + marca + " esta no canal " + canal);
			} else {
				canal--;
				System.out.println("A TV " + marca + " esta no canal " + canal);
			}
		} else {
			System.out.println("Voce precisa ligar a TV");
		}
	}
}
