# DontDroptheBlop

## Inhaltsverzeichnis

- [DontDroptheBlop](#dontdroptheblop)
  - [Inhaltsverzeichnis](#inhaltsverzeichnis)
  - [Projektidee](#projektidee)
  - [Arbeitsplan](#arbeitsplan)
    - [Projektvorbereitung und Anforderungsanalyse](#projektvorbereitung-und-anforderungsanalyse)
    - [Backend-Entwicklung](#backend-entwicklung)
    - [Frontend-Entwicklung](#frontend-entwicklung)
    - [Präsentation vorbereiten](#präsentation-vorbereiten)
    - [CSS anpassen](#css-anpassen)
    - [Integration und Tests](#integration-und-tests)
    - [Frontend und Backend zusammenführen](#frontend-und-backend-zusammenführen)
    - [Userpfade prüfen](#userpfade-prüfen)
    - [Automatisierte Test einbinden](#automatisierte-test-einbinden)
    - [Deployment](#deployment)
    - [Dokumentation fertigstellen](#dokumentation-fertigstellen)
  - [Installationsanleitung](#installationsanleitung)
    - [Voraussetzungen](#voraussetzungen)
    - [Repository klonen](#repository-klonen)
    - [Docker compose file starten](#docker-compose-file-starten)
    - [mit mysql verbinden](#mit-mysql-verbinden)
    - [Datenbank auswählen](#datenbank-auswählen)
    - [Admin User erstellen](#admin-user-erstellen)
    - [Backend einrichten](#backend-einrichten)
    - [Frontend einrichten](#frontend-einrichten)
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
  - [Testplan für die Spielanwendung "Dont Drop The Blop"](#testplan-für-die-spielanwendung-dont-drop-the-blop)
    - [1. Registrierung eines neuen Benutzers](#1-registrierung-eines-neuen-benutzers)
    - [2. Anmeldung eines registrierten Benutzers](#2-anmeldung-eines-registrierten-benutzers)
    - [3. Starten des Spiels](#3-starten-des-spiels)
    - [4. Spielfluss und Spielverhalten](#4-spielfluss-und-spielverhalten)
    - [5. Speichern des Scores nach Spielende](#5-speichern-des-scores-nach-spielende)
    - [6. Anzeige der Highscore-Liste](#6-anzeige-der-highscore-liste)
  - [Testprotokoll für die Spielanwendung "Dont Drop The Blop"](#testprotokoll-für-die-spielanwendung-dont-drop-the-blop)
  - [Sicherheitskonzept für die Spielanwendung "Dont Drop The Blop"](#sicherheitskonzept-für-die-spielanwendung-dont-drop-the-blop)
    - [1. Authentifizierung](#1-authentifizierung)
    - [2. Autorisierung](#2-autorisierung)
    - [3. Zugriffskontrollen](#3-zugriffskontrollen)
    - [4. Datenintegrität und Manipulationsschutz](#4-datenintegrität-und-manipulationsschutz)
    - [5. Benutzerverwaltung und Sperrfunktion](#5-benutzerverwaltung-und-sperrfunktion)
    - [6. Datensicherheit](#6-datensicherheit)
  - [Auswertung](#auswertung)
    - [Auswertung aus Sicht von Patrik](#auswertung-aus-sicht-von-patrik)
    - [Auswertung aus Sicht von Kunga](#auswertung-aus-sicht-von-kunga)
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

**Als Admin möchte ich die Highscore Liste resetten können.(Optional)**

<ins>Akzeptanzkriterien</ins>

- Der Admin sieht eine Option zum Zurücksetzen der Highscore-Liste.
- Die Option ist klar als "Highscore zurücksetzen" deklariert.
- Nach der Bestätigung wird der Score im Web sowie der Datenbank zurückgesetzt.

## Arbeitsplan

### Projektvorbereitung und Anforderungsanalyse

| **Datum**           | **Bearbeitet von** | **Aufwand**                         | **Beschreibung**                                                                   |
| ------------------- | ------------------ | ----------------------------------- | ---------------------------------------------------------------------------------- |
| 15.11.24 - 28.11.24 | Kunga              | Durchgehend während der Projektzeit | Dokumentation, die am Anfang bis zum Schluss stets aktuell gehalten wird.          |
| 15.11.24            | Kunga              | 0.75h                               | Projektidee und eine Analyse der Anforderungen sowie Anforderungskatalog erstellen |

### Backend-Entwicklung

| **Datum** | **Bearbeitet von** | **Aufwand** | **Beschreibung**                                                                |
| --------- | ------------------ | ----------- | ------------------------------------------------------------------------------- |
| 16.11.24  | Kunga              | 1h          | Backend-Struktur vom Unterricht 16.11.24 in unserem Backend-Folder hinzugefügt. |
| 22.11.24  | Kunga              | 3h          | Backend vom neuesten Unterricht (21.11) angepasst.                              |
| 22.11.24  | Kunga              | 2h          | Fehlende Klassen im Backend projektspezifisch hinzugefügt.                      |

### Frontend-Entwicklung

| **Datum** | **Bearbeitet von** | **Aufwand** | **Beschreibung**                                                            |
| --------- | ------------------ | ----------- | --------------------------------------------------------------------------- |
| 22.11.24  | Patrik             | 2.5h        | Struktur Frontend mit allen Pages und Services definiert und implementiert. |
| 22.11.24  | Patrik             | 2h          | Anpassung der CSS für ein konsistentes Design.                              |

### Präsentation vorbereiten

| **Datum** | **Aufwand** | **Bearbeitet von** | **Beschreibung**                               |
| --------- | ----------- | ------------------ | ---------------------------------------------- |
| 22.11.24  | 2.5h        | Patrik             | Struktur Frontend mit allen pages und services |

### CSS anpassen

| **Datum** | **Aufwand** | **Bearbeitet von** | **Beschreibung**                 |
| --------- | ----------- | ------------------ | -------------------------------- |
| 22.11.24  | 2h          | Patrik             | Anpassen der Pages gemäss Design |

### Integration und Tests

| **Datum** | **Bearbeitet von** | **Aufwand** | **Beschreibung**                                                   |
| --------- | ------------------ | ----------- | ------------------------------------------------------------------ |
| 23.11.24  | Kunga & Patrik     | 1h          | Frontend und Backend zusammengeführt und getestet.                 |
| 23.11.24  | Kunga & Patrik     | 1h          | Prüfung der Userpfade, um sicherzustellen, dass alle korrekt sind. |
| 24.11.24  | Kunga & Patrik     | 1h          | Automatisierte Tests für Frontend und Backend erstellt.            |

### Frontend und Backend zusammenführen

| **Datum** | **Aufwand** | **Bearbeitet von** | **Beschreibung** |
| --------- | ----------- | ------------------ | ---------------- |
| 25.11.24  | 2h          | Patrik             | Siehe Titel      |

### Userpfade prüfen

| **Datum** | **Aufwand** | **Bearbeitet von** | **Beschreibung**                         |
| --------- | ----------- | ------------------ | ---------------------------------------- |
| 25.11.24  | 2h          | Kunga & Patik      | Prüfen ob die Userpfade angezeigt werden |

### Automatisierte Test einbinden

| **Datum** | **Aufwand** | **Bearbeitet von** | **Beschreibung**                 |
| --------- | ----------- | ------------------ | -------------------------------- |
| 25.11.24  | 2h          | Patrik             | Testfälle erstellen für Frontend |

### Deployment

| **Datum** | **Bearbeitet von** | **Aufwand** | **Beschreibung**                                       |
| --------- | ------------------ | ----------- | ------------------------------------------------------ |
| 26.11.24  | Kunga & Patrik     | 2h          | Deployment der Anwendung auf dem Server und Tests.     |
| 27.11.24  | Kunga & Patrik     | 1.5h        | Abschlussprüfung der Anwendung und finale Anpassungen. |

### Dokumentation fertigstellen

| **Datum** | **Aufwand** | **Bearbeitet von** | **Beschreibung**                         |
| --------- | ----------- | ------------------ | ---------------------------------------- |
| 28.11.24  | 1h          | Kunga & Patik      | gemeinsam die dokumentation überarbeiten |
| 28.11.24  | 1h          | Kunga & Patik      | Präsentations erstellen und einüben      |

## Installationsanleitung

### Voraussetzungen

- Java (mind. Version 17) und Maven installiert
- Insomnia für API-Tests installiert und läuft
- GitHub Account
- Node.js
- Docker und Docker Compose
- (Optional) Docker Desktop

### Repository klonen

```bash
git clone https://github.com/TenzKD/DontDropTheBlop.git
cd DontDropTheBlop
```

### Docker compose file starten

```bash
docker-compose up -d
```

<p>Verbinde dich zur Datenbank und erstelle den Admin-Benutzer (siehe unten).</p>

### mit mysql verbinden

```bash
docker exec -it mysql-db mysql -u demo -p demo
```

### Datenbank auswählen

```sql
use demo;
```

### Admin User erstellen

```sql
INSERT INTO user (id, high_score, is_blocked, password, username)
VALUES (1, 0, 0x00, 'yourPassword', 'yourname');

INSERT INTO user_role (user_id, role_id)
VALUES (1, 2);
```

### Backend einrichten

Im Backend Verzeichnis /Backend

```bash
mvn clean install
mvn spring-boot:run
```

### Frontend einrichten

Im Frontendverzeichnis /Frontend

```bash
npm install
npm install vite --save-dev
npm run dev
```

## Backend

### Architektur

#### Hauptkomponenten

##### Controller

Die Controller-Schicht ist für die Verwaltung der HTTP-Anfragen verantwortlich. Sie definiert die Endpunkte der Anwendung, die von den Clients aufgerufen werden können. Die Controller übernehmen die Rolle des Vermittlers, indem sie eingehende Anfragen an die entsprechenden Services weiterleiten und die Ergebnisse an den Client zurückgeben.

##### Service

Die Service-Schicht enthält die Geschäftslogik der Anwendung. Hier werden alle relevanten Operationen implementiert, die die Anforderungen der Endpunkte erfüllen. Beispiele für typische Service-Methoden:

- Speichern von Score: Verarbeitet die Punktzahl eines Benutzers und aktualisiert dessen Highscore, falls die Punktzahl höher ist.
- Abrufen der Top 10 Spieler: Berechnet und liefert eine Liste der besten Spieler basierend auf ihren Highscores.

##### Repository

Die Repository-Schicht ist für den Datenbankzugriff zuständig. Sie verwendet JPA (Java Persistence API), um CRUD-Operationen (Erstellen, Lesen, Aktualisieren und Löschen) auf den Entitäten auszuführen. Jedes Repository ist direkt mit einer Entität verbunden, z. B. UserRepository für die Benutzerentität oder ScoreRepository für die Punkteentität.

#### Sicherheitskonzept

Die Sicherheit der Anwendung basiert auf einer klaren Trennung von Zugriffsrechten und der Verwendung von JSON Web Tokens (JWT) zur Authentifizierung und Autorisierung.

**Zugriffsebenen**:

- Öffentlich (public): Endpunkte, die ohne Authentifizierung zugänglich sind, z. B. Registrierung oder Login.
- Privat (user only): Endpunkte, die nur für authentifizierte Benutzer verfügbar sind, z. B. das Abrufen persönlicher Scores.
- Administrativ (admin only): Endpunkte, die nur Administratoren nutzen dürfen, z. B. Benutzerverwaltung.

**AuthTokenFilter Klasse**

Filtert Anfragen und prüft die JWTs und authentifiziert Benutzer anhand der Tokens.

**Rollen und Berechtigungen**

Die Rollen `ROLE_USER` und `ROLE_ADMIN` werden über die Role Entität verwaltet. Ein Benutzer ist bei der Registrierung als default Rolle User.

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

| HTTP Request | Endpoint | Beschreibung                                                                                      |
| :----------- | :------- | ------------------------------------------------------------------------------------------------- |
| POST         | /login   | Gibt den username und password um sich mit einem existieren Konto einzuloggen                     |
| POST         | /signup  | Erstellt ein neues Konto mit username und passwort. Prüft ob der username bereits vergeben wurde. |

#### Score

| HTTP Request | Endpoint        | Beschreibung                                                  |
| :----------- | :-------------- | ------------------------------------------------------------- |
| POST         | /add            | Gibt dem User einen entsprechenden score und speichert es ab. |
| GET          | /top10          | Zeigt die 10 Spieler mit dem höchsten highscore               |
| DELETE       | /{userId}/clear | Löscht den score und highscore eines spezifischen Spielers    |

#### Security

| HTTP Request | Endpoint          | Beschreibung                                                                                             |
| :----------- | :---------------- | -------------------------------------------------------------------------------------------------------- |
| GET          | /users            | Zeigt eine Liste mit allen Usern an                                                                      |
| PUT          | /block/{username} | Blockt einen spezifischen User. Der User kann sich nicht mehr einloggen und sein highscore wird resettet |

### Testplan

Für das Backend wurden Unit-Tests durchgeführt, um die Funktionalität von der User Rolle zu prüfen ob die default Values übereinstimmen sowie das hinzufügen der score Punkte.

#### Funktionstests der Unit-Tests

| Testfall                                                           | Erwartetes Verhalten                                                                                                 |
| ------------------------------------------------------------------ | -------------------------------------------------------------------------------------------------------------------- |
| Initialisierung der Benutzer-Entität (`testDefaultValues`)         | Die Felder der Benutzer-Entität werden korrekt initialisiert: scores ist leer, isBlocked ist false, highScore ist 0. |
| Hinzufügen einer Punktzahl zur User-Entität (`testAddScoreToUser`) | Die Punktzahl wird korrekt zur scores-Menge hinzugefügt, und die Beziehung zwischen Score und User ist konsistent.   |

### Testprotokoll

| **Testfall**         | **Testverhalten**                                          | **Testresultat** | **Kommentar**                                                   |
| -------------------- | ---------------------------------------------------------- | ---------------- | --------------------------------------------------------------- |
| `testDefaultValues`  | Standardwerte der `User`-Entität werden geprüft            | Bestanden        | Standardwerte (`isBlocked`, `scores`, `highScore`) korrekt      |
| `testAddScoreToUser` | Hinzufügen einer Punktzahl zur `User`-Entität wird geprüft | Bestanden        | Punktzahl wird erfolgreich hinzugefügt und korrekt referenziert |

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

| Testfall Nr. | Beschreibung                            | Testergebnis | Bemerkungen                                                                                                                                               |
| ------------ | --------------------------------------- | ------------ | --------------------------------------------------------------------------------------------------------------------------------------------------------- |
| 1            | Registrierung eines neuen Benutzers     | Erfolgreich  | Funktionierte ohne Fehler                                                                                                                                 |
| 2            | Anmeldung eines registrierten Benutzers | Erfolgreich  | Token wurde korrekt ausgegeben                                                                                                                            |
| 3            | Starten des Spiels                      | Erfolgreich  | Spiel startete ordnungsgemäß                                                                                                                              |
| 4            | Spielfluss und Spielverhalten           | Teilweise    | Spiel löst gameOver aus obwohl der trigger nicht ausgelöst wurde, aber das spiel lauft weiter so das dan der Richtige Highscor abgespeichert werden kann. |
| 5            | Speichern des Scores nach Spielende     | Erfolgreich  | Der Score wird ordnungsgemäss abgespeichert                                                                                                               |
| 6            | Anzeige der Highscore-Liste             | Erfolgreich  | Der höchste Score wird als Highscore für den User auf der Liste angezeigt falls er in der Top 10 ist.                                                     |

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

Passwort-Sicherheit: Benutzerpasswörter werden mit einem sicheren Hashing-Algorithmus verschlüsselt in der Datenbank gespeichert. Es ist zu keinem Zeitpunkt möglich, das Passwort im Klartext auszulesen.

## Auswertung

### Auswertung aus Sicht von Patrik

Rückblickend muss ich noch sehr viel über Frontend lernen. Besonders die Arbeit mit Tokens hat mich komplett überfordert. Am Anfang habe ich zu viel Zeit in das Programmieren des Spiels verbrannt, wodurch mir die Zeit für die Planung und Implementierung anderer wichtiger Teile fehlte. Die Planung war zu oberflächig und nicht gut durchgesprochen, was sich im Verlauf des Projekts als Problem herausgestellt hat. Die Kommunikation im Team war ebenfalls nicht ausreichend und hat starkes Entwicklungspotential. Dank meinem großzügigen Chef, der es versteht, dass schulische Projekte hohe Priorität besitzen, konnte ich Montag freinehmen. Im Verlauf von Montag ist mir jedoch aufgefallen, dass die Zeit nicht reicht, und er hat mir auch Dienstag frei gegeben. Obwohl ich so viel Zeit hatte, bin ich dennoch sehr enttäuscht von dem Ergebnis. Die Idee, ein eigenes Minispiel mit Highscore zu erstellen, hat mich zunächst sehr motiviert, aber die ganzen Hürden und Fehlermeldungen haben mich schließlich moralisch gebrochen, und ich möchte nichts mehr damit zu tun haben.

### Auswertung aus Sicht von Kunga

Es war ein spannendes Projekt, vor allem dass ich es aus der Sicht vom Backend sehen konnte in welche ich noch nicht so viel Erfahrung habe. Es wäre meiner Meinung nach definitiv besser gewesen, wenn das Modul parallel zum anderen Thema laufe würde, damit wir schlussendlich mehr Zeit haben den ganzen Code den wir implementieren mussten zu verstehen. Dadurch dass wir alles in einem Stück durchnahmen haben wir sehr viele Informationen in sehr kurzer Zeit aufgenommen. Ich bin nicht ganz zuversichtlich, dass ich den gesamten Backend Code verstehe und brauche definitiv mehrere Projekte dieser Art damit ich selbstsicherer bin. Das schwierigste im Backend für mich war es die Score Entität nachträglich im bereits erstellten Code hinzuzufügen. Ich musste den Attribut score von der Klasse User zu einer eigenständigen Entität umwandeln. Hier war es wie ich oben bereits im Journal geschrieben habe einfacher gewesen, wenn man zuerst ein Diagramm erstellt hätte. Aufgrund der Implementierung des Codes von der Schule hätte es dies jedoch erschwert. Bei einem Projekt welche man von null auf beginnt hätte ich es definitiv mit einem Diagramm gemacht. Die Zeit an sich hat gerade noch knapp gereicht um ein reibungsloses Spielerlebnis zu gewährleisten.

### Check Akzeptanzkriterien

| **User Story**                                                                                                | **Akzeptanzkriterien**                                                                                                                                                                                                                  | **Check**                                                            |
| ------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------- |
| **Als Benutzer möchte ich mich einloggen können mit Usernamen und Passwort, um das Spiel spielen zu können.** | - Der User sieht als erstes den Loginscreen und hat die Möglichkeit sich zu registrieren oder einzuloggen.<br>- Bei erfolgreichem Login wird der User zum Startmenü des Spiels weitergeleitet.<br>- Der Username muss einzigartig sein. | erfolgreich                                                          |
| **Als Benutzer möchte ich die Highscore Liste anschauen können.**                                             | - Der Benutzer hat die Berechtigung die Highscore Liste anschauen zu können.                                                                                                                                                            | erfolgreich                                                          |
| **Als Admin möchte ich Benutzer blockieren können.**                                                          | - Blockierte Benutzer können sich nicht mehr einloggen.<br>- Blockierte Benutzer werden nicht mehr auf der Highscore Liste angezeigt.                                                                                                   | erfolgreich                                                          |
| **Als Admin möchte ich die Highscore Liste resetten können. (Optional)**                                      | - Der Admin sieht eine Option zum Zurücksetzen der Highscore-Liste.<br>- Die Option ist klar als "Highscore zurücksetzen" deklariert.<br>- Nach der Bestätigung wird der Score im Web sowie der Datenbank zurückgesetzt.                | nicht erfolgreich, stattdessen kann der Admin einzelne User resetten |

### Arbeitsjournal

| **Datum**  | **Aufwand** | **Tätigkeiten**                                                                                | **Schwierigkeiten/Reflexion**                                                                                                                                                                                                                | **Author** |
| ---------- | ----------- | ------------------------------------------------------------- | -------- | ---------- |
| 22.11.2024 | 1 h         | Frontend mit dem Spiel gefüttert                                                               | übertragung war erfolgreich                                                                                                                                                            | Patrik     |
| 22.11.2024 | 3 h         | Frontend CSS angepasst                                                                         | müssam aber lehrreich                                                                                                                                                                                                                                                                                    | Patrik     |
| 22.11.2024 | 3 h         | Frontend mit Backend verbunden                                                                 | Probleme mit DOM und axios files                                                                                                                                                                                                               | Patrik     |
| 22.11.2024 | 1 h         | Im Frontend Registrierung und Login eingerichtet                                               | holperig aber erfolgreich                                                                                                                                                     | Patrik     |
| 22.11.2024 | 2 h         | Backend vom letzten Unterrichtstag 21.11.24 hinzugefügt.                                       | Da ich Probleme hatte mit dem Einfügen, habe ich es schlussendlich ein File nach dem andern hinzugefügt und geprüft, ob es auch funktioniert.                                                                                                                                                                                                                                                                                                                                  | Kunga      |
| 22.11.2024 | 2 h         | Die Struktur des Backends angepasst auf unser Projekt                                          | Ich hatte am Schluss der Lektion die Erkenntnis, dass es besser wäre, den Score als eigenes Entity zu erstellen anstatt als Attribut von der Klasse User.                                                                                                                                                                                                                                                                                                                                                                                  | Kunga      |
| 22.11.2024 | 4 h         | Endpunkte erstellt, um alle User anzuzeigen sowie User zu blocken                              | Falls genügend Zeit da wäre, könnte man die Funktion als Button hinzufügen, welche nur für den Admin sichtbar ist. Ausserdem sollte ich die Funktion des Blockens anpassen, falls es bereits blockiert ist, dass es entblockt.                                                                                                                                                                                                                                                  | Kunga      |
| 24.11.2024 | 4 h         | Score Entity sowie Endpoints für die Applikation hinzugefügt                                   | Ich hatte ziemliche Probleme, den Score Entity im Nachhinein hinzuzufügen. Hier wäre es definitiv besser gewesen, ein Datenmodell von Anfang an zu erstellen, um einen besseren Überblick auf die Struktur zu haben. Ein Grund war wahrscheinlich, weil die Mehrheit der Klassen während dem Unterricht implementiert worden sind. Bei der Implementierung habe ich es so gemacht, dass man die Scores in der Liste hinzufügen kann und der höchste Wert von Score in der Liste wird dem Highscore hinzugefügt. Ich war am Überlegen, ob ich eventuell den Wert direkt an Highscore hinzufügen soll, falls dieser höher ist, damit nicht eine riesige Liste entsteht. Schlussendlich habe ich mich dagegen entschieden aufgrund von, wie unser Dozent gesagt hat, analytischen Gründen wie z.B. wie viele Punkte hatte der User im Durchschnitt etc. Stattdessen gab ich dem ScoreController einen DELETE Endpoint zum Löschen von Scores und Highscore des Users. Dieser kann nur von einem Admin zugegriffen werden. | Kunga      |
| 25.11.2024 | 6 h         | Versuchen, das Frontend mit dem Backend zu verknüpfen                                          | Ständig nur Fehlermeldungen über Fehlermeldungen über Fehlermeldungen. Nachdem ich den Code Stück für Stück debuggt hatte, konnte ich davon ausgehen, dass überall der richtige Token und die richtigen Werte in den Parametern sind, aber der Zugang blieb mir verwehrt. Ich habe auch versucht, den `/api/scores/add` für alle erreichbar zu machen, aber es wurde mir weiterhin mit der Fehlermeldung 401 der Zugriff verweigert.                                                                                                                                                                 | Patrik     |
| 25.11.2024 | 3 h         | Userpfade prüfen                                                                               | Habe versucht, mithilfe von Insomnia einen Push-Befehl auszuführen, ob ich wenigstens einen Eintrag für den UserScore eintragen kann, aber es war weiterhin mit der Fehlermeldung 401 versehen. Nach mehrfachen Versuchen und auch Fragen an ChatGPT, was es liegen könnte, habe ich es mit einer schmerzenden Faust aufgegeben.                                                                                                                                                                                                             | Patrik     |
| 25.11.2024 | 0.5 h       | Die Block-Funktion mit Unblock erweitert                                                       | Dies war relativ einfach. Ich musste hier bei der betroffenen Funktion nur einen If/Else-Statement setzen, um zu prüfen, ob der User bereits blockiert ist oder nicht.                                                                                                                                                                                          | Kunga      |
| 25.11.2024 | 0.5 h       | Kommentare gesetzt für die Klassen                                                             | Keine Schwierigkeiten                                                                                                                                                                                                                        | Kunga      |
| 26.11.2024 | 2 h         | Frontend Test einbinden                                                                        | Habe mithilfe von ChatGPT Tests erstellt für das Frontend, aber erfolglos. Die Tests konnte ich nach dem Herunterladen weiterer Node-Module ausführen, aber trotzdem konnte es irgendwie den Syntax nicht verstehen, sodass ich beschlossen habe, auch hier aufzugeben.                                                                                                                                                                                                              | Patrik     |
| 26.11.2024 | 1 h         | ReadMe nachtragen                                                                              | Meine Erlebnisse im ReadMe für die Nachwelt festgehalten                                                                                                                                                                                                                                             | Patrik     |
| 26.11.2024 | 1 h         | Zwei Testfälle erstellt für Backend                                                            | Keine Schwierigkeiten                                                                                                                                                                                                                          | Kunga      |
| 26.11.2024 | 1 h         | Backend-Sektion im README.md vervollständigt                                                   | Ich war mir persönlich nicht sicher, ob ich genügend Informationen geschrieben habe für die Sektion Backend.                                                                                                                                                                                            | Kunga      |
| 26.11.2024 | 0.5 h       | Fehler im Frontend behoben / geprüft                                                           | Beim Fehler im Frontend handelte es sich um einen Tippfehler, welcher angepasst wurde, damit es mit dem Backend verknüpft ist. Die User werden lokal korrekt angezeigt mit Usernamen und Passwort, und das Spiel speichert den Score nach einem Game Over.                                                                                                                                                                                                                                                                                    | Kunga      |
| 27.11.2024 | 3 h         | Der Grund gefunden, weshalb der Player nach einer gewissen Zeit automatisch Game Over erreicht | Der Grund für den Fehler ist, dass die Position des Players (player.y) sich mit der Gravitation (dy) addiert, und der If-Statement für das Game Over besagt, dass wenn `player.y + player.height` größer ist als `canvas.height`, wird das Game Over aktiviert. Da die Position des Players jedoch mit jedem Sprung sich sehr schnell vergrößert, akzeptiert der If-Statement irgendwann die Bedingung. Leider kann man die Position y nicht zurücksetzen, da dies sonst die Position der Figur während des Spiels ändert. Ohne die grundlegende Struktur des Spiels zu ändern, kann ich das Problem nicht lösen. Ich habe hierzu Patrik gefragt, ob er eventuell das Problem lösen kann.                                                                                                                                                                                                                                                                                                                              | Kunga      |
| 27.11.2024 | 2.5 h       | Spiel-Logik angepasst                                                                          | Nach weiterem Herumexperimentieren und Debuggen konnte das Problem erkannt werden, aber nur teilweise gelöst.                                                                                                                                | Patrik      |
| 27.11.2024 | 2 h       | Project auf Raspberry Hosten angepasst                                                                          | Habe auf einem Raspbarry wo Ubuntu drauf lauft versucht unsere Projekt zu hosten. Habe zuerst Docker installiert, danach wollte ich Docker-compose istallieren aber da begangen die Probleme. Ich musste weitere packete herunterladen damit Docker-Compose funtionierte. Danach habe ich mich auf unseren GitHub Repository eingeloggt um das Projkt herunterzuladen. Als erstes habe ich die DB mithilfe des Docker-Compose eingerichtet. Dann wollte ich den Springboot starten musste aber zuerst Maven herunterladen. Aber die fehlermeldungen beim spring-boot haben sich nur geheuft. Habe dan mal Chatgpt gefragt und es meinte das inhalt im pom file fehlen. Ich war erschöpft und meine geduld war bereits am ende war habe ich dan aufgegeben.                                                                                                                               | Patrik      |
| 28.11.2024 | 3 h       | Präsentation und Dokru                                                                          | Präsetation herumgespielt und dan noch die Doku mit den letzten daten befüttern.                                                                                                                    | Patrik      |

## Hilfestellungen

- Struktur des Codes fürs Backend vom Unterricht Modul 223 - Multi User Applikation
- [Nutzung von ChatGPT für Programmierunterstützung](https://chatgpt.com/)
- Hilfestellungen durch den Dozenten in diversen Punkten
