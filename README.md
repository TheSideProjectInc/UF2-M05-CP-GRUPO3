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
- deportivo: boolean (indica si es deportivo).

## Métodos:

- acelerar(int incremento): Aumenta la velocidad sin superar velocidad_maxima.
- frenar(int decremento): Reduce la velocidad (sin bajar de 0).
- parar(): Detiene el vehículo (velocidad_actual = 0).
- esDeportivo(): Devuelve true si el vehículo es deportivo.
- getInfo(): Devuelve todos los datos del vehículo.
- esMarca(): Revisa si el vehículo es la marca indicada.
- esModelo(): Revisa si el vehículo es el modelo indicado.
- esIgual(): Compara 2 vehículos.
- Getter/Setter de velocidad_actual: getVelocidadActual() y setVelocidadActual().
- Getter/Setter de velocidad_maxima: getVelocidadMaxima() y setVelocidadMaxima() (Si es deportivo sera mayor).
- Getter de deportivo: getDeportivo().

### 📝 Test Cases

| **Método**         | **Caso de Prueba**               | **Entradas**                          | **Resultado Esperado**       | **Notas**                     |
|--------------------|----------------------------------|---------------------------------------|------------------------------|-------------------------------|
| `acelerar`         | Incremento normal                | `vel_actual=50`, `incremento=30`, `vel_max=120` | `80`                   |                               |
| `acelerar`         | Excede velocidad máxima          | `vel_actual=100`, `incremento=30`, `vel_max=120` | `120`                  | No supera el límite           |
| `acelerar`         | Aceleración negativa             | `vel_actual=50`, `incremento=-10`     | **Error**/`50`               | Inválido (no debe decrementar)|
| `frenar`           | Frenado normal                   | `vel_actual=80`, `decremento=20`      | `60`                   |                               |
| `frenar`           | Frenado a negativo               | `vel_actual=10`, `decremento=30`      | `0`                    | Velocidad mínima es 0         |
| `parar`            | Detener vehículo                 | `vel_actual=70`                       | `0`                    |                               |
| `setVelocidadMaxima` | Límite para no deportivo      | `deportivo=false`, `setVelocidadMaxima(250)` | `vel_max=120` (o error) | Restringir si no es deportivo |
| `setVelocidadMaxima` | Límite para deportivo         | `deportivo=true`, `setVelocidadMaxima(120)`  | `vel_max=120`           | Permitir cualquier valor      |
| `getInfo`          | Obtener información              | `marca="Tesla"`, `deportivo=true`     | String con todos los datos | Formato claro               |
| `esMarca`          | Comparar marca                   | `marca="Tesla"`                       | `true`/`false`         | Case-sensitive? Se aplica a modelo tambien              |
| `esIgual`          | Comparar vehículos               | `vehículo1 == vehículo2`              | `true`/`false`         | Por atributos clave          |
