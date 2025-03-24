public class Guitariste implements Musicien {
    private Instrument instrument; // L'instance d'instrument n'est pas gérée par le musicien, ce n'est pas son rôle

    // Soit le constructeur
    public Guitariste(Instrument instrument) {
        this.instrument = instrument;
    }

    // Sinon le setter
    public Guitariste() { }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    @Override
    public void jouer() {
        System.out.println("Le guitariste joue ... " + this.instrument);
    }
}
