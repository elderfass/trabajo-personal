public class Usuaio{
    private int cc;
    private String nombre, apellido, direccion, fecha_prestamo, fecha_entrega;
    public Usuaio(){

    }
    
    public Usuaio(int cc, String nombre, String apellido, String direccion, String fecha_prestamo,
            String fecha_entrega) {
        this.cc = cc;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.fecha_prestamo = fecha_prestamo;
        this.fecha_entrega = fecha_entrega;
    }
    
    public String getFecha_prestamo() {
        return fecha_prestamo;
    }

    public void setFecha_prestamo(String fecha_prestamo) {
        this.fecha_prestamo = fecha_prestamo;
    }

    public String getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(String fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    public int getCc() {
        return cc;
    }
    public void setCc(int cc) {
        this.cc = cc;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
    @Override
    public String toString() {
        return "Usuaio [cc=" + cc + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion
                + ", fecha_prestamo=" + fecha_prestamo + ", fecha_entrega=" + fecha_entrega + "]";
    }

    public Usuaio reg(){
        Principal.comver.nextLine();
        System.out.println("ingrese el nombre ");
        String nombre=Principal.comver.nextLine();
        System.out.println("ingrese su apellido");
        String apellido = Principal.comver.nextLine();
        System.out.println("ingrese al cedula");
        int cc=Principal.comver.nextInt();
        Principal.comver.nextLine();
        System.out.println("ingrese su direccion");
        String direc= Principal.comver.nextLine();
        System.out.println("ingrese la fecha de prestamo");
        String fecha1=Principal.comver.nextLine();
        System.out.println("ingrse la fecha de entrega");
        String fecha2=Principal.comver.nextLine();

        return new Usuaio(cc, nombre, apellido, direc, fecha1, fecha2);
    }

    
}
