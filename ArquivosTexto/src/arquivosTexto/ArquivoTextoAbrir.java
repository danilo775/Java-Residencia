package arquivosTexto;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ArquivoTextoAbrir {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do arquivo: ");
        String nomeArquivo = sc.nextLine();

        try( BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
       
            System.out.println("Conteudo do arquivo:");
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }

        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
  
        
    }
}

