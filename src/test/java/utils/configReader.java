package utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class configReader {
    Properties prop;

    public configReader() {
    }

    public Properties ConfigurationManager() {
        this.prop = new Properties();
        File proFile = new File("src/test/resources/config/configFile.properties");

        try {
            FileInputStream fis = new FileInputStream(proFile);
            this.prop.load(fis);
        } catch (Throwable var3) {
            var3.printStackTrace();
        }

        return this.prop;
    }

    public String getBrowsername() {
        String browsername = this.prop.getProperty("browsername");
        return browsername;
    }
    public String getUrl() {
        String Url = this.prop.getProperty("url");
        return Url;
    }
    public String getusername() {
        String userName = this.prop.getProperty("username");
        return userName;
    }
    public String getPassword() {
        String password = this.prop.getProperty("Password");
        return password;
    }
}
