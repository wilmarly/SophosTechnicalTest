package org.sophos.qa.technical.test;

public class Cliente {
	
    private String Nombre;
    int Cedula;
    String TipoDocumento;

    public String getNombre() {
        return Nombre;
    }

    public int getCedula() {
        return Cedula;
    }
    
    public String getTipoDocumento() {
        return TipoDocumento;
    }

    public void setCedula(int cedula) {
        Cedula = cedula;
    }

    public void setTipoDocumento(String tipoDocumento) {
        TipoDocumento = tipoDocumento;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;


    }
}
