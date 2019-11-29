package training.softwire;

public class Main {

    public static void main(String[] args) {
	    Counter<Apple> counter = new Counter<>();
	    counter.add(new Apple());
	    counter.add(new Apple());
        counter.add(new Apple());
        System.out.println("Apple counter: " + counter.getCount());

        Counter<Box<Apple>> boxCounter = new Counter<>();
        Box<Apple> box1 = new Box<>();
        Box<Apple> box2 = new Box<>();

        box1.add(new Apple());
        box1.add(new Apple());
        box1.add(new Apple());
        box2.add(new Apple());
        box2.add(new Apple());

        boxCounter.add(box1);
        boxCounter.add(box2);
        System.out.println("Box counter: " + boxCounter.getCount());

        Counter<Cart> cartCounter = new Counter<>();
        Cart cart = new Cart();
        cart.add(box1);
        cart.add(box2);
        cartCounter.add(cart);
        System.out.println("Cart counter: " + cartCounter.getCount());

    }
}
