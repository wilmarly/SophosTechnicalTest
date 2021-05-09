package org.sophos.qa.technical.test;


import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Eliminar {

    public void eliminar (Scanner sc, Map<Integer, List<Object>> clientes){
        System.out.println("Binvenido la eliminacion de clientes");
        System.out.println("Por favor ngrese la cedula del cliente");
        clientes.remove(sc.nextInt());
        System.out.println("El cliente se ha eliminado exitosamente");


    }
}
