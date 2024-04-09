package com.cart.framework.web;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class CartControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("GET /cart/line-items")
    void testList() throws Exception {
        // TODO: Prepare cart.

        mockMvc.perform(get("/cart/line-items"))
                .andExpect(status().isOk());
    }

    @Test
    @DisplayName("POST /cart/line-items - when user add a new product")
    void testAddNewItem() throws Exception {
        // TODO: Clear cart.

        String json = """
                {
                    "productId": 1,
                    "quantity: 2
                }
                """;

        mockMvc.perform(post("/cart/line-items")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json))
                .andExpect(status().isCreated());

        // TODO: Check count of cart line items.
        // TODO: Check quantity of the first line item.
    }

    @Test
    @DisplayName("POST /cart/line-items - when user add a same product")
    void testAddSameItem() throws Exception {
        // TODO: Prepare cart.

        String json = """
                {
                    "productId": 1,
                    "quantity: 2
                }
                """;

        mockMvc.perform(post("/cart/line-items")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json))
                .andExpect(status().isCreated());

        // TODO: Check count of cart line items.
        // TODO: Check quantity of the first line item.
    }

    @Test
    @DisplayName("POST /cart/line-items - when user add a different product")
    void testAddDifferentItem() throws Exception {
        // TODO: Prepare cart.

        String json = """
                {
                    "productId": 1,
                    "quantity: 2
                }
                """;

        mockMvc.perform(post("/cart/line-items")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json))
                .andExpect(status().isCreated());

        // TODO: Check count of cart line items.
        // TODO: Check quantity of the first line item.
        // TODO: Check quantity of the second line item.
    }
}
