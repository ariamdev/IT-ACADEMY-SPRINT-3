[![EN](https://img.shields.io/badge/EN-blue.svg?logo=googletranslate&logoColor=white)](https://github.com/ariamdev/IT-ACADEMY-SPRINT-3/blob/master/src/main/java/SPRINT%203/Tasca%20S3%2001%20Patterns%201/README.md)
[![ES](https://img.shields.io/badge/ES-red.svg?logo=googletranslate&logoColor=white)](https://github.com/ariamdev/IT-ACADEMY-SPRINT-3/blob/master/src/main/java/SPRINT%203/Tasca%20S3%2001%20Patterns%201/README.es.md)

2.Patrons 2
=

Aplicar els patrons de diseny: Builder, Observer y Callback.

>**Com s'organitzen les activitats?**
>
>Cada tema conté 3 nivells de dificultat. A major nivell, major dificultat. Així mateix, un mateix nivell pot contenir més d'un exercici.


🌟 Nivell 1
-

#### 📍 [Exercici 1 - Builder](https://github.com/ariamdev/IT-ACADEMY-SPRINT-3/tree/master/src/main/java/SPRINT%203/Tasca%20S3%2002%20Patterns%202/n1ex1Builder)

Desenvolupa un sistema de gestió de comandes de pizzes utilitzant el patró de disseny Builder en Java. El sistema ha de permetre la creació de diferents tipus de pizzes amb configuracions de mida, massa i ingredients diferents.

1. Defineix una classe Pizza amb els següents atributs:
- size (mida)
- dough (tipus de massa)
- toppings (ingredients)
2. Crea una interfície PizzaBuilder amb els mètodes necessaris per configurar la mida, la massa i els ingredients d'una pizza.
3. Implementa una o més classes que actuïn com a constructors concrets (PizzaBuilder) per a diferents tipus de pizzes. Per exemple, podries tenir un constructor per a la pizza hawaiana, un altre per a la pizza vegetariana, etc.
4. Desenvolupa una classe MestrePizzer que rebi un PizzaBuilder i que permeti construir pizzes de manera específica.
5. En el programa principal (Main), crea instàncies de PizzaBuilder i de MestrePizzer, i utilitza'ls per construir pizzes amb diferents configuracions.

⭐🌟Nivell 2
-

#### 📍 [Exercici 1 - Observer](https://github.com/ariamdev/IT-ACADEMY-SPRINT-3/tree/master/src/main/java/SPRINT%203/Tasca%20S3%2002%20Patterns%202/n2ex1Observer)

Dissenya un sistema en el qual un Agent de Borsa (Observable) notifica a diverses agències de Borsa (Observers) canvis quan la Borsa puja o baixa.

És necessari que l'objecte Observable mantingui referències als Observers.

⭐⭐🌟Nivell 3
-

#### 📍 [Exercici 1 - CallBack](https://github.com/ariamdev/IT-ACADEMY-SPRINT-3/tree/master/src/main/java/SPRINT%203/Tasca%20S3%2002%20Patterns%202/n3ex1CallBack)

Simula una passarel·la de pagament que rebi un objecte encapsulador del mètode de pagament a efectuar: targeta de crèdit, Paypal o deute en compte bancari.

- La passarel·la invocarà el pagament sense conèixer la forma i retornant el control a la classe d'origen.
- La classe que invoca la passarel·la de pagament serà una botiga de sabates.

