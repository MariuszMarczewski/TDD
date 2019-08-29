

package com.company;

import java.util.Scanner;

public class UserManager {

    public JanuszUser1 loginNewUser() {
        JanuszTools.log("Podaj imię: ");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        JanuszUser1 januszUser = new JanuszUser1(userName);
        return januszUser;

//        return new JanuszUser(
//                new Scanner(System.in).nextLine());
    }
}




