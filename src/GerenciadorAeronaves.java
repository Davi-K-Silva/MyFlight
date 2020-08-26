import java.util.ArrayList;

public class GerenciadorAeronaves {
    private ArrayList<Aeronave> aeronaves;
    private static GerenciadorAeronaves instance;

    private GerenciadorAeronaves(){
        aeronaves = new ArrayList<>();
    }

    public static GerenciadorAeronaves getInstace(){
        if (instance == null ){
            instance = new GerenciadorAeronaves();
        }
        return instance;
    }

    public void adicionar(Aeronave aviao){
        aeronaves.add(aviao);
    }

    public ArrayList<Aeronave> listarTodas() {
        return aeronaves;
    }

    public Aeronave buscarPorCodigo(String cod){
        Aeronave oAviao = null;
        for(Aeronave aviao: aeronaves){
            if(aviao.getCodigo() == cod){
                oAviao = aviao;
            }
        }
        return oAviao;
    }
}

