package com.funnydvd.dvdrental.cli.main;

import com.funnydvd.dvdrental.cli.ul.AppUI;

import static com.funnydvd.dvdrental.cli.ul.AppUI.*;

public class AppMain {

    public static void main(String[] args) {

        while (true) {

            startScreen();
            int selection = inputInteger(">>> ");

            FrontController.chooseSystem(selection);

        }

    }

}
