package br.com.victoria.ExercicioSpringBoot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.victoria.ExercicioSpringBoot.Model.Produto;
import br.com.victoria.ExercicioSpringBoot.Model.Usuario;

@RestController
public class Controller {
	
	Produto prod = new Produto(5,"O livro top" , "Um livro muito top" , 11.50 , 5.0 ,"Link superFoda");
	Usuario usu = new Usuario(4, "vickpmo", "vickpmo@gmail.com", "Victoria Paiva", "156zd", 14);
	@GetMapping("/hello")
	public String BoasVinda(){
		return "Olá, Seja Bem Vindo";
	}
	@GetMapping("/produto")
	public Produto GetPorduto() {
		return prod;
	}
	@GetMapping("/usuario")
	public Usuario GetUsuario() {
		return usu;
	}
}
