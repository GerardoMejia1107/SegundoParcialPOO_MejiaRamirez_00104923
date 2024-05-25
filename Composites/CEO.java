package Composites;

import Departamentos.Departamento;

import java.util.ArrayList;

public class CEO extends Departamento {
    private ArrayList<Departamento> principales;

    public CEO() {
        this.principales = new ArrayList<>();
    }

    public void agregarDeptPincipal(Departamento principal){
        this.principales.add(principal);
    }

    public void removerPrincipal(Departamento principal){
        this.principales.remove(principal);
    }

    public void mostrarInformacion(){
        super.mostrarInformacion();
    }
}
