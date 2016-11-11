package unicap.grafos.unicapmaps.dao;

import java.util.ArrayList;

/**
 * Created by Cais Automação on 06/10/2016. project Unicap Maps
 */
public class Dados {


   /* private static int matrizAdjacencias[][] = {
     // A B C D E F G H I J K L M N O P Q R S T U V W G4
            {1,1,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,1,1,1,0,0}, //0  A
            {1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0}, //1  B
            {0,1,1,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0}, //2  C
            {1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}, //3  D
            {0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0}, //4  E
            {0,0,0,0,0,1,0,0,0,0,0,1,0,1,0,0,0,0,1,1,0,0,0,0}, //5  F
            {0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,1,1,0,0,1,0,1}, //6  G
            {0,0,1,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0}, //7  H = Capela
            {0,0,0,0,1,0,0,0,1,1,0,0,0,0,0,0,1,0,0,0,0,0,0,0}, //8  I
            {0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0}, //9  J
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
            {0,0,0,0,0,0,1,0,0,0,1,0,1,0,0,0,0,1,0,0,0,1,0,0}, //21 V = Jardim dos patos
            {0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,1,0}, //22 W
            {0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1}  //23 G4
            // A B C D E F G H I J K L M N O P Q R S T U V W G4
    };*/

    private static int matrizAdjacencias[][] = { //matriz nova com arestas simples. recisam passar pro procedimento de espelhamento
          // A B C D E F G H I J K L M N O P Q R S T U V W G4
            {0,1,0,1,1,1,1,0,0,0,0,0,0,0,0,0,0,1,0,1,1,1,0,0}, //0  A
            {0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0}, //1  B
            {0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0}, //2  C
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}, //3  D
            {0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0,1,0,1,1,0,0,0}, //4  E
            {0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,1,1,1,0,0,0,0}, //5  F
            {0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,1,1,1,0,1,0,1}, //6  G
            {0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0}, //7  H = Capela
            {0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0}, //8  I
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}, //9  J
            {0,0,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,0,0,0,0,1,0}, //10 K
            {0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0}, //11 L
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0}, //12 M = Biblioteca
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,1,0,0,0,0}, //13 N
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}, //14 O
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0}, //15 P = Estacionamento professores
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0}, //16 Q
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0}, //17 R
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0}, //18 S = Estacionamento estudantes
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}, //19 T
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}, //20 U = Quadra de esportes
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}, //21 V = Jardim dos patos
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}, //22 W
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}  //23 G4
          // A B C D E F G H I J K L M N O P Q R S T U V W G4
    };

    static String[] nomesBlocos = {
            "Bloco A",
            "Bloco B",
            "Bloco C",
            "Bloco D",
            "Bloco E",
            "Bloco F",
            "Bloco G",
            "Capela",
            "Bloco I",
            "Bloco J",
            "Bloco K",
            "Bloco L",
            "Biblioteca",
            "Bloco N",
            "Bloco O",
            "Estacionamento professores",
            "Bloco Q",
            "Bloco R",
            "Estacionamento estudantes",
            "Bloco T",
            "Quadra de esportes",
            "Jardim",
            "Bloco W",
            "Bloco G4"
        };



    
    public static String[] getNomesBlocos(){
        return nomesBlocos;
    }

    private static int coordenadasVertices[][] = {
            { 587,810}, //0  A
            { 556,810}, //1  B
            { 418,721}, //2  C
            { 661,794}, //3  D
            { 733,508}, //4  E
            { 812,1214}, //5  F
            { 572,1118}, //6  G
            { 437,649}, //7  H = Capela
            { 850,441}, //8  I
            { 870,209}, //9  J
            {1091,1354}, //10 K
            { 863,1275}, //11 L
            { 451,989}, //12 M = Biblioteca
            { 993,1172}, //13 N
            {1086,1172}, //14 O
            { 516,721}, //15 P = Estacionamento professores
            { 752,664}, //16 Q
            { 658,1002}, //17 R
            { 579,1176}, //18 S = Estacionamento estudantes
            { 859,1160}, //19 T
            { 684,636}, //20 U = Quadra de esportes
            { 543,1002}, //21 V = Jardim dos patos
            {1016,1398}, //22 W
            { 343,1116}, //23 G4
    };

    private static int coordenadasComplementares[][][] = {
            {},                                             //I/ARESTA:: id:0 (0 -> 0)      A -> A
            {},                                    //I/ARESTA:: id:1 (0 -> 1)      A -> B
            {},                                    //I/ARESTA:: id:2 (0 -> 3)      A -> D
            {},                                    //I/ARESTA:: id:3 (0 -> 15)     A -> P
            {},              //I/ARESTA:: id:4 (0 -> 17)     A -> R
            {},              //I/ARESTA:: id:5 (0 -> 19)     A -> T
            {},                         //I/ARESTA:: id:6 (0 -> 20)     A -> U
            {},                                             //I/ARESTA:: id:7 (0 -> 21)     A -> V
            {},                                    //I/ARESTA:: id:8 (1 -> 0)      B -> A
            {},                                             //I/ARESTA:: id:9 (1 -> 1)      B -> B
            {},                                    //I/ARESTA:: id:10 (1 -> 2)      B -> C
            {},                                    //I/ARESTA:: id:11 (1 -> 15)    B -> P
            {},                                    //I/ARESTA:: id:12 (2 -> 1)     C -> B
            {},                                             //I/ARESTA:: id:13 (2 -> 2)     C -> C
            {},                                             //I/ARESTA:: id:14 (2 -> 7)     C -> H
            {},                                   //I/ARESTA:: id:15 (2 -> 15)    C -> P
            {},                                    //I/ARESTA:: id:16 (3 -> 0)     D -> A
            {},                                             //I/ARESTA:: id:17 (3 -> 3)     D -> D
            {},                                             //I/ARESTA:: id:18 (4 -> 4)     E -> E
            {},                                       //I/ARESTA:: id:19 (4 -> 8)     E -> I
            {},                                       //I/ARESTA:: id:20 (4 -> 16)    E -> Q
            {},                                       //I/ARESTA:: id:21 (4 -> 20)    E -> U
            {},                                       //I/ARESTA:: id:22 (5 -> 5)     F -> F
            {},                                       //I/ARESTA:: id:23 (5 -> 11)    F -> L
            {},                                       //I/ARESTA:: id:24 (5 -> 13)    F -> N
            {},                                       //I/ARESTA:: id:25 (5 -> 18)    F -> S
            {},                                       //I/ARESTA:: id:26 (5 -> 19)    F -> T
            {},                                       //I/ARESTA:: id:27 (6 -> 6)     G -> G
            {},                                       //I/ARESTA:: id:28 (6 -> 17)    G -> R
            {},                                       //I/ARESTA:: id:29 (6 -> 18)    G -> S
            {},                                       //I/ARESTA:: id:30 (6 -> 21)    G -> V
            {},                                       //I/ARESTA:: id:31 (6 -> 23)    G -> G4
            {},                                       //I/ARESTA:: id:32 (7 -> 2)     H -> C
            {},                                       //I/ARESTA:: id:33 (7 -> 7)     H -> H
            {},                                       //I/ARESTA:: id:34 (7 -> 15)    H -> P
            {},                                       //I/ARESTA:: id:35 (8 -> 4)     I -> E
            {},                                       //I/ARESTA:: id:36 (8 -> 8)     I -> I
            {},                                       //I/ARESTA:: id:37 (8 -> 9)     I -> J
            {},                                       //I/ARESTA:: id:38 (8 -> 16)    I -> Q
            {},                                       //I/ARESTA:: id:39 (9 -> 8)     J -> I
            {},                                       //I/ARESTA:: id:40 (9 -> 9)     J -> J
            {},                                       //I/ARESTA:: id:41 (10 -> 10)   K -> K
            {},                                       //I/ARESTA:: id:42 (10 -> 14)   K -> O
            {},                                       //I/ARESTA:: id:43 (10 -> 22)   K -> W
            {},                                       //I/ARESTA:: id:44 (11 -> 5)    L -> F
            {},                                       //I/ARESTA:: id:45 (11 -> 11)   L -> L
            {},                                       //I/ARESTA:: id:46 (11 -> 13)   L -> N
            {},                                       //I/ARESTA:: id:47 (11 -> 19)   L -> T
            {},                                       //I/ARESTA:: id:48 (11 -> 22)   L -> W
            {},                                       //I/ARESTA:: id:49 (12 -> 12)   M -> M
            {},                                       //I/ARESTA:: id:50 (12 -> 21)   M -> V
            {},                                       //I/ARESTA:: id:51 (13 -> 5)    N -> F
            {},                                       //I/ARESTA:: id:52 (13 -> 11)   N -> L
            {},                                       //I/ARESTA:: id:53 (13 -> 13)   N -> N
            {},                                       //I/ARESTA:: id:54 (13 -> 14)   N -> O
            {},                                       //I/ARESTA:: id:55 (13 -> 19)   N -> T
            {},                                       //I/ARESTA:: id:56 (14 -> 10)   O -> K
            {},                                       //I/ARESTA:: id:57 (14 -> 13)   O -> N
            {},                                       //I/ARESTA:: id:58 (14 -> 14)   O -> O
            {},                                       //I/ARESTA:: id:59 (15 -> 0)    P -> A
            {},                                       //I/ARESTA:: id:60 (15 -> 1)    P -> B
            {},                                       //I/ARESTA:: id:61 (15 -> 2)    P -> C
            {},                                       //I/ARESTA:: id:62 (15 -> 4)    P -> E
            {},                                       //I/ARESTA:: id:63 (15 -> 7)    P -> H
            {},                                       //I/ARESTA:: id:64 (15 -> 15)   P -> P
            {},                                       //I/ARESTA:: id:65 (15 -> 20)   P -> U
            {},                                       //I/ARESTA:: id:66 (16 -> 4)    Q -> E
            {},                                       //I/ARESTA:: id:67 (16 -> 8)    Q -> I
            {},                                       //I/ARESTA:: id:68 (16 -> 16)   Q -> Q
            {},                                       //I/ARESTA:: id:69 (16 -> 19)   Q -> T
            {},                                       //I/ARESTA:: id:70 (16 -> 20)   Q -> U
            {},        //I/ARESTA:: id:71 (17 -> 0)    R -> A
            {},                                       //I/ARESTA:: id:72 (17 -> 6)    R -> G
            {},                                       //I/ARESTA:: id:73 (17 -> 17)   R -> R
            {},                                       //I/ARESTA:: id:74 (17 -> 20)   R -> U
            {},                                       //I/ARESTA:: id:75 (17 -> 21)   R -> V
            {},                                       //I/ARESTA:: id:76 (18 -> 18)   S -> S
            {},          //I/ARESTA:: id:77 (19 -> 0)    T -> A
            {},                                       //I/ARESTA:: id:78 (19 -> 5)    T -> F
            {},                                       //I/ARESTA:: id:79 (19 -> 11)   T -> L
            {},                                       //I/ARESTA:: id:80 (19 -> 13)   T -> N
            {},                                       //I/ARESTA:: id:81 (19 -> 16)   T -> Q
            {},                                       //I/ARESTA:: id:82 (19 -> 17)   T -> R
            {},                                       //I/ARESTA:: id:83 (19 -> 19)   T -> T
            {},                                       //I/ARESTA:: id:84 (20 -> 0)    U -> A
            {},                                       //I/ARESTA:: id:85 (20 -> 4)    U -> E
            {},                                       //I/ARESTA:: id:86 (20 -> 15)   U -> P
            {},                                       //I/ARESTA:: id:87 (20 -> 16)   U -> Q
            {},                                       //I/ARESTA:: id:88 (20 -> 20)   U -> U
            {},                                       //I/ARESTA:: id:89 (21 -> 0)    V -> A
            {},                                       //I/ARESTA:: id:90 (21 -> 6)    V -> G
            {},                                       //I/ARESTA:: id:91 (21 -> 12)   V -> M
            {},                                       //I/ARESTA:: id:92 (21 -> 17)   V -> R
            {},                                       //I/ARESTA:: id:93 (21 -> 21)   V -> V
            {},                                       //I/ARESTA:: id:94 (22 -> 10)   W -> K
            {},                                       //I/ARESTA:: id:95 (22 -> 11)   W -> L
            {},                                       //I/ARESTA:: id:96 (22 -> 22)   W -> W
            {},                                       //I/ARESTA:: id:97 (23 -> 6)    G4-> G
            {}                                        //I/ARESTA:: id:98 (23 -> 23)   G4-> G4
    };
