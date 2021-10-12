public class Customer {
    public String name;
    public String size;

    private Clothing[] items;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setSize(int size){
        switch (size) {
            case 1:
            case 2:
            case 3:
                setSize("S");
                break;
            case 4:
            case 5:
            case 6:
                setSize("M");
                break;
            case 7:
            case 8:
            case 9:
                setSize("L");
                break;
            default:
                setSize("XL");
        }
    }

    public double getTotalClothingCost() {
        double total = 0.0;
        for (Clothing item : items){
            total = total + item.getPrice();
        }
        return total;
    }

    public void addItems(Clothing[] someItems) {
        items = someItems;
    }

    public Clothing[] getItems() {
        return items;
    }
}
