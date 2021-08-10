package InterfacesGraficas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ejercicio4 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panel;

	protected JButton suma;
	protected JButton resta;
	protected JButton multiplicacion;
	protected JButton division;
	protected JButton igual;
	protected ButtonGroup operaciones;
	protected JTextField operador1;
	protected JTextField operador2;
	protected JTextField operResult;
	protected JLabel casio;
	protected JLabel modelo;
	protected double operadorUno;
	protected double operadorDos;
	@SuppressWarnings("unused")
	private double resultado;

	public void crearVentana() {
		setTitle("Calculadora");
		setBounds(600, 100, 350, 500);
		iniciarComponentes();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	protected void iniciarComponentes() {
		initPanel();
		initLabels();
		initTextField();
		initButtons();

	}

	protected void initLabels() {
		casio = new JLabel();
		casio.setBounds(50, 4, 40, 30);
		casio.setText("Casio");
		casio.setFont(new Font("Arial", Font.PLAIN, 11));

		modelo = new JLabel();
		modelo.setBounds(80, 5, 40, 30);
		modelo.setFont(new Font("Arial", Font.ITALIC, 9));
		modelo.setText("Fx-4790");
		new JLabel();
		new JLabel();

		panel.add(casio);
		panel.add(modelo);

	}

	protected void initButtons() {

		// Suma
		suma = new JButton();
		suma.setText("+");
		suma.setBounds(230, 150, 50, 50);
		// Resta
		resta = new JButton();
		resta.setBounds(230, 210, 50, 50);
		resta.setText("-");
		// Multiplicacion
		multiplicacion = new JButton();
		multiplicacion.setText("*");
		multiplicacion.setBounds(230, 270, 50, 50);
		// Division
		division = new JButton();
		division.setText("/");
		division.setBounds(150, 270, 50, 50);

		operaciones = new ButtonGroup();

		operaciones.add(suma);
		operaciones.add(resta);
		operaciones.add(multiplicacion);
		operaciones.add(division);

		panel.add(suma);
		panel.add(resta);
		panel.add(multiplicacion);
		panel.add(division);
		// igual
		igual = new JButton();
		igual.setText("=");
		igual.setBounds(50, 270, 80, 50);

		panel.add(igual);

		suma.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				operadorUno = Double.parseDouble(operador1.getText());
				operadorDos = Double.parseDouble(operador2.getText());
				resultado = operadorUno + operadorDos;
				

			}
		});
		resta.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				operadorUno = Double.parseDouble(operador1.getText());
				operadorDos = Double.parseDouble(operador2.getText());
				resultado = operadorUno - operadorDos;
				

			}
		});

		multiplicacion.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				operadorUno = Double.parseDouble(operador1.getText());
				operadorDos = Double.parseDouble(operador2.getText());
				resultado = operadorUno * operadorDos;
			

			}
		});

		division.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				operadorUno = Double.parseDouble(operador1.getText());
				operadorDos = Double.parseDouble(operador2.getText());
				resultado = operadorUno / operadorDos;
				

			}
		});
		igual.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				operador1.setText("");
				operador2.setText("");
				operResult.setText(String.valueOf(resultado));
				
				

			}
		});

	}

	protected void initTextField() {
		operResult = new JTextField();
		operResult.setBounds(50, 40, 230, 100);
		operResult.setEditable(false);
		
		operResult.setFont(new Font("Arial", 1, 30));
		
		panel.add(operResult);

		operador1 = new JTextField();
		operador1.setBounds(50, 150, 150, 50);
		panel.add(operador1);

		operador2 = new JTextField();
		operador2.setBounds(50, 210, 150, 50);
		panel.add(operador2);

	}

	protected void initPanel() {
		panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);

		panel.setLayout(null);
		setContentPane(panel);
	}

}
