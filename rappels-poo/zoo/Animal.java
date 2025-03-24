public abstract class Animal {
    private String nom;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public Animal(String nom) {
        this.nom = nom;
        System.out.println("CREATION D'UN ANIMAL");
    }

    public void manger() {
        System.out.println("L'animal mange ...");
    }

    public abstract void dormir();


    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + this.nom;
    }
}
