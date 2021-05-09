# **SophosTechnicalTest**

* Prueba automatizada para la aplicación web tuttos y consumo de servicio web con RestAssured en ambos casos usando Excel.
* Programa en JAVA para crear, consultar, editar y eliminar clientes.

## **Descripción:**

Esta solución ha sido diseñada como parte del proceso de selección de la empresa Sophos Solutions, basicamente encontrara dos escenarios, el primero consiste en agregar un producto al carrito de compras y el segundo consiste en validar la respuesta de una petición realizada a un servicio Rest. la solución tiene un enfoque de escalabilidad por medio de un dataDriven gestionado por documentos de Excel para cada escenario.

Programa en JAVA que permite crear, consultar, editar y eliminar clientes a traves de la consola.

## **Tabla de contenido:**

> * ¿Cómo instalar?.
> * ¿Cómo usar?.
> * ¿Cómo ver el reporte generado?
> * Tecnologías utilizadas.
> * Progama por consola para crear, consultar, editar y eliminar clientes.

## **¿Cómo instalar?**

Descargue o clone el proyecto, una vez descargado inicie el cmd apuntando al directorio del proyecto y ejecute la siguiente línea de código.
```
$ gradle clean build -x test
```

## **¿Cómo usar?**
Antes de iniciar la ejecución del robot dirijase a los archivos excel donde podra parametrizar los datos con los cuales se van a ejecutar los escenarios de prueba, la ruta es:
```
 \\SophosSolutions\tottusAutomation\src\test\resources\datadriven
```
Tenga en cuenta que por cada línea agregada en el archivo Excel se va a ejecutar el escenario de prueba con los datos ingresados en dicho documento Excel.

Una vez configurada la data de prueba ejecute los siguientes comando en el cmd según se requiera: 

### **Ejecutar todos los escenarios**
```
$ gradle clean test aggregate
```
### **Ejecutar únicamente los escenarios web**
```
$ gradle clean -Dcucumber.options="--tags @tottusStore"
```
### **Ejecutar únicamente el escenario REST**
```
$ gradle clean -Dcucumber.options="--tags @UsersRequest" test
```
## **¿Cómo ver el reporte generado?**

una vez finaliza la ejecución, puede consultar el archivo index.html con el reporte generado en la siguiente ruta:
```
 \\SophosSolutions\tottusAutomation\target\site\serenity
```
## **Tecnológias utilizadas:**

* Gradle Versión 7.0
* Excel
* Serenuty BDD
* Cucumber
* JUnit
* Screenplay pattern
* Gherkin
* JAVA

## **Programa por consola para crear, consultar, editar y eliminar clientes.**

Este desarrollo se encuentra en la siguiente ruta:
 ```
 \\SophosSolutions\TechnicalTestSophos
```
Para hacer uso de este programa solo es necesario ejecutarlos como una aplicación JAVA y seguir las indicaciones que se muestran por consola


# **¡Gracias!**
