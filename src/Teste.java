import java.time.LocalDateTime;
import java.time.Duration;

public class Teste {
    public static void main(String[] args){
        cadastrarTeste();
;
    }

    public static void cadastrarTeste(){
        CiaAerea cia1 =  new CiaAerea("JJ", "LATAM Linhas Aéreas");
        CiaAerea cia2 =  new CiaAerea("G3", "Gol Linhas Aéreas SA");
        CiaAerea cia3 =  new CiaAerea("TP", "TAP Portugal");
        CiaAerea cia4 =  new CiaAerea("AD", "Azul Linhas Aéreas");
        GerenciadorCias gc = GerenciadorCias.getInstace();
        gc.adicionar(cia1); gc.adicionar(cia2); gc.adicionar(cia3); gc.adicionar(cia4);

        Aeronave a1 = new Aeronave("733", "Boeing 737-300", 140);
        Aeronave a2 = new Aeronave("73G", "Boeing 737-700", 126);
        Aeronave a3 = new Aeronave("380", "Airbus Industrie A380", 644);
        Aeronave a4 = new Aeronave("764", "Boeing 767-400", 304);
        GerenciadorAeronaves ga = GerenciadorAeronaves.getInstace();
        ga.adicionar(a1); ga.adicionar(a2); ga.adicionar(a3); ga.adicionar(a4);

        Geo geo1 = new Geo(-29.9939, -51.1711);
        Geo geo2 = new Geo(-23.4356, -46.4731);
        Geo geo3 = new Geo(38.7742, -9.1342);
        Geo geo4 = new Geo(25.7933, -80.2906);
        Aeroporto arpt1 = new Aeroporto("POA", "Salgado Filho Intl Apt", geo1);
        Aeroporto arpt2 = new Aeroporto("GRU", "São Paulo Guarulhos Intl Apt", geo2);
        Aeroporto arpt3 = new Aeroporto("LIS", "Lisbon", geo3);
        Aeroporto arpt4 = new Aeroporto("MIA", "Miami International Apt", geo4);
        GerenciadorAeroportos garpt = GerenciadorAeroportos.getInstace();
        garpt.adicionar(arpt1); garpt.adicionar(arpt2); garpt.adicionar(arpt3); garpt.adicionar(arpt4);

        Rota r1 = new Rota(cia2, arpt2, arpt1, a1);
        Rota r2 = new Rota(cia2, arpt1, arpt2, a2);
        Rota r3 = new Rota(cia3, arpt4, arpt3, a3);
        Rota r4 = new Rota(cia1, arpt3, arpt4, a4);
        GerenciadorRotas gr = GerenciadorRotas.getInstance();
        gr.adicionar(r1); gr.adicionar(r2); gr.adicionar(r3); gr.adicionar(r4);

        LocalDateTime datahora1 = LocalDateTime.of(2020, 8, 10, 8, 0);
        LocalDateTime datahora2 = LocalDateTime.of(2020, 8, 10, 15, 0);
        LocalDateTime datahora3 = LocalDateTime.of(2021, 8, 15, 7, 30);
        LocalDateTime datahora4 = LocalDateTime.of(2021, 8, 16, 18, 0);
        Duration d1 = Duration.ofMinutes(90);
        Duration d2 = Duration.ofMinutes(90);
        Duration d3 = Duration.ofMinutes(530);
        Duration d4 = Duration.ofMinutes(530);
        Voo v1 = new Voo(datahora1, d1, r1, Voo.Status.ATRASADO);
        Voo v2 = new Voo(datahora2, d2, r2, Voo.Status.CONFIRMADO);
        Voo v3 = new Voo(datahora3, d3, r3, Voo.Status.CANCELADO);
        Voo v4 = new Voo(datahora4, d4, r4, Voo.Status.CONFIRMADO);
        GerenciadorVoos gv = GerenciadorVoos.getInstance();
        gv.adicionar(v1); gv.adicionar(v2); gv.adicionar(v3); gv.adicionar(v4);
    }
}
