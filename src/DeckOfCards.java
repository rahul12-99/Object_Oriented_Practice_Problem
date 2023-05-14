import java.util.Random;

public class DeckOfCards {
    public static void main(String[] args) {
        int numOfPlayer = 4;
        int cardDistribute = 9;
        Random random = new Random();

        String[][] deck = new String[numOfPlayer][cardDistribute];
        for (int i = 0; i < numOfPlayer; i++) {
            for (int j = 0; j < cardDistribute; j++) {

                String cardType = (String) (random.nextInt(4) + "type");
                if (cardType.equals("0type")) {
                    cardType = "Clubs";
                } else if (cardType.equals("1type")) {
                    cardType = "Diamonds";
                } else if (cardType.equals("2type")) {
                    cardType = "Hearts";
                } else if (cardType.equals("3type")) {
                    cardType = "Spades";
                }

                String cardNum = (String) (random.nextInt(13) + "");
                if (cardNum.equals("1")) {
                    cardNum = "Ace";
                } else if (cardNum.equals("11")) {
                    cardNum = "Jack";
                } else if (cardNum.equals("12")) {
                    cardNum = "Queen";
                } else if (cardNum.equals("0")) {
                    cardNum = "King";
                }

                deck[i][j] = cardNum + " of " + cardType + "  ";
            }
        }

        for (int i = 0; i < numOfPlayer; i++) {
            System.out.print("Player " + (i + 1) + "- ");
            for (int j = 0; j < cardDistribute; j++) {
                System.out.print(deck[i][j] + " ");
            }
            System.out.println();
        }
    }
}
