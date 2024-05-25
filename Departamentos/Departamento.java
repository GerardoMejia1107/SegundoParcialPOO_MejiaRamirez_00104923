package Departamentos;

import java.util.ArrayList;

public abstract class Departamento {
    private String nombre;
    private int ID;
    private ArrayList<Departamento> subDepartamentos;

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



    public void agregarDeptPincipal(Departamento secundario){
        this.subDepartamentos.add(secundario);
    }

    public void removerPrincipal(Departamento secundario){
        this.subDepartamentos.remove(secundario);
    }

    public void mostrarInformacion(){
        for(Departamento dept: subDepartamentos){
            "Nombre: "  + this.getNombre()
        }
    }
}
