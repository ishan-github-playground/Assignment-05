import java.util.Scanner;

public class Assignment01{
    private static final Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        final String CLEAR = "\033[H\033[2J";
        final String COLOR_BLUE_BOLD = "\033[34;1m";
        final String COLOR_RED_BOLD = "\033[31;1m";
        final String COLOR_GREEN_BOLD = "\033[33;1m";
        final String RESET = "\033[0m";

        final String DASHBOARD = "👷 Welcome to Smart Banking App";
        final String OPEN_ACCOUNT = "➕ Open New Account";
        final String DEPOSIT = "Deposit Money";
        final String WITHDRAW = "Withdraw Money";
        final String TRANSFER="Transfer Money";
        final String CHECK_BALANCE="Check Account Balance";
        final String DROP_ACCOUNT="Drop Existing Accont";
        

        final String ERROR_MSG = String.format("\t%s%s%s\n", COLOR_RED_BOLD, "%s", RESET);
        final String SUCCESS_MSG = String.format("\t%s%s%s\n", COLOR_GREEN_BOLD, "%s", RESET);

        String[] customerIds = new String[0];
        String[] customerNames = new String[0];

        String screen = DASHBOARD;

        do{
            final String APP_TITLE = String.format("%s%s%s",
            COLOR_BLUE_BOLD, screen, RESET);
            System.out.println(CLEAR);
            System.out.println("\t" + APP_TITLE + "\n");

            switch(screen){
                case DASHBOARD:
                    System.out.println("\t[1]. Open New Account");
                    System.out.println("\t[2]. Deposit Money");
                    System.out.println("\t[3]. Withdraw Money");
                    System.out.println("\t[4]. Transfer Money");
                    System.out.println("\t[5]. Check Account Balance");
                    System.out.println("\t[6]. Drop Existing Accont");
                    System.out.println("\t[7]. Exit\n");
                    System.out.print("\tEnter an option to continue: ");
                    int option = scanner.nextInt();
                    scanner.nextLine();

                    switch(option){
                        case 1: screen=OPEN_ACCOUNT;break;
                        case 2: screen=DEPOSIT;break;
                        case 3: screen=WITHDRAW;break;
                        case 4: screen=TRANSFER;break;
                        case 5: screen=CHECK_BALANCE;break;
                        case 6: screen=DROP_ACCOUNT;break;
                        case 7: System.out.println(CLEAR); System.exit(0);
                        default: continue; 
                    }
                    




            }

        }while(true);


    }
}