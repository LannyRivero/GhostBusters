# 👻 GhostBusters Asturias – CLI Java App  
### Gestión de Fantasmas con MVC + TDD + Clean Code

![Java](https://img.shields.io/badge/Java-17+-red.svg)
![JUnit](https://img.shields.io/badge/Testing-JUnit5-green.svg)
![Coverage](https://img.shields.io/badge/Coverage-70%2B%25-brightgreen.svg)
![Architecture](https://img.shields.io/badge/Architecture-MVC-blue.svg)
![Status](https://img.shields.io/badge/Status-Completed-success.svg)

---

## 🧩 Descripción General
Los habitantes de Asturias han comenzado a notar **sombras inquietantes**, **ecos del más allá** y **manifestaciones espectrales** en lugares emblemáticos de la región.  
Para mantener la paz, se ha fundado la unidad **GhostBusters Asturias**, equipada con trampas ectoplásmicas de última tecnología.

Tu misión como desarrolladora(e) del sistema es permitir:

- Capturar fantasmas  
- Consultar y filtrar la base de datos ectoplásmica  
- Analizar actividad paranormal por fecha  
- Liberar entidades inofensivas  
- Registrar todas las interacciones con UX de consola  

🌍 **Ubicación de la base:** Un almacén industrial en Avilés, acondicionado con trampas de almacenamiento ectoplásmico.

El resultado es una **aplicación Java sólida, modular, testeada y fácil de extender**, ideal para aprender o demostrar habilidades de arquitectura limpia y testing.

---

## 🚀 Funcionalidades Principales

### ✔️ Capturar fantasmas  
Incluye validaciones, selección de clase, nivel de amenaza, habilidad especial y fecha.

### ✔️ Listar fantasmas capturados  
Con formato tabulado y ordenado.

### ✔️ Filtrar por clase  
Se listan únicamente entidades de una categoría específica.

### ✔️ Filtrar por mes y año  
Analiza patrones de actividad paranormal.

### ✔️ Liberar fantasmas  
Útil para gestionar el espacio en el contenedor ectoplásmico.

### ✔️ Menú interactivo de consola  
Múltiples opciones, validación de entradas incorrectas y mensajes de error amigables.

---

## 🏗️ Arquitectura del Proyecto (MVC)
```bash
📦 GhostBusters-Asturias
 ┣ 📂 src
 ┃ ┣ 📂 dev.lanny.controller
 ┃ ┃ ┗ 📜 HunterController.java
 ┃ ┣ 📂 dev.lanny.model
 ┃ ┃ ┣ 📜 GhostModel.java
 ┃ ┃ ┗ 📜 HunterModel.java
 ┃ ┣ 📂 dev.lanny.view
 ┃ ┃ ┣ 📜 MainView.java
 ┃ ┃ ┣ 📜 CaptureGhostView.java
 ┃ ┃ ┗ 📜 DeleteGhostView.java ┃ 
 ┃ ┣ 📂 tests
 ┃ ┣ 📜 GhostModelTests.java
 ┃ ┣ 📜 HunterModelTests.java
 ┃ ┗ 📜 MainViewTests.java
 ┣ 📜 README.md
 ┣ 📜 diagram.png (Diagrama de Clases)
 ┗ 📜 coverage_report.png (Cobertura de Pruebas)
```
**Modelo:** 
**Controlador:** orquesta acciones  
**Vista:** entrada y salida por consola  
**Test:** aplicación estricta de TDD  

---

## 🧪 Testing (TDD)

El proyecto incluye **más de 70% de cobertura real**, no inflada, con JUnit5 y Hamcrest.

### Tipos de tests incluidos:

✔️ Unit tests de `GhostModel`  
✔️ Unit tests de `HunterModel`  
✔️ Tests del controlador `HunterController`  
✔️ Tests de vistas simulando entrada del usuario  
✔️ Validación de errores y flujos completos  
✔️ Safe testing usando `ByteArrayInputStream / ByteArrayOutputStream`  

Ejemplo de un test importante:

```java
assertThat(output, containsString("✅ ¡Fantasma capturado satisfactoriamente!"));
```
Este enfoque permite que la aplicación sea mantenible, verificable y extensible.

## 🎮 Ejemplo de Interacción desde la Consola
```
============================================
 ¡Bienvenido a la Base Ghostbusters Asturias!
============================================
1. Capturar un nuevo fantasma
2. Ver lista de fantasmas capturados
3. Liberar un fantasma
4. Filtrar fantasmas por clase
5. Ver fantasmas capturados en un mes
6. Salir
> 1

Ingrese el nombre del fantasma:
> Espíritu del Pescador de Lastres

Seleccione la clase:
1. Clase I - Manifestación menor
4. Clase IV - Fantasma histórico
> 4

Nivel de peligro (Bajo, Medio, Alto, Crítico):
> Bajo

Fecha de captura (YYYY-MM-DD):
> 2025-02-03

Fantasma capturado con éxito.
Afinidad ectoplásmica: 7/10

```
## 🛠️ Tecnologías y Metodología
- **Lenguaje:** Java 17
- **Arquitectura:** MVC
- **Testing:** JUnit 5, TDD (Cobertura mínima del 70%)
- **Control de versiones:** Git & GitHub
- **Sprint:** 1 semana

## ▶️ Cómo Ejecutar el Proyecto

1. Clonar el repositorio:
```bash
git clone https://github.com/LannyRivero/GhostBusters.git
cd GhostBusters
```

2. Compilar:
```bash
mvn clean compile
```
3. Ejecutar:
```bash
mvn exec:java -Dexec.mainClass="dev.lanny.ghost_busters.App"
```

## 🧪 Cómo Ejecutar los Tests
```bash
mvn test
```
- Opcional: generar reporte de cobertura:

```bash
mvn jacoco:report
```
- El resultado aparece en:
```bash
target/site/jacoco/index.html
```

## ✅ Entregables
- 📌 **Repositorio de GitHub:** https://github.com/LannyRivero/GhostBusters.git
- 📌 **Diagrama de Clases:** _![image](https://github.com/user-attachments/assets/adf6f4d2-9cf6-4653-bfca-e53176a2dd18)_
- 📌 **Cobertura de Pruebas:** _![image](https://github.com/user-attachments/assets/0e152ced-3ba3-46c5-b5ee-f1b5f0102468)_


## 📢 Contribuciones
¡Cualquier cazafantasmas es bienvenido a colaborar en este proyecto! Para contribuir:
1. Haz un **fork** del repositorio.
2. Crea una **rama** (`feature/nueva-funcionalidad`).
3. **Haz commits** siguiendo buenas prácticas.
4. Envía un **Pull Request**.

## 🎮 Créditos
Desarrollado por el equipo de Cazafantasmis d’Asturies 🏰⚡

---
💡 *"No tengas miedo de los fantasmas... ¡haz que ellos te teman a ti!"*



