import java.awt.event.ActionEvent;

public class Controlador {
    Conector conMySQL;

    public Controlador(){

    }

    public void acciones(VentanaConsultas visor, ActionEvent evt){
        Object clicado=evt.getSource();
        if(clicado==visor.autenticador.panel.aceptar){
            String host=visor.autenticador.panel.servidor.getText();
            String usuario=visor.autenticador.panel.usuario.getText();
            String pw=new String(visor.autenticador.panel.password.getPassword());
            String base=visor.autenticador.panel.base.getText();
            conMySQL=new Conector(host,usuario,pw,base);
            if(conMySQL.getConexion()!=null)
                visor.autenticador.dispose();
            else
                muestraError("El error que manda MySQL es:\n"+conMySQL.getMensajeError());
        }
        if(clicado==visor.botones.consultar){
            ConsultaSQL consulta=new ConsultaSQL(conMySQL.getConexion(),visor.area.texto.getText());
            if(consulta.getMensajeError()==null)
                visor.resultados.modelo.setDataVector (consulta.getDatosDevueltos(),consulta.getNombresColumnas());
            else
                muestraError("El error que manda MySQL es:\n"+consulta.getMensajeError());
        }
        if(clicado==visor.autenticador.panel.cancelar||clicado==visor.botones.salir)
            System.exit(0);
    }

    private void muestraError( String e){
        javax.swing.JOptionPane.showMessageDialog(null,e);
    }

    public static void main(String[] args) {
        new VentanaConsultas();

    }

}

