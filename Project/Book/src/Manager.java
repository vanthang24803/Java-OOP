import java.util.ArrayList;
import java.util.List;

public class Manager {
    List<Document> documents;

    public Manager() {
        this.documents = new ArrayList<>();
    }
    // Add

    public void addDocument(Document document) {
        this.documents.add(document);
    }

    // Delete

    public boolean deleteDocument(String id) {
        Document doc = this.documents.stream()
                .filter(document -> document.getId().equals(id))
                .findFirst().orElse(null);
        if (doc == null) {
            return false;
        }
        this.documents.remove(doc);
        return true;
    }

    //Show 

    public void showInfor(){
        this.documents.forEach(
            documents -> System.out.println(documents.toString()));
    }

    //Search Book

    public void searchByBook(){
        this.documents.stream().filter(
            doc -> doc instanceof Book
        ).forEach(doc -> System.out.println(doc.toString()));
    }

    //Search Newpaper

    public void searchByNewpaper(){
        this.documents.stream().filter(
            doc -> doc instanceof Newpaper
        ).forEach(doc -> System.out.println(doc.toString()));
    }

    //Search Journal

    public void searchByJournal(){
        this.documents.stream().filter(
            doc -> doc instanceof Journal
        ).forEach(doc -> System.out.println(doc.toString()));
    }
}
