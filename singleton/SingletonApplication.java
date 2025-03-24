import java.lang.reflect.Constructor;

public class SingletonApplication {
    public static void main(String[] args) throws Exception {
        // BIEN
        DbConnection dbc1 = DbConnection.getInstance();
        DbConnection dbc2 = DbConnection.getInstance();

        // PAS BIEN
        Constructor<DbConnection> ctor = DbConnection.class.getDeclaredConstructor();

        ctor.setAccessible(true);

        DbConnection dbc3 = ctor.newInstance();

        dbc1.connect();

        System.out.println(dbc1 == dbc2);
        System.out.println(dbc1 == dbc3);
    }
}
