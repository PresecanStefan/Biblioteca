import java.util.ArrayList;

public class Carte implements Comparable<Carte>{

    String titlu;
    String autor;
    ArrayList<Pagina>pagini;

    public Carte(String titlu, String autor, int nrPagini) {
        this.titlu = titlu;
        this.autor = autor;
        this.pagini = new ArrayList<>();
        for (int i = 0; i < nrPagini; i++) {
            pagini.add(new Pagina());
        }
    }

    public String getTitlu() {
        return titlu;
    }

    public String getAutor() {
        return autor;
    }

    public int getNrPagini() {
        return pagini.size();
    }

    public String getTextOnPage(int nrPagini) {
        if (nrPagini >= 1 && nrPagini <= pagini.size()) {
            return pagini.get(nrPagini - 1).getText();
        } else {
            return "Eroare";
        }
    }

    public void setTextOnPage(int paginaCurenta, String text) {
        if (paginaCurenta >= 1 && paginaCurenta <= pagini.size()) {
            pagini.get(paginaCurenta - 1).setText(text);
        } else {
            System.out.println("Eroare");
        }
    }

    @Override
    public String toString() {
        return "Titlu: " + titlu + ", Autor: " + autor + ", Numar Pagini: " + pagini.size();
    }

    @Override
    public int compareTo(Carte otherBook) {
        // Compare by author first, then by title if authors are the same
        int authorComparison = this.autor.compareTo(otherBook.autor);
        if (authorComparison == 0) {
            return this.titlu.compareTo(otherBook.titlu);
        }
        return authorComparison;
    }
}
