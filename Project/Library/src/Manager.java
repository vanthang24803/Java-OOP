import java.util.ArrayList;
import java.util.List;

public class Manager {
    private List<Card> cards;

    public Manager() {
        this.cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        this.cards.add(card);
    }

    public boolean removeCard(String id) {
        Card card = this.cards.stream().filter(
                t -> t.getId().equals(id)).findFirst().orElse(null);
        if(card != null) {
            this.cards.remove(card);
            return true;
        }
        else {
            return false;
        }
    }

    public void display(){
        this.cards.forEach(card ->System.out.println(card.toString()));
    }

}
