package Departamentos;

public abstract class Departamento {
    private String nombre;
    private int ID;

    public Departamento() {
    }

    public Departamento(String nombre, int ID) {
        this.nombre = nombre;
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    //Metodo mostrar
    public void mostrarInformacion(){
        System.out.println(
                "Nombre: "  + this.getNombre()+ "\n"+
                        "ID: " + this.getID()
        );
    }
}
