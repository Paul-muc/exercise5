/**
 *  Übung 5:  
 *  Ein einfacher Java-Thread wird erzeugt.
 *  Der Thread gibt 10 mal einen Text auf die Konsole aus und beendet sich 
 *  dann. Nach jeder Ausgabe wartet der Thread ca. 2 Sekunden.
 *  Der Main-Thread wartet auf dessen Ende und beendet sich dann ebenfalls
 * 		   
 *  @author Peter Mandl
 *  @version 2.0
 */

package edu.hm.winf.tutorium.uebung5;

/**
 * Testklasse zur Erzeugung des eigenen Threads
 */
public class myThreadTest {

	public static void main(String args[]) {

		// Referenz auf eine Instanz des eigenen Threads
		MyThread t1;

		// Thread instanziieren
		t1 = new MyThread("...auf und nieder immer wieder...");

		System.out.println("Start von main");
		System.out.println("Beobachten sie den Java-Prozess im Taskmanager");
		System.out.println("Betrachten Sie die Spalte Threads");
		System.out.println("Wieviele Threads hat der Prozess?");

		try {
			Thread.sleep(3000);
		} catch (Exception e) {
		}

		// Thread starten
		t1.start();

		System.out.println("Thread " + t1.getName()
				+ " gestartet mit Priorität " + t1.getPriority());
		System.out.println("Main: Warten auf Ende von Thread " + t1.getName());

		try {
			t1.join();
		} catch (InterruptedException e) {
			// Ausnahme nicht behandelt
		}
		System.out.println("Thread " + t1.getName() + " beendet");
		System.out.println("Wieviele Threads hat der Prozess nun?");

		try {
			Thread.sleep(20000);
		} catch (Exception e) {
		}

		System.out.println("Ende von main");
	}
}