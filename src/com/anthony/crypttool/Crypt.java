package com.anthony.crypttool;

import javax.crypto.KeyGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Crypt {

    public String generateSymetricKey(String algorithm,String keyLength){
        String hexKey = "";
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance(algorithm) ;
            keyGenerator.init(Integer.valueOf(keyLength));
            byte[] key = keyGenerator.generateKey().getEncoded();
            hexKey = this.convertByte2Hex(key);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return hexKey;
    }

    public String calculateHash(String msg, String hashAlgorithm){
        String hexHash = "";
        try {
            MessageDigest msgDigest = MessageDigest.getInstance(hashAlgorithm);
            msgDigest.update(msg.getBytes());
            byte[] digest = msgDigest.digest();
            //Converting the byte array in to HexString format
            hexHash=this.convertByte2Hex(digest);

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return hexHash;
    }

    private String convertByte2Hex(byte[] inputByte){
        StringBuffer hexString = new StringBuffer();
        for (int i = 0;i<inputByte.length;i++) {
            hexString.append(Integer.toHexString(0xFF & inputByte[i]));
        }
        return String.valueOf(hexString);
    }
}
