package com.example.patrimonio.resource;

import static com.jayway.restassured.RestAssured.get;
import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;

import org.junit.jupiter.api.Test;

import com.jayway.restassured.http.ContentType;

/**
 * @author Vitor Lima
 *
 */
class ItemResourceTest {

    /**
     * Test method for {@link com.example.patrimonio.resource.ItemResource#listar()}.
     */
    @Test
    void testListar() {
        get("/item").
        then().
        contentType(ContentType.JSON).
        body("etiqueta", containsString("AU9875"));

    }

    /**
     * Test method for {@link com.example.patrimonio.resource.ItemResource#adicionar(com.example.patrimonio.model.Item)}.
     */
    @Test
    void testAdicionar() {
        given().
        contentType(ContentType.JSON).
        body("../../src/main/resources/item.json").
        when().
        post("/item");
    }

}
