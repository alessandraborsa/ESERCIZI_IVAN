class Articolo {
    private int id, quantita;
    private String codice, descrizione;

    public void setId(int i) { 
        id=i + 1; } 
        
    public int getId() { 
        return id; }

    public void setQuantita(int q) { 
        quantita=q; } 
            
    public int getQuantita() { 
        return quantita; }

    public void setCodice(String c) { 
        codice=c; } 
            
    public String getCodice() { 
        return codice; }

    public void setDescrizione(String d) { 
        descrizione=d; } 
            
    public String getDescrizione() { 
        return descrizione; }
}

