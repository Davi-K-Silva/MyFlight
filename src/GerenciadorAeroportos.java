import java.util.ArrayList;

public class GerenciadorAeroportos {
    private ArrayList<Aeroporto> aeroportos;
    private static GerenciadorAeroportos instance;

    private GerenciadorAeroportos() {
        aeroportos = new ArrayList<>();
    }

    public static GerenciadorAeroportos getInstace(){
        if (instance == null ){
            instance = new GerenciadorAeroportos();
        }
        return instance;
    }

    public void adicionar(Aeroporto aero){
        aeroportos.add(aero);
    }

    public ArrayList<Aeroporto> listarTodos(){
        return aeroportos;
    }

    public Aeroporto buscarPorCodigo(String cod){
        Aeroporto oAero = null;
        for(Aeroporto aero: aeroportos){
            if (aero.getCodigo() == cod) {
                oAero = aero;
            }
        }
        return  oAero;
    }
}