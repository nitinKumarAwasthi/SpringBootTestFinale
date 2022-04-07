package it.devlecc.springtestfinale.controller;

import it.devlecc.springtestfinale.avviso.ProdottoNonTrovato;
import it.devlecc.springtestfinale.model.Prodotto;
import it.devlecc.springtestfinale.repository.ProdottoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.List;

@RestController
public class ProdottoRestController {
    private static Logger logger =
            LoggerFactory.getLogger(ProdottoRestController.class);
    private final ProdottoRepository repository;

    public ProdottoRestController(ProdottoRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/prodotti")
    List<Prodotto> tuttiProdotti(){
        logger.info("Prendo tutti i Prodotti");
        return repository.findAll();
    }
    @PostMapping("/prodotto")
    Prodotto nuovoProdotto(@RequestBody Prodotto nuovoProdotto){
        return repository.save(nuovoProdotto);
    }

    @GetMapping("/prodotti/{id}")
    Prodotto singoloProdotto(@PathVariable Long id){
        return repository.findById(id)
                .orElseThrow(() -> new ProdottoNonTrovato(id));
    }
        @PutMapping("/prodotti/{id}")
    Prodotto aggiornaProdotto(@RequestBody Prodotto prodotto, @PathVariable Long id){
        return repository.save(prodotto);
    }

    @DeleteMapping("/prodotto/{id}")
    void eliminaProdotto(@PathVariable Long id){
        repository.deleteById(id);
    }

    @GetMapping("/prodotti/ricercatradatadiacquisto")
    public List<Prodotto> ricercaProdottiTraDateDiAcquisto(
            @RequestParam(name = "datada") @DateTimeFormat(pattern = "dd-MM-yyyy")
                    Date datada,
            @RequestParam(name = "dataa") @DateTimeFormat(pattern = "dd-MM-yyyy")
            Date dataa
            ){
        return repository.findByDataDiAcquistoBetween(datada, dataa);
    }
    @GetMapping("/prodotti/ricercatradatadiacquistoGreaterthan")
    public List<Prodotto> ricercaProdottiTraDateDiAcquistoPiùGrandeDi(
            @RequestParam(name = "acquistopiùgrandedi") @DateTimeFormat(pattern = "dd-MM-yyyy")
                    Date acquistoPiùGrandeDi
    ){
        return repository.findByDataDiAcquistoGreaterThan(acquistoPiùGrandeDi);
    }
    @GetMapping("/prodotti/ricercatradatadiacquistolessthan")
    public List<Prodotto> ricercaProdottiTraDateDiAcquistoPiùPiccoloDi(
            @RequestParam(name = "acquistopiùpiccolodi") @DateTimeFormat(pattern = "dd-MM-yyyy")
                    Date acquistoPiùPiccoloDi
    ){
        return repository.findByDataDiAcquistoLessThan(acquistoPiùPiccoloDi);
    }
    @GetMapping("/prodotti/ricercatradatadiscadenza")
    public List<Prodotto> ricercaProdottiTraDateDiScadenza(
            @RequestParam(name = "datada") @DateTimeFormat(pattern = "dd-MM-yyyy")
                    Date datada,
            @RequestParam(name = "dataa") @DateTimeFormat(pattern = "dd-MM-yyyy")
                    Date dataa
    ){
        return repository.findByDataDiScadenzaBetween(datada, dataa);
    }
    @GetMapping("/prodotti/ricercatradatadiscadenzagreaterthan")
    public List<Prodotto> ricercaProdottiTraDateDiScadenzaPiùGrandeDi(
            @RequestParam(name = "scadenzapiùgrandedi") @DateTimeFormat(pattern = "dd-MM-yyyy")
                    Date scadenzaPiùGrandeDi
    ){
        return repository.findByDataDiScadenzaGreaterThan(scadenzaPiùGrandeDi);
    }
    @GetMapping("/prodotti/ricercatradatadiscadenzalessthan")
    public List<Prodotto> ricercaProdottiTraDateDiScadenzaPiùPiccoloDi(
            @RequestParam(name = "scadenzapiùpiccolodi") @DateTimeFormat(pattern = "dd-MM-yyyy")
                    Date scadenzaPiùPiccoloDi
    ){
        return repository.findByDataDiScadenzaLessThan(scadenzaPiùPiccoloDi);
    }
    @GetMapping("/prodotto/ricercabyprezzo")
    public List<Prodotto> ricercaProdottoConPrezzo(
            @RequestParam(name = "prezzomin") float prezzoMin,
            @RequestParam(name = "prezzomax") float prezzoMax
    ){
        return repository.findByPrezzoBetween(prezzoMin, prezzoMax);
    }
    @GetMapping("/prodotto/ricercabyprezzomax")
    public List<Prodotto> ricercaProdottoConPrezzoMassimo(
            @RequestParam(name = "prezzomax") float prezzoMax
    ){
        return repository.findByPrezzoLessThan(prezzoMax);
    }
    @GetMapping("/prodotto/ricercabyprezzomin")
    public List<Prodotto> ricercaProdottoConPrezzoMinimo(
            @RequestParam(name = "prezzomin") float prezzoMin
    ){
        return repository.findByPrezzoGreaterThan(prezzoMin);
    }

    @GetMapping("/prodotto/ricercabyranking")
    public List<Prodotto> ricercaProdottoConRanking(
            @RequestParam(name = "min") float min,
            @RequestParam(name = "max") float max
    ){
        return repository.findByRankingBetween(min, max);
    }
    @GetMapping("/prodotto/ricercabyrankingmax")
    public List<Prodotto> ricercaProdottoConRankingMax(
            @RequestParam(name = "max") float max
    ){
        return repository.findByRankingLessThan(max);
    }
    @GetMapping("/prodotto/ricercabyrankingmin")
    public List<Prodotto> ricercaProdottoConRankingMin(
            @RequestParam(name = "min") float min
    ){
        return repository.findByRankingGreaterThan(min);
    }

    @PostMapping("/caricafile")
    public String caricaFile (@RequestParam("file") MultipartFile file){
        String conFormat = String.format("%s-%s", file.getOriginalFilename(), file.getContentType());
        logger.info(conFormat);
        return conFormat;
    }
}
