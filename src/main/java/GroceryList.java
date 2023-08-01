import java.util.List;

public class GroceryList {

    private List<Product> items;

    public void addItem(Product item){
      items.add(item);
    }

    public void addItem(Product[] products){
        for(int i = 0; i < products.length; i++){
            Product product = products[i];
            this.addItem(product);
        }
    }


}
