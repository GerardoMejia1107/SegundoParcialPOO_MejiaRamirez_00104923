import Composites.CEO;
import Departamentos.Departamento;
import Departamentos.Principal;
import Departamentos.Secundario;

public class Main {
    public static void main(String[] args) {
        Departamento principal1 = new Principal("Sales", 1);
        Departamento principal2 = new Principal("IT", 2);



        Departamento secundario1 = new Secundario("G1", 11);
        Departamento secundario2 = new Secundario("G2", 12);

        CEO ceo = new CEO();


        ceo.agregarDeptPincipal(principal1);
        ceo.agregarDeptPincipal(principal2);

        ceo.mostrarInformacion();



    }
}
