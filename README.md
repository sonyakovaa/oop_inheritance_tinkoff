Моделируем кормление животных в зоопарке.

Что имеем:

Класс Zoo с основной логикой.

Класс FoodBag (сумка с едой) с полем food (количество еды)

Класс Animal c полями:
String name
int foodNeeded - сколько животное ест за раз
double eatCount - сколько раз животное поело

Что нужно сделать:
FoodBag:
1.1. Написать для food геттер и сеттер.
1.2. Устанавливать значение food через конструктор.

Animal:
2.1. В конструкторе устанавливать только значение foodNeeded;
2.2. При необходимости написать для полей геттеры и сеттеры, поля должны оставаться приватными;
2.3. Написать реализацию метода eat:
Если в сумке есть еда, вычесть из сумки количество еды, которое нужно животному, и увеличить счетчик приема пищи на 1;
Если еда есть, но её недостаточно, доесть всю оставшуюся еду до 0 и увеличить счетчик корма на соответствующую часть
(например, нужно 20, а было только 5 -> eatCount увеличивается на 0,25)

Panda, Rabbit, Fox:
3.1. Создать указанные выше классы-наследники Animal;
3.2. Устанавливать значение name в конструкторах наследников.
При установки имени делать проверку, чтобы первая буква имени животного совпадала с первой буквой имени класса
(например, для Rabbit подойдёт имя Robert и не подойдёт Nick)

Zoo:
4.1. Написать реализацию метода foodBagIsEmpty по смыслу наименования метода;
4.2. Написать реализацию метода feedAnimals:
- Инициализация животных (по одному экземпляру каждого класса, потребление устанавливать такое: Panda - 200; Rabbit - 5; Fox - 21;)
- Кормление: кормим всех животных по-очереди, начиная с любого, до тех пор, пока в сумке не закончится еда;
- Вывод в консоль информации о том, сколько раз поело кажое из животных, в формате:
  <имя> поел X раз
  <имя> поел X раз
  <имя> поел X раз

Изменять исходный код нельзя
