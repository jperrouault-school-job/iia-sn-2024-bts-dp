public class DbConfig {
    private String host;
    private int port;
    private String dbname;
    private String username;

    public DbConfig(String host, int port, String username, String dbname) {
        this.host = host;
        this.port = port;
        this.dbname = dbname;
        this.username = username;
    }

    public DbConfig() { }

    @Override
    public String toString() {
        return "DbConfig [host=" + host + ", port=" + port + ", dbname=" + dbname + ", username=" + username + "]";
    }

    public static DbConfigBuilderV1 builderV1() {
        return new DbConfigBuilderV1();
    }

    public static DbConfigBuilderV2 builderV2() {
        return new DbConfigBuilderV2();
    }

    static class DbConfigBuilderV1 {
        private DbConfig instance = new DbConfig();

        public DbConfigBuilderV1 host(String host) {
            this.instance.host = host;
            return this;
        }

        public DbConfigBuilderV1 port(int port) {
            this.instance.port = port;
            return this;
        }

        public DbConfigBuilderV1 dbname(String dbname) {
            this.instance.dbname = dbname;
            return this;
        }

        public DbConfigBuilderV1 username(String username) {
            this.instance.username = username;
            return this;
        }

        public DbConfig build() {
            return this.instance;
        }
    }
    
    static class DbConfigBuilderV2 {
        private String host;
        private int port;
        private String dbname;
        private String username;

        public DbConfigBuilderV2 host(String host) {
            this.host = host;
            return this;
        }

        public DbConfigBuilderV2 port(int port) {
            this.port = port;
            return this;
        }

        public DbConfigBuilderV2 dbname(String dbname) {
            this.dbname = dbname;
            return this;
        }

        public DbConfigBuilderV2 username(String username) {
            this.username = username;
            return this;
        }

        public DbConfig build() {
            return new DbConfig(host, port, username, dbname);
        }
    }
}
