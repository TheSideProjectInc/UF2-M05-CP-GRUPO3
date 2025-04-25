# cp-uf2-m05 - Proyecto Vehículo  

Este proyecto consiste en desarrollar una clase **Vehículo** usando **Test Driven Development (TDD)**, junto con prácticas de colaboración en equipo, Git y GitHub.  

---

## 📌 Objetivos  
- Practicar el uso de **Git y GitHub**.  
- Desarrollar una aplicación usando **TDD y JUnit**.  
- Fomentar la **colaboración en equipo**.  

---

# Requisitos Funcionales del Vehículo

## Atributos:

- marca: String (ej. "Toyota").
- modelo: String (ej. "Corolla").
- velocidad_actual: int (km/h, inicial 0).
- velocidad_maxima: int (límite del vehículo).
- tuneado: boolean (indica si está modificado).
- pasajeros: int (capacidad de ocupantes).

## Métodos:

- acelerar(int incremento): Aumenta la velocidad sin superar velocidad_maxima.
- frenar(int decremento): Reduce la velocidad (sin bajar de 0).
- parar(): Detiene el vehículo (velocidad_actual = 0).
- esTuneado(): Devuelve true si el vehículo está tuneado.
- Getter/Setter de velocidad_actual: getVelocidadActual() y setVelocidadActual().
- Getter/Setter de velocidad_maxima: getVelocidadMaxima() y setVelocidadMaxima().
- Getter/Setter de tuneado: getTuneado() y setTuneado().
