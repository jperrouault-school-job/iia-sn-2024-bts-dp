
public class Application {
    // psvm
    public static void main(String[] args) {
        // sout
        // sysout
        System.out.println("Hello world!");

        String chaine = "test";
        int a = 0;
        Integer b = 6;

        Chat albert = new Chat();
        // Animal lanimal = new Animal();

        albert.dormir();
        albert.manger();

        // // albert.nom = "Albert";
        // albert.setNom("Albert");
        // // albert.age = -100;
        // albert.setAge(-100);

        // // System.out.println("Le chat s'appelle " + albert.nom);
        // System.out.println("Le chat s'appelle " + albert.getNom());
        

        Chat tom = new Chat();
        Souris jerry = new Souris();

        System.out.println(tom);

        tom.chasser(jerry);
    }
}