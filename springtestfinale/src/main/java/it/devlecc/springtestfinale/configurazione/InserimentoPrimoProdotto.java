package it.devlecc.springtestfinale.configurazione;


import it.devlecc.springtestfinale.model.Prodotto;
import it.devlecc.springtestfinale.repository.ProdottoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Configuration
public class InserimentoPrimoProdotto {
    private static Logger logger = LoggerFactory.getLogger(InserimentoPrimoProdotto.class);

    @Bean
    CommandLineRunner insericiProdotti(ProdottoRepository repository){
        return args -> {

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            SimpleDateFormat dateFormatPerScadenza = new SimpleDateFormat("yyyy-MM-dd");

            Date datadiacquisto = dateFormat.parse("06-04-2021");
            Date datadiscadenza = dateFormatPerScadenza.parse("06-05-2021");
            Prodotto p1 = new Prodotto("Pane",datadiacquisto,datadiscadenza, 5.34f);

            datadiacquisto = dateFormat.parse("23-11-2021");
            datadiscadenza = dateFormatPerScadenza.parse("07-12-2021");
            Prodotto p2 = new Prodotto("Latte", datadiacquisto, datadiscadenza,23.99f);

            datadiacquisto = dateFormat.parse("11-01-2009");
            datadiscadenza = dateFormatPerScadenza.parse("01-02-2009");
            Prodotto p3 = new Prodotto("Uova",datadiacquisto,datadiscadenza,15.99f);

            datadiacquisto = dateFormat.parse("20-12-2018");
            datadiscadenza = dateFormatPerScadenza.parse("20-05-2019");
            Prodotto p4 = new Prodotto("Cioccolato",datadiacquisto, datadiscadenza,9.34f);

            List<Prodotto> prodotti = new ArrayList<>();
            prodotti.add(p2);
            prodotti.add(p3);
            prodotti.add(p4);
            repository.save(p1);
            repository.saveAll(prodotti);

            List<Prodotto> prodottiDalDb = repository.findAll();
            Prodotto p1DelDb = new Prodotto();
            int i = 0;
            for (Prodotto p: prodottiDalDb ) {
                if (i == 0){
                    logger.error("Prendo il primo prodotto del DB");
                    p1DelDb = p;
                    i++;
                }
                logger.info("Nome Del Prodotto: "+p.getNomeDelProdotto());
                logger.info("Prezzo Del Prodotto: "+p.getPrezzo());
                logger.info("Data di Acquisto del Prodotto: "+p.getDataDiAcquisto());
                logger.info("Data di Scadenza del Prodotto: "+p.getDataDiScadenza());
                logger.warn(p.toString());
            }

            /*Prodotto prodottoConId1 = repository.findById(Long.valueOf(1)).get();
            logger.info("Prodotto con id 1: "+prodottoConId1.getNomeDelProdotto());*/

        };
    }
}
