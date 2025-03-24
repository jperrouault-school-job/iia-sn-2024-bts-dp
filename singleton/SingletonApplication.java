public class SingletonApplication {
    public static void main(String[] args) {
        DbConnection dbc1 = DbConnection.getInstance();
        DbConnection dbc2 = DbConnection.getInstance();

        dbc1.connect();

        System.out.println(dbc1 == dbc2);
    }
}
