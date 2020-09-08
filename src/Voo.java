import java.time.LocalDateTime;
import java.time.Duration;

public abstract class Voo {
    public enum Status { CONFIRMADO, ATRASADO, CANCELADO };

    private LocalDateTime datahora;
    private Status status;

    public Voo(LocalDateTime datahora) {
        this.datahora = datahora;
    }

    public LocalDateTime getDatahora() {
        return datahora;
    }

    public abstract Duration getDuracao();

    public abstract Rota getRota();


}
