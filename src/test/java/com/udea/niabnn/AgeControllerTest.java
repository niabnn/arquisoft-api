package com.udea.niabnn;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@SpringBootTest
@AutoConfigureMockMvc

public class AgeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetAge() throws Exception {
    mockMvc.perform(get("/api/age?name=estefania"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("estefania"));
    }
    
}