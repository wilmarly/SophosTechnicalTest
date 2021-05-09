# SophosTechnicalTest

Prueba automatizada para la aplicación web tuttos y consumo de servicio web con RestAssured usando Excel

## Descripción:

Esta solución ha sido diseñada como parte del proceso de selección de la empresa Sophos Solutions, basicamente encontrara dos escenarios, el primero consiste en agregar un producto al carrito de compras y el segundo consiste en validar la respuesta a una petición realizada a un servicio Rest. la solución tiene un enfoque de escalabilidad por medio de un dataDriven gestionado por documentos de Excel para cada escenario.

## Tabla de contenido:

*Cómo instalar?.
*Cómo usar?.
*Cómo ver el reporte generado?
*Tecnologías utilizadas.

## Cómo instalar?

Descargue o clone el proyecto, una ves degargado inicie el cmd apuntando al directorio del proyecto y ejecute la siguiente linea de codigo.

$ gradle clean build -x test

## Cómo usar?
Antes de iniciar la ejecución del robot dirijase a los archivos excel donde podra parametrizar los datos con los cuales se van a ejecutar os escenarios de prueba, la ruta es:

$ \\tottusAutomation\src\test\resources\datadriven

tenga en cuenta que por cada linea agregada en el archivo Excel se va a ejecutar el escenario de prueba con los datos ingresados en dicho documento Excel.

una ves configurada la data de prueba ejecute los siguientes comando en el cmd según se reqioera 

### Ejecutar todos los escenarios
$gradle clean test aggregate

### Ejecutar unicamente los escenarios web
$gradle clean -Dcucumber.options="--tags @tottusStore"

### Ejecutar unicamente el escenario REST
$gradle clean -Dcucumber.options="--tags @UsersRequest" test

Cómo ver el reporte generado?

una vez finaliza la ejecución, puede consultar el archivo index.html con el reporte generado en la siguiente ruta:
$ \\tottusAutomation\target\site\serenity

## Tecnológias utilizadas:

*Gradle
*Excel
*Serenuty BDD
*Cucumber
*JUnit
*Screenplay pattern
*Gherkin
*JAVA


Gracais!
