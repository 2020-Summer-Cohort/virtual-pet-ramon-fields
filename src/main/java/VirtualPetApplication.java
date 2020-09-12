import java.util.Scanner;

public class VirtualPetApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        VirtualPet agumon = new VirtualPet();
        //Input and Output
        System.out.println("----------------------------");
        System.out.println("Welcome to the Digital World");
        System.out.println("----------------------------");
        System.out.println("----------------------------------");
        System.out.println("Meet Agumon your very own Digimon.");
        System.out.println("----------------------------------");
        System.out.println("Hunger: " + agumon.getHunger());
        System.out.println("Thirst: " + agumon.getThirst());
        System.out.println("Boredom: " + agumon.getBoredom());
        System.out.println("Tiredness: " + agumon.getTiredness());
        System.out.println("-----------------------");
        System.out.println("What do you want to do?");
        System.out.println("-----------------------");
        System.out.println("Press 1 to Feed");
        System.out.println("Press 2 to Quench thirst");
        System.out.println("Press 3 to Digivolve");
        System.out.println("Press 4 to Rest");
        System.out.println("Press 5 to Exit");
        System.out.println("-----------------------");
        String userInput = input.nextLine();

        while (!userInput.equals("5")) {

            switch (userInput) {
                case "1":
                    agumon.feed();
                    agumon.tick();
                    System.out.println("You gave Agumon some food.");
                    System.out.println("-----------------------");
                    System.out.println("Hunger: " + agumon.getHunger());
                    System.out.println("Thirst: " + agumon.getThirst());
                    System.out.println("Boredom: " + agumon.getBoredom());
                    System.out.println("Tiredness: " + agumon.getTiredness());
                    break;
                case "2":
                    agumon.quenchThirst();
                    agumon.tick();
                    System.out.println("You gave Agumon some water.");
                    System.out.println("-----------------------");
                    System.out.println("Hunger: " + agumon.getHunger());
                    System.out.println("Thirst: " + agumon.getThirst());
                    System.out.println("Boredom: " + agumon.getBoredom());
                    System.out.println("Tiredness: " + agumon.getTiredness());
                    break;
                case "3":
                    agumon.digivolve();
                    agumon.tick();
                    System.out.println("You Digivolved Agumon.");
                    System.out.println("-----------------------");
                    System.out.println("Hunger: " + agumon.getHunger());
                    System.out.println("Thirst: " + agumon.getThirst());
                    System.out.println("Boredom: " + agumon.getBoredom());
                    System.out.println("Tiredness: " + agumon.getTiredness());
                    break;
                case "4":
                    agumon.rest();
                    agumon.tick();
                    System.out.println("You let Agumon rest.");
                    System.out.println("-----------------------");
                    System.out.println("Hunger: " + agumon.getHunger());
                    System.out.println("Thirst: " + agumon.getThirst());
                    System.out.println("Boredom: " + agumon.getBoredom());
                    System.out.println("Tiredness: " + agumon.getTiredness());
                    break;
                default:
                    System.out.println("Not an option...");
                    break;
            }
            System.out.println("What do you want to do?");
            System.out.println("Press 1 to Feed");
            System.out.println("Press 2 to Quench thirst");
            System.out.println("Press 3 to Digivolve");
            System.out.println("Press 4 to Rest");
            System.out.println("Press 5 to Exit");
            userInput = input.nextLine();
        }
        input.close();
    }
}

