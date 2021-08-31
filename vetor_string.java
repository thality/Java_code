/******************************************************************************
Thalita Rosa 
*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		String[] estados = new String[2];
		int i;
		estados[0] = "MA";
		estados[1] = "SP";
		//imprimi os estados 
		for(i=0; i<2; i++){
		    System.out.println(estados[i]);
		}
		// armazena uma sigla para verificar posteriormente e comparar com os estados armazenados
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digita uma sigla");
		String siglabusca = leitor.next();
		
		//busca linear
		boolean encontrou = false;
		for(i=0; i<2; i++){
		    String elemento = estados[i];
		    if(elemento.equals(siglabusca)){
		        encontrou = true;
		        break;
		    }
		}
		
		if(encontrou == true){
		    System.out.println("achou");
		}else{
		    System.out.println("nao achou");
		}
		
	}
}