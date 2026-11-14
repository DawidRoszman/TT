# TT

Projekt `JavaApi` – zadania z programowania (Java, dane z publicznych API).

## Wymagania

- JDK 25 (programy używają kompaktowych plików źródłowych z `void main()`).
- Biblioteka JSON-java `json-20250517.jar`.

## Biblioteka JSON

1. Pobierz
   [json-20250517.jar](https://repo.maven.apache.org/maven2/org/json/json/20250517/json-20250517.jar)
   do katalogu `JavaApi/lib`.
2. W IntelliJ kliknij plik prawym przyciskiem i wybierz **Add as Library**.

Katalog `JavaApi/lib/` jest w `.gitignore`, więc każdy pobiera bibliotekę
samodzielnie.

## Uruchamianie

W IntelliJ: przycisk przy metodzie `main` w pliku zadania. Z terminala
(w katalogu `JavaApi`):

```sh
javac -cp lib/json-20250517.jar -d out src/*.java
java -cp out:lib/json-20250517.jar Zadanie8
```
