package exception;

public class MenosDeQuatroItensException extends RuntimeException {
	
	public MenosDeQuatroItensException(String mensagem) {
        super("CLASSE: " + mensagem);
    }
}
