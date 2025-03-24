public class Chat extends Animal implements Chasseur, Proie {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public Chat(String nom) {
        super(nom);
        System.out.println("CREATION D'UN CHAT");
    }

    @Override
    public void manger() {
        System.out.println("Le chat mange ...");
        super.manger();
    }

    @Override
    public void dormir() {
        System.out.println("Le chat dort encore dans une position cheloue ...");
    }

    @Override
    public void chasser(Proie proie) {
        System.out.println("Le chat chasse la proie " + proie);
        proie.mourir(this);
    }

    @Override
    public void mourir(Chasseur chasseur) {
        System.out.println("Le chat s'est fait chassé!");
    }
}
