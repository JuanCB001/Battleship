import javax.swing.*;

public class Naves extends JPanel {
    static final int AGUA = 0;
    static final int NAVE = 1;

    static public int [][] mar;

    public Naves () {
        mar = new int[10][10];
    }

    public void generarNavio ( int num, int tam ) {
        int i = 0;
        int camino = 0, direc, x, y;
        boolean sigue = true, existe = true;
        while ( i < num ) { // El número de naves que queremos
            do{
                x = ( int ) Math.floor( Math.random() * 10 );
                y = ( int ) Math.floor( Math.random() * 10 );
                // Norte = 1, Oeste = 2, Sur = 3, y Este = 4
                if ( mar[y][x] == 0 ) {
                    camino = 0;
                    direc = ( int ) Math.floor( Math.random() * 4 + 1 );
                    for ( int h = 1; h < tam && existe; h++ ) {
                        if ( direc == 1 ){ // Disminuye y
                            y--;
                            if ( y > -1 )
                                camino += mar[y][x];
                            else
                                existe = false;
                        }
                        if ( direc == 2 ){ // Disminuye x
                            x--;
                            if ( x > -1 )
                                camino += mar[y][x];
                            else
                                existe = false;
                        }
                        if ( direc == 3 ){ // Aumenta y
                            y++;
                            if ( y < 10 )
                                camino += mar[y][x];
                            else
                                existe = false;
                        }
                        if ( direc == 4 ){ // Aumenta x
                            x++;
                            if ( x < 10 )
                                camino += mar[y][x];
                            else
                                existe = false;
                        }
                    }
                    if ( camino == 0 && existe ) {
                        direc = ( direc%2 == 0 ) ? direc - 1 : direc + 1;
                        for ( int h = 0; h < tam; h++ ) {
                            mar[y][x] = this.NAVE;
                            if ( direc == 1 ){ // Disminuye y
                                y--;
                            }
                            if ( direc == 2 ){ // Disminuye x
                                x--;
                            }
                            if ( direc == 3 ){ // Aumenta y
                                y++;
                            }
                            if ( direc == 4 ){ // Aumenta x
                                x++;
                            }

                        }

                    }
                }
            }while( camino > 0 && !existe );
            i++;
        }
    }

    public static void main(String[] args) {
        Naves barcos = new Naves();
        for ( int f = 0; f < 10; f++ ){
            for ( int c = 0; c < 10; c++ ){
                System.out.print(mar[f][c]);
            }
            System.out.println();
        }
        int [] naves = { 3, 1, 2, 2, 1, 3, 1, 4 };
        for ( int x = 0; x < 8; x+=2 ){
            barcos.generarNavio(naves[x], naves[x+1]);
        }
        System.out.println("==================================");
        for ( int f = 0; f < 10; f++ ){
            for ( int c = 0; c < 10; c++ ){
                System.out.print(mar[f][c]);
            }
            System.out.println();
        }
    }
}
