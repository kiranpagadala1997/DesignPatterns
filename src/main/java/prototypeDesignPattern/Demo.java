package prototypeDesignPattern;

public class Demo {

    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop b1 = new BookShop();
        b1.setShopName("Universal");
        b1.loadData();


        BookShop b2 = b1.clone();
        b1.getBooks().remove(2);

        System.out.println(b1);
        b2.setShopName("Atlas");
        System.out.println(b2);

    }
}
