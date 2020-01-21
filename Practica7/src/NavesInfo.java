import javax.swing.*;
import java.awt.*;

public class NavesInfo extends JPanel {
    private JLabel nTotales;
    private JLabel portaviones;
    private JLabel submarinos;
    private JLabel destructores;
    private JLabel fragatas;
    private JLabel num1;
    private JLabel num2;
    private JLabel num3;
    private JLabel num4;
    private JLabel num5;

    public NavesInfo () {
        nTotales = new JLabel("Naves enemigas restantes: ");
        portaviones = new JLabel("Portaviones: ");
        submarinos = new JLabel("Submarino: ");
        destructores = new JLabel("Destructores: ");
        fragatas = new JLabel("Fragatas: ");
        num1 = new JLabel("0");
        num2 = new JLabel("0");
        num3 = new JLabel("0");
        num4 = new JLabel("0");
        num5 = new JLabel("0");
        setLayout(new GridLayout(5,2));
        add(nTotales);
        add(num1);
        add(portaviones);
        add(num2);
        add(submarinos);
        add(num3);
        add(destructores);
        add(num4);
        add(fragatas);
        add(num5);
    }

    public void setNTotales (int n) {
        nTotales.setText(String.valueOf(n));
    }
}