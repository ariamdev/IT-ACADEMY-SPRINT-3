[![EN](https://img.shields.io/badge/EN-blue.svg?logo=googletranslate&logoColor=white)](#eng)
[![CAT](https://img.shields.io/badge/CAT-yellow.svg?logo=googletranslate&logoColor=white)](#cat)

2.Patrones 2
=

Aplicar los patrones de diseño: Builder, Observer y Callback.

>**Como se organizan las actividades?**
>
>Cada tema contiene 3 niveles de dificultad. A mayor nivel, mayor dificultad. Así mismo, un mismo nivel puede contener más de un ejercicio.
>

🌟Nivel 1
-

##### 📍 [Ejercicio 1 - Builer](https://github.com/ariamdev/IT-ACADEMY-SPRINT-3/tree/master/src/main/java/SPRINT%203/Tasca%20S3%2002%20Patterns%202/n1ex1Builder)

Desarrolla un sistema de gestión de pedidos de pizzas utilizando el patrón de diseño Builder en Java. El sistema tiene que permitir la creación de diferentes tipos de pizzas con configuraciones de medida, masa e ingredientes diferentes.

1. Define una clase Pizza con los siguientes atributos:
- size (medida)
- dough (tipo de demasiado)
- toppings (ingredientes)
2. Crea una interfaz PizzaBuilder con los métodos necesarios para configurar la medida, la masa y los ingredientes de una pizza.
3. Implementa una o más clases que actúen como constructores concretos (PizzaBuilder) para diferentes tipos de pizzas. Por ejemplo, podrías tener un constructor para la pizza hawaiana, otro para la pizza vegetariana, etc.
4. Desarrolla una clase MestrePizzer que reciba un PizzaBuilder y que permita construir pizzas de manera específica.
5. En el programa principal (Main), crea instancias de PizzaBuilder y de MestrePizzer, y utilízalos para construir pizzas con diferentes configuraciones.

⭐🌟 Nivel 2
-

##### 📍 [Ejercicio 1 - Observer](https://github.com/ariamdev/IT-ACADEMY-SPRINT-3/tree/master/src/main/java/SPRINT%203/Tasca%20S3%2002%20Patterns%202/n2ex1Observer)

Diseña un sistema en el cual un Agente de Bolsa (Observable) notifica a varias agencias de Bolsa (Observers) cambios cuando la Bolsa sube o baja.

Es necesario que el objeto Observable mantenga referencias a los Observers.

⭐⭐🌟 Nivel 3
-

##### 📍 [Ejercicio 1 - Callback](https://github.com/ariamdev/IT-ACADEMY-SPRINT-3/tree/master/src/main/java/SPRINT%203/Tasca%20S3%2002%20Patterns%202/n3ex1CallBack)

Simula una pasarela de pago que reciba un objeto encapsulador del método de pago a efectuar: tarjeta de crédito, Paypal o deuda en cuenta bancaria.

- La pasarela invocará el pago sin conocer la forma y devolviendo el control en la clase de origen.
- La clase que invoca la pasarela de pago será una tienda de zapatos.
