# inf331-tarea3

## Obtener las fuentes

Para obtener las fuentes y sus dependencias se deben realizar los siguientes pasos:

- Clonar el repositorio

`git clone https://github.com/capgadsx/inf331-tarea3/`

- Obtener gradle y las dependencias

Ejecutar el binario `gradlew` o `gradlew.bat` según el sistema operativo utilizado.

`./gradlew`

## Ejecutar las Pruebas

Una vez obtenidas las dependencias podemos ejecutar `./gradlew test`

## Compilar la aplicación

Una vez realizadas las pruebas compilamos nuestro ejecutable: `./gradlew shadowJar`

## Ejecutar la aplicación

El resultado de la compilación se puede ejecutar a través de: 

`java -jar build/libs/Transactions-1.0-SNAPSHOT-all.jar`
