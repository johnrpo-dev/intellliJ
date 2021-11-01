package Empleado;

public class Empleado {

    private int id ;
    private String name;
    private String cargo;
    private int salary;
    private String telephone;
    private String address;


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

    //encapsulamiento get & set


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //metodos = acciones = funciones
    public int calcularSalario (){

        return (0);
    }
}
