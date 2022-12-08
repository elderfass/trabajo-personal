public class Estante {
    private String tipo;

    public Estante(){

    }
    
    public Estante(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Estante, tipo=" + tipo + "]";
    }

}
