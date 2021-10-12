public class Customer {
    public String name;
    public String size;

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

    public String getTotalClothingCost() {
        return null;
    }

    public void addItems(Clothing[] items) {

    }

    public Clothing[] getItems() {
        return null;
    }
}
