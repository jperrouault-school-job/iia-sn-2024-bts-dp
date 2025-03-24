public class Guitariste implements Musicien {
    private Instrument instrument; // L'instance d'instrument n'est pas gérée par le musicien, ce n'est pas son rôle

    @Override
    public void jouer() {
        System.out.println("Le guitariste joue ... " + this.instrument);
    }
}
