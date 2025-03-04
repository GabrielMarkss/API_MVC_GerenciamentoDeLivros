package arqtsoftatvd03.repository;

import arqtsoftatvd03.model.LivroModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<LivroModel, Integer> {
}