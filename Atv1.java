import java.util.Scanner;

public class Atv1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StackDinamica pilha1 = new StackDinamica();
        StackDinamica pilha2 = new StackDinamica();
        
        System.out.println("DIGITE A OPERACAO: ");
        String op = input.nextLine();

        String operacao[] = op.split(" ");
        
        for(int i =0; i < operacao.length; i++){
            if( (operacao[i].equals("(")) || (operacao[i].equals("[")) || (operacao[i].equals("{") )  ){
                pilha1.push(operacao[i]);
                
            }else if( (operacao[i].equals(")") ) || (operacao[i].equals("]")) || (operacao[i].equals("}") )){
                pilha2.push(operacao[i]);
            }
        }

        if(pilha1.sizePilha() == pilha2.sizePilha()){
            System.out.println("NUMERO DE CHAVES CORRETAS");
        }else{
            System.out.println("NUMERO DE CHAVES INCORRETAS");
        }

        input.close();
    }
}
