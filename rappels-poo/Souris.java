public class Souris extends Animal implements Proie {
    @Override
    public void dormir() {
        System.out.println("La souris dort ...²");
    }

    @Override
    public void mourir(Chasseur chasseur) {
        System.out.println("La souris se fait chasser par " + chasseur.getClass().getSimpleName());
    }

    @Override
    public String toString() {
        return "Une souris";
    }
}
