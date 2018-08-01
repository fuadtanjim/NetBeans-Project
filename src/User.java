
import java.util.jar.Attributes.Name;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tanjim
 */
public class User {
    
    private int id;
    private final String nm;
    
    
    public User(String Name){
        this.nm=Name;
        
        
    }

    User() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String getName(){
        return nm;
    }
    
    
    
    
    
}
