import java.time.LocalDateTime;
import java.time.Duration;

public class Voo {
    public enum Status { CONFIRMADO, ATRASADO, CANCELADO };

    private LocalDateTime datahora;
    private Duration duracao;
    private Rota rota;
    private Status status;

    public Voo(LocalDateTime datahora, Duration duracao, Rota rota, Status status) {
        this.datahora = datahora;
        this.duracao = duracao;
        this.rota = rota;
        this.status = status;
    }

    public Voo( Duration duracao, Rota rota, Status status) {
        this.datahora = LocalDateTime.of(2016,8, 12, 12, 0);
        this.duracao = duracao;
        this.rota = rota;
        this.status = status;
    }

    public LocalDateTime getDatahora() {
        return datahora;
    }

    public Duration getDuracao() {
        return duracao;
    }

    public Rota getRota() {
        return rota;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Voo{ " + status + " " + datahora + " " + duracao + " " + rota;
    }
}
