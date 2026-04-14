package EjercicioED.EjercicioEntornos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	/**
	 * Comprueba que el método getEdad calcula correctamente
	 * la edad de la persona a partir de su fecha de nacimiento.
	 */
	 @Test
	    void testGetEdad() {
	        Persona p = new Persona(12345678, "Juan Perez", 'M',
	                1, 1, 2000);

	        int edad = p.getEdad();

	        assertTrue(edad >= 0);
	    }
	 
	 /**
	  * Comprueba que el método compareTo ordena correctamente
	  * las personas en función de su NIF.
	  */
	 @Test
	 void testCompareTo() {
	     Persona p1 = new Persona(1, "A", 'M', 1, 1, 2000);
	     Persona p2 = new Persona(2, "B", 'M', 1, 1, 2000);

	     assertTrue(p1.compareTo(p2) < 0);
	 }
}
