# DontDroptheBlop

## Inhaltsverzeichnis

- [DontDroptheBlop](#dontdroptheblop)
  - [Inhaltsverzeichnis](#inhaltsverzeichnis)
  - [Projektidee](#projektidee)
  - [Arbeitsplan](#arbeitsplan)
    - [Projektvorbereitung und Anforderungsanalyse](#projektvorbereitung-und-anforderungsanalyse)
    - [Backend-Entwicklung](#backend-entwicklung)
    - [Frontend-Entwicklung](#frontend-entwicklung)
    - [Integration und Tests](#integration-und-tests)
    - [Deployment](#deployment)
    - [Präsentation vorbereiten](#präsentation-vorbereiten)
  - [Backend](#backend)
    - [Architektur](#architektur)
      - [Hauptkomponenten](#hauptkomponenten)
        - [Controller](#controller)
        - [Service](#service)
        - [Repository](#repository)
      - [Sicherheitskonzept](#sicherheitskonzept)
      - [Datenbankmodell](#datenbankmodell)
      - [Funktionen](#funktionen)
    - [Schnittstellen](#schnittstellen)
      - [Authentizierung](#authentizierung)
      - [Score](#score)
      - [Security](#security)
    - [Testplan](#testplan)
      - [Funktionstests der Unit-Tests](#funktionstests-der-unit-tests)
    - [Testprotokoll](#testprotokoll)
  - [Frontend](#frontend)
    - [Testplan](#testplan-1)
    - [Testprotokoll](#testprotokoll-1)
  - [Auswertung](#auswertung)
    - [Arbeitsjournal](#arbeitsjournal)
  - [Hilfestellungen](#hilfestellungen)

## Projektidee

Unser Team möchte eine Gaming-Applikation erstellen, die den Score des Users nach einem Spiel auf dem Highscore-Board abspeichert. Um den Usern einen zusätzlichen Motivationsgrund zum Spielen zu geben, wollen wir den Highscore Board auf die Top 10 Scores beschränken. Der User soll die Möglichkeit haben, einen Account zu erstellen und sich einzuloggen. Der Username wird dann auf dem Highscore angezeigt mit der Punktzahl, falls dieser hoch genug war.

Folgende User Storys haben wir erstellt in Anbetracht unserer Idee inklusive Akzeptanzkriterien:

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

## Arbeitsplan

### Projektvorbereitung und Anforderungsanalyse

| **Datum**           | **Bearbeitet von** | **Aufwand**                         | **Beschreibung**                                                          |
| ------------------- | ------------------ | ----------------------------------- | ------------------------------------------------------------------------- |
| 15.11.24 - 28.11.24 | Kunga              | Durchgehend während der Projektzeit | Dokumentation, die am Anfang bis zum Schluss stets aktuell gehalten wird. |
| 15.11.24            | Kunga              | 0.75h                               | Projektidee und eine Analyse der Anforderungen sowie Anforderungskatalog erstellen |

### Backend-Entwicklung

| **Datum** | **Bearbeitet von** | **Aufwand** | **Beschreibung**                                                                 |
| --------- | ------------------ | ----------- | ------------------------------------------------------------------------------ |
| 16.11.24  | Kunga              | 1h          | Backend-Struktur vom Unterricht 16.11.24 in unserem Backend-Folder hinzugefügt. |
| 22.11.24  | Kunga              | 3h          | Backend vom neuesten Unterricht (21.11) angepasst.                              |
| 22.11.24  | Kunga              | 2h          | Fehlende Klassen im Backend projektspezifisch hinzugefügt.                      |

### Frontend-Entwicklung

| **Datum** | **Bearbeitet von** | **Aufwand** | **Beschreibung**                               |
| --------- | ------------------ | ----------- | ---------------------------------------------- |
| 22.11.24  | Patrik             | 2.5h        | Struktur Frontend mit allen Pages und Services definiert und implementiert.      |
| 22.11.24  | Patrik             | 2h          | Anpassung der CSS für ein konsistentes Design.                                   |

### Integration und Tests

| **Datum** | **Bearbeitet von** | **Aufwand** | **Beschreibung**                                                  |
| --------- | ------------------ | ----------- | ----------------------------------------------------------------- |
| 23.11.24  | Kunga & Patrik     | 1h          | Frontend und Backend zusammengeführt und getestet.                |
| 23.11.24  | Kunga & Patrik     | 1h          | Prüfung der Userpfade, um sicherzustellen, dass alle korrekt sind. |
| 24.11.24  | Kunga & Patrik     | 1h          | Automatisierte Tests für Frontend und Backend erstellt.           |

### Deployment

| **Datum** | **Bearbeitet von** | **Aufwand** | **Beschreibung**                                        |
| --------- | ------------------ | ----------- | ------------------------------------------------------- |
| 26.11.24  | Kunga & Patrik     | 2h          | Deployment der Anwendung auf dem Server und Tests.      |
| 27.11.24  | Kunga & Patrik     | 1.5h        | Abschlussprüfung der Anwendung und finale Anpassungen.  |

### Präsentation vorbereiten

| **Datum** | **Bearbeitet von** | **Aufwand** | **Beschreibung**                                        |
| --------- | ------------------ | ----------- | ------------------------------------------------------- |
| 27.11.24  | Kunga & Patrik     | 4h          | Präsentation als PowerPoint vorbereiten                 |
| 28.11.24  | Kunga & Patrik     | 2h          | Nochmal kurz die Präsentation sowie prüfen ob alles funktioniert  |

## Backend

### Architektur

#### Hauptkomponenten

##### Controller

Die Schicht verwaltet die HTTP-Anfragen der User und definiert die Endpunkte.

##### Service

Die Logik wird hier implementiert.

Beispiel:
- Speichern von Score
- Abrufen der Top 10 Spieler etc.

##### Repository

Zuständig für den Zugriff auf die Datenbank. Verwendet JPA um CRUD Operationen auf den Entities auszuführen.

#### Sicherheitskonzept

Endpunkte sind in öffentliche(public), private(user only) und administrative(admin only) unterteilt.
Für die Authentifizierung wird JSON Web Token JWT verwendet.

**AuthTokenFilter Klasse**

Filtert Anfragen und prüft die JWTs und authentifiziert Benutzer anhand der Tokens.

**Rollen und Berechtigungen**

Die Rollen `ROLE_USER` und ``ROLE_ADMIN`` werden über die Role Entität verwaltet. Ein Benutzer ist bei der Registrierung als default Rolle User.

#### Datenbankmodell
**Entitäten**:
  - `User`: Enthält Benutzerinformationen wie Name, Passwort, Score, Rollen und den Status (blockiert oder nicht blockiert).
  - `Score`: Speichert die Punktzahlen eines Benutzers und ist mit einer ManyToOne Benziehung verknüpft
  - `Role`: Definiert die Benutzerrollen.

**Relationale Datenbank**

Für unser Projekt nutzen wir eine relationale Datenbank (MySQL). Tabellen wie users, roles und scores werden basierend auf den @Entities automatisch generiert.
  
#### Funktionen

**Benutzerverwaltung**
 - Benutzerregistrierung mit Rollen
 - Passwort- und Zugangsschutz

**Score**
- Speichern von Scorepunkten
- Löschen der Punktzahl eines Spielers (Admin)
- Abrufen der besten Spieler (Top 10 nach Highscore)

### Schnittstellen

#### Authentizierung

| HTTP Request | Endpoint   | Beschreibung                                       |
| :----------- | :--------- | -------------------------------------------------- |
| POST         | /login     | Gibt den username und password um sich mit einem existieren Konto einzuloggen                                  |
| POST         | /signup    | Erstellt ein neues Konto mit username und passwort. Prüft ob der username bereits vergeben wurde. |

#### Score

| HTTP Request | Endpoint   | Beschreibung                                       |
| :----------- | :--------- | -------------------------------------------------- |
| POST         | /add     | Gibt dem User einen entsprechenden score und speichert es ab.                       |
| GET         | /top10    | Zeigt die 10 Spieler mit dem höchsten highscore |
| DELETE         | /{userId}/clear    | Löscht den score und highscore eines spezifischen Spielers |


#### Security

| HTTP Request | Endpoint   | Beschreibung                                       |
| :----------- | :--------- | -------------------------------------------------- |
| GET         | /users    | Zeigt eine Liste mit allen Usern an  |
| PUT         | /block/{username}  | Blockt einen spezifischen User. Der User kann sich nicht mehr einloggen und sein highscore wird resettet |

### Testplan

Für das Backend wurden Unit-Tests durchgeführt, um die Funktionalität von der User Rolle zu prüfen ob die default Values übereinstimmen sowie das hinzufügen der score Punkte.

#### Funktionstests der Unit-Tests

| Testfall                                                                                         | Erwartetes Verhalten                                                                                         |
| ------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| Initialisierung der Benutzer-Entität (`testDefaultValues`)                                    | Die Felder der Benutzer-Entität werden korrekt initialisiert: scores ist leer, isBlocked ist false, highScore ist 0.                                                     |
| Hinzufügen einer Punktzahl zur User-Entität (`testAddScoreToUser`)                            | Die Punktzahl wird korrekt zur scores-Menge hinzugefügt, und die Beziehung zwischen Score und User ist konsistent.                                                     |

### Testprotokoll

| **Testfall**         | **Testverhalten**                                         | **Testresultat** | **Kommentar**                                     |
| -------------------- | -------------------------------------------------------- | ---------------- | ------------------------------------------------ |
| `testDefaultValues`  | Standardwerte der `User`-Entität werden geprüft          | Bestanden       | Standardwerte (`isBlocked`, `scores`, `highScore`) korrekt |
| `testAddScoreToUser` | Hinzufügen einer Punktzahl zur `User`-Entität wird geprüft | Bestanden       | Punktzahl wird erfolgreich hinzugefügt und korrekt referenziert |

## Frontend

### Testplan

### Testprotokoll

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
|25.11.2024 | 0.5 h | Die Block Funktion mit unblock erweitert | Dies war relativ einfach. Ich musste hier bei der betroffenen Funktion nur einen if/else statement setzen zum prüfen ob der user bereits blockiert ist oder nicht | Kunga |
| 25.11.2024 | 0.5 h | Kommentare gesetzt für die Klassen | Keine Schwierigkeiten | Kunga |
|26.11.2024 | 1 h | 2 Testfälle erstellt für Backend | Keine Schwierigkeiten | Kunga |
|26.11.2024 | 1h | Backend Sektion im README.md vervollständigt | Ich war mir persönlich nicht sicher ob ich genügend Informationen geschrieben habe für die Sektion Backend. | Kunga |

## Hilfestellungen

- Struktur des Codes fürs Backend vom Unterricht Modul 223 - Multi User Applikation
- [Nutzung von ChatGPT für Programmierunterstützung](https://chatgpt.com/)
- Hilfestellungen durch den Dozenten in diversen Punkten
