public class ProductAlreadyExistException extends Exception{

    public ProductAlreadyExistException() {
      }

    ProductAlreadyExistException(String message) {
            super(message);
        }
    }


