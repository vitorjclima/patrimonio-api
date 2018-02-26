package com.example.patrimonio.resource;

import static com.jayway.restassured.RestAssured.get;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

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
        statusCode(200);/*.
        and().
        contentType(ContentType.JSON);*/
    }

    /**
     * Test method for {@link com.example.patrimonio.resource.ItemResource#adicionar(com.example.patrimonio.model.Item)}.
     */
    @Test
    void testAdicionar() {
        fail("Not yet implemented");
    }

}
