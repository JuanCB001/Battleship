import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Battleship extends JFrame {
    private Image icono;
    private JPanel superior;
    private JPanel tableros;
    private JButton reset;
    private JLabel turno;

    public Battleship () {
        super("Batalla Naval");
        icono = new ImageIcon("images/battleship.png").getImage();
        setIconImage(icono);
        setLayout(new BorderLayout());
        setSize(1000,600);
        setLocation(100,50);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        superior = new JPanel();
        superior.setLayout(new BorderLayout());
        reset = new JButton("Reiniciar Juego");
        reset.setIcon(new ImageIcon("images/reset.png"));
        superior.add(reset, BorderLayout.WEST);
        turno = new JLabel("Turno");
        turno.setHorizontalAlignment(JLabel.CENTER);
        superior.add(turno, BorderLayout.CENTER);
        superior.setBorder(new EmptyBorder(10, 15, 10, 15));
        add(superior, BorderLayout.NORTH);
        tableros = new JPanel();
        tableros.setLayout(new GridLayout(1,2));
        JPanel tab1 = new JPanel();
        tab1.setBorder(BorderFactory.createTitledBorder("Jugador 1"));
        tab1.setLayout(new BorderLayout());
        JPanel cuadros1 = new JPanel();
        cuadros1.setLayout(new GridLayout(10,10));
        for (int x=1; x<=100; x++) {
            Celda cuadro = new Celda();
            //cuadro.addActionListener(new ManejadorCelda());
            cuadros1.add(cuadro);
        }
        tab1.add(cuadros1, BorderLayout.CENTER);
        NavesInfo p1 = new NavesInfo();
        tab1.add(p1, BorderLayout.SOUTH);
        p1.setBorder(new EmptyBorder(10, 15, 10, 15));
        JPanel tab2 = new JPanel();
        tab2.setBorder(BorderFactory.createTitledBorder("Jugador 2"));
        tab2.setLayout(new BorderLayout());
        JPanel cuadros2 = new JPanel();
        cuadros2.setLayout(new GridLayout(10,10));
        for (int x=1; x<=100; x++) {
            Celda cuadro = new Celda();
            //cuadro.addActionListener(new ManejadorCelda());
            cuadros2.add(cuadro);
        }
        tab2.add(cuadros2, BorderLayout.CENTER);
        NavesInfo p2 = new NavesInfo();
        tab2.add(p2, BorderLayout.SOUTH);
        p2.setBorder(new EmptyBorder(10, 15, 10, 15));
        tableros.add(tab1);
        tableros.add(tab2);
        tableros.setBorder(new EmptyBorder(10,15,10,15));
        add(tableros,BorderLayout.CENTER);
        setVisible(true);
    }

    public static void main(String[] args) {
        Battleship batalla = new Battleship();
    }
    class ManejadorCelda implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
}
