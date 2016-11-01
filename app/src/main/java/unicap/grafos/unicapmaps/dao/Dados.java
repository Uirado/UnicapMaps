package unicap.grafos.unicapmaps.dao;

/**
 * Created by Cais Automação on 06/10/2016. project Unicap Maps
 */
public class Dados {


    private static int matrizAdjacencias[][] = {
          // A B C D E F G H I J K L M N O P Q R S T U V W G4
            {1,1,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,1,1,0,0,0}, //0  A
            {1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0}, //1  B
            {0,1,1,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0}, //2  C
            {1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}, //3  D
            {0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0}, //4  E
            {0,0,0,0,0,1,0,0,0,0,0,1,0,1,0,0,0,0,1,1,0,0,0,0}, //5  F
            {0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,1,1,0,0,1,0,1}, //6  G
            {0,0,1,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0}, //7  H = Capela
            {0,0,0,0,1,0,0,0,1,1,0,0,0,0,0,0,1,0,0,0,0,0,0,0}, //8  I
            {0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0}, //9 J
            {0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,1,0}, //10 K
            {0,0,0,0,0,1,0,0,0,0,0,1,0,1,0,0,0,0,0,1,0,0,1,0}, //11 L
            {0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0}, //12 M = Biblioteca
            {0,0,0,0,0,1,0,0,0,0,0,1,0,1,1,0,0,0,0,1,0,0,0,0}, //13 N
            {0,0,0,0,0,0,0,0,0,0,1,0,0,1,1,0,0,0,0,0,0,0,0,0}, //14 O
            {1,1,1,0,1,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,1,0,0,0}, //15 P = Estacionamento professores
            {0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,1,0,0,1,1,0,0,0}, //16 Q
            {1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,1,0,0,1,1,0,0}, //17 R
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0}, //18 S = Estacionamento estudantes
            {1,0,0,0,0,1,0,0,0,0,0,1,0,1,0,0,1,1,0,1,0,0,0,0}, //19 T
            {1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,1,0,0,0}, //20 U = Quadra de esportes
            {0,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,0,1,0,0,0,1,0,0}, //21 V = Jardim dos patos
            {0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,1,0}, //22 W
            {0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1}  //23 G4
            // A B C D E F G H I J K L M N O P Q R S T U V W G4
    };

    private static int coordenadasVertices[][] = {
            {0,0}, //0
            {500,500}, //1
            {500,250}, //2
            {250,500}, //3
            {350,0}, //4
            {0,0}, //5
            {0,0}, //6
            {100,300}, //7
            {350,1800}, //8
            {0,0}, //9
            {0,0}, //10
            {0,0}, //11
            {0,0}, //12
            {0,0}, //13
            {0,0}, //14
            {300,500}, //15
            {0,0}, //16
            {0,0}, //17
            {0,0}, //18
            {0,0}, //19
            {0,0}, //20
            {0,0}, //21
            {0,0}, //22
            {0,0}, //23
    };

    public static int[][] getCoordenadasVertices() {
        return coordenadasVertices;
    }

    static int[][] getMatrizAdjacencias() {
        return matrizAdjacencias;
    }


}