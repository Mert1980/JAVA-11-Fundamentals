package be.intecbrussel.exercise11_program_attributes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ApplicationProperties {
    private Properties props;
    private String fileName;
    private int xPos;
    private int yPos;
    private int width;
    private int height;

    public ApplicationProperties(String file) {
        this.fileName = file;
        setProps(new Properties());
    }

    public void store(){
        try(FileOutputStream out = new FileOutputStream(fileName)){
            props.setProperty("xPos", String.valueOf(getXPos()));
            props.setProperty("yPos", String.valueOf(getYPos()));
            props.setProperty("width", String.valueOf(getWidth()));
            props.setProperty("height", String.valueOf(getHeight()));
            props.store(out, fileName);
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public void load(){
        try(FileInputStream in = new FileInputStream(fileName)){
            props.load(in);
            props.list(System.out);
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    public String getProperty(String key, String keyValue){
        return props.getProperty(key, keyValue);
    }

    public int getXPos() {
        return xPos;
    }

    public void setXPos(int xPos) {
        this.xPos = xPos;
    }

    public int getYPos() {
        return yPos;
    }

    public void setYPos(int yPos) {
        this.yPos = yPos;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Properties getProps() {
        return props;
    }
}
