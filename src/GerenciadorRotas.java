import java.time.LocalDate;
import java.util.ArrayList;

public class GerenciadorRotas{
    private ArrayList<Rota> rotas;
    private static GerenciadorRotas instance;

    private GerenciadorRotas() {
        rotas = new ArrayList<>();
    }

    public static GerenciadorRotas getInstance(){
        if(instance == null){
            instance = new GerenciadorRotas();
        }
        return instance;
    }

    public void adicionar(Rota rota){
        rotas.add(rota);
    }

    public ArrayList<Rota> listarTodos() {
        return rotas;
    }

    public ArrayList<Rota> buscarPorOrigem(Aeroporto orig){
        ArrayList<Rota> rotasO = new ArrayList<>();
        for ( Rota rota : rotas ){
            if(rota.getOrigem().getCodigo() == orig.getCodigo()) {
                rotasO.add(rota);
            }
        }
        return rotasO;
    }
}