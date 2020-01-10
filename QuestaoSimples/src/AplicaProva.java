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
	 questao[0] = new QuestaoSimples("Quanto � 1+1 ?","2");
	 questao[1] = new QuestaoSimples("Quanto � 2+2 ?","4");
	 questao[2] = new QuestaoSimples("Quanto � 10/2 ?","5");
	 questao[3] = new QuestaoMultiplaEscolha("Quanto � 5^2 ?","b","a) 10","b) 25","c) 5","d) 12");
	 questao[4] = new QuestaoDica("Quanto � 5x2 ?","10","mesmo n�mero de 5+5");
	 
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
	 System.out.println("Voc� acertou " + acertos);
	  System.out.println("Voc� errou " + erros);

}
}
