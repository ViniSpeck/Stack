public class StackTest {
    public static void main(String[] args) {
        Stack<Pancake> s = new ObjectStack<>();

        s.push(new Pancake("Chocolate", 3.1));
        s.push(new Pancake("Vanilla", 3.3));
        s.push(new Pancake("Strawberry", 2.2));

        try {
            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.pop());
        } catch (IndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }

        System.out.println("Fim do Programa!");

    }
}
