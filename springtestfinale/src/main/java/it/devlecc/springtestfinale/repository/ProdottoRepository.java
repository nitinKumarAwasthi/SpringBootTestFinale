package it.devlecc.springtestfinale.repository;

import it.devlecc.springtestfinale.model.Prodotto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdottoRepository extends JpaRepository<Prodotto, Long> {
}
