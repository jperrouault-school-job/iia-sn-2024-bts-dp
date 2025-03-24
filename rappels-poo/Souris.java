public class Souris extends Animal implements Proie {
    public Souris(String nom) {
        super(nom);
    }

    @Override
    public void dormir() {
        System.out.println("La souris dort ...²");
    }

    @Override
    public void mourir(Chasseur chasseur) {
        System.out.println("La souris se fait chasser par " + chasseur);
    }
}
