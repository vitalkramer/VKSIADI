
package vksiadi;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author vk
 */
public class Funcoes {
    
    public String md5 (String senha){
        
        String md5 = null;
        try {
        //Create MessageDigest object for MD5
        MessageDigest digest = MessageDigest.getInstance("MD5");
        //Update input string in message digest
        digest.update(senha.getBytes(), 0, senha.length());
        //Converts message digest value in base 16 (hex) 
        md5 = new BigInteger(1, digest.digest()).toString(16);
        return md5;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        
        return md5;
    }
    
}
