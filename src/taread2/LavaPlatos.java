
package taread2;

import javax.swing.JOptionPane;

public class LavaPlatos {
    public void menuPrincipal() {
         int respuesta;
        int platos;
        int vasos;
        int cubiertos;
        Pila miPila = new Pila();
        
        JOptionPane.showMessageDialog(null, "Bienvenido a la "
                + "simulacion de lava platos");
        
        while (true) {            
            respuesta = Integer.parseInt(JOptionPane.
                showInputDialog("Ingresa (1) si deseas ingresar trastos \n" +
         "Ingresa (2) si deseas salir del simulador"));
            if (respuesta == 1) {
                respuesta = Integer.parseInt(JOptionPane.
                        showInputDialog("Ingresa (1) si deseas ingresar Platos \n"
                                + "Ingresa (2) si deseas ingresar Vasos"));

                if (respuesta == 1) {
                    platos = Integer.parseInt(JOptionPane.
                            showInputDialog("Cuantos platos deseas ingresar:"));
                    cubiertos = Integer.parseInt(JOptionPane.
                            showInputDialog("Cuantos cubiertos deseas ingresar:"));
                    
                    Trastos platos1 = new Trastos(platos, 0, cubiertos);
                    System.out.println("");
                    System.out.println("PLATOS ACOMODADOS");
                    miPila.push(platos1);
                    System.out.println("");
                    
                } else {
                    vasos = Integer.parseInt(JOptionPane.
                            showInputDialog("Cuantos Vasos deseas ingresar:"));
                    cubiertos = Integer.parseInt(JOptionPane.
                            showInputDialog("Cuantos cubiertos deseas ingresar:"));
                    
                    Trastos platos1 = new Trastos(0, vasos, cubiertos);
                    System.out.println("");
                    System.out.println("PLATOS ACOMODADOS");
                    miPila.push(platos1);
                    System.out.println("");
                }
                miPila.listar();

            } else if (respuesta == 2) {
                JOptionPane.showMessageDialog(null, "SALIENDO.....");
                break;
            }
        }
    }
}
