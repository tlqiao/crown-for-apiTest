package org.crown;

import org.apache.commons.codec.digest.Md5Crypt;
import org.junit.Test;

public class GetPassword {
    @Test()
    public void getPassword() {
        System.out.println(Md5Crypt.apr1Crypt("abc123","$apr1$crown"));
    }
}
