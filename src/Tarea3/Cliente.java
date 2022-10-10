
package Tarea3;

public class Cliente {
    private String nombre;
    private int cedula;
    private boolean discapacidad;

    public Cliente(String nombre, int cedula, boolean discapacidad) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.discapacidad = discapacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public boolean getDiscapacidad() {
        return discapacidad;
    }

    public void setDiscapacidad(boolean discapacidad) {
        this.discapacidad = discapacidad;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", cedula=" + cedula + ", discapacidad=" + discapacidad + '}';
    }
    
}
