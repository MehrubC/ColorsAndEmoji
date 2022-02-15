public class Main
{
    public static void main(String[] args)
    {
        Mehrub mehrub = new Mehrub();
        mehrub.introduce();
        System.out.println();
        mehrub.printFavoriteEmojis();
        System.out.println();
        System.out.println();
        try
        {
            mehrub.animate();
        } catch (Exception e) {}
    }
}