package EjercicioED.EjercicioEntornos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CursoTest {

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
	 * Comprueba que el método getNombre devuelve correctamente
	 * el nombre del curso asignado en el constructor.
	 */
	@Test
	final void testGetNombre() {
        Curso curso = new Curso("DAW");

        assertEquals("DAW", curso.getNombre());
    }
	
	/**
	 * Comprueba que el objeto Curso se crea correctamente
	 * y que su representación en texto no es nula.
	 */
	@Test
	final void testCurso() {
	      Curso curso = new Curso("DAW");

	        assertNotNull(curso);
	        assertTrue(curso.toString().contains("DAW"));
	    }
}