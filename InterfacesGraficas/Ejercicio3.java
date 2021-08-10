package InterfacesGraficas;

import java.awt.event.MouseEvent;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.event.MouseInputListener;

public class Ejercicio3 extends JFrame {
	private JPanel panel;
	private JButton enviar;
	private JRadioButton windows;
	private JRadioButton linux;
	private JRadioButton mac;
	private ButtonGroup grupoRadioButtons;
	private JSlider numeroHoras;
	private JCheckBox programacion;
	private JCheckBox disenoGrafico;
	private JCheckBox administracion;
	private JLabel sistemaOperativo;
	private JLabel especialidad;
	private JLabel jornada;

	private int contador = 0;
	private String sistemaOP = "";

	public void crearVentana() {
		setTitle("Encuesta");
		setBounds(600, 350, 800, 300);
		iniciarComponentes();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public void iniciarComponentes() {
		colocarPanel();
		colocarEtiquetas();
		colocarRadioButons();
		colocarCheckBox();
		colocarSlider();
		colocarButton();
	}

	private void colocarButton() {
		enviar = new JButton();
		enviar.setBounds(510, 125, 80, 30);
		enviar.setText("Enviar");
		panel.add(enviar);

		enviar.addMouseListener(new MouseInputListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				String profesiones = "Profesiones seleccionadas: ";
				int horasDedicadas = numeroHoras.getValue();

				if (windows.isSelected()) {
					sistemaOP = windows.getText();
				} else if (linux.isSelected()) {
					sistemaOP = linux.getText();
				} else {
					sistemaOP = mac.getText();
				}

				if (programacion.isSelected()) {
					profesiones = profesiones + programacion.getText() + " ";
					contador++;
				}
				if (disenoGrafico.isSelected()) {
					profesiones = profesiones + disenoGrafico.getText() + " ";
					contador++;
				}
				if (administracion.isSelected()) {
					profesiones = profesiones + administracion.getText() + " ";
					contador++;
				}
				if (contador == 0) {
					profesiones = "No se a seleccionado profesion";
				}

				JOptionPane.showMessageDialog(null, "Informe encuesta: " + "\n" + profesiones
						+ "\nSistema Operativo seleccionado: " + sistemaOP + "\nHoras dedicadas: " + horasDedicadas);

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});

	}

	private void colocarSlider() {
		numeroHoras = new JSlider(JSlider.HORIZONTAL, 0, 10, 1);
		numeroHoras.setBounds(465, 50, 180, 50);
		numeroHoras.setPaintTicks(true);
		numeroHoras.setMinorTickSpacing(1);
		numeroHoras.setMajorTickSpacing(1);
		numeroHoras.setPaintLabels(true);
		panel.add(numeroHoras);

	}

	private void colocarCheckBox() {
		programacion = new JCheckBox();
		disenoGrafico = new JCheckBox();
		administracion = new JCheckBox();

		programacion.setText("Programacion");
		disenoGrafico.setText("Diseño grafico");
		administracion.setText("Administracion");

		programacion.setBounds(260, 50, 150, 30);
		disenoGrafico.setBounds(260, 90, 150, 30);
		administracion.setBounds(260, 130, 150, 30);

		panel.add(programacion);
		panel.add(disenoGrafico);
		panel.add(administracion);

	}

	private void colocarRadioButons() {
		windows = new JRadioButton();
		linux = new JRadioButton();
		mac = new JRadioButton();
		
		windows.setSelected(true);
		
		
		

		windows.setText("Windows");
		linux.setText("Linux");
		mac.setText("Mac");

		windows.setBounds(30, 50, 80, 30);
		linux.setBounds(30, 90, 80, 30);
		mac.setBounds(30, 130, 80, 30);

		panel.add(windows);
		panel.add(linux);
		panel.add(mac);

		grupoRadioButtons = new ButtonGroup();
		grupoRadioButtons.add(windows);
		grupoRadioButtons.add(linux);
		grupoRadioButtons.add(mac);
		

	}

	private void colocarEtiquetas() {
		sistemaOperativo = new JLabel();
		sistemaOperativo.setBounds(30, 10, 200, 30);
		sistemaOperativo.setText("Seleccione sistema operativo");
		panel.add(sistemaOperativo);

		especialidad = new JLabel();
		especialidad.setBounds(260, 10, 200, 30);
		especialidad.setText("Seleccione especialidad");
		panel.add(especialidad);

		jornada = new JLabel();
		jornada.setBounds(500, 10, 200, 30);
		jornada.setText("Horas dedicadas");
		panel.add(jornada);
	}

	private void colocarPanel() {
		panel = new JPanel();
		panel.setLayout(null);
		setContentPane(panel);

	}
}
