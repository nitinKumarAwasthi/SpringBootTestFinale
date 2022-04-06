package it.devlecc.springtestfinale.repository;

import it.devlecc.springtestfinale.model.Prodotto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface ProdottoRepository extends JpaRepository<Prodotto, Long> {
        List<Prodotto> findByDataDiAcquistoBetween (Date datada, Date dataa);
        List<Prodotto> findByDataDiScadenzaBetween (Date datada, Date dataa);
        List<Prodotto> findByPrezzoBetween(float prezzoMin, float prezzoMax);
        List<Prodotto> findByPrezzoLessThan(float prezzoMax);
        List<Prodotto> findByPrezzoGreaterThan(float prezzoMin);
        List<Prodotto> findByRankingBetween(float min, float max);
        List<Prodotto> findByRankingLessThan(float max);
}
