import java.util.Set;

public class Main {
    public static void main(String[] args) throws ProductAlreadyExistException {
        ProductList products = new ProductList();
        RecipeList fishRecipes = new RecipeList();

        Product banana = new Product("Банан", 32.0, 3);
        Product fish = new Product("Рыба", 420.0, 2);
        Product egg = new Product("Яйца", 50.0, 2);
        Product milk = new Product("Молоко", 36.0,2);
        products.addProduct(banana);
        products.addProduct(fish);
        products.addProduct(egg);
        products.addProduct(milk);
        System.out.println(products);
//        products.addProduct(banana);
        products.checkProduct(fish.getName());
        products.removeProduct(banana.getName());
        System.out.println(products);
        Recipe fishPie = new Recipe("Рыбный пирог", products.getProducts());
        fishRecipes.addRecipe(fishPie);
        System.out.println(fishRecipes);

    }
}