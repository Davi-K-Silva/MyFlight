import java.time.LocalDate;
import java.util.ArrayList;

public class GerenciadorVoos {
    private ArrayList<Voo> voos ;
    private static GerenciadorVoos instance;

    private GerenciadorVoos(){
        voos = new ArrayList<>();
    }

    public static GerenciadorVoos getInstance() {
        if (instance == null) {
            instance = new GerenciadorVoos();
        }
        return instance;
    }

    public void adicionar(Voo voo){
        voos.add(voo);
    }

    public ArrayList<Voo> listarTodos() {
        return voos;
    }

    public ArrayList<Voo> buscarData(LocalDate data){
        ArrayList<Voo> voosD = new ArrayList<>();
        for ( Voo voo : voos){
            if (voo.getDatahora().equals(data)){
                voosD.add(voo);
            }
        }
        return voosD;
    }

}