/*
    private static int coordenadasComplementares[][][] = {
            {},                                             //I/ARESTA:: id:0 (0 -> 0)      A -> A
            {{300,409}},                                    //I/ARESTA:: id:1 (0 -> 1)      A -> B
            {{300,395}},                                    //I/ARESTA:: id:2 (0 -> 3)      A -> D
            {{258,375}},                                    //I/ARESTA:: id:3 (0 -> 15)     A -> P
            {{300,441}, {328,441}, {328,495}},              //I/ARESTA:: id:4 (0 -> 17)     A -> R
            {{300,441}, {419,441}, {419,521}},              //I/ARESTA:: id:5 (0 -> 19)     A -> T
            {{303,312}, {340,312}},                         //I/ARESTA:: id:6 (0 -> 20)     A -> U
            {{300,441}, {320,441}, {320,481}, {294,481},{282,486}},                                             //I/ARESTA:: id:7 (0 -> 21)     A -> V
            {{300,409}},                                    //I/ARESTA:: id:8 (1 -> 0)      B -> A
            {},                                             //I/ARESTA:: id:9 (1 -> 1)      B -> B
            {{212,409}},                                    //I/ARESTA:: id:10 (1 -> 2)      B -> C
            {{258,409}},                                    //I/ARESTA:: id:11 (1 -> 15)    B -> P
            {{212,409}},                                    //I/ARESTA:: id:12 (2 -> 1)     C -> B
            {},                                             //I/ARESTA:: id:13 (2 -> 2)     C -> C
            {},                                             //I/ARESTA:: id:14 (2 -> 7)     C -> H
            {{258, 370}},                                   //I/ARESTA:: id:15 (2 -> 15)    C -> P
            {{300,395}},                                    //I/ARESTA:: id:16 (3 -> 0)     D -> A
            {},                                             //I/ARESTA:: id:17 (3 -> 3)     D -> D
            {},                                             //I/ARESTA:: id:18 (4 -> 4)     E -> E
            {},                                       //I/ARESTA:: id:19 (4 -> 8)     E -> I
            {},                                       //I/ARESTA:: id:20 (4 -> 16)    E -> Q
            {},                                       //I/ARESTA:: id:21 (4 -> 20)    E -> U
            {},                                       //I/ARESTA:: id:22 (5 -> 5)     F -> F
            {},                                       //I/ARESTA:: id:23 (5 -> 11)    F -> L
            {},                                       //I/ARESTA:: id:24 (5 -> 13)    F -> N
            {},                                       //I/ARESTA:: id:25 (5 -> 18)    F -> S
            {},                                       //I/ARESTA:: id:26 (5 -> 19)    F -> T
            {},                                       //I/ARESTA:: id:27 (6 -> 6)     G -> G
            {},                                       //I/ARESTA:: id:28 (6 -> 17)    G -> R
            {},                                       //I/ARESTA:: id:29 (6 -> 18)    G -> S
            {},                                       //I/ARESTA:: id:30 (6 -> 21)    G -> V
            {},                                       //I/ARESTA:: id:31 (6 -> 23)    G -> G4
            {},                                       //I/ARESTA:: id:32 (7 -> 2)     H -> C
            {},                                       //I/ARESTA:: id:33 (7 -> 7)     H -> H
            {},                                       //I/ARESTA:: id:34 (7 -> 15)    H -> P
            {},                                       //I/ARESTA:: id:35 (8 -> 4)     I -> E
            {},                                       //I/ARESTA:: id:36 (8 -> 8)     I -> I
            {},                                       //I/ARESTA:: id:37 (8 -> 9)     I -> J
            {},                                       //I/ARESTA:: id:38 (8 -> 16)    I -> Q
            {},                                       //I/ARESTA:: id:39 (9 -> 8)     J -> I
            {},                                       //I/ARESTA:: id:40 (9 -> 9)     J -> J
            {},                                       //I/ARESTA:: id:41 (10 -> 10)   K -> K
            {},                                       //I/ARESTA:: id:42 (10 -> 14)   K -> O
            {},                                       //I/ARESTA:: id:43 (10 -> 22)   K -> W
            {},                                       //I/ARESTA:: id:44 (11 -> 5)    L -> F
            {},                                       //I/ARESTA:: id:45 (11 -> 11)   L -> L
            {},                                       //I/ARESTA:: id:46 (11 -> 13)   L -> N
            {},                                       //I/ARESTA:: id:47 (11 -> 19)   L -> T
            {},                                       //I/ARESTA:: id:48 (11 -> 22)   L -> W
            {},                                       //I/ARESTA:: id:49 (12 -> 12)   M -> M
            {},                                       //I/ARESTA:: id:50 (12 -> 21)   M -> V
            {},                                       //I/ARESTA:: id:51 (13 -> 5)    N -> F
            {},                                       //I/ARESTA:: id:52 (13 -> 11)   N -> L
            {},                                       //I/ARESTA:: id:53 (13 -> 13)   N -> N
            {},                                       //I/ARESTA:: id:54 (13 -> 14)   N -> O
            {},                                       //I/ARESTA:: id:55 (13 -> 19)   N -> T
            {},                                       //I/ARESTA:: id:56 (14 -> 10)   O -> K
            {},                                       //I/ARESTA:: id:57 (14 -> 13)   O -> N
            {},                                       //I/ARESTA:: id:58 (14 -> 14)   O -> O
            {{258,375}},                                       //I/ARESTA:: id:59 (15 -> 0)    P -> A
            {{258,409}},                                       //I/ARESTA:: id:60 (15 -> 1)    P -> B
            {{258,370}},                                       //I/ARESTA:: id:61 (15 -> 2)    P -> C
            {},                                       //I/ARESTA:: id:62 (15 -> 4)    P -> E
            {},                                       //I/ARESTA:: id:63 (15 -> 7)    P -> H
            {},                                       //I/ARESTA:: id:64 (15 -> 15)   P -> P
            {},                                       //I/ARESTA:: id:65 (15 -> 20)   P -> U
            {},                                       //I/ARESTA:: id:66 (16 -> 4)    Q -> E
            {},                                       //I/ARESTA:: id:67 (16 -> 8)    Q -> I
            {},                                       //I/ARESTA:: id:68 (16 -> 16)   Q -> Q
            {},                                       //I/ARESTA:: id:69 (16 -> 19)   Q -> T
            {},                                       //I/ARESTA:: id:70 (16 -> 20)   Q -> U
            {{342,495}, {342,441}, {300,441}},        //I/ARESTA:: id:71 (17 -> 0)    R -> A
            {},                                       //I/ARESTA:: id:72 (17 -> 6)    R -> G
            {},                                       //I/ARESTA:: id:73 (17 -> 17)   R -> R
            {},                                       //I/ARESTA:: id:74 (17 -> 20)   R -> U
            {},                                       //I/ARESTA:: id:75 (17 -> 21)   R -> V
            {},                                       //I/ARESTA:: id:76 (18 -> 18)   S -> S
            {{419,521},{419,441},{300,441}},          //I/ARESTA:: id:77 (19 -> 0)    T -> A
            {},                                       //I/ARESTA:: id:78 (19 -> 5)    T -> F
            {},                                       //I/ARESTA:: id:79 (19 -> 11)   T -> L
            {},                                       //I/ARESTA:: id:80 (19 -> 13)   T -> N
            {},                                       //I/ARESTA:: id:81 (19 -> 16)   T -> Q
            {},                                       //I/ARESTA:: id:82 (19 -> 17)   T -> R
            {},                                       //I/ARESTA:: id:83 (19 -> 19)   T -> T
            {},                                       //I/ARESTA:: id:84 (20 -> 0)    U -> A
            {},                                       //I/ARESTA:: id:85 (20 -> 4)    U -> E
            {},                                       //I/ARESTA:: id:86 (20 -> 15)   U -> P
            {},                                       //I/ARESTA:: id:87 (20 -> 16)   U -> Q
            {},                                       //I/ARESTA:: id:88 (20 -> 20)   U -> U
            {},                                       //I/ARESTA:: id:89 (21 -> 0)    V -> A
            {},                                       //I/ARESTA:: id:90 (21 -> 6)    V -> G
            {{258,501},{240,496}},                                       //I/ARESTA:: id:91 (21 -> 12)   V -> M
            {},                                       //I/ARESTA:: id:92 (21 -> 17)   V -> R
            {},                                       //I/ARESTA:: id:93 (21 -> 21)   V -> V
            {},                                       //I/ARESTA:: id:94 (22 -> 10)   W -> K
            {},                                       //I/ARESTA:: id:95 (22 -> 11)   W -> L
            {},                                       //I/ARESTA:: id:96 (22 -> 22)   W -> W
            {},                                       //I/ARESTA:: id:97 (23 -> 6)    G4-> G
            {}                                        //I/ARESTA:: id:98 (23 -> 23)   G4-> G4
    };
    */


    public static int[][] getCoordenadasVertices() {
        return coordenadasVertices;
    }

    static int[][] getMatrizAdjacencias() {
        return matrizAdjacencias;
    }


    public static int[][][] getCoordenadasComplementares() {
        return coordenadasComplementares;
    }
}

