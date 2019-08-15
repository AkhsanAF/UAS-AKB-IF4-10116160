package com.akhsanaf.uasakb4.presenter;
/* Tanggal Pengerjaan
 *  12 Agustus 2019
 *
 * Akhsan Andara F
 *  10116160
 *  IF-4
 *  */

public interface IRegisterActivity {

    void checkInputan();
    boolean cekPassword(String Password, String confirmPassword);
    boolean cekUser(String Username);

}
