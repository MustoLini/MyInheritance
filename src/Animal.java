public class Animal { // Super Class
    private String name = "Animal";
    private String food = "Food";

    public void changeFood(String food) {
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    protected final void changeName(String newName) {
        this.name = newName;
    }

    protected final String getName() {
        return this.name;
    }

    public void eatStuff(){
        System.out.println("Yam "  +  this.food);
    }

    public void walkAround(){
        System.out.println(this.name + " walks around." );
    }

    public Animal(){
        //Generic Constructor
    }

    public Animal(String name, String food){
        changeFood(food);
        this.changeName(name);

    }
}
