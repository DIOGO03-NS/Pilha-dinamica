public class CelulaPilha {
    public Object dado;
    public CelulaPilha proxima;
    public CelulaPilha anterior;


    public Object getDado() {
        return this.dado;
    }

    public void setDado(Object dado) {
        this.dado = dado;
    }

    public CelulaPilha getProxima() {
        return this.proxima;
    }

    public void setProxima(CelulaPilha proxima) {
        this.proxima = proxima;
    }

    public CelulaPilha getAnterior() {
        return this.anterior;
    }

    public void setAnterior(CelulaPilha anterior) {
        this.anterior = anterior;
    }

}
