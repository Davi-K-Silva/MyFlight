import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class VooVariasEscalas extends Voo{
    private ArrayList<Rota> escalas;

    public VooVariasEscalas ( Rota rota, ArrayList<Rota> escalas , LocalDateTime datahora, Duration duracao, Status status) {
        super(datahora, duracao, rota, status);
        this.escalas = escalas;
    }

    public ArrayList<Rota> getEscalas(){
        return escalas;
    }

    @Override
    public String toString() {
        String Escalas = "";
        for( Rota escala: escalas){
            Escalas += " -> " + escala;
        }
        return super.toString() + Escalas ;
    }
}
