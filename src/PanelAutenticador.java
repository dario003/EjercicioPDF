import javax.swing.*;
import java.awt.GridLayout;

public class PanelAutenticador extends JPanel {

    //Crea 3 componentes necesarios
    public JTextField servidor, usuario, base;

    //Un cuadro de texto para la contraseña
     public JPasswordField password;

     //Dos botones
    public JButton aceptar, cancelar;

    public PanelAutenticador(){
        iniciaComponentes();
        agregaComponentes();
    }

    private void iniciaComponentes(){
        servidor = new JTextField();
        usuario = new JTextField();
        password = new JPasswordField();
        base = new JTextField();

        aceptar = new JButton("Aceptar");
        aceptar.setMnemonic('a'); //Subraya la letra A para activar el atajo  la tecla ALT+A

        cancelar = new JButton("Cancelar");
        cancelar.setMnemonic('c');

    }

    private void agregaComponentes(){
        //esta linea convierte  al panel en una rejilla de cinco filas y dos columnas
        setLayout(new GridLayout(5,2));

        //Agrega componentes al panel segun la rejilla  de izquierda a derecha y de arriba a abajo
        add (new JLabel("Servidor", JLabel.RIGHT));
        add(servidor);
        add(new JLabel("Usuario",JLabel.RIGHT));
        add(usuario);
        add(new JLabel("Contraseña",JLabel.RIGHT));
        add(password);
        add(new JLabel("Base de datos",JLabel.RIGHT));
        add(base);
        add(aceptar);
        add(cancelar);
    }
}
