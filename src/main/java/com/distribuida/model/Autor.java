package com.distribuida.model;


import jakarta.persistence.*;

@Entity
@Table(name = "autor")
public class Autor {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_autor")
    private int idAutor;
    @Column(name =  "id_nombre")
    private String nombre;
    @Column(name = "id_apellido")
    private String apellido;
    @Column(name = "id_pais")
    private String pais;
    @Column(name = "id_direccion")
    private String direccion;
    @Column(name = "id_telefono")
    private String telefono;
    @Column(name = "id_correo")
    private String correo;

    //Constructor vacio
    public Autor(){}

    //Constructor con parámetros
    public Autor(int idAutor, String nombre, String apellido, String pais, String direccion, String telefono, String correo){
        this.idAutor = idAutor;
        this.nombre = nombre;
        this.apellido = apellido;
        this.pais = pais;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }

    //Métodos getters and setters

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    //ToString
    @Override
    public String toString() {
        return "Autor{" +
                "idAutor=" + idAutor +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", pais='" + pais + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}
