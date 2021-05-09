
package org.sophos.qa.technical.test;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Menu extends Cliente {
    Map<Integer, List<Object>> clientes = new HashMap<>();

    int response;
    int consulta;
    int eliminar;

    Scanner read = new Scanner(System.in);

    public void interfaz() {

        while (response <= 4) {
        	
            System.out.println("Por favor seleccione una de las siguientes opciones y presione enter:\n" +
                    "1. Registrar un cliente \n" +
                    "2. Editar un cliente \n" +
                    "3. Eliminar un cliente \n" +
                    "4. Consultar un cliente \n" +
                    "5. Salir de la aplicación");
            
            response = Integer.parseInt(read.next());

            
            switch(response) {
            case 1:
                Registrar rc = new Registrar();
                rc.registrar(read, clientes);
              break;
            case 2:
                Editar ed = new Editar();
                ed.editar(read, clientes);         	
            case 3:
                Eliminar Ec = new Eliminar();
                Ec.eliminar(read, clientes);
                break;
            case 4:
                Consultar cc = new Consultar();
                cc.consultar(read, clientes);
              break;
              
            default:
            	System.out.println("Gracias, que tenga un excelente día");
            	System.exit(0);
          }

        

            
        }
    }
}
