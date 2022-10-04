package datos;

import domain.*;
import java.sql.SQLException;
import java.util.*;

public interface PersonaDAO {
    
    public List<PersonaDTO> seleccionar() throws SQLException;
    
    public int insertar(PersonaDTO persona) throws SQLException;
    
    public int actualizar(PersonaDTO persona) throws SQLException;
    
    public int eliminar(PersonaDTO persona) throws SQLException;
}
