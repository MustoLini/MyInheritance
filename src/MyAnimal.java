public class MyAnimal {
    public static void main(String[] args) {
        Animal genericAnimal= new Animal();
        Cats genericCat= new Cats("Kalle", "Tuna", "Boll");
        genericCat.walkAround();
        System.out.println(genericCat.getName());
        genericAnimal.walkAround();
        System.out.println(genericAnimal.getName());

        Dogs ne= new Dogs("Jojo", "Ro", 19);
        ne.changeName("rono");
        System.out.println(ne.getName());


        Animal moris= new Cats("Morris" , "Sushi", "Rubber mouse");
        System.out.println(moris.getName());
        System.out.println(moris.getFood());
        System.out.println(((Cats) moris).getToy());

        acceptAnimal(moris);
    }
    public static void acceptAnimal(Animal randAnimal){
        System.out.println(randAnimal.getName());

        randAnimal.walkAround();
        Cats tempCat= (Cats) randAnimal;
        System.out.println(tempCat.getToy());
        System.out.println(tempCat.getName());

    }
}
