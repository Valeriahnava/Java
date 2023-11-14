package screen;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import com.toedter.calendar.JDateChooser;

import models.Empleado;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaEmpleado extends JFrame implements ActionListener{

        Empleado empleado;
        JLabel textLabel;
        JLabel numeroEmpleadoJLabel;
        JLabel nombreJLabel;
        JLabel domicilioJLabel;
        JLabel telefonoJLabel;
        JLabel emailJLabel;
        JLabel fechaJLabel;
        JLabel generoJLabel;
        JComboBox <Long> numeroEmpleadoJComboBox;
        TextField nombreJTextField;
        TextField domicilioJTextField;
        TextField telefonoJTextField;
        TextField emailJTextField;
        JDateChooser fechaJDateChooser;
        JComboBox<String> generoJComboBox;
        JButton buscarJButton;
        JButton guardarJButton;
        JButton modificarJButton;
        JButton eliminarJButton;
        JButton limpiarJButton;


        public VentanaEmpleado(String titulo) {
            super(titulo);
            setSize(600, 700);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(new GridBagLayout());
            crearComponentes();}

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == buscarJButton){
            System.out.println("Buscar");
            // TODO: implementar iniciar sesion, llamar a LoginRepository
        }
        if(e.getSource() == guardarJButton){
            System.out.println("Guardar");
            // TODO: has visible la ventana de Registro
        }
        if(e.getSource() == modificarJButton){
            System.out.println("Modificar");
            // TODO: implementar iniciar sesion, llamar a LoginRepository
        }
        if(e.getSource() == eliminarJButton){
            System.out.println("Eliminar");
            // TODO: implementar iniciar sesion, llamar a LoginRepository
        }
        if(e.getSource() == limpiarJButton){
            System.out.println("Limpiar");
            // TODO: implementar iniciar sesion, llamar a LoginRepository
            VentanaRegistro vr = new VentanaRegistro();
            vr.setVisible(true);
            this.dispose();
        }
    }
    // Empleado empleado
    private void crearComponentes() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10,10,10,10);
        // titulo
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 4;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        
        textLabel = new JLabel("Empleados");
        textLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(textLabel, gbc);

        //texto numEmpleado
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;

        numeroEmpleadoJLabel = new JLabel("#Empleado");
        numeroEmpleadoJLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(numeroEmpleadoJLabel, gbc);
        //BotonNumEmpleado
        gbc.gridx = 1;
        gbc.gridy = 1;

        gbc.gridwidth = 1;

        numeroEmpleadoJComboBox = new JComboBox<Long>();
        add(numeroEmpleadoJComboBox,gbc);
        //Boton buscar
        gbc.gridx = 2;
        gbc.gridy = 1;

        gbc.gridwidth = 1;
        gbc.gridheight = 1;

        buscarJButton = new JButton();
        add(buscarJButton,gbc);

        //textoNombre
        gbc.gridx = 0;
        gbc.gridy = 2;

        gbc.gridwidth = 1;

        nombreJLabel = new JLabel("Nombre: ");
        nombreJLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(nombreJLabel, gbc);

        //Textfield
        gbc.gridx = 1;
        gbc.gridy = 2;

        gbc.gridwidth = 2;

        nombreJTextField = new TextField(100);
        add(nombreJTextField, gbc);
        //textoDomicilio
        gbc.gridx = 0;
        gbc.gridy = 3;

        gbc.gridwidth = 1;

        domicilioJLabel = new JLabel("Domicilio: ");
        domicilioJLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(domicilioJLabel, gbc);

        //domiciliofield
        gbc.gridx = 1;
        gbc.gridy = 3;

        gbc.gridwidth = 2;

        domicilioJTextField = new TextField(100);
        add(domicilioJTextField, gbc);

        //Telefonotexto
        gbc.gridx = 0;
        gbc.gridy = 4;

        gbc.gridwidth = 1;

        telefonoJLabel = new JLabel("Teléfono: ");
        telefonoJLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(telefonoJLabel, gbc);

        //Telefonofield
        gbc.gridx = 1;
        gbc.gridy = 4;

        gbc.gridwidth = 2;

        telefonoJTextField = new TextField(100);
        add(telefonoJTextField, gbc);

        //emailtexto
        gbc.gridx = 0;
        gbc.gridy = 5;

        gbc.gridwidth = 1;

        emailJLabel = new JLabel("Email: ");
        emailJLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(emailJLabel, gbc);

        //emailfield
        gbc.gridx = 1;
        gbc.gridy = 5;

        gbc.gridwidth = 2;

        emailJTextField = new TextField(100);
        add(emailJTextField, gbc);

        //fechanacimientotexto
        gbc.gridx = 0;
        gbc.gridy = 6;

        gbc.gridwidth = 1;

        fechaJLabel = new JLabel("Fecha de Nacimiento: ");
        fechaJLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(fechaJLabel, gbc);
        //fechadenacimientofield

        gbc.gridx = 1;
        gbc.gridy = 6;

        gbc.gridwidth = 2;

        fechaJDateChooser = new JDateChooser();
        add(fechaJDateChooser, gbc);

        //generotexto
        gbc.gridx = 0;
        gbc.gridy = 7;

        gbc.gridwidth = 1;

        generoJLabel = new JLabel("Género: ");
        generoJLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(generoJLabel, gbc);

        //generoboton
        gbc.gridx = 1;
        gbc.gridy = 7;

        gbc.gridwidth = 2;

        generoJComboBox = new JComboBox<String>();
        add(generoJComboBox, gbc);

        //boton guardar

        gbc.gridx = 0;
        gbc.gridy = 8;

        gbc.gridwidth = 1;

        guardarJButton = new JButton("Guardar");
        guardarJButton.addActionListener(this);
        add(guardarJButton, gbc);

        gbc.gridx = 1;
        gbc.gridy = 8;

        gbc.gridwidth = 1;

        modificarJButton = new JButton("Guardar");
        modificarJButton.addActionListener(this);
        add(modificarJButton, gbc);

        gbc.gridx = 2;
        gbc.gridy = 8;

        gbc.gridwidth = 1;

        eliminarJButton = new JButton("Guardar");
        eliminarJButton.addActionListener(this);
        add(eliminarJButton, gbc);

        gbc.gridx = 3;
        gbc.gridy = 8;

        gbc.gridwidth = 1;

        limpiarJButton = new JButton("Guardar");
        limpiarJButton.addActionListener(this);
        add(limpiarJButton, gbc);

        }
}
