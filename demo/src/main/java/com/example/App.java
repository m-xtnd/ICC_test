package com.example;

import models.Party;
import models.PartyRepo;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        for (String[] values : PartyRepo.all_parties) {
            String addname = values[0];
            LocalDate addratifiedDate = LocalDate.parse(values[1].trim(), formatter);
            LocalDate addintoForceDate = LocalDate.parse(values[2].trim(), formatter);
            Party party = new Party(0, addname, addratifiedDate, addintoForceDate);
        }

        System.out.println(
                " Welcome to ICC_test. This program aims to determine if a State can be prosecuted for international crimes (genocide, war crimes, crimes against humanity, and the crime of aggression) in front of the International Criminal Court (ICC).");

        // Checking if the State is party.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the State name: ");
        String sc_state = scanner.nextLine();
        int canBeProsecuted = 0;
        for (String[] check_sc_state : PartyRepo.all_parties) {
            for (String s : check_sc_state) {
                if (sc_state.equals(PartyRepo.all_parties[1])) {
                    System.out.println(
                            "Has this crime been referred to the ICC by a resolution of the United Nations? Type 'yes' or 'no'.");
                    String un_ref = scanner.nextLine();

                    if (un_ref.equals("yes")) {
                        System.out.println("The State can be prosecuted under Art. 13 of the Rome Statute.");
                        break;
                    }

                }

                // exceptions block

                // PM yes/no - exceptions
                // yes - date - yes // no - exceptions
            }
        }
    }
}