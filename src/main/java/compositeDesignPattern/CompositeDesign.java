package compositeDesignPattern;


public class CompositeDesign {
    public static void main(String[] args) {

        Component hd = new Leaf(4000, "Drive");
        Component mouse = new Leaf(400, "mouse");
        Component monitor = new Leaf(8000, "monitor");
        Component ram = new Leaf(2000, "ram");
        Component cpu = new Leaf(3000, "cpu");


        Composite ph = new Composite("pheri");
        Composite cabinet = new Composite("cabinet");
        Composite mb = new Composite("mb");
        Composite computer = new Composite("computer");

        ph.setComponents(monitor);
        ph.setComponents(mouse);

        mb.setComponents(cpu);
        mb.setComponents(ram);

        cabinet.setComponents(hd);
        cabinet.setComponents(mb);
        computer.setComponents(cabinet);
        computer.setComponents(ph);

//        leaf node prices
        ram.showPrice();

//        composite node contains composite objects also with same method
        computer.showPrice();

    }
}
