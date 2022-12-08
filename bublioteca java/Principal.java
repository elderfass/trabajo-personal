import java.util.ArrayList;
import java.util.Scanner;

public class Principal{
    private String contraseña;
    
    public String getContraseña() {
        return contraseña;
    }
    public void setContraseña(String c) {
        this.contraseña = c;
    }
    public static Usuaio us=new Usuaio();
    public static Scanner comver = new Scanner(System.in);
    public static ArrayList<Usuaio> usuaios = new ArrayList<>();
    public static ArrayList<Libro> estantes = new ArrayList<>();
    public static void main(String[] args) {
        int fin=0;
        while (fin==0){
            menu();
            int ops = comver.nextInt();
            switch (ops){
                case 1:
                menus();
                break;
                case 2:
                    comver.nextLine();
                    menb();
                break;
                case 3:
                    fin++;
                    break;
                default:
                    System.out.println("opcion no valida");
            break;
            }
        }
    }
    public static void menu(){
        System.out.println("1. usuraio \n2. bibliotecario");
    }

    public static void menb(){
        int fbib=0;
        while (fbib==0){
            Libro ln=new Libro();
            System.out.println("1. agregar \n2. buscar \n3. actualizar \n4. borrar \n5. salir");
            int bop=comver.nextInt();
            switch (bop){
                case 1:
                    Libro l=ln.reg();
                    estantes.add(l);
                break;
                case 2:
                    System.out.println("ingrese el id a buscar");
                    int id=comver.nextInt();
                    Estante bus=ln.buscarl(id);
                    if (bus!=null){
                        System.out.println(bus.toString());
                    }else{
                        System.out.println("el libro no existe");
                    }
                break;
                case 3:
                    System.out.println("ingrese el id a buscar");
                    int id1 =comver.nextInt();
                    Libro bus1=ln.buscarl(id1);
                    if (bus1!=null){
                        Libro g=ln.reg();
                        bus1.setId(g.getId());
                        bus1.setNombre(g.getNombre());
                        bus1.setTipo(g.getTipo());
                        bus1.setStok(g.getStok());
                        System.out.println("actualizacion exitosa");
                    }else{
                        System.out.println("el libro no existe");
                    }
                break;
                case 4:
                    System.out.println("ingrese el id a buscar");
                    int id2 =comver.nextInt();
                    Estante bus2=ln.buscarl(id2);
                    if (bus2!=null){
                        estantes.remove(bus2);
                    }else{
                        System.out.println("el libro no existe");
                    }
                break;
                case 5:
                    fbib+=1;
                break;
                default:
                    System.out.println("opcion no valida");
                break;
            }
        }
    }

    public static void menus(){
        int fus=0;
        while (fus==0){
            System.out.println("1. prestar \n2. devolover \n3. salir");
            int opu=comver.nextInt();
            switch (opu){
                case 1:
                    if (estantes.isEmpty()){
                       
                        System.out.println("no hay datos registrados");
                    
                    }else{
                        Usuaio usua=us.reg();
                        comver.nextLine();
                        System.out.println("que tipo de libro desea");
                        String libro=comver.nextLine();
                        for (Libro i: estantes){
                            if (i.getTipo().equalsIgnoreCase(libro)){
                                System.out.println(i.toString());
                            }else{
                                System.out.println("el libro no existe");
                                fus++;
                            }
                        }
                        System.out.println("ingrese el id de el libro que desea");
                        int idp=comver.nextInt();
                        for (Libro i: estantes){
                            if (i.getId()==idp){
                                if (i.getStok()!=0){
                                    int e=i.getStok();
                                    e--;
                                    i.setStok(e);
                                }else{
                                    System.out.println("no tenemos mas de este libro");
                                    fus++;
                                }
                            }else{
                                System.out.println("el libro ingresado no existe");
                                fus++;
                            }
                        }
                        
                        usuaios.add(usua);
                    }
                break;
            case 2:
                    if (usuaios.isEmpty()){
                        System.out.println("no hay prestamos realisados");
                    }else{
                        Usuaio db=us.reg();
                        System.out.println(db);
                        for (Usuaio i: usuaios){
                            if (i.getCc()==db.getCc()){
                                usuaios.remove(i);
                                
                                System.out.println("devolucion confirmada");
                            }else{
                                System.out.println("error el usuario ingresado no a solicitado libros");
                            }
                        }
                    }
                break;

                case 3:
                    fus++;
                break;
            }
        }
    }
}