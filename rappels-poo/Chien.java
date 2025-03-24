public class Chien extends Animal implements Chasseur {
    @Override
    public void dormir() {
        System.out.println("Le chien dort ...");
    }

    @Override
    public void chasser(Proie proie) {
        
    }
}
