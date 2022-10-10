package Tarea3;

import javax.swing.JOptionPane;

public class Banco {

    public static void menuPrincipal() {
        Cola fila1 = new Cola();
        
        int respuesta;
        int respuesta2;
        JOptionPane.showMessageDialog(null, "Bienvenido al sistema bancario "
                + "\n" + "Porfavor ingrese los siguientes datos");

        while (true) {
            
            respuesta = Integer.parseInt(JOptionPane
                    .showInputDialog("(1) si desea ingresar a alguien a la "
                            + "fila \n" + "(2) Si desea terminar"));
            if (respuesta == 1) {
                String nombre;
                int cedula;
                int discapacidad;
                
                nombre = JOptionPane.showInputDialog("Ingrese el nombre:");
                cedula = Integer.parseInt(JOptionPane.
                        showInputDialog("Ingresela la cedula:"));
                
                discapacidad = Integer.parseInt(JOptionPane.
                        showInputDialog("Ingrese (1) si el cliente "
                                + "sufre una discapacidad \n" + "Ingrese "
                                + "(2) si no sufre de una discapacidad"));
                
                if (discapacidad == 1) {
                    Cliente newCliente = new Cliente(nombre,cedula,true);
                    fila1.encolaD(new Nodo(newCliente));
                    System.out.println(fila1.toString());
                    
                    respuesta2 = Integer.parseInt(JOptionPane.
                            showInputDialog("Ingresa (1) si deseas agregar otro "
                                    + "cliente \n" +
                                    "Ingresa (2) si deseas salir"));
                    if (respuesta2 == 2) {
                        break;
                    }
                    
                    break;
                    
                }else if (discapacidad == 2) {
                    Cliente newCliente = new Cliente(nombre,cedula,false);
                    fila1.encola(new Nodo(newCliente));
                    System.out.println(fila1.toString());
                    respuesta2 = Integer.parseInt(JOptionPane.
                            showInputDialog("Ingresa (1) si deseas agregar otro "
                                    + "cliente \n" +
                                    "Ingresa (2) si deseas salir"));
                    if (respuesta2 == 2) {
                        break;
                    }
                }else {
                    JOptionPane.showInternalMessageDialog(null, "Opcion invalida");
                }

            } else if (respuesta == 2) {
                JOptionPane.showMessageDialog(null, "Saliendo del programa");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Opcion invalida \n"
                        + "El programa volvera a iniciar....");
            }
        }
    }
}
