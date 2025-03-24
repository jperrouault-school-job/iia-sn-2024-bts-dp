public class MusicienFactory {
    public static Musicien createGuitariste() {
        Guitariste guitariste = new Guitariste(InstrumentFactory.createInstrumentGuitariste());

        // Si on utilise le setter
        // guitariste.setInstrument(InstrumentFactory.createInstrumentGuitariste());

        return guitariste;
    }
}
