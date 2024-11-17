package co.edu.uniquindio.poo.model;

import java.util.LinkedList;

public class Empresa {
    private String nombre;
    private LinkedList<Vehiculo> vehiculos;
    private LinkedList<Persona> personas;
    public Empresa(String nombre, LinkedList<Vehiculo> vehiculos, LinkedList<Persona> personas) {
        this.nombre = nombre;
        vehiculos = new LinkedList<>();
        personas = new LinkedList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public LinkedList<Vehiculo> getVehiculos() {
        return vehiculos;
    }
    public void setVehiculos(LinkedList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
    public LinkedList<Persona> getPersonas() {
        return personas;
    }
    public void setPersonas(LinkedList<Persona> personas) {
        this.personas = personas;
    }

    public boolean registrarVehiculo(Vehiculo vehiculo) {
        if (vehiculos.contains(vehiculo)) {
            System.out.println("El vehículo ya está registrado en la empresa.");
            return false;
        }
        vehiculos.add(vehiculo);
        System.out.println("Vehículo registrado con éxito: " + vehiculo.getMarca() + " " + vehiculo.getModelo());
        return true;
    }

    public boolean registrarEmpleado(Empleado empleado) {
        if (empleado == null) {
            System.out.println("El empleado no puede ser nulo.");
            return false;
        }
    
        // Verificar si ya existe un empleado con el mismo código o ID en la lista de personas
        for (Persona persona : personas) {
            if (persona instanceof Empleado) {
                Empleado e = (Empleado) persona;
                if (e.getCodigoEmpleado().equals(empleado.getCodigoEmpleado()) || e.getId().equals(empleado.getId())) {
                    System.out.println("El empleado con el código " + empleado.getCodigoEmpleado() + " o ID " + empleado.getId() + " ya está registrado.");
                    return false;
                }
            }
        }
    
        personas.add(empleado); // Añadir el empleado a la lista general de personas
        System.out.println("Empleado registrado con éxito: " + empleado.getNombre() + " (Código: " + empleado.getCodigoEmpleado() + ")");
        return true;
    }
    
    

}
