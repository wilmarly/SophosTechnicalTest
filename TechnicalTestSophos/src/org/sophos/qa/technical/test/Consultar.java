package org.sophos.qa.technical.test;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Consultar {

    public void consultar (Scanner sc, Map<Integer, List<Object>> clientes){

        System.out.println("Binvenido a la consulta de clientes");
        System.out.println("Por favor ingrese la cedula del cliente");

        System.out.println(clientes.get(sc.nextInt()));
    }
}
