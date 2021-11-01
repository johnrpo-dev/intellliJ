package Empresa;

import Empleado.Empleado;

import java.util.Scanner;

public class empresa {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcion;
        int contador = 0;

        Empleado[] empleados = new Empleado[10];

        do {
            System.out.println("==========");
            System.out.println("Bienvenido");
            System.out.println("==========");
            System.out.println("1. Agregar Empleado");
            System.out.println("2. Mostrar Empleado");
            System.out.println("3. Mostrar Empleados");
            System.out.println("4. Exit");
            System.out.println("");  //salto de linea

            System.out.print("Digite una opcion");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    empleados[contador] = new Empleado();

                    System.out.println("Digita el id: ");
                    empleados[contador].setId( scanner.nextInt() );
                    System.out.println("Digita el Nombre: ");
                    empleados[contador].setName( scanner.next() );
                    System.out.println("Digita el Cargo");
                    empleados[contador].setCargo( scanner.next() );
                    System.out.println("Digita el Salario: ");
                    empleados[contador].setSalary( scanner.nextInt() );
                    System.out.println("Digita el Telefono");
                    empleados[contador].setTelephone( scanner.next() );
                    System.out.println("Digite la dirección: ");
                    empleados[contador].setAddress( scanner.next() );

                    contador++;

                    break;
                case 2:
                    System.out.println("Id del empleado");
                    int id = scanner.nextInt();
                    int j = 0;
                        if ( id == empleados[j].getId() ) {
                            System.out.println("****************");
                            System.out.println(empleados[j].getName());
                            System.out.println(empleados[j].getAddress());
                            System.out.println("****************");

                        }else{
                            System.out.println("Empleado no encontrado");
                        }

                    break;
                case 3:
                    for (int i = 0; i < contador; i++) {
                        System.out.println(empleados[i].getName() );
                        System.out.println(empleados[i].getCargo());
                        System.out.println(empleados[i].getSalary());
                        System.out.println(empleados[i].getTelephone());
                        System.out.println(empleados[i].getAddress());
                        System.out.println("_____________________");
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no Valida");
                    break;
            }

        }while (opcion != 4);
    }
}
