/*
* File: Writer.java
* Author: Nagy Áron
* Copyright: 2026, Nagy Áron
* Group: Szoft II/N
* Date: 2026-10-05
* Github: https://github.com/lopnifox/
* Licenc: MIT
*/

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class Writer implements Writable {
    private String fileName;

    public Writer(String fileName) {
        this.fileName = fileName;
    }

    public void writeContent(String content) {
        try {
            tryWriteContent(content);
        } catch (IOException e) {
            System.err.println("Hiba! A fájlba írás sikertelen!");
            System.err.println(e.getMessage());
        }
    }

    private void tryWriteContent(String content) throws IOException {
        try (FileWriter fileWriter = new FileWriter(
            this.fileName,
            Charset.forName("utf-8"),
            true
        )) {
            fileWriter.write(content + "\n");
        }
    }
}