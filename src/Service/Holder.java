package Service;
import Domain.Product;
import java.util.List;

/**
 * Класс для принятия денежных средств от покупателя
 */
public class Holder {
    private final List<Product> products;

    public Holder(List<Product> products) {
       this.products = products;
    }

    public double validateProduct(int productNumber) { /* получаем цену товара по номеру, если такой товар есть в автомате */
        if (productNumber < 1 || productNumber > products.size()) {
            return -1; // Возврат отрицательного значения для обозначения ошибки
        }
        return products.get(productNumber - 1).getPrice();
    }

    public boolean takePayment(double payment, double price) {
        if (payment >= price) {
            System.out.println("Получено: " + price);
            return true;
        } else {
            System.out.println("Недостаточно средств. Пожалуйста, введите достаточную сумму.");
            return false;
        }
    }
}
