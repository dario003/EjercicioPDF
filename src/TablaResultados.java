import javax.swing.*;

public class TablaResultados extends JScrollPane {

    public ModeloTabla modelo;
    public JTable tabla;

    public TablaResultados (){
        modelo = new ModeloTabla();
        tabla = new JTable(modelo);

        //Las columnas se autoajustan
        tabla.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        setViewportView(tabla); //La tabla se verá dentro del panel de barras de desplazamiento
    }

}
