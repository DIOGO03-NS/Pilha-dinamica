    public class StackDinamica{
        CelulaPilha top;

        public void push(String nome){
            CelulaPilha novaCelula = new CelulaPilha();
            novaCelula.setDado(nome);
            novaCelula.setAnterior(this.top);
            this.top = novaCelula;
        }

        public void push(int numero){
            CelulaPilha novaCelula = new CelulaPilha();
            novaCelula.setDado(numero);
            novaCelula.setAnterior(this.top);
            this.top = novaCelula;
        }

        public void pop(){
            if(!isEmpyt()){
            this.top = this.top.getAnterior();
            }else{
            System.out.println("Pilha Vazia!!!");
            } 
        }

        public boolean isEmpyt(){
            if(this.top == null){
            
            return true;
            }else return false;
        }

        public int sizePilha(){
            CelulaPilha p; 
            int cont = 0;
            p = this.top;
            while(p != null){
            p = p.getAnterior();
            cont++;
            }
            return cont; 
        }

        public void imprimir(){
            CelulaPilha p; p = this.top;
            if(isEmpyt()){
            System.out.println("Pilha Vazia!!!");
            }else{
            while(p != null){
            System.out.println("Nome na pilha..: "+p.getDado());
            p = p.getAnterior();
                } 
            } 
        }

        public CelulaPilha top(){
            if(isEmpyt()){
            System.out.println("Pilha Vazia!!!");
            return null;
            }else {
            return this.top;
            } 
        } 
        
    }
    