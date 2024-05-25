package Departamentos;

import java.util.ArrayList;

public class Principal extends Departamento{
    private ArrayList<Departamento> secundarios;
    public Principal(String nombre, int ID) {
        super(nombre, ID);
        this.secundarios = new ArrayList<>();
    }




}
