public class Dogs extends Animal{

    private int age=0;

    public int getAge() {
        return age;
    }

    public void changeAge(int age) {
        this.age = age;
    }

    public Dogs(){

    }

    public Dogs(String name, String food, int age){
        super(name, food);
        changeAge(age);
    }


    public void walkAround() {
        System.out.println(this.getName() + " walks around.");
    }

    public void greets(Dogs anotherDog){
        System.out.println(this.getName() + " Greats " + anotherDog.getName());
    }
    public void urinate(){
        System.out.println(this.getName() + " is urinating.");
    }
}
