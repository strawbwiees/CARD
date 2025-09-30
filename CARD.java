import javax.swing.JOptionPane;

public class CARD {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter cards (ex. legendary;10 rare;5 epic;3):");

        if (input == null) {
            System.out.println("No input provided.");
            return;
        }

        String[] cards = input.trim().split("\\s+");

        System.out.println("Cards entered:\r");
        for (String card : cards) {
            if (card.contains(";")) {
                String[] parts = card.split(";");
                if (parts.length == 2) {
                    System.out.println(parts[0] + " " + parts[1] + "\r");
                } else {
                    System.out.println("Invalid card format: " + card + "\r");
                }
            } else {
                System.out.println("Invalid card format: " + card + "\r");
            }
        }
    }
}
