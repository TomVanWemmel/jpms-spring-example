package red.jackal.training.spring.jpms.app;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import red.jackal.training.spring.jpms.api.ExampleData;
import red.jackal.training.spring.jpms.api.ExampleRepository;
import red.jackal.training.spring.jpms.web.controller.SaveExampleRequest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class AppTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ExampleRepository exampleRepository;

    private ObjectMapper objectMapper = JsonMapper.builder()
            .build();

    @Test
    void requestIsSentToRepository() throws Exception {
        mockMvc.perform(post("/v1/examples/")
                        .contentType("application/json")
                        .content(objectMapper.writeValueAsString(new SaveExampleRequest("special.name"))))
                .andExpect(status().isOk());

        assertThat(exampleRepository.findAll())
                .hasSize(1)
                .map(ExampleData::name)
                .containsExactly("special.name");
    }

}