/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UUIDClass;

import java.util.UUID;

/**
 *
 * @author GIE
 */
public class UUIDApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(var i = 0; i < 100; i++) {
            UUID uuid = UUID.randomUUID();
            String key = uuid.toString();
            System.out.println(key);
        }
    }
    
}
