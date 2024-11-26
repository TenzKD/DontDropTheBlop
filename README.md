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

<<<<<<< HEAD
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
| 25.11.24  | 2h          | Patrik       | Siehe Titel      |

##### Userpfade prüfen

| **Datum** | **Aufwand** | **Bearbeitet von** | **Beschreibung**                         |
| --------- | ----------- | ------------------ | ---------------------------------------- |
| 25.11.24  | 2h          | Kunga & Patik      | Prüfen ob die Userpfade angezeigt werden |


##### Automatisierte Test einbinden

| **Datum** | **Aufwand** | **Bearbeitet von** | **Beschreibung**                         |
| --------- | ----------- | ------------------ | ---------------------------------------- |
| 25.11.24  | 2h          | Patrik       | Testfälle erstellen für Frontend |
##### Dokumentation fertigstellen

| **Datum** | **Aufwand** | **Bearbeitet von** | **Beschreibung**                         |
| --------- | ----------- | ------------------ | ---------------------------------------- |
| 28.11.24  | 3h          | Kunga & Patik       | gemeinsam die dokumentation überarbeiten |
##### Dokumentation fertigstellen

| **Datum** | **Aufwand** | **Bearbeitet von** | **Beschreibung**                         |
| --------- | ----------- | ------------------ | ---------------------------------------- |
| 28.11.24  | 1h          | Kunga & Patik       | Präsentations erstellen und einüben |


#####
=======
| **Datum** | **Bearbeitet von** | **Aufwand** | **Beschreibung**                                        |
| --------- | ------------------ | ----------- | ------------------------------------------------------- |
| 27.11.24  | Kunga & Patrik     | 4h          | Präsentation als PowerPoint vorbereiten                 |
| 28.11.24  | Kunga & Patrik     | 2h          | Nochmal kurz die Präsentation sowie prüfen ob alles funktioniert  |
>>>>>>> 6de4cee72c712ea71b317a3db39410d115fa68e3

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

## Testplan für die Spielanwendung "Dont Drop The Blop"

#### 1. Registrierung eines neuen Benutzers


- **Testziel**: Sicherstellen, dass Benutzer sich erfolgreich registrieren können.
- **Vorgehensweise**: Ein neuer Benutzer öffnet die Registrierungsseite, füllt alle erforderlichen Felder (Benutzername, Passwort) korrekt aus und sendet das Formular ab.
- **Erwartetes Ergebnis**: Der Benutzer erhält eine Erfolgsmeldung, dass die Registrierung erfolgreich war.


#### 2. Anmeldung eines registrierten Benutzers

- **Testziel**: Sicherstellen, dass registrierte Benutzer sich erfolgreich anmelden können.
- **Vorgehensweise**: Ein registrierter Benutzer öffnet die Anmeldeseite, gibt seinen Benutzernamen und das korrekte Passwort ein und sendet das Formular ab.
- **Erwartetes Ergebnis**: Der Benutzer erhält Zugriff auf das Spielmenü.
- **Abdeckung**: Validierung der Anmeldeinformationen und Token-basierte Authentifizierung.

#### 3. Starten des Spiels

- **Testziel**: Sicherstellen, dass ein angemeldeter Benutzer das Spiel erfolgreich starten kann.
- **Vorgehensweise**: Der Benutzer wählt die Option "Spiel starten" im Hauptmenü.
- **Erwartetes Ergebnis**: Das Spiel beginnt ordnungsgemäß und der Benutzer kann spielen.
- **Abdeckung**: Zugriffskontrolle, Initialisierung des Spiels und Benutzerinteraktion.

#### 4. Spielfluss und Spielverhalten

- **Testziel**: Sicherstellen, dass das Spiel korrekt abläuft, ohne Fehler oder Abstürze.
- **Vorgehensweise**: Der Benutzer spielt das Spiel und versucht, eine Punktzahl zu erreichen.
- **Erwartetes Ergebnis**: Das Spiel läuft ohne Unterbrechungen, und es gibt keine Fehler bei der Anzeige oder Interaktion.
- **Abdeckung**: Spiellogik, Benutzersteuerung und Fehlerhandling.

#### 5. Speichern des Scores nach Spielende

- **Testziel**: Sicherstellen, dass der erzielte Score eines Benutzers erfolgreich gespeichert wird.
- **Vorgehensweise**: Nach dem Ende eines Spiels wird der Score automatisch über die API an das Backend gesendet.
- **Erwartetes Ergebnis**: Der Score wird erfolgreich gespeichert und eine Bestätigung wird angezeigt.
- **Abdeckung**: API-Aufruf zur Score-Speicherung und Token-Validierung.

