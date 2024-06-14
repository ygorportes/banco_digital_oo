import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contaList = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setContaList(List<Conta> contaList) {
        this.contaList = contaList;
    }

    public void adicionarConta(Conta conta) {
        contaList.add(conta);
    }

    public void removerConta(Conta conta) {
        contaList.remove(conta);
    }
}
