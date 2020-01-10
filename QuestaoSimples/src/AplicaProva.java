import java.util.Scanner;
public class AplicaProva {
public static void main(String args[]) {
	Scanner sc = new Scanner (System.in);
	String resposta;
	int acertos = 0;
	int nota = 0;
	int erros = 0;
	double media = 0;
	QuestaoSimples questao[] = new QuestaoSimples[5];
	 questao[0] = new QuestaoSimples("Quanto é 1+1 ?","2");
	 questao[1] = new QuestaoSimples("Quanto é 2+2 ?","4");
	 questao[2] = new QuestaoSimples("Quanto é 10/2 ?","5");
	 questao[3] = new QuestaoMultiplaEscolha("Quanto é 5^2 ?","b","a) 10","b) 25","c) 5","d) 12");
	 questao[4] = new QuestaoDica("Quanto é 5x2 ?","10","mesmo número de 5+5");
	 
	 for(int i = 0;i<questao.length;i++) {
		 System.out.println(questao[i].aplicarQuestao());
		 resposta = sc.nextLine();
		 if(questao[i].corrigir(resposta)) {
			 acertos++;
			 nota = nota + 10;
		 }else {
			 erros++;
			 nota = nota + 0;
		 }
	 }
	 media = nota/5;
	 System.out.println("media: " + media);
	 System.out.println("Você acertou " + acertos);
	  System.out.println("Você errou " + erros);

}
}
