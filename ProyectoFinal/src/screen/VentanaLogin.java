package screen;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaLogin extends JFrame implements ActionListener {
    JLabel textJLabel;
    JLabel usuarioJlabel;
    JTextField usuarioJTextField;
    JLabel contraseniaJLabel;
    JPasswordField contraseniaJPasswordField;
    JButton iniciarJButton;
    JButton registrarJButton;

    public VentanaLogin(String titulo) {
        super(titulo);
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        crearComponentes();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == iniciarJButton){
            System.out.println("Iniciar");
            // TODO: implementar iniciar sesion, llamar a LoginRepository
        }
        if(e.getSource() == registrarJButton){
            System.out.println("Registrar");
            // TODO: has visible la ventana de Registro
            /* 
             * VentanaRegistro vr = new VentanaRegistr("Registro")
             * vr.setVisible(true);
             * this.dispose()
             */
            VentanaRegistro vr = new VentanaRegistro();
            vr.setVisible(true);
            this.dispose();
        }

    }

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

        textJLabel = new JLabel("Iniciar Sesión");
        textJLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(textJLabel, gbc);

        // texto usuario
        gbc.gridx = 0;
        gbc.gridy = 1;

        gbc.gridwidth = 1;
        gbc.gridheight = 1;

        usuarioJlabel = new JLabel("Usuario");
        usuarioJlabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(usuarioJlabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;

        gbc.gridwidth = 3;
        gbc.gridheight = 1;

        usuarioJTextField = new JTextField(100);
        usuarioJTextField.setHorizontalAlignment(SwingConstants.CENTER);
        add(usuarioJTextField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;

        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        
        contraseniaJLabel = new JLabel("Contraseña");
        contraseniaJLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(contraseniaJLabel,gbc);
        
        gbc.gridx = 1;
        gbc.gridwidth = 3;

        contraseniaJPasswordField = new JPasswordField(100);

        add(contraseniaJPasswordField,gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 3;
        
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        
        iniciarJButton = new JButton("Iniciar");
        iniciarJButton.addActionListener(this);
        add(iniciarJButton,gbc);

        gbc.gridx = 2;
        registrarJButton = new JButton("Registrarse");
        registrarJButton.addActionListener(this);
        add(registrarJButton, gbc);
        
    }

    public void mensajePassword() {

    }

    public String damePassword() {
        return null;

    }

}
