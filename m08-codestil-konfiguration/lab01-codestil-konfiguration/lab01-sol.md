# Lösungshinweise: Codestil und Konfiguration (Platzhalter)

**Status: Platzhalter**, siehe `lab01-thx.md` und `lab01-exc.md` dieses
Labs. Sobald `3302_K08.pdf` vorliegt, hier durch die tatsächliche
Musterlösung ersetzen.

## 8.3.1 - Benutzername setzen

```java
package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SetUsername_solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Bitte Benutzernamen eingeben:");
        String username = reader.readLine();
        System.out.println("Benutzername gesetzt: " + username);
    }
}
```
