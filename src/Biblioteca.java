import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Biblioteca {
    private ArrayList<Carte> carti;

    public Biblioteca(){
        carti = new ArrayList<>();
    }

    public void addBook(Carte carte){
        carti.add(carte);
    }

    public void afiseazaBiblioteca() {
        for (Carte carte : carti) {
            System.out.println(carte);
        }
    }

    public void sortLibrary() {
        Collections.sort(carti);
    }




}
