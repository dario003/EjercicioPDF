import javax.swing.*;

public class DialogoAutenticador extends JDialog {
    //Obsérvese que hereda de JDialog

    public PanelAutenticador panel;

    /*Este programa sólo sirve para
     *mostrar el panel autenticador
     *en un cuadro de diálogo*/
    public DialogoAutenticador() {
        panel = new PanelAutenticador();//Una instancia de nuestro panel autenticador
        add(panel);//agrega el panel autenticador
        setSize(300, 150); //Dimensiona el diálog
    }
}
