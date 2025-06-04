package com.example;
import java.util.*;

public class TrainingScheduleApp {
    private static final List<Training> trainings = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {

            System.out.println("\nMenu: ");
            System.out.println("1. Create training");
            System.out.println("2. Show all trainings");
            System.out.println("3. Exit");
            System.out.print("Choose action: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    createTraining();
                    break;
                case "2":
                    for (Training t : trainings) {
                        t.displayInfo();
                        System.out.println("------------------");
                    }
                    break;
                case "3":
                    running = false;
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }

    private static void createTraining() {
        System.out.println("Choose the type of the training: ");
        for (TrainingType type : TrainingType.values()) {
            System.out.println(type.ordinal() + 1 + ". " + type);
        }
        int typeChoice = Integer.parseInt(scanner.nextLine()) - 1;
        TrainingType selectedType = TrainingType.values()[typeChoice];

        System.out.print("Choose the place of the training: ");
        for (Place place : Place.values()) {
            System.out.println(place.ordinal() + 1 + ". " + place);
        }
        int placeChoice = Integer.parseInt(scanner.nextLine()) - 1;
        Place location = Place.values()[placeChoice];

        System.out.print("Enter price: ");
        double price = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter the amount of trainings: ");
        int amount = Integer.parseInt(scanner.nextLine());

        Client client = null;
        if (selectedType == TrainingType.PERSONAL) {
            System.out.print("Name of the client: ");
            String name = scanner.nextLine();
            System.out.print("Phone number: ");
            String phone = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            client = new Client(name, phone, email, amount);
            client.decrementSession();
        }

        Training training = new Training(selectedType, location, price, client);
        trainings.add(training);

        System.out.println("The training was added successfully!");
    }
}