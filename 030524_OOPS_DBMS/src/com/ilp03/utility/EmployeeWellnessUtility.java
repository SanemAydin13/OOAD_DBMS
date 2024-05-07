package com.ilp03.utility;
import java.util.Scanner;
import com.ilp03.service.ActivityService;
import com.ilp03.service.ParticipationServiceImpl;

public class EmployeeWellnessUtility {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("******* Employee Wellness Program *******");
        char goToMainMenu = 'y';
        do {
            System.out.println("-----Choose : -----");
            System.out.println("1.Display Activity List\n2.Activity participation List\n");
            int choice = scanner.nextInt();
            //scanner.nextLine();
            switch (choice) {
                case 1:
                    ActivityService.getAllActivity();
                    break;
                case 2:
                    ParticipationServiceImpl.displayAllParticipations();
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
            System.out.println("Go to main menu (y/n)");
            goToMainMenu = scanner.next().charAt(0);
        } while (goToMainMenu == 'y');
        
    }
}

