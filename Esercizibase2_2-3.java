import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Articolo[] articoli = new Articolo[3];

        for (int i=0; i<3; i++) {
            articoli[i] = new Articolo();
            Scanner sc = new Scanner(System.in);

            System.out.println("inserisci codice descrizione e quantità di un articolo");

            String codice = sc.nextLine();
            String descrizione = sc.nextLine();
            int quantita = sc.nextInt();

            articoli[i].setCodice(codice);
            articoli[i].setDescrizione(descrizione);
            articoli[i].setQuantita(quantita);
            articoli[i].setId(i);
            
        }

        

        
        int maxQ = 0;
        int maxQindex = -1;
        
        for (int i=0; i<=articoli.length - 1; i++) {
             
            if (articoli[i].getQuantita() > maxQ ) {
                maxQ = articoli[i].getQuantita();
                maxQindex = i;
            }
            
        };


        System.out.println("L'articolo con quantità maggiore è: \n" + 
        "id: " + articoli[maxQindex].getId() + "\n" + 
        "descrizione: " + articoli[maxQindex].getDescrizione() + "\n" + 
        "quantità: " + articoli[maxQindex].getQuantita() + "\n" + 
        "codice: " + articoli[maxQindex].getCodice());

      



    }
}