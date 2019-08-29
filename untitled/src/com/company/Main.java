package com.company;

public class Main {

    public static void main(String[] args) {
        JanuszUser1 user = new UserManager().loginNewUser();

        JanuszSklep januszSklep = new JanuszSklep(user);
        januszSklep.setFakeData();

        JanuszTools.log("TOTAL: " + januszSklep.getKoszyk().toString());
    }
}







