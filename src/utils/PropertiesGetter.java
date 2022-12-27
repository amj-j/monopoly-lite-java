package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

import tiles.PropertyTile;

public class PropertiesGetter {
    private static PropertiesGetter instance;
    private ArrayList<PropertyTile> propertyList = new ArrayList<PropertyTile>();

    private PropertiesGetter() {
        try {
            File file = new File("property_list.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            for (int i = 0; i < Constants.PROPERTIES_NUM; i++) {
                if ((line = bufferedReader.readLine()) != null) {
                    createProperty(line);
                }
                else {
                    bufferedReader.close();
                    invalidFile();
                }
            }
        } 
        catch (IOException e) {
            invalidFile();
        }
    }

    public static PropertiesGetter getInstance() {
        if (instance == null) {
            instance = new PropertiesGetter();
        }
        return instance;
    }

    private void createProperty(String line) {
        String[] params = line.split("\\s+");
        String name = params[0];
        try {
            int price = Integer.parseInt(params[1]);
            int stayCost = Integer.parseInt(params[2]);
            propertyList.add(new PropertyTile(name, price, stayCost));
        }
        catch (NumberFormatException e) {
            invalidFile();
        }
    }

    private void invalidFile() {
        IOmanager.println("The \"property_list.txt\" you provided is invalid!");
        System.exit(0);
    }

    public PropertyTile takePropertyTile() {
        PropertyTile rtrn = propertyList.get(0);
        propertyList.remove(0);
        return rtrn;
    }
}
