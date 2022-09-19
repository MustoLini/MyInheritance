public class Cats extends Animal { // extends ==  Inherits Super Class
    private String toy = "Yarn";

    public void changeToy(String toy) {
        this.toy = toy;
    }

    public void playWithToy() {
        System.out.println("Likes to play " + this.toy);

    }

    public void walkAround() {
        System.out.println(this.getName() + " stalks around.");
    }

    public String getToy() {
        return this.toy;
    }

    public Cats() {
        // Generic
    }

    public Cats(String name, String food, String toy) {
        super(name, food);
        changeToy(toy);
    }
}
