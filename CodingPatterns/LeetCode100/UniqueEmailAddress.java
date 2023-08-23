package LeetCode100;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddress {

    public static void main(String[] args) {
        
        String[] emails = {
            "test.email+alex@example.com",
            "test.e.mail+bob.cathy@example.com",
            "testemail+david@ex.ample.com"
        };

        System.out.println("Total unique email addresses: " + uniqueEmails(emails));
    }

    private static int uniqueEmails(String[] emails) {

        Set<String> set = new HashSet<>();
        for(String email : emails) {
            String processed = processEmail(email);
            set.add(processed);
        }

        return set.size();
    }

    private static String processEmail(String email) {

        String[] parts = email.split("@");
        String local = parts[0];
        String domain = parts[1];

        local = local.split("\\+")[0].replace(".", "");

        return local + "@" + domain;
    }
    
}
