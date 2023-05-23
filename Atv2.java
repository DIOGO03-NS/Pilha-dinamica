import java.util.Random;
public class Atv2 {
    public static void main(String[] args) {
        StackDinamica pilha1 = new StackDinamica();
        StackDinamica pilha2 = new StackDinamica();
        StackDinamica pilha3 = new StackDinamica();
        

        Random gerador = new Random();

        for(int i = 0; i < 100; i++){
            int numero = gerador.nextInt(9) + 1;
            if((numero == 1) || (numero == 2) || (numero == 3)){
                pilha1.push(numero);
            }else if((numero == 4) || (numero == 5) || (numero == 6)){
                pilha2.push(numero);
            }else{
                pilha3.push(numero);
            }
        }

        for(int i = 0; i < 100; i++){
            int pilha = gerador.nextInt(3) + 1;
            int topo1 = (int) pilha1.top().getDado();
            int topo2 = (int) pilha2.top().getDado();
            int topo3 = (int) pilha3.top().getDado();

            if(pilha == 1){
                
                System.out.println("EMPILHANDO NA PILHA 1");
                pilha1.push(topo2);
                pilha2.pop();
                pilha1.push(topo3);
                pilha3.pop();
            }else if(pilha == 2){

                System.out.println("EMPILHANDO NA PILHA 2");
                pilha2.push(topo1);
                pilha1.pop();
                pilha2.push(topo2);
                pilha2.pop();
            }else if(pilha == 3){

                System.out.println("EMPILHANDO NA PILHA 3");
                pilha3.push(topo1);
                pilha1.pop();
                pilha3.push(topo2);
                pilha2.pop();
            }

            if(pilha1.isEmpyt()){
                System.out.println("PILHA 1 VAZIA");
                break;
            }

            if(pilha2.isEmpyt()){
                System.out.println("PILHA 2 VAZIA");
                break;
            }

            if(pilha3.isEmpyt()){
                System.out.println("PILHA 3 VAZIA");
                break;
            }

            
        }
    }
}
