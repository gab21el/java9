import java.util.Scanner;
import com.Carros.entity.Carro;

public class Main {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       Carro[] meuCarro = new Carro[50];
       int cont = 1;
       int tot = 0;

       for (int i = 0; i < 50; i++){
           if (cont == 1) {
               meuCarro[i] = new Carro();
               System.out.println("Digite a marca do carro: ");
               meuCarro[i].marca = scanner.nextLine();
               System.out.println("Digite o modelo do carro: ");
               meuCarro[i].modelo = scanner.nextLine();
               System.out.println("Digite o ano do carro: ");
               meuCarro[i].ano = Integer.parseInt(scanner.nextLine());
               System.out.println("Digite o valor do carro: ");
               meuCarro[i].valor = Integer.parseInt(scanner.nextLine());
               tot++;

               System.out.println("Deseja inserir mais um? 1 (SIM) / 0 (NÃO)");
               cont = Integer.parseInt(scanner.nextLine());
           } else {
               break;
           }
       }
       Carro.exibeCarros(meuCarro, tot);

    }
}