package excepciones;

public class OperacionExcepcion extends RuntimeException/*Exception*/{
    public OperacionExcepcion(String mensaje){
        super(mensaje);
    }
}
