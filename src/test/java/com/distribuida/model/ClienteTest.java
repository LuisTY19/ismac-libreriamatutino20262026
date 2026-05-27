package com.distribuida.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    private Cliente cliente;

    // Constructor
    @BeforeEach
    public void setup(){
        cliente = new Cliente(
                1
                ,"1753274099"
                ,"Bob"
                ,"Toronja"
                ,"Fondo de bikini"
                ,"0997872664"
                ,"bobtoronja@gmail.com"
        );
    }

    // Constructor y Getters
    @Test
    public void testClienteConstructorAndGetters(){
        assertAll("Pruebas unitarias constructor Cliente",
                () -> assertEquals(1,cliente.getIdCliente()),
                () -> assertEquals("1753274099",cliente.getCedula()),
                () -> assertEquals("Bob",cliente.getNombre()),
                () -> assertEquals("Toronja",cliente.getApellido()),
                () -> assertEquals("Fondo de bikini",cliente.getDireccion()),
                () -> assertEquals("0997872664",cliente.getTelefono()),
                () -> assertEquals("bobtoronja@gmail.com",cliente.getCorreo())
        );

        // ToString
        System.out.println(cliente.toString());
    }

    // Setters
    @Test
    public void testClienteSetters(){
        cliente.setIdCliente(2);
        cliente.setCedula("1754274098");
        cliente.setNombre("Luis");
        cliente.setApellido("Tipantiza");
        cliente.setDireccion("Pifo");
        cliente.setTelefono("0997872668");
        cliente.setCorreo("luis@gmail.com");

        // Getters
        assertAll("Pruebas unitarias setters Cliente",
                () -> assertEquals(2,cliente.getIdCliente()),
                () -> assertEquals("1754274098",cliente.getCedula()),
                () -> assertEquals("Luis",cliente.getNombre()),
                () -> assertEquals("Tipantiza",cliente.getApellido()),
                () -> assertEquals("Pifo",cliente.getDireccion()),
                () -> assertEquals("0997872668",cliente.getTelefono()),
                () -> assertEquals("luis@gmail.com",cliente.getCorreo())
        );

        // toString
        System.out.println(cliente.toString());

    }

    // toString
    @Test
    public void testClienteToString(){
        String str = cliente.toString() ;

        assertAll("Pruebas unitarias  -  to String  -  Cliente",
                () -> assertTrue(str.contains("1")),
                () -> assertTrue(str.contains("Bob")),
                () -> assertTrue(str.contains("Toronja")),
                () -> assertTrue(str.contains("Fondo de bikini")),
                () -> assertTrue(str.contains("0997872664")),
                () -> assertTrue(str.contains("bobtoronja@gmail.com"))
        );
    }

}