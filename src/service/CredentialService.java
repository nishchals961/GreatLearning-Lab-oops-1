package service;

import java.util.Random;

public class CredentialService {
    public String generateEmail(String firstname, String lastname, String department){
        String email = firstname + lastname + "@" + department + ".abc.com";
        return email;
    }

    public char[] generatePassword(){
        String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String specialCharacters = "!@#$";
        String numbers = "1234567890";
        String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
        Random random = new Random();
        char[] password = new char[6];

        password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
        password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
        password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
        password[3] = numbers.charAt(random.nextInt(numbers.length()));

        for(int i = 4; i< 6 ; i++) {
            password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
        }
        return password;
    }

    public void showCredentials(String firstname, String lastname , String department){
        CredentialService credentialService = new CredentialService();
        char[] password = credentialService.generatePassword();
        System.out.println("Dear " + firstname + " your credentials are as follows ");
        System.out.println("Email ---> " + credentialService.generateEmail(firstname, lastname, department));
        System.out.println("Password ---> " + password);
    }
}
