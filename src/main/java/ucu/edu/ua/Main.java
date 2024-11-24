package ucu.edu.ua;

import java.net.SocketImpl;
import java.util.List;

import ucu.edu.ua.task1.Student;
import ucu.edu.ua.task1.Student.StudentBuilder;
import ucu.edu.ua.task2.BirthdayMailCode;
import ucu.edu.ua.task2.Client;
import ucu.edu.ua.task2.MailInfo;
import ucu.edu.ua.task2.MailSender;
import ucu.edu.ua.task3.MyImage;
import ucu.edu.ua.task3.ProxyImage;
import ucu.edu.ua.task2.MailCode;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Student student = new Student()
        //         .setFirstName("Tania")
        //         .setLastName("Shvets");  //порушує принцип SOLID

        // StudentBuilder studentBuilder = new StudentBuilder();
        // Student student = studentBuilder
        //         .firstName("Tania")
        //         .lastName("Shvets")
        //         .age(18)
        //         .build();
        // Student student = Student.builder()
        //         .firstName("Tania")
        //         .lastName("Shvets")
        //         .age(18)
        //         .gender("female")
        //         .email("mymy")
        //         .courses(List.of("Java", "Math"))
        //         .course("Babilka")
        //         .build();

        // System.out.println(student);

        Client client = Client.builder()
                    .name("Tania")
                    .age(18)
                    .email("mymy")
                    .build();

        MailCode mailCode = new BirthdayMailCode();

        // MailInfo mailInfo = new MailInfo(client, mailCode);

        MailInfo mailInfo = new MailInfo(client, client1 -> "It is just random mail!");


        MailSender mailSender = new MailSender();
        mailSender.sendMail(mailInfo);
        System.out.println(client);

        MyImage image = new ProxyImage("C:/Users/User/Pictures/схема.jpg");
        System.out.println("Image is not loaded yet.");
        image.display();
        image.display();
    }
}