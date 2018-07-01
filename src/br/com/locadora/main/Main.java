package br.com.locadora.main;

import java.awt.EventQueue;

import br.com.locadora.connection.ConnectionFactory;
import br.com.locadora.dao.GenericDao;
import br.com.locadora.view.LocadoraView;

public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LocadoraView frame = new LocadoraView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


}
