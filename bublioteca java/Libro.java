public class Libro extends Estante{
    private int id;
    private String nombre;
    private int stok;

    public Libro(){

    }

    public Libro(String tipo, int id, String nombre, int stok) {
        super(tipo);
        this.id = id;
        this.nombre = nombre;
        this.stok = stok;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
    
    
    @Override
    public String toString() {
        return "Libro [id=" + id + ", nombre=" + nombre + ", stok=" + stok + "]"+ super.toString();
    }

    public Libro buscarl(int id){
        Libro lib=null;
        for (Libro i: Principal.estantes){
            if (i.getId()==id){
                lib=i;
                break;
            }else{
                lib=null;
            }
        }
        return lib;

    }
    public Libro reg(){
        System.out.println("ingrese el id");
        int id=Principal.comver.nextInt();
        Principal.comver.nextLine();
        System.out.println("ingrese el tipo");
        String tipo=Principal.comver.nextLine();
        System.out.println("ingrese el nombre");
        String nombre=Principal.comver.nextLine();
        System.out.println("ingrese la cantidad");
        int stock=Principal.comver.nextInt();

        return new Libro(tipo, id, nombre, stock);
    }
}
