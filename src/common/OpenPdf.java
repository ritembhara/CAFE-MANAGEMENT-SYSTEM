/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class OpenPdf {
    public static void openById(String id)
    {
        try
        {
            if((new File("E:\\"+id+".pdf")).exists())
            {
                Process p =Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll,FileProtocolHandler E:\\"+id+".pdf");
            }
            else
                JOptionPane.showMessageDialog(null, "File doesn't exists");
            
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
}
