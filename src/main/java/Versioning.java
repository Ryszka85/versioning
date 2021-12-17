import java.text.MessageFormat;

public class Versioning {
    public static void main(String[] args) {
        String consoleMessage = MessageFormat.format(
                """
                        #######################################
                        Current Application Version : {0}
                        #######################################
                        """ ,
                Versioning.class.getPackage().getImplementationVersion()
        );
        System.out.println(consoleMessage);
    }
}
