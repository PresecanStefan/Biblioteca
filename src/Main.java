import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /*ArrayList<Carte>biblioteca = new ArrayList<Carte>();

        Carte carte1 = new Carte("Harap Alb","Ion Creanga");
        Pagina pagina1 = new Pagina(1, "Prima pagina");
        Pagina pagina2 = new Pagina(2, "A doua pagina");

        carte1.addPagina(pagina1);
        carte1.addPagina(pagina2);

        Carte carte2 = new Carte("Luceafarul","Mihai Eminescu");
        pagina1 = new Pagina(1, "Prima pagina");
        pagina2 = new Pagina(2, "A doua pagina");

        carte2.addPagina(pagina1);
        carte2.addPagina(pagina2);

        Carte carte3 = new Carte("Ion","Liviu Rebreanu");
        pagina1 = new Pagina(1, "Prima pagina");
        pagina2 = new Pagina(2, "A doua pagina");

        carte3.addPagina(pagina1);
        carte3.addPagina(pagina2);

        Carte carte4 = new Carte("Amintiri din Copilarie","Ion Creanga");
        pagina1 = new Pagina(1, "Prima pagina");
        pagina2 = new Pagina(2, "A doua pagina");

        carte4.addPagina(pagina1);
        carte4.addPagina(pagina2);


        biblioteca.add(carte1);
        biblioteca.add(carte2);
        biblioteca.add(carte3);
        biblioteca.add(carte4);



        for(var car:biblioteca){
            System.out.println(car.getCarte());
        }*/
    Biblioteca biblioteca=new Biblioteca();

    Carte carte3= new Carte("Ion","Liviu Rebreanu",250);
    carte3.setTextOnPage(1,"Povestea lui Ion");
    biblioteca.addBook(carte3);


    Carte carte1= new Carte("Harap-Alb","Ion Creanga",150);
    carte1.setTextOnPage(1,"Povestea lui Harap-Alb");
    biblioteca.addBook(carte1);

    Carte carte2= new Carte("Trei iezi","Ion Creanga",150);
    carte2.setTextOnPage(1,"Capra cu trei iezi");
    biblioteca.addBook(carte2);


    biblioteca.sortLibrary();

    biblioteca.afiseazaBiblioteca();
    }
}