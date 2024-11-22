# DontDroptheBlop

## Inhaltsverzeichnis

- [Projektidee](#projektidee)

## Projektidee

Unser Team möchte eine Gaming Applikation erstellen, die den Score des Users nach einem Spiel auf den Highscore Board abspeichert. Um die User einen zusätzlichen Motivationsgrund zum Spielen zu geben, wollen wir den Highscore Board auf die Top 10 scores beschränken. Der User soll die Möglichkeit haben einen Account zu erstellen und sich einzuloggen. Der Username wird dann auf dem Highscore angezeigt mit der Punktzahl, falls dieser hoch genug war.

Folgende User Stories haben wir erstellt in Anbetracht unserer Idee inklusive Akzeptanzkriterien:

**Als Benutzer möchte ich mich einloggen können mit Usernamen und Passwort, um das Spiel spielen zu können.**

<ins>Akzeptanzkriterien</ins>

- Der User sieht als erstes den Loginscreen und hat die Möglichkeit sich zu registrieren oder einzuloggen.
- Bei erfolgreichem Login wird der User zum Startmenü des Spiels weitergeleitet.
- Der Username muss einzigartig sein.

**Als Benutzer möchte ich die Highscore Liste anschauen können.**

<ins>Akzeptanzkriterien</ins>

- Der Benutzer hat die Berechtigung die Highscore Liste anschauen zu können.

**Als Admin möchte ich Benutzer blockieren können.**

<ins>Akzeptanzkriterien</ins>

- Blockierte Benutzer können sich nicht mehr einloggen.
- Blockierte Benutzer werden nicht mehr auf der Highscore Liste angezeigt.

**Als Admin möchte ich die Highscore Liste resetten können.**

<ins>Akzeptanzkriterien</ins>

- Der Admin sieht eine Option zum Zurücksetzen der Highscore-Liste.
- Die Option ist klar als "Highscore zurücksetzen" deklariert.
- Nach der Bestätigung wird der Score im Web sowie der Datenbank zurückgesetzt.

## Planung

### Arbeitsplanung

#### Projektvorbereitung und Anforderungsanalyse

##### Dokumentation als README.md

| **Datum**           | **Bearbeitet von** | **Aufwand**                         | **Beschreibung**                                                          |
| ------------------- | ------------------ | ----------------------------------- | ------------------------------------------------------------------------- |
| 15.11.24 - 28.11.24 | Kunga              | Durchgehend während der Projektzeit | Dokumentation, die am Anfang bis zum Schluss stets aktuell gehalten wird. |

##### Anforderungsanalyse und Erstellung eines Anforderungskatalogs

| **Datum** | **Aufwand** | **Bearbeitet von** | **Beschreibung**                                                                   |
| --------- | ----------- | ------------------ | ---------------------------------------------------------------------------------- |
| 15.11.24  | 0.75h       | Kunga              | Projektidee und eine Analyse der Anforderungen sowie Anforderungskatalog erstellen |

##### Backend Struktur vom Unterricht 16.11.24

| **Datum** | **Aufwand** | **Bearbeitet von** | **Beschreibung**                                                                |
| --------- | ----------- | ------------------ | ------------------------------------------------------------------------------- |
| 20.11.24  | 1h          | Kunga              | Backend Struktur vom Unterricht 16.11.24 in unserem Backend Folder hinzugefügt. |

##### Neue Backend Struktur vom Unterricht 21.11.24

| **Datum** | **Aufwand** | **Bearbeitet von** | **Beschreibung**                              |
| --------- | ----------- | ------------------ | --------------------------------------------- |
| 22.11.24  | 3h          | Kunga              | Backend vom neusten Unterricht 21.11 anpassen |

##### Fehlende Klassen im Backend für das Projekt spezifisch hinzufügen

| **Datum** | **Aufwand** | **Bearbeitet von** | **Beschreibung**                                                         |
| --------- | ----------- | ------------------ | ------------------------------------------------------------------------ |
| 22.11.24  | 2h          | Kunga              | Allfällige Änderungen im existierenden Code für unser Projekt spezifisch |

##### Struktur des Frontend (React) definieren und implementieren

| **Datum** | **Aufwand** | **Bearbeitet von** | **Beschreibung**                               |
| --------- | ----------- | ------------------ | ---------------------------------------------- |
| 22.11.24  | 2.5h        | Patrik             | Struktur Frontend mit allen pages und services |

##### CSS anpassen

| **Datum** | **Aufwand** | **Bearbeitet von** | **Beschreibung**                 |
| --------- | ----------- | ------------------ | -------------------------------- |
| 22.11.24  | 2h          | Patrik             | Anpassen der Pages gemäss Design |

##### Frontend und Backend zusammenführen

| **Datum** | **Aufwand** | **Bearbeitet von** | **Beschreibung** |
| --------- | ----------- | ------------------ | ---------------- |
| 22.11.24  | 1h          | Kunga&Patrik       | Siehe Titel      |

##### Userpfade prüfen

| **Datum** | **Aufwand** | **Bearbeitet von** | **Beschreibung**                         |
| --------- | ----------- | ------------------ | ---------------------------------------- |
| 22.11.24  | 1h          | Kunga&Patrik       | Prüfen ob die Userpfade angezeigt werden |

##### Automatisierte Test einbinden

| **Datum** | **Aufwand** | **Bearbeitet von** | **Beschreibung**                         |
| --------- | ----------- | ------------------ | ---------------------------------------- |
| 22.11.24  | 1h          | Kunga&Patrik       | Testfälle erstellen für Frontend/Backend |

#####

## Backend

### Testplan

### Testprotokoll

## Frontend

### Testplan

### Testprotokoll

## Sicherheitskonzept

## Auswertung

### Arbeitsjournal

| **Datum**  | **Aufwand** | **Tätigkeiten**                                                                                                    | **Schwierigkeiten/Reflexion**                                                                                |
| ---------- | ----------- | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| 22.11.2024 | 1 Stunde    | Erstellung von Testfällen für Frontend und Backend. Überprüfung der Abdeckung der Testfälle mit den Anforderungen. | Einige Tests waren schwieriger umzusetzen, da die Mock-Daten nicht korrekt initialisiert wurden.             |
| 03.11.2024 | 45 Minuten  | Basisstruktur mit Spring Boot Initializr erstellt. Entitäten mit Attributen sowie Getter und Setter ergänzt.       | Es lief reibungslos, allerdings habe ich gemerkt, dass einige Attribute genauer dokumentiert werden könnten. |

## Hilfestellungen

- Struktur des Codes fürs Backend vom Unterricht Modul 223 - Multi User Applikation
- [Nutzung von ChatGPT für Programmierunterstützung](https://chatgpt.com/)
