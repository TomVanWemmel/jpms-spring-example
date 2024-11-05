package red.jackal.training.spring.jpms.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import red.jackal.training.spring.jpms.api.ExampleData;
import red.jackal.training.spring.jpms.service.ExampleService;

import java.util.List;

@RestController
@RequestMapping("/v1/examples")
public class ExampleController {

    private final ExampleService exampleService;

    public ExampleController(ExampleService exampleService) {
        this.exampleService = exampleService;
    }

    @GetMapping("/")
    public List<ExampleData> getAllExamples() {
        return exampleService.getAllExamples();
    }

    @PostMapping("/")
    public ExampleData addExample(@RequestBody SaveExampleRequest request) {
        return exampleService.addExample(request.name());
    }

    @GetMapping("/{id}")
    public ExampleData getExample(@PathVariable Long id) {
        return exampleService.getExample(id);
    }
}
