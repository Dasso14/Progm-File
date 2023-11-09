import javax.swing.JFrame;
import javax.swing.JTextArea;

public class ViewFile<JTestArea> extends JFrame {
    private JTextArea areaTexto;
    
    public ViewFile(String s){
        super("Mostrando el contenido de un archivo");
        areaTexto = new JTextArea(s,5,490);
        add(areaTexto);
    }
}
