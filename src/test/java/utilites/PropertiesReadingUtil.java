package utilites;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReadingUtil {
    public static void main(String[] args) throws IOException {
        String pathForStreamFile="configuration.properties";
        FileOutputStream fileOutputStream=new FileOutputStream(pathForStreamFile);

    }
    public static Properties properties=new Properties();

    static {

        String pathForStreamFile="configuration.properties";

        try{
            FileInputStream fileInputStream=new FileInputStream(pathForStreamFile);
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static String getProperties(String keyword){
        return properties.getProperty(keyword);
    }}

