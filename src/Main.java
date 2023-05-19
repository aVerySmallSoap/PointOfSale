import Components.Dashboard;
import Components.Themes.ThemeLoader;

public class Main {

    public static void main(String[] args) {
        ThemeLoader.loadThemes();
        Dashboard dash = new Dashboard();
        dash.run();
    }

}
