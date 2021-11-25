# java8

 
https://github.com/keramiozsoy/java8/find/main


 Usage of operations

 - datasource - chain - intermediate operations - chain - terminal operations

 Info

 ### intermediate operations return a stream,

 * distinct 
 * filter
 * flatMap
 * limit
 * map
 * peek
 * skip
 * sorted

  ### terminal operations return non-stream values like primitive or object or collection or may not return anything.

 * allMatch
 * anyMatch
 * collect
 * count
 * findAny
 * findFirst
 * forEach
 * max
 * min
 * noneMatch
 * reduce
 * toArray




## Java Functional Interfaces

- java.util.function paketi

~~~
Java 8 ile gelen 

Herhangi bir interface icerisinde yanlizca bir tane abstract 

( yani iceriginde yapilacak is tanimlanmamis sadece 
    parametreleri ve varsa donulmesi istenilen deger tanimlamis ) 

metot var ise Fonksiyonel Arayuzler olarak adlandirilir.

Yukaridaki metodun disinda metotlarin olmasi onun
fonksiyonel arayuz olmadigi anlamina gelmez. 
Farkli metotlarin icleri dolu olmasi gereklidir.

Buradaki tek kural yukaridaki metodun disindakilerden
herhangi birinin de abstract olmadigi durumda 
fonksiyonel arayuz olmaya devam eder.

iki tane abstract oldugunda artik fonksiyonel arayuz degildir.
~~~

## Java Lambda
~~~
Bir lambda ifadesi ile kod yazmak istedigimizde
lambda ifadesinin kullanacagi arayuzun (interface)
yanlisca bir adet tanimlanmis fakat yapilacak is
yazilmamis metot (abstract) kullarak 
ifadenin yazilma aninda metodun yapmasi istedigimiz 
isi tanimlayip sadece o ifadeye ozgu 
sekilde ayni fonksiyonel arayuzun birbirinden
farkli kod calisma seklini yazmis oluyoruz.
~~~

Ornek 

~~~
ExampleFunctionalInterface lambda = () -> {
    System.out.println("Executing...");
};

ExampleFunctionalInterface lambda2 = () -> {
    System.out.println("Executing...");
    System.out.println("Executing...");
    System.out.println("Executing...");
};

~~~

### Function

- java.util.function.Function

Java da kullanmak istedigimiz foksiyonlarin
temelinde kullilan mantigi temsil eden arayuzdur.

==
Bir parametre alir bir parametre doner.
==

Matematikteki fonksiyonlar gibi dusunebiliriz. 
Bir girdisi ve ciktisi olma durumu.

~~~
@FunctionalInterface
public interface Function<T, R> {

    /**
     * Applies this function to the given argument.
     *
     * @param t the function argument
     * @return the function result
     */
    R apply(T t);

    ..
    ..
    ..


~~~

Ornek 

- Kendimize gonderdigimiz sayinin kendisi ile carpip
sonucu donen bir fonksiyon tanimlayalim.

CustomPowFunctionMain


### Predicate

- java.util.function.Predicate

~~~
    bir parametre alip true veya false donen fonksiyonel arayuzdur.
~~~

PredicateMain

### UnaryOperation

- java.util.function.UnaryOperation

~~~
    Elimizdeki bir objenin verilerini degistirmek istedigimizde
    kullanisli bir alt yapi saglar ve sonucta verilen tip
    ne ise geriye aynisini donmek zorundadir.

    Function arayuzunden genisletilerek olusturulan bir arayuz
    verilen parametre ile donus tipi ayni olmasi
    gereken durumlarda kullanilir.

    Function arayuzunun sagladigi farkli genel veri tipleri 
    ile calisma prensibini daha ozel bir noktaya tasiyor.
~~~

Ornek 
~~~
Elimizdeki bir User objesinin bilgilerini dolduralim.
~~~

UnaryOperatorMain






