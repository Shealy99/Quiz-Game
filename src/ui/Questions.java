package ui;

public class Questions {

    String[] questions1;
    String[] questions2;
    String[] questions3;
    String[] questions4;

    String[] alt11 = {"ZINK", "HEKUR", "KALIUM", "KALCIUM"};
    String[] alt12 = {"320K", "200K", "440K", "600K"};
    String[] alt13 = {"GREKET", "ROMAKET", "ZUPUZ", "TIMOCHARIS"};
    String[] alt14 = {"59", "458", "365", "28"};
    String[] alt21 = {"Maat Mons", "Magellan Mons", "Sen Mons", "Theia Mons"};
    String[] alt22 = {"457C", "221C", "168C", "639C"};
    String[] alt23 = {"23 milion km ", "80 milion km ", "122 milion km ", "40 milion km "};
    String[] alt24 = {"0.62 vite toke", "1.68 vite toke", "0.82 vite toke", "0.31 vite toke"};
    String[] alt31 = {"FLORI DHE NIKEL", "ZINK DHE KALIUM", "HEKUR DHE NIKEL", "BAKER DHE HEKUR"};
    String[] alt32 = {"ANGLI", "AUSTRALI", "ITALI", "JAPONI"};
    String[] alt33 = {"VOSTOK", "BAIKAL", "CASPIAN", "MARIANA TRENCH"};
    String[] alt34 = {"MALI EVEREST", "MALI I BARDHE", "KILIMANXHARO", "MALI K2"};
    String[] alt41 = {"Liqen", "Atmosfere", "Toke", "Berthame"};
    String[] alt42 = {"Perendise Greke te luftes", "Perendise romake te luftes", "Marses", "Zeusit"};
    String[] alt43 = {"35kg", "45kg", "55kg", "65kg"};
    String[] alt44 = {"6000km", "7000km", "6400km", "7400km"};
    String[] sakt1 = {"HEKUR", "440K", "ROMAKET", "59"};
    String[] sakt2 = {"Theia Mons", "457C", "40 milion km ", "0.62 vite toke"};
    String[] sakt3 = {"HEKUR DHE NIKEL", "AUSTRALI", "MARIANA TRENCH", "MALI K2"};
    String[] sakt4 = {"Toke", "Perendise romake te luftes", "35kg", "6400km"};

    public Questions() {
        init();
    }

    private void init() {
        questions1 = new String[4];
        questions2 = new String[4];
        questions3 = new String[4];
        questions4 = new String[4];

        questions1[0] = "Cili eshte elementi qe gjendet me shume ne Merkur?";
        questions1[1] = "Cila eshte temperatura mesatare e  Merkurit?";
        questions1[2] = "Prej kujt e mori emrin Merkuri?";
        questions1[3] = "Per sa dite ben Merkuri nje rrotullim rreth Diellit?";

        questions2[0] = "Cili eshte vullkani me i madh ne Venus?";
        questions2[1] = "Cila eshte temperatura mesatare e  Venusit?";
        questions2[2] = "Sa larg Tokes eshte Venusi?";
        questions2[3] = "Per sa dite ben Venusi nje rroutllim rreth Diellit?";

        questions3[0] = "Metalet me te gjetur ne koren e Tokes jane:";
        questions3[1] = "Ne cilin shtet gjendet \"The Great Barrier Reef\" ?";
        questions3[2] = "Cili eshte emri i zones me te thelle ne oqean?";
        questions3[3] = "Cili eshte mali me i rrezikshem per te ngjitur?";

        questions4[0] = "Ne cilen pjese te Marsit eshte gjetur uje?";
        questions4[1] = "Prej kujt e ka marre emrin planeti Mars??";
        questions4[2] = "Sa do peshonin 45 kg ne Mars?";
        questions4[3] = "Sa eshte diametri i Marsit?";

    }

}
