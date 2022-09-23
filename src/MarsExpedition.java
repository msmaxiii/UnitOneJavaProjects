import java.util.Scanner;

public class MarsExpedition {
    public MarsExpedition () {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Expedition prep program starting...");
        System.out.println("Booting up...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("Ready");

        System.out.println("Hello user, What is your name");
        String name = input.nextLine();

        System.out.println("Hi," + name + "Welcome to the Expedition prep program. \n" + "Are you ready to head out into the newWorld? +\n " + "Type Y orN");

        String excited = input.nextLine();

        if (excited.equalsIgnoreCase("Y")) ;
        System.out.println("I knw you would say that. You are team leader for a reason");
    }
        else
                System.out.println("To bad you are team leader. You have to go");
    {
        System.out.println("How many people do you want on your expedition team?(Input an int number)");

        int teamSize = input.nextInt();
        input.nextLine();
        if (teamSize > 2)
        {
            System.out.println("That's way to many people. We can only send 2 more members");
            teamSize = 2;
        }
        else if (teamSize < 2)
        {
            System.out.println("That's not enough people. We need you and 2 more members.");
            teamSize = 2;
        }
        else if (teamSize == 2)
        {
            System.out.println("That's a perfect sized team. Good job.");
        }
        System.out.print("You are allowed to bring one weapon with you. You know, just in case. What do you want to bring?");
        String weapon = input.nextInt();

        System.out.println("Nice, choice, you will be bringing a weapon with you");

    }
}

