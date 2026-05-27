package com.distribuida.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutorTest {

    private Autor autor;

    //Constructor
    @BeforeEach
    public void setUp(){
        autor = new Autor(
                1
                , "Jhoel"
                , "Lema"
                , "Ecuador"
                , "Pifo"
                , "0987654321"
                , "jhoel@gmail.com"
        );
    }

    @Test
    public void testAutorAndGetters(){

        assertAll("Pruebas unitarias constructor Autor",
                () -> assertEquals(1,autor.getIdAutor()),
                () -> assertEquals("Jhoel",autor.getNombre()),
                () -> assertEquals("Lema",autor.getApellido()),
                () -> assertEquals("Ecuador",autor.getPais()),
                () -> assertEquals("Pifo",autor.getDireccion()),
                () -> assertEquals("0987654321",autor.getTelefono()),
                () -> assertEquals("jhoel@gmail.com",autor.getCorreo())
        );

        // ToString
        System.out.println(autor.toString());
    }

    //Setters
    @Test
    public void testAutorSetters(){

        autor.setIdAutor(2);
        autor.setNombre("Edgar");
        autor.setApellido("Poe");
        autor.setPais("Ecuador");
        autor.setDireccion("Tumbaco");
        autor.setTelefono("0988888888");
        autor.setCorreo("edgarpoe@gmail.com");

        //Getters
        assertAll("Pruebas unitarias getters Autor",
                () -> assertEquals(2,autor.getIdAutor()),
                () -> assertEquals("Edgar",autor.getNombre()),
                () -> assertEquals("Poe",autor.getApellido()),
                () -> assertEquals("Ecuador",autor.getPais()),
                () -> assertEquals("Tumbaco",autor.getDireccion()),
                () -> assertEquals("0988888888",autor.getTelefono()),
                () -> assertEquals("edgarpoe@gmail.com",autor.getCorreo())
        );

        System.out.println(autor.toString());
    }

    // ToString
    @Test
    public void testAutorToString(){

        String str = autor.toString();

        assertAll("Pruebas unitarias - To String - Autor",
                () -> assertTrue(str.contains("1")),
                () -> assertTrue(str.contains("Jhoel")),
                () -> assertTrue(str.contains("Lema")),
                () -> assertTrue(str.contains("Ecuador")),
                () -> assertTrue(str.contains("Pifo")),
                () -> assertTrue(str.contains("0987654321")),
                () -> assertTrue(str.contains("jhoel@gmail.com"))
        );
    }
}