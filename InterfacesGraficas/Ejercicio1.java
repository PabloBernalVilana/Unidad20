package InterfacesGraficas;

import java.awt.JobAttributes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.InputMismatchException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.MouseInputListener;

public class Ejercicio1 extends JFrame{
	private JPanel panel;
	private JButton saludar;
	private JTextField nombre;
	private JLabel mensaje;
	String nombreString = "";
	
	public void crearVentana() {
		// añadimos el titulo
		setTitle("Saludador");
		// configuramos dimensiones ventana
		setBounds(750, 300, 400, 400);
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
		
	}
	public void colocarPanel() {
		panel = new JPanel();
		panel.setLayout(null);
		setContentPane(panel);
	}
	public void colocarEtiquetas() {
		mensaje = new JLabel();
		mensaje.setBounds(100, 100, 200, 30);
		mensaje.setText("Escribe un nombre para saludar");
		panel.add(mensaje);
	}
	public void colocarBotones() {
		saludar = new JButton();
		saludar.setBounds(150, 300, 100, 30);
		saludar.setText("Saludar");
		panel.add(saludar);
		
		
			saludar.addMouseListener(new MouseInputListener() {
				
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
					mostrarSaludo();
					
				}
			});
			
			
				
				
			
	}
	public void colocarTextField() {
		nombre = new JTextField();
		nombre.setBounds(50, 150, 280, 30);
		panel.add(nombre);
		
		nombre.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
	}
	public void mostrarSaludo() {
		nombreString = (nombre.getText());
		JOptionPane.showMessageDialog(null, "¡Hola " + nombreString + "!" );
	}
	
	
	

}
