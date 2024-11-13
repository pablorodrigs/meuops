package ac2_project.example.ac2_ca;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class Ac2CaApplicationTests {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void contextLoads() {
    }

    @Test
    void helloEndpointReturnsHelloWorld() {
        // Chama o endpoint /hello e verifica se a resposta é "HelloWorld"
        ResponseEntity<String> response = restTemplate.getForEntity("/hello", String.class);
        assertThat(response.getBody()).isEqualTo("HelloWorld");
    }
}
