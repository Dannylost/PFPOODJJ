

package admins;

import crmbenedictoxvi.GrupoEstudio;
import crmbenedictoxvi.Instructor;
import java.util.ArrayList;

public class AdminInstructor {
    public ArrayList<Instructor> tablaInstructor() {     
    
        ArrayList<Instructor> listInstructor = new ArrayList<Instructor>();
        Instructor instructor = new Instructor ("Jose", "Perez");
        listInstructor.add(instructor);
        
        instructor = new Instructor("Pedro", "Lopez");
        listInstructor.add(instructor);
        
        instructor = new Instructor("Ruben", "Maldonado");
        listInstructor.add(instructor);

        instructor = new Instructor("Daniel", "Ramirez");
        listInstructor.add(instructor);
        
        return listInstructor;
        
    }
}
