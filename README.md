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
- https://docs.oracle.com/javase/8/docs/api/java/util/function/package-tree.html



~~~

Ornekleri olanlar * ile isaretli.
Katmanlari ayni olanlar sadece farkli parametre aliyorlar.

java.util.function.Function<T,R> *
            java.util.function.UnaryOperator<T> *
                            java.util.function.DoubleUnaryOperator *
                            java.util.function.IntUnaryOperator
                            java.util.function.LongUnaryOperator

    java.util.function.BiFunction<T,U,R> *
                java.util.function.BinaryOperator<T> *
                            java.util.function.DoubleBinaryOperator
                            java.util.function.IntBinaryOperator
                            java.util.function.LongBinaryOperator


java.util.function.DoubleFunction<R> *

    java.util.function.ToDoubleFunction<T> *
            java.util.function.LongToDoubleFunction *
            java.util.function.IntToDoubleFunction

    java.util.function.ToDoubleBiFunction<T,U>


java.util.function.IntFunction<R> *

    java.util.function.ToIntFunction<T>
            java.util.function.DoubleToIntFunction *
            java.util.function.LongToIntFunction 


    java.util.function.ToIntBiFunction<T,U>  *


java.util.function.LongFunction<R> *

    java.util.function.ToLongFunction<T>
            java.util.function.DoubleToLongFunction
            java.util.function.IntToLongFunction

    java.util.function.ToLongBiFunction<T,U>





java.util.function.Predicate<T> *
        java.util.function.IntPredicate *
        java.util.function.LongPredicate
        java.util.function.DoublePredicate

java.util.function.BiPredicate<T,U> *


java.util.function.Supplier<T>  *
        java.util.function.IntSupplier
        java.util.function.BooleanSupplier
        java.util.function.LongSupplier

java.util.function.DoubleSupplier


java.util.function.Consumer<T>
        java.util.function.DoubleConsumer
                java.util.function.ObjDoubleConsumer<T>

        java.util.function.IntConsumer
                java.util.function.ObjIntConsumer<T>

        java.util.function.LongConsumer
                java.util.function.ObjLongConsumer<T>

java.util.function.BiConsumer<T,U>


~~~

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

~~~
    Bir parametre alir bir parametre doner.
~~~

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

~~~
 Kendimize gonderdigimiz sayinin kendisi ile carpip
sonucu donen bir fonksiyon tanimlayalim.
~~~

CustomPowFunctionMain


## DoubleUnaryOperator

~~~
    Verilen double parametre uzerinde islem yapip tekrar ayni tipte sonucu doner
~~~

Ornek
~~~
    elimizdeki aci degerinin trigonometrik sinus degerini alan operator kullanalim
~~~

DoubleUnaryOperatorMain


## UnaryOperation ( specialization of Function )

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



## BiFunction

- java.util.function.BiFunction

~~~
    Ilk iki deger parametre ucuncu deger donus parametresi.
    Hepsinin ayni olma zorunlugugu yok.
~~~

Ornek 
~~~
    Verilen bir Integer ve bir Double degerini carpip
    Long olarak geri donen programi yazalim.
~~~

BiFunctionMain



## BinaryOperator
~~~
    Iki parametre alip tek parametre donmesini
    istedigimiz durumlarda kullaniriz.

    Tum parametreler ayni tipte olmalidir.
~~~

Ornek 
~~~
    Elimizeki iki sayinin toplamini donen uygulamayi yazalim.
~~~

BinaryOperatorMain



## DoubleFunction
~~~
    verilen double parametreyi istedigimiz obje tipine
    cevirebilmemizi saglar
~~~

Ornek 
~~~
    Virgulden sonra 4 hane olan double degerini
    virgulden sonra 2 hane gosterebilecek hassasiyete
    ceviren programi yazalim.
~~~

DoubleFunctionMain


## IntFunction
~~~
    verilen int parametreyi istedigimiz obje tipine
    cevirebilmemizi saglar
~~~

Ornek 
~~~
    verilen int parametresini double a ceviren bir program yazalim
~~~

IntFunctionMain


## LongFunction
~~~
    verilen long parametreyi istedigimiz obje tipine
    cevirebilmemizi saglar
~~~

Ornek 
~~~
    verilen long parametresini double a ceviren bir program yazalim
~~~

LongFunctionMain


## ToDoubleFunction
~~~
    Paremetre verilen tipi double a ceviren fonksiyondur
~~~

Ornek

~~~
    verilen long degerini double a ceviren fonksiyonu yazalim.
~~~

ToDoubleFunctionMain


#### LongToDoubleFunctionMain
~~~
    Paremetre verilen long tipi double a ceviren fonksiyondur
~~~
Ornek 
~~~
    long verilen tipi double a ceviren programi yazalim.
~~~

LongToDoubleFunctionMain


#### IntToDoubleFunction


## ToIntFunction
~~~
    Paremetre verilen tipi int e ceviren fonksiyondur
~~~

#### DoubleToIntFunction
~~~
    Paremetre verilen double tipi int a ceviren fonksiyondur
~~~

Ornek
~~~
    double verilen tipi int e ceviren fonksiyonu yaziniz.
~~~

DoubleToIntFunctionMain


## ToIntBiFunction
~~~
    Verilen iki paremtre ile islemler yapildiktan sonra int 
    olarak geri donen fonksiyondur.
~~~

Ornek
~~~
    Bir float ve bir integer degeri carpip int deger donen fonk yaziniz
~~~

ToIntBiFunctionMain


## ToLongFunction
~~~
    Paremetre verilen tipi long a ceviren fonksiyondur
~~~







### Predicate

- java.util.function.Predicate


~~~
    Parametre olarak verilen deger yazilan kurallardan gecirildiginde
    uygun ise true degilse false doner
~~~

Ornek
~~~
~~~

PredicateMain




### IntPredicate
~~~
    sadece int paramtresi alabilen predicate kullanimidir.
~~~

IntPredicateMain


## BiPredicate
~~~
    Parametre olarak verilen iki durumun ikisininde 
    yazilan kurallardan gecirildiginde uygun ise true 
    degilse false deger doner 
~~~

Ornek
~~~
~~~

BiPredicateMain


## Supplier
~~~
    Veri uretilen fonksiyon gibi dusunebiliriz.

    Uretilecek veri hazirlanir fakat 
    get() metodu cagirilmadan objelerin nesneleri uretilmez

~~~

Ornek 
~~~
    Meyve uretip sayisini donen supplier metodunu yazalim.
~~~

SupplierMain

## Consumer
~~~
    Parametre olarak verilen bilgiyi alir ve bir cikti uretir
    fakat metot olarak bir donus saglamaz.

    (java 8 terminal operatorlerinde kullanabilirisiniz)
~~~

Ornek 

~~~
    Verilen harfleri buyuten bir program yaziniz.
~~~
ConsumerMain





