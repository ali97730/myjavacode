public class MegaBytesConvertor {

    public static void printMegaBytesAndKiloBytes(int kilobytes)
    {

        if(kilobytes < 0)
        {
            System.out.println("invalid value");
        }
        else {
            int megabytes;
            megabytes = Math.round(kilobytes / 1024);
            int afterkilobytes = kilobytes - (megabytes * 1024);
            System.out.println(kilobytes + " KB=" + megabytes + " MB and " + afterkilobytes + " KB");
        }
    }
}
