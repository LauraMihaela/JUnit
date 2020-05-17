
package tests;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;
import syspagos.Empleado;
import syspagos.Prima;
import excepciones.*;

public class TestEmpleado

{

	@Test

	public void establecerNumeroDeEmpleadoCorrecto()

	{

		Empleado e = new Empleado();

		try

		{

			e.establecerNumeroEmpleado("4");

		} catch (NumeroEmpleadoException ex)

		{

			fail();

		}

		assertEquals(4, e.getNumeroEmpleado());

	}

	@Test

	public void establecerNumeroDeEmpleadoFail4()

	{

		Empleado e = new Empleado();

		try

		{

			e.establecerNumeroEmpleado("000");

		} catch (NumeroEmpleadoException ex)

		{

			fail();

		}

		assertEquals(4, e.getNumeroEmpleado());

	}

	@Test

	public void establecerNumeroDeEmpleadoFail5()

	{

		Empleado e = new Empleado();

		try

		{

			e.establecerNumeroEmpleado("-105");

		} catch (NumeroEmpleadoException ex)

		{

			fail();

		}

		assertEquals(4, e.getNumeroEmpleado());

	}

	@Test

	public void establecerNumeroDeEmpleadoFail6()

	{

		Empleado e = new Empleado();

		try

		{

			e.establecerNumeroEmpleado("M");

		} catch (NumeroEmpleadoException ex)

		{

			fail();

		}

		assertEquals(4, e.getNumeroEmpleado());

	}

	@Test

	public void establecerNumeroDeEmpleadoFail7()

	{

		Empleado e = new Empleado();

		try

		{

			e.establecerNumeroEmpleado(" ");

		} catch (NumeroEmpleadoException ex)

		{

			fail();

		}

		assertEquals(4, e.getNumeroEmpleado());

	}

	@Test

	public void establecerNumeroDeEmpleadoFail3()

	{

		Empleado e = new Empleado();

		try

		{

			e.establecerNumeroEmpleado("1005");

		} catch (NumeroEmpleadoException ex)

		{

			fail();

		}

		assertEquals(4, e.getNumeroEmpleado());

	}

	@Test

	public void establecerNumeroDeEmpleadoFail2()

	{

		Empleado e = new Empleado();

		try

		{

			e.establecerNumeroEmpleado("10");

		} catch (NumeroEmpleadoException ex)

		{

			fail();

		}

		assertEquals(4, e.getNumeroEmpleado());

	}

	@Test

	public void establecerNombreDeEmpleadoCorrecto()

	{

		Empleado e = new Empleado();

		try

		{

			e.estableceNombreEmpleado("MartaOliva");

		} catch (NombreEmpleadoException ex)

		{

			fail();

		}

		assertEquals("MartaOliva", e.getNombreEmpleado());

	}

	@Test

	public void establecerNombreDeEmpleadoFail9()

	{

		Empleado e = new Empleado();

		try

		{

			e.estableceNombreEmpleado("Marta");

		} catch (NombreEmpleadoException ex)

		{

			fail();

		}

		assertEquals("MartaOliva", e.getNombreEmpleado());

	}

	@Test

	public void establecerNombreDeEmpleadoFail11()

	{

		Empleado e = new Empleado();

		try

		{

			e.estableceNombreEmpleado(" ");

		} catch (NombreEmpleadoException ex)

		{

			fail();

		}

		assertEquals("MartaOliva", e.getNombreEmpleado());

	}

	@Test

	public void establecerNombreDeEmpleadoFail10()

	{

		Empleado e = new Empleado();

		try

		{

			e.estableceNombreEmpleado("105");

		} catch (NombreEmpleadoException ex)

		{

			fail();

		}

		assertEquals("MartaOliva", e.getNombreEmpleado());

	}

	@Test

	public void establecerMesesDeTrabajoCorrecto()

	{

		Empleado d = new Empleado();

		try {

			d.estableceMesesTrabajo("10");

		} catch (MesesTrabajoException e) {

			fail();

		}

		Integer resultado = d.getNumeroEmpleado();

		Integer esperado = Integer.parseInt("10");

		assertEquals(esperado, resultado);

	}

	@Test

	public void estableceMesesTrabajoFail14()

