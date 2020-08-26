import java.util.ArrayList;

public class GerenciadorCias {
    private ArrayList<CiaAerea> empresas;
    private static GerenciadorCias instance;

    private GerenciadorCias(){ empresas = new ArrayList<>(); }

    public static GerenciadorCias getInstace(){
        if (instance == null ){
            instance = new GerenciadorCias();
        }
        return instance;
    }

    public void adiconar(CiaAerea cia){
        empresas.add(cia);
    }

    public ArrayList<CiaAerea> listarTodas(){
        return empresas;
    }

    public CiaAerea buscarCodigo(String cod){
        CiaAerea aCia = null;
        for(CiaAerea cia : empresas ){
            if(cia.getCodigo() == cod) {
                aCia = cia;
            }
        }
        return aCia;
    }

    public CiaAerea buscarNome(String cod){
        CiaAerea aCia = null;
        for(CiaAerea cia : empresas ){
            if(cia.getNome() == cod) {
                aCia = cia;
            }
        }
        return aCia;
    }

}
