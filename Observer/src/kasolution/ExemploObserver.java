package kasolution;

public class ExemploObserver {
    public static void main(String[] args) {
        Mensageiro mensageiro = new Mensageiro();

        Usuario usuario1 = new Usuario("João");
        Usuario usuario2 = new Usuario("Maria");

        mensageiro.adicionarObservador(usuario1);
        mensageiro.adicionarObservador(usuario2);

        mensageiro.receberMensagem("Olá! Nova mensagem!");

        mensageiro.removerObservador(usuario1);

        mensageiro.receberMensagem("Uma mensagem importante!");

        // Saída:
        // Nova mensagem recebida: Olá! Nova mensagem!
        // João recebeu a notificação: Olá! Nova mensagem!
        // Maria recebeu a notificação: Olá! Nova mensagem!
        // Nova mensagem recebida: Uma mensagem importante!
        // Maria recebeu a notificação: Uma mensagem importante!
    }
}

