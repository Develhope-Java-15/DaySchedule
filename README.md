È possibile aggiungere ad ogni classe esistenti eventuali metodi ed attributi, oltre a quelli esplicitati, richiesti per lo svolgimento dei seguenti esercizi.

1. Implementare una classe Product avente i seguenti attributi:
    - name: String
    - quantity: int

2. Implementare una classe GroceryList che rappresenta una lista della spesa.  La classe, oltre al costruttore ed eventuali setter/getter, deve fornire i seguenti metodi:
   - addItem(Product): aggiunge il Product alla lista della spesa.
   - addItem(Product[]): aggiunge tutti i Product alla lista della spesa.

3. Scrivere un metodo main(...) che chiede all'utente, in un loop, quale delle seguenti azioni vuole compiere:
    - Stampare a schermo la lista della spesa
    - Aggiungere un elemento dalla lista della spesa
        - Consiglio: chiedere gli attributi di Product ad uno ad uno allo Scanner
    - Rimuovere un elemento dalla lista della spesa
        - Va chiesto solo il nome del Product da rimuovere, e rimuovere da GroceryList tutti i prodotti che contengono la stringa data in input dall'utente
   - Verificare se un nella lista della spesa è presente almeno un prodotto che contiene una stringa, chiesta in input all'utente.
   - Svuotare la lista della spes
