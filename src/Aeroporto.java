public class Aeroporto {
    private String codigo;
    private String nome;
    private Geo loc;

    public Aeroporto(String codigo, String nome, Geo loc) {
        this.codigo = codigo;
        this.nome = nome;
        this.loc = loc;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public Geo getLoc() {
        return loc;
    }

    public class Geo {
        private double latitude;
        private double longitude;

        public double getLatitude() {
            return latitude;
        }

        public double getLongitude() {
            return longitude;
        }
    }
}


