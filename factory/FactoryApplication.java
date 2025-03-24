public class FactoryApplication {
    public static void main(String[] args) {
        DbConfig dbconfig = new DbConfig();

        dbconfig.setHost("127.0.0.1");
        dbconfig.setPort(3308);
        dbconfig.setDbname("iia_sn");
        dbconfig.setUsername("root");

        String mysqlCS = ConnectionStringFactory.create("mysql", dbconfig);
        String pgsqlCS = ConnectionStringFactory.create("pgsql", dbconfig);

        // mysql://host:port/dbname
        System.out.println(mysqlCS);

        // pgsql://host:port/dbname
        System.out.println(pgsqlCS);
    }
}
