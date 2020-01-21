import javax.swing.*;

public class Celda extends JButton {
    public static final int AGUA = 0;
    public static final int NAVE = 1;
    public static ImageIcon[] iconos = new ImageIcon[2];
    private int valor;

    public Celda () {
        valor = AGUA;

    }


    public int getValor() {
        return valor;
    }

    public void setValor (int valor) {
        this.valor = valor;
        setIcon(iconos[valor]);
    }

    public void reiniciar () {
        setValor(AGUA);
    }

    public boolean estaLibre () {
        return getIcon() == null;
    }
}
