package Products;
import java.util.Objects;

public class Product {
    public Object getName() {
        return null;
    }

    public void setChecked() {
    }

    public float getPrice() {
        return 0;
    }

    public class product {
        private final String name;
        private final float price;
        private final int quantity;
        private boolean checked;

        public product(String name, float price, int quantity) {
            if (name == null || name.isBlank() || price < 0 || quantity < 0) {
                throw new IllegalArgumentException("Заполните карточку товара полностью");
            }
            this.name = name;
            this.price = price;
            this.quantity = quantity;
            this.checked = false;
        }

        public String getName() {
            return name;
        }

        public float getPrice() {
            return price;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setChecked() {
            this.checked = true;
        }

        public boolean isChecked() {
            return checked;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            product product = (Product.product) o;
            return Objects.equals(name, product.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }

        @Override
        public String toString() {
            String checkedString = this.isChecked() ? "Да" : "Нет";
            return name +
                    " - цена: " + price +
                    ", количество: " + quantity +
                    ", куплен: " + checked;
        }
    }

}
