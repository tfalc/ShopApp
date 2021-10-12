public class Clothing implements Comparable<Clothing>{
        private String description;
        private double price;
        private String size = "M";
        public final static Integer minPrice = 10;
        public final static double minTax = 0.2;

        public Clothing(String description, double price, String size) {
                this.description = description;
                this.price = price;
                this.size = size;
        }

        public String getDescription() {
                return description;
        }

        public void setDescription(String description) {
                this.description = description;
        }

        public double getPrice() {
                return price + (price * minTax);
        }

        public void setPrice(double price) {
                this.price = (price > minPrice) ? price : minPrice;
        }

        public String getSize() {
                return size;
        }

        public void setSize(String size) {
                this.size = size;
        }

        @Override
        public String toString(){
                return getDescription() + ", " + getSize() + ", " + getPrice();
        }

        @Override
        public int compareTo(Clothing clothing) {
                return this.description.compareTo(clothing.description);
        }
}
