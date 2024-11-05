package red.jackal.training.spring.jpms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import red.jackal.training.spring.jpms.api.ExampleData;
import red.jackal.training.spring.jpms.api.ExampleRepository;
import red.jackal.training.spring.jpms.entity.ExampleEntity;

import java.util.List;
import java.util.Optional;

@Repository
public class JpaExampleRepository implements ExampleRepository {

    public SpringJpaRepository springJpaRepository;

    public JpaExampleRepository(SpringJpaRepository springJpaRepository) {
        this.springJpaRepository = springJpaRepository;
    }

    public Optional<ExampleEntity> findById(long id) {
        return springJpaRepository.findById(id);
    }

    public List<ExampleData> findAll() {
        return List.copyOf(springJpaRepository.findAll());
    }

    public ExampleData save(ExampleData exampleData) {
        return springJpaRepository.save(new ExampleEntity(exampleData));
    }

    public interface SpringJpaRepository extends JpaRepository<ExampleEntity, Long> {

    }
}
