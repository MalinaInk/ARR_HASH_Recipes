import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ProductList {
    private final Set<Product> products = new HashSet<>();

    public Set<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) throws ProductAlreadyExistException {
        if (product == null) {
            return;
        }
//Set не выкидывает исключений, добавляет последний на место существующего.
//Самостоятельно прописываем исключение
        if (this.products.contains(product)) {
            throw new ProductAlreadyExistException("Такой продукт уже существует");
        } else {
            this.products.add(product);
        }
    }

    public void checkProduct(String name) {
        for (Product product : this.products) {
            if (product.getName().equals(name)) {
                product.setChecked();
                break;
            }
        }
    }

    //Удаление через создание итератора и использование в цикле для перебора
    public void removeProduct(String name) {
        Iterator<Product> productsIterator = this.products.iterator();
        while (productsIterator.hasNext()) {
            if (productsIterator.next().getName().equals(name)) {
                productsIterator.remove();
                break;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список продуктов:").append('\n');
        for (Product product : this.products) {
            stringBuilder.append(product).append('\n');
        }
        return stringBuilder.toString();
    }
}
