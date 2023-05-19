package Components.Themes;

import com.formdev.flatlaf.FlatLaf;

public class ThemeLoader {

    public static void loadThemes(){
        FlatLaf.registerCustomDefaultsSource("Components.Themes.Properties");
    }

}