	{

		Empleado e = new Empleado();

		try

		{

			e.estableceMesesTrabajo("0118");

		} catch (MesesTrabajoException ex)

		{

			fail();

		}

		assertEquals(10, e.getMesesTrabajo());

	}

	@Test

	public void estableceMesesTrabajoFail13()

	{

		Empleado e = new Empleado();

		try

		{

			e.estableceMesesTrabajo("1");

		} catch (MesesTrabajoException ex)

		{

			fail();

		}

		assertEquals(10, e.getMesesTrabajo());

	}

	@Test

	public void estableceMesesTrabajoFail15()

	{

		Empleado e = new Empleado();

		try

		{

			e.estableceMesesTrabajo("-41");

		} catch (MesesTrabajoException ex)

		{

			fail();

		}

		assertEquals(10, e.getMesesTrabajo());

	}

	@Test

	public void estableceMesesTrabajoFail16()

	{

		Empleado e = new Empleado();

		try

		{

			e.estableceMesesTrabajo("*");

		} catch (MesesTrabajoException ex)

		{

			fail();

		}

		assertEquals(10, e.getMesesTrabajo());

	}

	@Test

	public void estableceMesesTrabajoFail17()

	{

		Empleado e = new Empleado();

		try

		{

			e.estableceMesesTrabajo(" ");

		} catch (MesesTrabajoException ex)

		{

			fail();

		}

		assertEquals(10, e.getMesesTrabajo());

	}

	
	
	@Test

	public void establecerSerDirectivoCorrecto18()

	{

		Empleado e = new Empleado();

		try

		{

			e.establecerSerDirectivo("+");

		} catch (CargoException ex)

		{

			fail();

		}

		assertEquals(true, e.getDirectivo());

	}
	
	@Test
	public void establecerSerDirectivoCorrecto19()

	{

		Empleado e = new Empleado();

		try

		{

			e.establecerSerDirectivo("-");

		} catch (CargoException ex)

		{

			fail();

		}

		assertEquals(false, e.getDirectivo());

	}

	@Test

	public void establecerSerDirectivoFail20()

	{

		Empleado e = new Empleado();

		try

		{

			e.establecerSerDirectivo("*");

		} catch (CargoException ex)

		{

			fail();

		}

		assertEquals(true, e.getDirectivo());

	}

	@Test

	public void establecerSerDirectivoFail21()

	{

		Empleado e = new Empleado();

		try

		{

			e.establecerSerDirectivo("++");

		} catch (CargoException ex)

		{

			fail();

		}

		assertEquals(true, e.getDirectivo());

	}

	@Test

	public void establecerSerDirectivoFail22()

	{

		Empleado e = new Empleado();

		try

		{

			e.establecerSerDirectivo(" ");

		} catch (CargoException ex)

		{

			fail();

		}

		assertEquals(true, e.getDirectivo());

	}

	@Test

	public void calcularPrimaCorrecta1()

	{

		Empleado e = new Empleado();

		try

		{

			e.calcularPrima("625", "Jorge", "035", "+");

		} catch (Exception ex)

		{

			fail();

		}

		assertEquals(Prima.P1, e.getPrima());

	}

	@Test

	public void calcularPrimaCorrecta2()

	{

		Empleado e = new Empleado();

		try

		{

			e.calcularPrima("065", "Jose", "010", "+");

		} catch (Exception ex)

		{

			fail();

		}

		assertEquals(Prima.P3, e.getPrima());

	}

	@Test

	public void calcularPrimaCorrecta3()

	{

		Empleado e = new Empleado();

		try

		{

			e.calcularPrima("105", "Marta", "011", "-");

		} catch (Exception ex)

		{

			fail();

		}

		assertEquals(Prima.P4, e.getPrima());

	}

	@Test

	public void calcularPrimaCorrecta4()

	{

		Empleado e = new Empleado();

		try

		{

			e.calcularPrima("002", "Maria", "020", "-");

		} catch (Exception ex)

		{

			fail();

		}

		assertEquals(Prima.P2, e.getPrima());

	}
	
	@Test

	public void calcularPrimaCorrecta5()

	{

		Empleado e = new Empleado();

		try

		{

			e.calcularPrima("105", "Marta", "011", "*");

		} catch (Exception ex)

		{

			fail();

		}

		assertEquals(Prima.P4, e.getPrima());

	}
	
	
}