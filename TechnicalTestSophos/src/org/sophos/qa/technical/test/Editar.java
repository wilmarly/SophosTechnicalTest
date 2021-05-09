package org.sophos.qa.technical.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Editar extends Cliente{

    public void editar(Scanner sc, Map<Integer, List<Object>> clientes){
    	
        System.out.println("Binvenido a la opcion de eliminacionde clientes");
        
        System.out.println("Por favor ingrese la cedula del cliente");
        setCedula(sc.nextInt());
        
        System.out.println("Por favor ingrese el tipo de documento");
        setTipoDocumento(sc.next());
        
        System.out.println("Por favor ingrese el nombre del cliente");
        setNombre(sc.next());

        List<Object> datosCliente = new ArrayList<Object>();
        datosCliente.add(getTipoDocumento());
        datosCliente.add(getNombre());
        datosCliente.add((getCedula()));

        clientes.replace(getCedula(), datosCliente);



    }
}
