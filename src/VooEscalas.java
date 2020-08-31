import java.time.Duration;
import java.time.LocalDateTime;

public class VooEscalas extends Voo{
    private Rota rotaFinal;

    public VooEscalas(LocalDateTime datahora, Duration duracao, Rota rota, Rota rotafinal, Status status){
        super(datahora, duracao, rota, status);
        this.rotaFinal = rotafinal;
    }

    public Rota getRotaFinal() { return rotaFinal; }

    @Override
    public String toString() {
        return super.toString() + " -> " + rotaFinal;
    }

}
