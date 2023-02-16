package exercise;

import java.util.List;

// BEGIN
public class App {
    public static Long getCountOfFreeEmails(List<String> emails) {
        return emails.stream()
                .filter(email -> App.isEmailFree(email))
                .count();
    }

    private static boolean isEmailFree(String email) {
        return email.endsWith("gmail.com") || email.endsWith("yandex.ru") || email.endsWith("hotmail.com");
    }
}
// END
