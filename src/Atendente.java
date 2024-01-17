import java.util.LinkedList;
import java.util.Queue;
// Classe Atendente
public class Atendente {
    Queue<Comando> filaComandos = new LinkedList<>();

    public void adicionarComando(Comando comandoAdicionarPizza) {
        filaComandos.add(comandoAdicionarPizza);
    }

    public void processarPedidos() {
        while (!filaComandos.isEmpty()) {
            Comando comando = filaComandos.poll();
            comando.executar();
        }
    }
}
