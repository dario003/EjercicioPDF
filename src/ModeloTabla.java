import javax.swing.table.DefaultTableModel;

public class ModeloTabla extends DefaultTableModel {

    public ModeloTabla() {

//Dimensiona la tabla para la presentación inicial
        setColumnCount(7);
        setRowCount(30);
    }
}
