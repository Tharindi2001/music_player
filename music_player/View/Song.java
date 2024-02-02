/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;


import java.io.File;

/**
 *
 * @author kasun
 */
public class Song {
    
    private File path;
    private String name;
    
    public Song(File path) {
        this.path = path;
        name=path.getName();
        
    }

    public File getPath() {
        return path;
    }
    public String getName()
    {
        return name;
    }
}
