import java.util.ArrayList;

public class Auction {
    private ArrayList<Lot> lots;

    public Auction() {
        lots = new ArrayList<>();
    }

    public void addLot(Lot lot) {
        lots.add(lot);
    }

    public void showLots() {
        for (Lot lot : lots) {
            System.out.println(lot);
        }
    }

    public Lot getLot(int lotNumber) {
        for (Lot lot : lots) {
            if (lot.getLotNumber() == lotNumber) {
                return lot;
            }
        }
        return null;
    }
}