#### 6. Anzeige der Highscore-Liste

- **Testziel**: Sicherstellen, dass Benutzer die aktuelle Highscore-Liste einsehen können.
- **Vorgehensweise**: Der Benutzer öffnet die Highscore-Seite im Hauptmenü.
- **Erwartetes Ergebnis**: Die Highscore-Liste wird korrekt angezeigt, inklusive aller Benutzernamen und Scores.
- **Abdeckung**: Lesen der Highscore-Datenbank über die API und Darstellung der Daten.

## Testprotokoll für die Spielanwendung "Dont Drop The Blop"

| Testfall Nr. | Beschreibung                            | Testergebnis | Bemerkungen                       |
| ------------ | --------------------------------------- | ------------ | --------------------------------- |
| 1            | Registrierung eines neuen Benutzers     | Erfolgreich  | Funktionierte ohne Fehler         |
| 2            | Anmeldung eines registrierten Benutzers | Erfolgreich  | Token wurde korrekt ausgegeben    |
| 3            | Starten des Spiels                      | Erfolgreich  | Spiel startete ordnungsgemäß      |
| 4            | Spielfluss und Spielverhalten           | Fehlgeschlagen  | Spiel löst gameOver aus obwohl der trigger nicht ausgelöst wurde        |
| 5            | Speichern des Scores nach Spielende     | Fehlgeschlagen  | zugrif verweigert |
| 6            | Anzeige der Highscore-Liste             | Fehlgeschlagen  | zugrif verweigertt |


## Sicherheitskonzept für die Spielanwendung "Dont Drop The Blop"

### 1. Authentifizierung

Die Anwendung setzt eine tokenbasierte Authentifizierung ein, um sicherzustellen, dass nur autorisierte Benutzer Zugriff auf das Spiel haben. Jeder Benutzer muss sich zuerst erfolgreich anmelden, um ein JWT (JSON Web Token) zu erhalten, das als Zugangstoken dient. Dieses Token wird bei jeder Anfrage an geschützte Endpunkte als Teil des HTTP-Headers mitgesendet. Nur Benutzer mit einem gültigen Token können auf die Funktionen des Spiels zugreifen, wie z. B. das Starten eines Spiels oder das Speichern eines Scores.

### 2. Autorisierung

Die Anwendung unterscheidet zwischen normalen Benutzern und Administratoren.

Normale Benutzer: Können sich anmelden, das Spiel spielen, ihren Score speichern und die Highscore-Liste einsehen.

Administratoren: Besitzen erweiterte Rechte, wie das Sperren oder Bannen von Benutzern. Wenn ein Benutzer gesperrt wurde, kann er sich nicht mehr anmelden und sein Score wird aus der Highscore-Liste entfernt.

Die Autorisierungsregeln werden über die Backend-API durch spezielle Berechtigungsprüfungen umgesetzt, die sicherstellen, dass nur Benutzer mit der Rolle "Admin" bestimmte administrative Funktionen ausführen können.

### 3. Zugriffskontrollen

Spielzugang: Der Zugriff auf das Spiel ist nur möglich, wenn der Benutzer ein gültiges JWT-Token vorweist. Das Token wird beim Spielstart überprüft und muss gültig sein, damit der Benutzer spielen kann.

Speichern des Scores: Der Spiel-Score wird über eine geschützte API-Endpunkt im Backend gespeichert. Diese API prüft, ob das bereitgestellte Token gültig ist, bevor der Score des Benutzers in der Datenbank gespeichert wird. Ungültige oder manipulierte Token werden zurückgewiesen.

Highscore-Einsicht: Jeder authentifizierte Benutzer hat die Möglichkeit, die Highscore-Liste einzusehen. Diese wird über einen öffentlichen Endpunkt zur Verfügung gestellt, der jedoch nur lesenden Zugriff auf die Highscore-Datenbank gewährt.

### 4. Datenintegrität und Manipulationsschutz

Alle API-Anfragen zum Speichern von Scores werden über HTTPS gesendet, um sicherzustellen, dass die Daten verschlüsselt sind und nicht von Dritten abgefangen oder manipuliert werden können.

JWT-Token werden verwendet, um sicherzustellen, dass Benutzer nur ihre eigenen Daten manipulieren können. Der Server überprüft die Gültigkeit und Integrität des Tokens bei jeder Anfrage.

