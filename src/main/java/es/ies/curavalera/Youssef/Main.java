package es.ies.curavalera.Youssef;
/**
 * @author Youssef_Miftah
 */
public class Main {



    public static void main(String[] args) {
        //Asinación de la informacion del empleado
        Empleado empleado = new Empleado("1245678M","Perico de los Palotes");
        
        empleado.setDireccion("C/del Pez,6");
        empleado.setNumHijos(3);
        imprimirEmpleado(empleado);

    }

    //Metodo de con la impresion de la informacion del empleado
    private static void imprimirEmpleado(Empleado empleado) {
        System.out.println("DNI: "+ empleado.getDni());
        System.out.println("Nombre: "+ empleado.getNombre());
        System.out.println("Cargo: "+ empleado.getCargo());
        System.out.println("Número de hijos: "+ empleado.getNumHijos());
        System.out.println("Sueldo: "+ empleado.calcula_sueldo(1200));
    }

}
