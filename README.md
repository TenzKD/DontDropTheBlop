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
| 23.11.24  | 1h          | Kunga&Patrik       | Siehe Titel      |

##### Userpfade prüfen

| **Datum** | **Aufwand** | **Bearbeitet von** | **Beschreibung**                         |
| --------- | ----------- | ------------------ | ---------------------------------------- |
| 23.11.24  | 1h          | Kunga&Patrik       | Prüfen ob die Userpfade angezeigt werden |

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

| **Datum**  | **Aufwand** | **Tätigkeiten**                                                  | **Schwierigkeiten/Reflexion**                                                                                                                                                                                                   | **Author** |
| ---------- | ----------- | ---------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------- |
| 22.11.2024 | 1 h         | Frontend mit dem Spiel gefüttert                                 | übertragung war erfolgreich                                                                                                                                                                                                     | Patrik     |
| 22.11.2024 | 3 h         | Frontend CSS angepasst                                           | müssam aber lehrreich                                                                                                                                                                                                           | Patrik     |
| 22.11.2024 | 3 h         | Frontend mit Backand verbunden                                   | Probleme mit Dom und axios files                                                                                                                                                                                                | Patrik     |
| 22.11.2024 | 1 h         | Im Frontend Regiestrierung und Login eingerichtet                | holperig aber erfolgreich                                                                                                                                                                                                       | Patrik     |
| 22.11.2024 | 2 h         | Backend vom vom letzten Unterrichtstag 21.11.24 hinzugefügt.     | Da ich Probleme hatte mit dem Einfügen, habe ich es schlussendlich ein File nach dem andern hinzugefügt und geprüft ob es auch funktioniert.                                                                                    | Kunga      |
| 22.11.2024 | 2 h         | Die Struktur des Backends angepasst auf unser Projekt            | Ich hatte am Schluss der Lektion die Erkenntniss, dass es besser wäre den Score als eigenes Entity zu erstellen anstatt als Attribut von der Klasse User.                                                                       | Kunga      |
| 22.11.2024 | 4 h         | Endpunkte erstellt um alle User anzuzeigen sowie User zu blocken | Falls genügend Zeit da wäre, könnte man die Funktion als Button hinzufügen welche nur als sichtbar für den Admin ist. Ausserdem sollte ich die Funktion des blocken anpassen, falls es bereits blockiert ist, dass es entblockt | Kunga      |
|24.11.2024 | 4 h | Score Entity sowie Endpoints für die Applikation hinzugefügt | Ich hatte ziemliche Probleme den Score Entity im Nachhinein hinzuzufügen. Hier wäre es definitiv besser gewesen ein Datenmodell von Anfang an zu erstellen um ein besseren Überblick auf die Struktur zu haben. Ein Grund war wahrscheinlich weil die Mehrheit der Klassen implementiert worden ist vom Stoff während dem Unterricht. Bei der Implementierung habe ich es so gemacht dass man die scores adden kann in der Liste und der höchste Wert von score in der Liste wird dem highscore hinzugefügt. Ich war am überlegen ob ich eventuell den Wert direkt an highscore hinzufügen soll falls dieser höher ist, damit nicht eine riesige Liste entsteht. Schlussendlich habe ich mich dagegen entschieden aufgrund von, wie unser Dozent gesagt hat zu mir, analystischen gründen wie z.B wie viele Punkte hatte der User im Durchschnitt etc. Stattdessen gab ich dem scoreController einen DELETE endpoint zum löschen von scores und highscore des users. Dieser kann nur von einem admin zugegriffen werden. | Kunga |

## Hilfestellungen

- Struktur des Codes fürs Backend vom Unterricht Modul 223 - Multi User Applikation
- [Nutzung von ChatGPT für Programmierunterstützung](https://chatgpt.com/)
- Hilfestellungen durch den Dozenten in diversen Punkten
