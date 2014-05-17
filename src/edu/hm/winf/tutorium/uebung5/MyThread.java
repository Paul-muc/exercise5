package edu.hm.winf.tutorium.uebung5;

public class MyThread extends Thread {

	public String messageText;

	public MyThread(String messageText) {
		this.messageText = messageText;
	}

	/*
	 * Methode, welche die eigentliche Aktion ausführt (definiert im Interface
	 * Runnable)
	 */
	public void run() {
		this.setPriority(Thread.MAX_PRIORITY);
		System.out.println("Thread hat seine Priorität verändert auf: "
				+ this.getPriority());

		// Thread gibt den Text 10 mal aus
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread " + getName() + ": " + messageText);
			try {
				sleep(2000);
			} catch (Exception e) {
				// Ausnahme nicht behandelt
			}
		}
	}

}