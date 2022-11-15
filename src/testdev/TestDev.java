/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testdev;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.commons.io.FilenameUtils;

/**
 *
 * @author secordova
 */
public class TestDev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file =new File("D:/opt/tmp/77213/qwe.zip");
        String nombre=file.getPath();
          Integer indice=file.toString().lastIndexOf("\\") + 1;
           System.out.println(nombre);
        System.out.println(file.toString().substring(indice));
        System.out.println(file.toString());
}
}
