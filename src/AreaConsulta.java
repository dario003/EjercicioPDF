import javax.swing.*;

public class AreaConsulta extends JScrollPane {
    public JTextArea texto;

    public AreaConsulta() {
        texto=new JTextArea(4,30);
        texto.setLineWrap(true);//Hace que las líneas corten en el límite del área
        texto.setWrapStyleWord(true);//Hace que corten sólo en palabras completas
        setViewportView(texto);//Dentro de las barras se verá le área de texto
        }
}
