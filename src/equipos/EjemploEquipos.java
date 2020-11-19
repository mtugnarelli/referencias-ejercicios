package equipos;

import org.junit.Assert;
import org.junit.Test;

public class EjemploEquipos {

	@Test
	public void crearEquiposAmarillos() {

		Integrante homero = new Integrante("Homero S");
		Assert.assertEquals("Homero S", homero.obtenerNombre());
		Equipo losBorbotones = new Equipo("Los Borbotones", 4);
		Assert.assertEquals("Los Borbotones", losBorbotones.obtenerNombre());
		Assert.assertEquals(0, losBorbotones.contarMiembros());
		Assert.assertTrue(losBorbotones.obtenerCapitan() == null);
		Integrante barney = null;

		// #uno

		Integrante apu = new Integrante("Apu");
		losBorbotones.asignarIntegrante(1, homero);
		losBorbotones.asignarIntegrante(2, barney);
		losBorbotones.asignarIntegrante(3, apu);
		Assert.assertEquals(2, losBorbotones.contarMiembros());
		barney = new Integrante("Barney Gomez");
		losBorbotones.asignarCapitan(homero);
		Assert.assertTrue(losBorbotones.obtenerIntegrante(3) == apu);
		Assert.assertTrue(losBorbotones.obtenerCapitan() == homero);
		losBorbotones.asignarIntegrante(4, null);

		// #dos

		Equipo isotopos = new Equipo("Isotopos de S", 7);
		Integrante barneyGomez = barney;
		barney = null;
		apu = new Integrante("Apu Jr");
		Integrante homeroThompson = homero;
		isotopos.asignarIntegrante(1, homero);
		isotopos.asignarIntegrante(2, homeroThompson);
		homeroThompson.cambiarNombre("Homero Thompson");
		isotopos.asignarIntegrante(3, barney);
		isotopos.asignarIntegrante(4, barneyGomez);
		isotopos.asignarCapitan(apu);

		// #tres
	}

	@Test
	public void crearEquiposVerdes() {

		Integrante rafael = new Integrante("Rafael");
		Assert.assertEquals("Rafael", rafael.obtenerNombre());
		Equipo tropa = new Equipo("Las Tortugas Samurai", 5);
		Assert.assertEquals("Las Tortugas Samurai", tropa.obtenerNombre());
		Assert.assertEquals(0, tropa.contarMiembros());
		Integrante donatello = new Integrante("Donatello");

		// #uno

		Integrante splinter = new Integrante("Splinter");
		tropa.asignarIntegrante(1, rafael);
		tropa.asignarIntegrante(2, donatello);
		tropa.asignarIntegrante(5, splinter);
		tropa.asignarCapitan(splinter);
		Assert.assertTrue(splinter == tropa.obtenerCapitan());

		// #dos

		Assert.assertEquals(3, tropa.contarMiembros());
		Equipo tmnt = new Equipo("TMNT", 3);
		tmnt.asignarIntegrante(1, new Integrante("Leonardo"));
		tmnt.asignarIntegrante(2, splinter);
		tmnt.asignarCapitan(tmnt.obtenerIntegrante(1));
		rafael = null;
		donatello = splinter;

		// #tres

	}
}
