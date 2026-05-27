package com.distribuida.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CategoriaTest {

    private Categoria categoria;

    //Constructor
    @BeforeEach
    public void setUp(){
        categoria = new Categoria(
                1
                , "Terror"
                , "Los asesinatos de Drácula"
        );
    }
    @Test
    public void testCategoriaAndGetters(){
        assertAll("Pruebas unitarias constructor Categoria",
                () -> assertEquals(1,categoria.getIdCategoria()),
                () -> assertEquals("Terror",categoria.getCategoria()),
                () -> assertEquals("Los asesinatos de Drácula",categoria.getDescripcion())
                );

        // ToString
        System.out.println(categoria.toString());
    }

    //Setters
   @Test
    public void testCategoriaSetters(){
        categoria.setIdCategoria(2);
        categoria.setCategoria("Terror");
        categoria.setDescripcion("IT");


    //Getters
        assertAll("Pruebas unitarias getters Categoria",
               () -> assertEquals(2,categoria.getIdCategoria()),
               () -> assertEquals("Terror",categoria.getCategoria()),
                () -> assertEquals("IT",categoria.getDescripcion())
       );

        System.out.println(categoria.toString());
   }

   // ToString
    @Test
    public void testCategoriaToString(){
        String str = categoria.toString();

        assertAll("Pruebas unitarias - To String - Categoria",
                () -> assertTrue(str.contains("1")),
                () -> assertTrue(str.contains("Terror")),
                () -> assertTrue(str.contains("Los asesinatos de Drácula"))
                );
    }
}
