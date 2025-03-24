public abstract class Animal {
    public Animal() {
        System.out.println("CREATION D'UN ANIMAL");
    }

    public void manger() {
        System.out.println("L'animal mange ...");
    }

    public abstract void dormir();

}
