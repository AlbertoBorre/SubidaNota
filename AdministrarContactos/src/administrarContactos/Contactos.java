package administrarContactos;

/**
 * Clase donde creo, modifico y elimino los contactos de cada lista de contactos:
 * @author Alberto
 * @version 1.0 15/06/2022
 */
public class Contactos {
    String nombre;
    String apellidos;
    String email;
    String direccion;
    String telefono;
    String comentario;

    /**
     * Constructor sobrecargado de Contactos:
     * @param nombre
     * @param apellidos
     * @param email
     * @param direccion
     * @param telefono
     * @param comentario
     */
    public Contactos(String nombre, String apellidos, String email, String direccion, String telefono, String comentario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.direccion = direccion;
        this.telefono = telefono;
        this.comentario = comentario;
    }

    /**
     * Segundo constructor de Contactos:
     * @param nombre
     * @param apellidos
     * @param email
     * @param direccion
     * @param telefono
     */
    public Contactos(String nombre, String apellidos, String email, String direccion, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    /**
     * get del nombre del contacto:
     * @return Devuelve un String
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set del nombre del contacto:
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * get de los apellidos del contacto:
     * @return Devuelve un String
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Set de los apellidos del contacto:
     * @param apellidos
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * get del email del contacto:
     * @return Devuelve un String
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set del email del contacto:
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * get de la direccion del contacto:
     * @return Devuelve un String
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Set de la direccion del contacto:
     * @param direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * get del telefono del contacto:
     * @return Devuelve un String
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Set del telefono del contacto:
     * @param telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * get del comentario del contacto:
     * @return Devuelve un String
     */
    public String getComentario() {
        return comentario;
    }

    /**
     * Set del nombre del contacto:
     * @param comentario
     */
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
