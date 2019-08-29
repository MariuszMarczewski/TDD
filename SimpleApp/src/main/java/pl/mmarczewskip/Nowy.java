package pl.mmarczewskip;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class Nowy {


    public static void
    main(String[] args) {
        Properties ustawienia =
                new
                        Properties();
        OutputStream wyjscie =
                null;
        try {
            wyjscie =
                    new
                            FileOutputStream("app.cfg"
                    );
            ustawienia.setProperty(
                    "uzytkownik"
                    ,
                    "admin"
            );
            ustawienia.setProperty(
                    "haslo"
                    ,
                    "123456"
            );
            ustawienia.setProperty(
                    "port"
                    ,
                    "4000"
            );
            ustawienia.store(wyjscie,
                    null
            );
        } catch
        (IOException io) {
            io.printStackTrace();
        } finally {
            if
            (wyjscie !=
                    null
            ) {
                try {
                    wyjscie.close();
                } catch
                (IOException e) {
                    e.printStackTrace();
                }

            }
        }


    }

}