import Components.Dashboard;
import Components.Themes.ThemeLoader;
import com.formdev.flatlaf.FlatLightLaf;

public class Main {

    public static void main(String[] args) {
        ThemeLoader.loadThemes();
        FlatLightLaf.setup();
        Dashboard.run();
    }

}
