/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionalimentos;

/**
 *
 * @author User
 */
public class Pedido {
    private String nombre;
    private String vegetal;
    private String carne;
    private String guarnicion;
    private String bebida;
    private String postre; 

    public Pedido(String nom_comensal, String vegetal, String carne, String guarnicion, String bebida, String postre) {
        this.nombre = nom_comensal;
        this.vegetal = vegetal;
        this.carne = carne;
        this.guarnicion = guarnicion;
        this.bebida = bebida;
        this.postre = postre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getVegetal() {
        return vegetal;
    }

    public String getCarne() {
        return carne;
    }

    public String getGuarnicion() {
        return guarnicion;
    }

    public String getBebida() {
        return bebida;
    }

    public String getPostre() {
        return postre;
    }
    
    
}
