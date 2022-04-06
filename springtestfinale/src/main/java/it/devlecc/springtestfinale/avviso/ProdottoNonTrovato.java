package it.devlecc.springtestfinale.avviso;


public class ProdottoNonTrovato extends RuntimeException {
    public ProdottoNonTrovato(Long id){
        super("Prodotto non Trovato "+ id);
    }
}
