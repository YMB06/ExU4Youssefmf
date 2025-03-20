package es.ies.curavalera.Youssef;

/**
 *
 * @author yo misma
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado empleado = new Empleado("1245678M","Perico de los Palotes");
        
        empleado.setDireccion("C/del Pez,6");
        empleado.setNumHijos(3);
        imprimirEmpleado(empleado);

    }

    private static void imprimirEmpleado(Empleado empleado) {
        System.out.println("DNI: "+ empleado.getDni());
        System.out.println("Nombre: "+ empleado.getNombre());
        System.out.println("Cargo: "+ empleado.getCargo());
        System.out.println("Número de hijos: "+ empleado.getNumHijos());
        System.out.println("Sueldo: "+ empleado.calcula_sueldo(1200));
    }

}
