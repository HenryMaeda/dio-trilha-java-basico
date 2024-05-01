import java.util.Locale;
import java.util.Scanner; 


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // criei o objeto scanner para receber informações do usuario
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US) ; 

        int numeroConta  ; 
        String nomeCliente , agencia , sobrenomeCliente , nomeCompleto ; 
        float saldo ; 
        
            System.out.println("Digite o seu numero: ");
                numeroConta = scanner.nextInt() ; 

            System.out.println("Digite o numero da sua agencia no formato XXX-X: ") ; 
                agencia = scanner.next() ; 

            System.out.println("Escreva seu nome: ") ; 
                nomeCliente = scanner.next() ; 

            System.out.println("Escreva seu sobrenome: ") ; 
                sobrenomeCliente = scanner.next() ; 

            System.out.println("Digite o saldo que voce deseja inserir na nova conta: ") ; 
                saldo = scanner.nextFloat() ; 

                nomeCompleto = nomeCliente + " " + sobrenomeCliente ; 
            
            System.out.println("Olá " + nomeCompleto + " " + "obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + ", " + " conta " + numeroConta + ", " +  "e seu saldo " + saldo + " " + "já está disponível para saque. "  );

            scanner.close() ; 
    } 
}
