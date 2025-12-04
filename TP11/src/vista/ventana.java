package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Modelo.Ciclomotor;
import Modelo.Juego;
import javax.swing.UIManager;

public class ventana extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_1;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JPanel panel_2;
	private JPanel enfrentamiento;
	private JPanel panel_4;
	private JPanel creacion;
	private JList<Ciclomotor> list;
	private JList<Ciclomotor> list_1;
	private JPanel panel_3;
	private JPanel panel_5;
	private JPanel panel_6;
	private JPanel panel_7;
	private JPanel panel_8;
	private JPanel panel_9;
	private JLabel lblPotencia;
	private JPanel panel_11;
	private JLabel lblNombre;
	private JTextField textFieldnombre;
	private JTextField textField_potencia;
	private JTextField textField_velocidad;
	private JPanel panel_12;
	private JPanel panel_13;
	private JLabel lblVelocidad_1;
	private JPanel panel_14;
	private JTextField textField_cilindrada;
	private JPanel panel_15;
	private JPanel panel_16;
	private JLabel lblVelocidad_2;
	private JPanel panel_17;
	private JButton Agregar;
	private JButton Eliminar;
	private JPanel panel_10;
	private JPanel panel_18;
	private JButton Enfrentar;
	private JPanel panel_19;
	private JPanel panel_20;
	private JRadioButton Potencia;
	private JPanel panel_21;
	private JRadioButton Velocidad;
	private JPanel panel_22;
	private JRadioButton Peso;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private Juego juego=new Juego();
	private JPanel panel_23;
	private JRadioButton Cilindrada;
	private JPanel panel_24;
	private JPanel panel_25;
	private JLabel lblPeso;
	private JPanel panel_26;
	private JTextField textField_peso;
	private DefaultListModel<Ciclomotor> modeloLista = new DefaultListModel<Ciclomotor>();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana frame = new ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ventana() {
		setPreferredSize(new Dimension(80, 80));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 695);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		this.contentPane.setLayout(new BorderLayout(0, 0));
		
		this.panel = new JPanel();
		this.contentPane.add(this.panel, BorderLayout.CENTER);
		this.panel.setLayout(new GridLayout(0, 3, 0, 0));
		
		this.panel_2 = new JPanel();
		this.panel.add(this.panel_2);
		this.panel_2.setLayout(new BorderLayout(0, 0));
		
		this.list = new JList<Ciclomotor>();
		this.panel_2.add(this.list, BorderLayout.CENTER);
		
		this.enfrentamiento = new JPanel();
		this.panel.add(this.enfrentamiento);
		this.enfrentamiento.setLayout(new GridLayout(2, 0, 0, 0));
		
		this.creacion = new JPanel();
		this.creacion.setBorder(UIManager.getBorder("ComboBox.editorBorder"));
		this.creacion.setBackground(new Color(240, 240, 240));
		this.enfrentamiento.add(this.creacion);
		this.creacion.setLayout(new GridLayout(0, 2, 0, 0));
		
		this.panel_6 = new JPanel();
		this.creacion.add(this.panel_6);
		this.panel_6.setLayout(new BorderLayout(0, 0));
		
		this.panel_11 = new JPanel();
		this.panel_6.add(this.panel_11, BorderLayout.CENTER);
		
		this.lblNombre = new JLabel("Modelo");
		this.lblNombre.setFont(new Font("Tahoma", Font.BOLD, 19));
		this.panel_11.add(this.lblNombre);
		
		this.panel_3 = new JPanel();
		this.creacion.add(this.panel_3);
		
		this.textFieldnombre = new JTextField();
		this.panel_3.add(this.textFieldnombre);
		this.textFieldnombre.setColumns(10);
		
		this.panel_8 = new JPanel();
		this.creacion.add(this.panel_8);
		
		this.lblPotencia = new JLabel("Potencia");
		this.lblPotencia.setFont(new Font("Tahoma", Font.BOLD, 19));
		this.panel_8.add(this.lblPotencia);
		
		this.panel_5 = new JPanel();
		this.creacion.add(this.panel_5);
		
		this.textField_potencia = new JTextField();
		this.panel_5.add(this.textField_potencia);
		this.textField_potencia.setColumns(10);
		
		this.panel_12 = new JPanel();
		this.creacion.add(this.panel_12);
		
		this.panel_13 = new JPanel();
		this.panel_12.add(this.panel_13);
		
		this.lblVelocidad_1 = new JLabel("Velocidad");
		this.lblVelocidad_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		this.panel_13.add(this.lblVelocidad_1);
		
		this.panel_9 = new JPanel();
		this.creacion.add(this.panel_9);
		
		this.textField_velocidad = new JTextField();
		this.panel_9.add(this.textField_velocidad);
		this.textField_velocidad.setColumns(10);
		
		this.panel_24 = new JPanel();
		this.creacion.add(this.panel_24);
		
		this.panel_25 = new JPanel();
		this.panel_24.add(this.panel_25);
		
		this.lblPeso = new JLabel("Peso");
		this.lblPeso.setFont(new Font("Tahoma", Font.BOLD, 19));
		this.panel_25.add(this.lblPeso);
		
		this.panel_26 = new JPanel();
		this.creacion.add(this.panel_26);
		
		this.textField_peso = new JTextField();
		this.textField_peso.setColumns(10);
		this.panel_26.add(this.textField_peso);
		
		this.panel_15 = new JPanel();
		this.creacion.add(this.panel_15);
		
		this.panel_16 = new JPanel();
		this.panel_15.add(this.panel_16);
		
		this.lblVelocidad_2 = new JLabel("Cilindrada");
		this.lblVelocidad_2.setFont(new Font("Tahoma", Font.BOLD, 19));
		this.panel_16.add(this.lblVelocidad_2);
		
		this.panel_14 = new JPanel();
		this.creacion.add(this.panel_14);
		
		this.textField_cilindrada = new JTextField();
		this.textField_cilindrada.setColumns(10);
		this.panel_14.add(this.textField_cilindrada);
		
		this.panel_7 = new JPanel();
		this.creacion.add(this.panel_7);
		
		this.Agregar = new JButton("Añadir moto");
		this.Agregar.addActionListener(this);
		this.panel_7.add(this.Agregar);
		
		this.panel_17 = new JPanel();
		this.creacion.add(this.panel_17);
		
		this.Eliminar = new JButton("Eliminar");
		this.Eliminar.addActionListener(this);
		this.panel_17.add(this.Eliminar);
		
		this.panel_10 = new JPanel();
		this.enfrentamiento.add(this.panel_10);
		this.panel_10.setLayout(new BorderLayout(0, 0));
		
		this.panel_18 = new JPanel();
		this.panel_18.setPreferredSize(new Dimension(70, 70));
		this.panel_10.add(this.panel_18, BorderLayout.SOUTH);
		
		this.Enfrentar = new JButton("ENFRENTAR");
		this.Enfrentar.addActionListener(this);
		this.panel_18.add(this.Enfrentar);
		
		this.panel_19 = new JPanel();
		this.panel_10.add(this.panel_19, BorderLayout.CENTER);
		this.panel_19.setLayout(new GridLayout(4, 0, 0, 0));
		
		this.panel_21 = new JPanel();
		this.panel_19.add(this.panel_21);
		
		this.Velocidad = new JRadioButton("Velocidad");
		buttonGroup.add(this.Velocidad);
		this.Velocidad.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.panel_21.add(this.Velocidad);
		
		this.panel_22 = new JPanel();
		this.panel_19.add(this.panel_22);
		
		this.Peso = new JRadioButton("Peso");
		buttonGroup.add(this.Peso);
        this.Peso.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.panel_22.add(this.Peso);
		
		this.panel_23 = new JPanel();
		this.panel_19.add(this.panel_23);
		
		this.Cilindrada = new JRadioButton("Cilindrada");
		buttonGroup.add(this.Cilindrada);
		this.Cilindrada.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.panel_23.add(this.Cilindrada);
		
		this.panel_20 = new JPanel();
		this.panel_19.add(this.panel_20);
		
		this.Potencia = new JRadioButton("Potencia");
		buttonGroup.add(this.Potencia);
		this.Potencia.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.panel_20.add(this.Potencia);
		
		this.panel_4 = new JPanel();
		this.panel.add(this.panel_4);
		this.panel_4.setLayout(new BorderLayout(0, 0));
		
		this.list_1 = new JList<Ciclomotor>();
		this.panel_4.add(this.list_1, BorderLayout.CENTER);
		
		this.panel_1 = new JPanel();
		this.panel_1.setPreferredSize(new Dimension(80, 80));
		this.panel_1.setSize(new Dimension(0, 20));
		this.contentPane.add(this.panel_1, BorderLayout.SOUTH);
		this.panel_1.setLayout(new BorderLayout(0, 0));
		
		this.scrollPane = new JScrollPane();
		this.panel_1.add(this.scrollPane, BorderLayout.CENTER);
		
		this.textArea = new JTextArea();
		this.scrollPane.setViewportView(this.textArea);
		
		this.list.setModel(modeloLista);
		this.list_1.setModel(modeloLista);

	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == this.Enfrentar) {
			do_btnNewButton_2_actionPerformed(arg0);
		}
		if (arg0.getSource() == this.Eliminar) {
			do_btnNewButton_1_actionPerformed(arg0);
		}
		if (arg0.getSource() == this.Agregar) {
			do_btnNewButton_actionPerformed(arg0);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent arg0) {

		String nombre=this.textFieldnombre.getText();
		int potencia=Integer.parseInt(this.textField_potencia.getText());
		int velocidad=Integer.parseInt(this.textField_velocidad.getText());
		int peso=Integer.parseInt(this.textField_peso.getText());
		int cilindrada=Integer.parseInt(this.textField_cilindrada.getText());
		
		Ciclomotor c = new Ciclomotor(nombre,potencia,velocidad,peso,cilindrada);
		this.juego.agregarCiclomotor(c);
		this.actualizaListas();
	}

	private void actualizaListas() {
		this.modeloLista.clear();
		Iterator<Ciclomotor> iterator=this.juego.getCiclomotores();
		while(iterator.hasNext())
			this.modeloLista.addElement(iterator.next());
	}

	protected void do_btnNewButton_1_actionPerformed(ActionEvent arg0) {
		Ciclomotor c=this.list.getSelectedValue();
		if(c!=null)
		{
			this.juego.eliminarCiclomotor(c);
			this.actualizaListas();
		}
	}

	protected void do_btnNewButton_2_actionPerformed(ActionEvent arg0) {
		Ciclomotor c1=this.list.getSelectedValue();
		Ciclomotor c2=this.list_1.getSelectedValue();
		
		String atributo="";
		if(this.Potencia.isSelected())
			atributo="Potencia";
	
		else if(this.Velocidad.isSelected())
			atributo="Velocidad";
		
		else if(this.Peso.isSelected())
			atributo="Peso";
		
		else if(this.Cilindrada.isSelected())
			atributo="Cilindrada";

		Ciclomotor ganador=this.juego.enfrentar(c1, c2, atributo);

		String cartelito ="Se enfrentaron "+c1.getNombre()+" contra "+c2.getNombre()+" en "+atributo+". ";

		if(ganador==null)
			cartelito=cartelito+"Empate.";
		else
			cartelito=cartelito+"Ganador: "+ganador.getNombre()+".";

		this.textArea.append(cartelito+"\n");
	}
}
