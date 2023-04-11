package ar.edu.unju.edm.Ejercicio5;
import java.util.Date;

public class Empleado {
    private String nombre;
    private Date fechaIngreso;
    private int legajo;
    private String email;
    private double sueldo;
    private int horasTrabajadas;

    public Empleado() {
    }

    public Empleado(String string, int i, int j) {
    }

    public void empleado() {}

    public void empleado(String nombre, int legajo, int horasTrabajadas) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.horasTrabajadas = horasTrabajadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public void calcularSueldo() {
        if (horasTrabajadas <= 160) {
            sueldo = horasTrabajadas * 4000;
        } else {
            int horasExtras = horasTrabajadas - 160;
            sueldo = 160 * 4000 + horasExtras * 5500;
        }
    }

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
        empleado1.setNombre("Juan Perez");
        empleado1.setFechaIngreso(new Date());
        empleado1.setLegajo(12345);
        empleado1.setEmail("juan.perez@empresa.com");
        empleado1.setHorasTrabajadas(200);
        empleado1.calcularSueldo();

        Empleado empleado2 = new Empleado("Maria Gomez", 54321, 180);
        empleado2.calcularSueldo();

        System.out.println("Empleado 1:");
        System.out.println("Nombre: " + empleado1.getNombre());
        System.out.println("Fecha de ingreso: " + empleado1.getFechaIngreso());
        System.out.println("Legajo: " + empleado1.getLegajo());
        System.out.println("Email: " + empleado1.getEmail());
        System.out.println("Sueldo: $" + empleado1.getSueldo());
        System.out.println("Horas trabajadas: " + empleado1.getHorasTrabajadas());

        System.out.println("\nEmpleado 2:");
        System.out.println("Nombre: " + empleado2.getNombre());
        System.out.println("Legajo: " + empleado2.getLegajo());
        System.out.println("Sueldo: $" + empleado2.getSueldo());
        System.out.println("Horas trabajadas: " + empleado2.getHorasTrabajadas());
    }
}