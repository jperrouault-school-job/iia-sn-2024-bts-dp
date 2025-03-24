
public class Application {
    // psvm
    public static void main(String[] args) {
        // sout
        // sysout
        System.out.println("Hello world!");

        String chaine = "test";
        int a = 0;
        Integer b = 6;

        Chat albert = new Chat("Albert");
        // Animal lanimal = new Animal();

        albert.dormir();
        albert.manger();

        // // albert.nom = "Albert";
        // albert.setNom("Albert");
        // // albert.age = -100;
        // albert.setAge(-100);

        // // System.out.println("Le chat s'appelle " + albert.nom);
        // System.out.println("Le chat s'appelle " + albert.getNom());
        
        String ss = "A";
        char sss = 'A' + 'B';
        char ssss = 97;

        int aa = 13;
        int aaa = 013;
        int aaaa = 0x13;
        int aaaaa = 0b11;
        
        System.out.println(aa);
        System.out.println(aaa);
        System.out.println(aaaa);
        System.out.println(aaaaa);

        Chat tom = new Chat("Tom");
        Souris jerry = new Souris("Jerry");

        System.out.println(tom);

        tom.chasser(jerry);
    }
}