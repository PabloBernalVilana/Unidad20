package InterfacesGraficas;

import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.MouseInputListener;

public class Ejercicio2 extends JFrame {
	private JPanel panel;
	private JButton addPelicula;
	private JTextField nombrePelicula;
	private JLabel titulo;
	private JLabel peliculas;
	private JComboBox<Object> listaPeliculas;

	public void crearVentana() {
		// añadimos el titulo
		setTitle("Películas");

		// configuramos dimensiones ventana
		setBounds(750, 300, 600, 300);
		// iniciar componentes
		iniciarComponentes();
		// al cerrar la ventana se para la app
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// nos hace visible la ventana
		setVisible(true);
	}



	public void iniciarComponentes() {
		colocarPanel();
		colocarEtiquetas();
		colocarTextField();
		colocarBotones();
		colocarComboBox();
	}

	public void colocarPanel() {
		panel = new JPanel();
		panel.setLayout(null);
		setContentPane(panel);
	}

	public void colocarEtiquetas() {
		titulo = new JLabel();
		titulo.setBounds(400, 50, 80, 30);
		titulo.setText("Peliculas");
		panel.add(titulo);
		
		peliculas = new JLabel();
		peliculas.setBounds(50, 50, 200, 30);
		peliculas.setText("Escribe un nombre de una pelicula");
		panel.add(peliculas);
		
	}

	public void colocarBotones() {
		addPelicula = new JButton();
		addPelicula.setBounds(100, 150, 100, 30);
		addPelicula.setText("Añadir");
		panel.add(addPelicula);

		addPelicula.addMouseListener(new MouseInputListener() {

			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				String peliculaIntroducida = nombrePelicula.getText();
				listaPeliculas.addItem(peliculaIntroducida);
				nombrePelicula.setText("");

			}
		});

	}

	public void colocarTextField() {
		nombrePelicula = new JTextField();
		nombrePelicula.setBounds(50, 100, 200, 30);
		panel.add(nombrePelicula);
	}
	public void colocarComboBox() {
		listaPeliculas = new JComboBox<>();
		listaPeliculas.setBounds(350, 100, 175, 25);
		panel.add(listaPeliculas);
	}

}
