import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class VooEscalas extends Voo{
    private ArrayList<Rota> rotas;
    private Duration duracao;

    public VooEscalas( LocalDateTime datahora) {
        super(datahora);
        this.rotas = new ArrayList<>();
        this.duracao = Duration.ofMinutes(0);
    }

    public Duration getDuracao() {
        return duracao;
    }

    public Rota getRota() {
        return null;
    }

    public ArrayList<Rota> getRotas(){
        return rotas;
    }

    public void adicionarRota(Rota rota) {
        this.duracao = duracao.plusMinutes(calcDuracao(rota));
        rotas.add(rota);
    }

    private int calcDuracao(Rota rota){
        double distancia = Geo.distancia(rota.getOrigem().getLoc(), rota.getDestino().getLoc());
        double tempo = (distancia / 805) * 60;
        return (int)tempo + 30;
    }

    @Override
    public String toString() {
        String Escalas = rotas.get(0).toString();
        for(int i = 1; i < rotas.size(); i++){
            Escalas += " -> " + rotas.get(i);
        }
        return String.format("Voo: %s %s %s min", getDatahora(), Escalas, duracao.toMinutes());
    }
}
