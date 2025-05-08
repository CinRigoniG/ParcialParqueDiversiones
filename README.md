# 🎢 Sistema de Gestión de Parque de Diversiones

Este proyecto implementa un sistema orientado a objetos en Java para modelar el funcionamiento de un parque de diversiones, según una consigna de evaluación con modelo UML y requisitos funcionales.

## 📚 Descripción

El sistema permite gestionar:

- Visitantes y sus entradas (tickets).
- Atracciones clasificadas por tipo (MECÁNICA, INFANTIL, ACUÁTICA).
- Empleados de seguridad y sus especialidades.
- Incidentes ocurridos en atracciones, con detalles y responsables.
- Reportes de incidentes.
- Mantenimientos técnicos y técnicos responsables.

## 📌 Funcionalidades principales

### 1. Codificación e instanciación (40%)

- Clases implementadas según modelo UML.
- Se crean:
  - Un visitante con dos entradas (General y VIP).
  - Tres atracciones (una de cada tipo), con horarios disponibles.
  - Un empleado de seguridad con dos especialidades.
  - Dos incidentes (con atracción, visitante y empleado involucrado).
  - Un reporte que contiene los incidentes.
  - Un mantenimiento con técnico asignado.

### 2. `calcularTiempoDeEspera()` – Atracción (10%)

Calcula el tiempo estimado de espera basado en los visitantes en cola y la duración de la atracción.

### 3. `agregarEspecialidad(String)` – EmpleadoSeguridad (10%)

Agrega una especialidad al empleado, evitando duplicados.

### 4. `mostrarIncidentesReportados()` – EmpleadoSeguridad (20%)

Muestra los incidentes en los que participó el empleado, incluyendo: atracción, fecha, descripción y estado.

### 5. `obtenerAtraccionMasVisitada()` – Parque (20%)

Devuelve la atracción con más visitantes en cola.
