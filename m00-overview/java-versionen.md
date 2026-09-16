# Java-Versionen: welche wofür?

## Das Grundprinzip seit 2017/2018

- Alle 6 Monate erscheint eine neue Java-Version mit neuen Features.
- In unregelmäßigen, aber im Mittel etwa 2-3-jährigen Abständen wird eine
  Version zur **Long-Term-Support (LTS)**-Version erklärt - nur diese
  erhalten über viele Jahre Sicherheitsupdates und Support.
- Für produktive, langlebige Anwendungen (also fast alles, was in
  `java-einsatzgebiete.md` beschrieben ist) wählt man in der Praxis so gut wie
  immer eine LTS-Version, keine Zwischenversion.

## Welche Version für diesen Kurs?

- Dieser Kurs verwendet **Java 25**, laut Oracle eine LTS-Version mit
  Support mindestens bis September 2033 (siehe Kap. 1, Fußnote 1) - damit für
  die absehbare Zukunft eine solide Wahl.
- Die vorherige LTS-Version war **Java 21**.

## Warum das für Einsteiger:innen wichtig ist

- Wenn Sie später außerhalb dieses Kurses auf Projekte mit "älterem" Java
  treffen (z. B. Java 8, 11 oder 17), sind das mit hoher Wahrscheinlichkeit
  bewusst gewählte LTS-Versionen produktiver Systeme - kein Zeichen von
  Rückständigkeit, sondern von Stabilitätsbedarf.
- Die in diesem Kurs behandelten Sprachgrundlagen (Kap. 1-21) sind seit vielen
  Java-Versionen im Kern unverändert; einzelne moderne Schreibweisen (z. B.
  `switch` mit Pfeil in Kap. 6.3.3) werden explizit als solche markiert.
