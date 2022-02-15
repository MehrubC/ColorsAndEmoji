public class Mehrub
{

    private final String BLUE = "\033[0;34m";
    private final String RED = "\u001B[31m";
    private final String BROWN = "\u001B[33m";
    private final String WHITE = "\u001B[37m";
    private final String BLACK = "\u001B[30m";
    private final String CYAN = "\u001B[36m";
    private final String BLUE_BRIGHT = "\033[0;94m";
    private final String PURPLE = "\033[0;35m";
    private final String name = "Mehrub";

    private final String CLOWN_EMOJI = "\uD83E\uDD21";

    private String aboutMe;

    // constructor
    public Mehrub()
    {
        aboutMe = "";
    }

    public void introduce()
    {
        System.out.println(CYAN + "Hello," + BLACK + " my name is " + RED + name);
        System.out.println(BLUE + "and I am" + PURPLE + " a student at" + BROWN + " Brooklyn Tech!");
        System.out.println(BLUE_BRIGHT + "Nice to meet you!");
    }

    public void printFavoriteEmojis()
    {
        System.out.println(BLUE + "These " + RED + "are " + BLACK + "my " + CYAN + "favorite " + PURPLE + "emojis: ");
        System.out.println("Skull: " + BLACK + "\uD83D\uDC80");
        System.out.println("ROFL: " + CYAN + "\uD83E\uDD23");
        System.out.println("Clown: " + RED + CLOWN_EMOJI);
        System.out.println("Yawning: " + WHITE + "\uD83E\uDD71");
    }

    public void animate() throws InterruptedException
    {
        System.out.println("One day, Mehrub was on his way to school.");
        Thread.sleep(2000);
        System.out.println( BROWN + "                          _____________________");
        System.out.println("                          |      BK TECH      |");
        System.out.println("                          |                   |");
        System.out.println("                          |        __         |");
        System.out.println(RED + CLOWN_EMOJI + BROWN + "                        |        | |        |");
        System.out.println();
        Thread.sleep(500);

        System.out.println( BROWN + "                          _____________________");
        System.out.println("                          |      BK TECH      |");
        System.out.println("                          |                   |");
        System.out.println("                          |        __         |");
        System.out.println(RED + "   " + CLOWN_EMOJI + BROWN + "                     |        | |        |");
        System.out.println();
        Thread.sleep(500);

        System.out.println( BROWN + "                          _____________________");
        System.out.println("                          |      BK TECH      |");
        System.out.println("                          |                   |");
        System.out.println("                          |        __         |");
        System.out.println(RED + "     " + CLOWN_EMOJI + BROWN + "                   |        | |        |");
        System.out.println();
        Thread.sleep(500);

        System.out.println( BROWN + "                          _____________________");
        System.out.println("                          |      BK TECH      |");
        System.out.println("                          |                   |");
        System.out.println("                          |        __         |");
        System.out.println(RED + "        " + CLOWN_EMOJI + BROWN + "                |        | |        |");
        System.out.println();
        Thread.sleep(500);

        System.out.println(CYAN + "Then along the way, he got tired.");
        Thread.sleep(2000);
        System.out.println( BROWN + "                          _____________________");
        System.out.println("                          |      BK TECH      |");
        System.out.println("                          |                   |");
        System.out.println("                          |        __         |");
        System.out.println(BLACK + "        " + "\uD83E\uDD71" + BROWN + "                |        | |        |");
        System.out.println();
        Thread.sleep(1000);

        System.out.println(PURPLE + "After 5 years of thinking, Mehrub finally decided to go home since he was tired.");
        Thread.sleep(2000);

        System.out.println( BROWN + "                          _____________________");
        System.out.println("                          |      BK TECH      |");
        System.out.println("                          |                   |");
        System.out.println("                          |        __         |");
        System.out.println(RED + "     " + CLOWN_EMOJI + BROWN + "                   |        | |        |");
        System.out.println();
        Thread.sleep(500);

        System.out.println( BROWN + "                          _____________________");
        System.out.println("                          |      BK TECH      |");
        System.out.println("                          |                   |");
        System.out.println("                          |        __         |");
        System.out.println(RED + "   " + CLOWN_EMOJI + BROWN + "                     |        | |        |");
        System.out.println();
        Thread.sleep(500);

        System.out.println( BROWN + "                          _____________________");
        System.out.println("                          |      BK TECH      |");
        System.out.println("                          |                   |");
        System.out.println("                          |        __         |");
        System.out.println(RED + CLOWN_EMOJI + BROWN + "                        |        | |        |");
        System.out.println();
        Thread.sleep(500);

        System.out.println( BROWN + "                          _____________________");
        System.out.println("                          |      BK TECH      |");
        System.out.println("                          |                   |");
        System.out.println("                          |        __         |");
        System.out.println("                          |        | |        |");
        System.out.println();
        Thread.sleep(500);




    }

}