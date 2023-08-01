import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    Implementare una classe GroceryList che rappresenta una lista della spesa.
    La classe, oltre al costruttore ed eventuali setter/getter, deve fornire i seguenti metodi:
    addItem(Product): aggiunge il Product alla lista della spesa.
    addItem(Product[]): aggiunge tutti i Product alla lista della spesa.
*/
public class GroceryList {
    private List<Product> groceryList;

    public GroceryList () {
        this.groceryList = new ArrayList<>();
    }

    public void addItem (Product newProduct) {
        groceryList.add(newProduct);
    }

    public void addItem (Product[] newProducts) {
        for (Product product : newProducts) {
            groceryList.add(product);
        }
    }
}
