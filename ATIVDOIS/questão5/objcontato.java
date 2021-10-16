package Q_05;

public class objcontato {
    public static void main(String[] args) {
        Contato contato = new Contato("Guilherme", "75 9993 5455");    

        contato.enviarMensagem("opa, meu aliado");
        contato.mensagensNLidas();
        contato.ReceberMensagens2("olá, peter.");
        contato.ReceberMensagens2("como vai?");
        contato.ReceberMensagens2("Poderia me tirar uma dúvida?");
        contato.ReceberMensagens2("É em relação a atividade de LP1");
        contato.ReceberMensagens2("Quando tiver tempo, me diz! \n");
        contato.mensagensNLidas();
        contato.mostMens2();
        contato.mensagensNLidas();
        
    }
}
