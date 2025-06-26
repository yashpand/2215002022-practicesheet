import java.util.Scanner;

 class RockPaperSesorGame {

    
    public static String getComputerChoice() {
        int random = (int)(Math.random() * 3); // 0, 1, or 2
        if (random == 0) return "rock";
        else if (random == 1) return "paper";
        else return "scissors";
    }

    
    public static String determineWinner(String user, String computer) {
        if (user.equals(computer)) {
            return "Draw";
        } else if (
            (user.equals("rock") && computer.equals("scissors")) ||
            (user.equals("paper") && computer.equals("rock")) ||
            (user.equals("scissors") && computer.equals("paper"))
        ) {
            return "User";
        } else {
            return "Computer";
        }
    }

    
    public static void displayResults(String[][] rounds, int userWins, int computerWins, int draws) {
        System.out.println("\nGame Results:");
        System.out.println("Round\tUser\tComputer\tWinner");
        System.out.println("------------------------------------------");
        for (int i = 0; i < rounds.length; i++) {
            System.out.println((i + 1) + "\t" + rounds[i][0] + "\t" + rounds[i][1] + "\t\t" + rounds[i][2]);
        }

        int totalGames = rounds.length;
        double userPercent = (userWins * 100.0) / totalGames;
        double computerPercent = (computerWins * 100.0) / totalGames;

        System.out.println("\nFinal Statistics:");
        System.out.println("User Wins: " + userWins);
        System.out.println("Computer Wins: " + computerWins);
        System.out.println("Draws: " + draws);
        System.out.println("User Winning %: " + String.format("%.2f", userPercent) + "%");
        System.out.println("Computer Winning %: " + String.format("%.2f", computerPercent) + "%");
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rounds: ");
        int roundsCount = scanner.nextInt();
        scanner.nextLine(); // consume newline

        String[][] gameResults = new String[roundsCount][3];
        int userWins = 0, computerWins = 0, draws = 0;

        for (int i = 0; i < roundsCount; i++) {
            System.out.print("\nRound " + (i + 1) + " - Enter your choice (rock/paper/scissors): ");
            String userChoice = scanner.nextLine().toLowerCase();

            String computerChoice = getComputerChoice();
            String winner = determineWinner(userChoice, computerChoice);

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) computerWins++;
            else draws++;

            gameResults[i][0] = userChoice;
            gameResults[i][1] = computerChoice;
            gameResults[i][2] = winner;
        }

        displayResults(gameResults, userWins, computerWins, draws);
    }
}
