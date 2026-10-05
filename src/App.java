/*
* File: App.java
* Author: Nagy Áron
* Copyright: 2026, Nagy Áron
* Group: Szoft II/N
* Date: 2026-10-05
* Github: https://github.com/lopnifox/
* Licenc: MIT
*/

public class App {
    public static void main(String[] args) throws Exception {
        Writable writer = new Writer("adat.txt");
        writer.writeContent("alma");
        writer.writeContent("körte");
        System.out.println("A fájlba írás kész.");
    }
}
