package az.java.SendMailWithSpringFramework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class SendMailWithSpringFrameworkApplication implements CommandLineRunner {

    @Autowired
    private MailService mailService;

    public static void main(String[] args) {
        SpringApplication.run(SendMailWithSpringFrameworkApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        try {
//            mailService.send("sitayevalale@gmail.com", "emailsend@gmail.com", "hello", "how are you");
//            mailService.sendHTML("sitayevalale@gmail.com", "emailsend@gmail.com", "hello", "<b><i><u>how are you</u></i></b>");
            File file = new File("C:\\Users\\User\\Pictures");
            mailService.sendHTML("sitayevalale@gmail.com", "emailsend@gmail.com", "hello", "<b><i><u>how are you</u></i></b>", file);

            System.out.println("Done");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
