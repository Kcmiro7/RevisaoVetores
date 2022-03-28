//importa a classe Scanner para nosso projeto, que está denetro do pacote java.util
import java.util.Scanner;
//declara uma classe publica chamada Vetor2 e inicia o corpo da classe por meio do sin
public class Vetor2 
/**Cria uma classe que: 
 * leia um numero inteiro "n"
 * Leia o nome dos funcionarios em um Vetor "funcionario" com o tamanho n.
*/
{

    public static void main(String[] args)  
    {
        Scanner sc=new Scanner (System.in);
        int n;
        String funcionario[]= new String[n];
        //comente cada linha em detalhe,não pode faltar nada

        for (int index = 0; index < funcionario.length; index++) 
        {
            System.out.println("Digite o nome do funcionario");
            funcionario[index]=sc.next();

         }
         sc.close();
    }
    
}
