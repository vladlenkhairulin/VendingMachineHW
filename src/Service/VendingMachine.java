package Service;
import Domain.Product;

import java.util.List;

public class VendingMachine {
    private List<Product> listProduct;

    public VendingMachine(List<Product> listProduct) {
    ;
        this.listProduct = listProduct;
    }

    public List<Product> getListProduct() {
        return listProduct;
    }
}
