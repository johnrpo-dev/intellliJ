package Empleado;

public class Empleado {

    int id ;
    String name;
    String cargo;
    int salary;
    String telephone;
    String address;


    //metodo especial --------->constructor
    public Empleado() {
    }

    public Empleado(int id, String name, String cargo, int salary, String telephone, String address) {
        this.id = id;
        this.name = name;
        this.cargo = cargo;
        this.salary = salary;
        this.telephone = telephone;
        this.address = address;
    }

    //metodos = acciones = funciones
    public int calcularSalario (){

        return (0);
    }
}
