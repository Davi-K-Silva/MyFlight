import java.time.Duration;
import java.time.LocalDateTime;


public class VooDireto extends Voo{
    private Rota rota;
    private Duration duracao;

    public VooDireto(LocalDateTime datahora, Rota rota){
        super(datahora);
        this.rota = rota;
        double distancia = Geo.distancia(rota.getOrigem().getLoc(), rota.getDestino().getLoc());
        double tempo = (distancia / 805) * 60;
        this.duracao = Duration.ofMinutes((int)tempo + 30);
    }

    public Duration getDuracao() {
        return duracao;
    }

    public Rota getRota() {
        return rota;
    }

    @Override
    public String toString() {
        return String.format("Voo: %s %s %s min",getDatahora(), getRota(), getDuracao().toMinutes());
    }

}
