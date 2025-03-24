public class DbConnection {
    // private static DbConnection instance = new DbConnection();
    private static DbConnection instance;

    private DbConnection() { }

    public static DbConnection getInstance() {
        if (instance == null) {
            instance = new DbConnection();
        }

        return instance;
    }

    public void connect() {
        System.out.println("Connexion ... OK !");
    }
}
