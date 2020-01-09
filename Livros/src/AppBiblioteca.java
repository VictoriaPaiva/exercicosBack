import java.util.Scanner;
public class AppBiblioteca {
public static void main(String angs[]) {
	Scanner sc = new Scanner (System.in);
	int x;
	int livro;
	 Livro l1 = new Livro("Harry Potter",true);
	 Livro l2 = new Livro("Pétalas ao vento","V. C. Andrews",false);
	 Livro l3 = new Livro("A garota do lago",true);
	 Livro l4 = new Livro("Stalker",false);
	 Livro l5 = new Livro("Sherlock Holmes","Arthur Conan Doyle",false);
	 
	 //System.out.println("Catalogo de livros:\n- Harry Potter\n- Pétalas ao vento\n- A garota do lago\n- Stalker\n- Sherlock Homes");
	 /*System.out.println(" ");
	 System.out.println("(1) Solicitar emprestimo");
	 System.out.println("(2) Verificar disponibilidade");
	 System.out.println("(3) Devolução");
	 System.out.println("(4) Sair");*/
	 System.out.println("Escolha um livro: \n1-Harry Potter\n2- Pétalas ao vento\n3- A garota do lago\n4- Stalker\n5- Sherlock Homes");
	 livro = sc.nextInt();
	 if(livro==1) {System.out.println(" ");
	 System.out.println("(1) Solicitar emprestimo");
	 System.out.println("(2) Verificar disponibilidade");
	 System.out.println("(3) Devolução");
	 System.out.println("(4) Sair");
	 do{
		 x = sc.nextInt();
	 
	 //livro = sc.nextInt();
	 switch(x) {
	 case 1:
		 l1.emprestimo();
		 break;
	 case 2:
		 l1.verificar();
		 break;
	 case 3:
		 l1.devolver();
		 break;
	 case 4:
		 break;
	 }
	 }while(x!=4);
	 }if(livro==2) {
		 System.out.println(" ");
		 System.out.println("(1) Solicitar emprestimo");
		 System.out.println("(2) Verificar disponibilidade");
		 System.out.println("(3) Devolução");
		 System.out.println("(4) Sair");
		 do{
			 x = sc.nextInt();
		 
		 switch(x) {
		 case 1:
			 l2.emprestimo();
			 break;
		 case 2:
			 l2.verificar();
			 break;
		 case 3:
			 l2.devolver();
			 break;
		 case 4:
			 break;
		 }
		 }while(x!=4);
		 }
	 if(livro==3) {
		 System.out.println(" ");
		 System.out.println("(1) Solicitar emprestimo");
		 System.out.println("(2) Verificar disponibilidade");
		 System.out.println("(3) Devolução");
		 System.out.println("(4) Sair");
		 do{
			 x = sc.nextInt();
		 
		 switch(x) {
		 case 1:
			 l3.emprestimo();
			 break;
		 case 2:
			 l2.verificar();
			 break;
		 case 3:
			 l3.devolver();
			 break;
		 case 4:
			 break;
		 }
		 }while(x!=4);
		 }if(livro==4) {
			 System.out.println(" ");
			 System.out.println("(1) Solicitar emprestimo");
			 System.out.println("(2) Verificar disponibilidade");
			 System.out.println("(3) Devolução");
			 System.out.println("(4) Sair");
			 do{
				 x = sc.nextInt();
			 
			 switch(x) {
			 case 1:
				 l4.emprestimo();
				 break;
			 case 2:
				 l4.verificar();
				 break;
			 case 3:
				 l4.devolver();
				 break;
			 case 4:
				 break;
			 }
			 }while(x!=4);
			 }if(livro==5) {
				 System.out.println(" ");
				 System.out.println("(1) Solicitar emprestimo");
				 System.out.println("(2) Verificar disponibilidade");
				 System.out.println("(3) Devolução");
				 System.out.println("(4) Sair");
				 do{
					 x = sc.nextInt();
				 
				 switch(x) {
				 case 1:
					 l5.emprestimo();
					 break;
				 case 2:
					 l5.verificar();
					 break;
				 case 3:
					 l5.devolver();
					 break;
				 case 4:
					 break;
				 }
				 }while(x!=4);
				 }
}
}
