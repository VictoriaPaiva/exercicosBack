
public class QuestaoDica extends QuestaoSimples{
	private String dica;
	
	public QuestaoDica(String enunciado, String resposta, String dica) {
		super(enunciado, resposta);
		this.dica = dica;
	}
	public String aplicarQuestao() {
		return super.aplicarQuestao() +"\n"+ dica;
	}

}