### 5. Benutzerverwaltung und Sperrfunktion

Administratoren haben die Möglichkeit, Benutzer zu sperren oder zu bannen. Diese Sperrfunktion sorgt dafür, dass der gesperrte Benutzer sich nicht mehr anmelden kann und sein Score nicht mehr in der Highscore-Liste angezeigt wird. Die Implementierung sieht vor, dass der Status eines Benutzers in der Datenbank aktualisiert wird, sodass jeglicher Zugriff auf das Spiel verweigert wird, wenn der Benutzer als "gesperrt" markiert ist.

### 6. Datensicherheit

Passwort-Sicherheit: Benutzerpasswörter werden mit einem sicheren Hashing-Algorithmus  verschlüsselt in der Datenbank gespeichert. Es ist zu keinem Zeitpunkt möglich, das Passwort im Klartext auszulesen.


## Auswertung

### Auswertung aus Sicht von Patrik

Rückblickend muss ich noch sehr viel über Frontend lernen. Besonders die Arbeit mit Tokens hat mich komplett überfordert. Am Anfang habe ich zu viel Zeit in das Programmieren des Spiels verbrannt, wodurch mir die Zeit für die Planung und Implementierung anderer wichtiger Teile fehlte. Die Planung war zu oberflächig und nicht gut durchgesprochen, was sich im Verlauf des Projekts als Problem herausgestellt hat. Die Kommunikation im Team war ebenfalls nicht ausreichend und hat starkes Entwicklungspotential. Dank meinem großzügigen Chef, der es versteht, dass schulische Projekte hohe Priorität besitzen, konnte ich Montag freinehmen. Im Verlauf von Montag ist mir jedoch aufgefallen, dass die Zeit nicht reicht, und er hat mir auch Dienstag frei gegeben. Obwohl ich so viel Zeit hatte, bin ich dennoch sehr enttäuscht von dem Ergebnis. Die Idee, ein eigenes Minispiel mit Highscore zu erstellen, hat mich zunächst sehr motiviert, aber die ganzen Hürden und Fehlermeldungen haben mich schließlich moralisch gebrochen, und ich möchte nichts mehr damit zu tun haben. 
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
| 25.11.2024 | 6 h         | Versuchen das Frontend mit dem Backen zu verknüpfen   | stendig nur fehlermeldung über fehlermeldung über fehlermeldung, nachdem ich den code stück für stück debbugt habbte mit controllbracke konnte ich dafon ausgehen das überall der richtige token und die richtige werte in den parameter sind aber der zugang blib mir verwert, habe auch versucht den /api/scores/add für alle erreichbar machen aber es wurde mir weiterhin mit der Fehlermeldung 401 den zugruif verweigert                                                                                                                                                                                                      | Patrik     |
| 25.11.2024 | 3 h         | Userpfade prüfen                                   | habe versucht mithilfe von Insomnia ein Push befehl auszufühern ob ich wenigest so ein eintrag für den userScore eintragen kann aber es wahr weiterhin mit der fehlermeldung 401 versehen. Nach mehrfaches ausprobieren und auch ChatGpt fragen an was es liegen kann, habe ich es mit einer schmerzenden Faust aufgegeben.                                                                                                                                                                                              | Patrik     |
| 26.11.2024 | 2 h         | Frontend Test einbinden                                  | Habe mithilfe von ChatGPT zest erstellt für den Frontend, aber erfoglos, die test konnte ich nachdem ich weitere node_models heruntergeladen habe Ausführen, aber trozdem konte es irgenwie den Syntax nicht verstehen, somit habe ich beschlossen auch hier aufzugeben.                                                                                                                                                                                              | Patrik     |
| 22.11.2024 | 1 h         | ReadMe nachtragen                                   | Meine erlebnisse im ReadMe für die Nachwelt festgehalten                                                                                                                                                                                               | Patrik     |

|25.11.2024 | 0.5 h | Die Block Funktion mit unblock erweitert | Dies war relativ einfach. Ich musste hier bei der betroffenen Funktion nur einen if/else statement setzen zum prüfen ob der user bereits blockiert ist oder nicht | Kunga |
| 25.11.2024 | 0.5 h | Kommentare gesetzt für die Klassen | Keine Schwierigkeiten | Kunga |

## Hilfestellungen

- Struktur des Codes fürs Backend vom Unterricht Modul 223 - Multi User Applikation
- [Nutzung von ChatGPT für Programmierunterstützung](https://chatgpt.com/)
- Hilfestellungen durch den Dozenten in diversen Punkten
