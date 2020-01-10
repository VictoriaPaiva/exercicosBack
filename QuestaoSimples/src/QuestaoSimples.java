
public class QuestaoSimples {
	protected String enunciado;
	protected String resposta;

	
	
	public QuestaoSimples(String enunciado, String resposta) {
		
		this.enunciado = enunciado;
		this.resposta = resposta;
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

	public String aplicarQuestao() {
		return enunciado;
	}

	public boolean corrigir(String resposta) {
		//return this.resposta.equals(resposta);
		if (resposta.equals(this.resposta)) {
			return true;
		} else {
			return false;
		}
	}
}
