public class Main {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        // Testando os métodos do reprodutor musical
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica("Like a Stone - AudioSlave");

        // Testando os métodos do aparelho telefônico
        meuIphone.ligar("123-456-7890");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando os métodos do navegador na internet
        meuIphone.exibirPagina("http://www.example.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
