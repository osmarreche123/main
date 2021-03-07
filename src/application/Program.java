package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entitites.Comment;
import entitites.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com a data da postagem(dd/mm/yyyy hh:mm:ss): ");
		String data = sc.nextLine();
		Date moment = sdf.parse(data);
		System.out.print("Titulo: ");
		String titulo = sc.nextLine();
		System.out.print("Conteudo: ");
		String conteudo = sc.nextLine();
		System.out.print("Likes: ");
		Integer likes = sc.nextInt();	
		Post post = new Post(moment, titulo, conteudo, likes);
		System.out.println("Quantidade de Comments: ");
		Integer quantComent = sc.nextInt();
		
		sc.nextLine();
		for(int i = 1; i <= quantComent; i++) {
			
			System.out.print("Coment: ");		
			String comment = sc.nextLine();
			Comment coment = new Comment(comment);
			post.addCommentList(coment);
			
				
		}
		
		System.out.println(post);
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
