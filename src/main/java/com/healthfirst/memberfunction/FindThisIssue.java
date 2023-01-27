package com.healthfirst.memberfunction;

import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

public class FindThisIssue {

    public void keyPairGeneratorNoncompliant() throws NoSuchAlgorithmException {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        // Noncompliant: keysize too small for this algorithm.
        keyPairGenerator.initialize(128);
        keyPairGenerator.genKeyPair();
    }

}
