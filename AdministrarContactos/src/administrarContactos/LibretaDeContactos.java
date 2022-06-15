package administrarContactos;

import java.util.List;

/**
 * Clase donde creo, modifico y elimino las listas de contactos:
 * @author Alberto
 * @version 1.0 15/06/2022
 */
public class LibretaDeContactos {
    String apodo;
    //List<Contactos> libreta1 = new List;

    /**
     * Constructor de la libreta de contactos:
     * @param apodo
     */
    public LibretaDeContactos(String apodo) {
        this.apodo = apodo;
    }

    /**
     * Metodo para añadir contactos a la lista:
     * @param nombre
     * @param apellidos
     * @param email
     * @param direccion
     * @param telefono
     * @param comentario
     */
    public void addContacto(String nombre, String apellidos, String email, String direccion, String telefono, String comentario){
        Contactos contacto1 = new Contactos(nombre, apellidos, email, direccion, telefono, comentario);
    }
}
