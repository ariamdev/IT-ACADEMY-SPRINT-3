[![ES](https://img.shields.io/badge/ES-red.svg?logo=googletranslate&logoColor=white)](https://github.com/ariamdev/IT-ACADEMY-SPRINT-3/blob/master/src/main/java/SPRINT%203/Tasca%20S3%2002%20Patterns%202/README.es.md)
[![CAT](https://img.shields.io/badge/CAT-yellow.svg?logo=googletranslate&logoColor=white)](https://github.com/ariamdev/IT-ACADEMY-SPRINT-3/blob/master/src/main/java/SPRINT%203/Tasca%20S3%2002%20Patterns%202/README.cat.md)


2.Patterns 2
=

Apply the Builder, Observer and Callback patterns.


>**How are the activities organized?**
>
>Each theme contains 3 levels of difficulty. The higher the level, the greater the difficulty. Likewise, the same level may contain more than one exercise.


🌟 Level 1
-

#### 📍 [Exercise 1 - Builder](https://github.com/ariamdev/IT-ACADEMY-SPRINT-3/tree/master/src/main/java/SPRINT%203/Tasca%20S3%2002%20Patterns%202/n1ex1Builder)

Develop a pizza order management system using the Builder design pattern in Java. The system must allow the creation of different types of pizzas with different configurations of size, mass and ingredients.

1. Define a Pizza class with the following attributes:
- size (size)
- dough (mass type)
- toppings (ingredient)
  
2. Create a PizzaBuilder interface with the methods needed to configure the size, mass and ingredients of a pizza.
3. Implement one or more classes that act as concrete builders (PizzaBuilder) for different types of pizzas. For example, you could have a builder for Hawaiian pizza, another for vegetarian pizza, etc.
4. Develop a MestrePizzer class that receives a PizzaBuilder and that allows the construction of pizzas specifically.
5. In the main program (Main), create instances of PizzaBuilder and MestrePizzer, and use them to build pizzas with different configurations.



⭐🌟 Level 2
-

#### 📍 [Exercise 1 - Observer](https://github.com/ariamdev/IT-ACADEMY-SPRINT-3/tree/master/src/main/java/SPRINT%203/Tasca%20S3%2002%20Patterns%202/n2ex1Observer)


Design a system in which a Stock Exchange Agent (Observable) notifies several Stock Exchange agencies (Observers) changes when the Stock Exchange rises or falls.

The Observable object needs to keep references to Observers.



⭐⭐🌟 Level 3
-

#### 📍 [Exercise 1 - Callback](https://github.com/ariamdev/IT-ACADEMY-SPRINT-3/tree/master/src/main/java/SPRINT%203/Tasca%20S3%2002%20Patterns%202/n3ex1CallBack)


Simulate a payment gateway that receives a cash-capsuulator object of the payment method to be made: credit card, Paypal or debt in bank account.

- The gateway will invoke payment without knowing the form and returning the control to the origin class.
- The class that invokes the payment gateway will be a shoe store.

