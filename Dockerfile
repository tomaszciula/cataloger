# Instrukcja uruchomienia bazy danych z obrazu Dockera
# Docker musi być zainstalowany w systemie!
# 1. Uruchom Terminal (Wiesz poleceń w Windows)
# 2. Przejdź do katalogu projektu Cataloger w którym jest plik Dockerfile
# 3. Wpisz - "docker build -t my-postgres-db ./" - utworzony zostanie obraz dockerowy o nazwie "my-postgres-db"
# 4. Sprawdź czy obraz został utworzony, wpisz - "docker images -a" żeby wylistować wszystkie obrazy
# 5. W końcu uruchom kontener z postgres wpisując - "docker run -d --name my-postgresdb-container -p 5432:5432 my-postgres-db"
# 6. Baza powinna działać :)
FROM postgres
ENV POSTGRES_PASSWORD docker
ENV POSTGRES_DB world