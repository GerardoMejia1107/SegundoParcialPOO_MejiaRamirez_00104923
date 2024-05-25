import Composites.CEO;
import Departamentos.Departamento;
import Departamentos.Principal;

public class Main {
    public static void main(String[] args) {
        Departamento principal1 = new Principal("Sales", 1);
        Departamento principal2 = new Principal("IT", 2);

        CEO ceo = new CEO();
        ceo.agregarDeptPincipal(principal1);
        ceo.agregarDeptPincipal(principal2);

        ceo.mostrarInformacion();



    }
}
