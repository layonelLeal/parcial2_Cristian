package Modelo;

import supabase.Supabase;
import gestionalimentos.Pedido;
import javax.swing.table.DefaultTableModel;
import org.json.JSONArray;

public class Conexion {

    static Supabase sup;
    
    public static void conectionSup(){
        sup = new Supabase("https://wchlcbxnrpzvbooqwosk.supabase.co/", 
                "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6IndjaGxjYnhucnB6dmJvb3F3b3NrIiwicm9sZSI6ImFub24iLCJpYXQiOjE3MjMwNzM2NzUsImV4cCI6MjAzODY0OTY3NX0.XJiVr_CjK_byXr8pj0eTRpSoduYdZIOsKqKwHaDgWsQ");
    }
    
    public static void Conectando(){
        conectionSup();
    }
    
    public static JSONArray GenerarPed(String nombre, String vegetal, String carne, String guarnicion, String bebida, String postre ){
        
        conectionSup();
        Pedido newPedido[] = new Pedido[1];
        newPedido[0] = new Pedido(nombre, vegetal, carne, guarnicion, bebida, postre);
        
        JSONArray data = new JSONArray(newPedido);
        System.out.println(data.toString());
        sup.from("alimentos").insert(data);
        return data;
    }
    

    
}
