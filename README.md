# Learn Project

This project based on the "Java The Complete Reference, 8th Edition" and on the hackerrank.com exercise / topics.

# Structure of the Project

    └── src
        └── main
           └── java 
              ├── AbstractDemo
              │    ├── AbstractAreas                           #Abstract class implementation
              │    └── AbstractDemo                            #Abstract class implementation
              ├── AnnotationDemo
              │    ├── Marker                                  #Annotation Marker  
              │    ├── Meta                                    #@Retention annotation with Reflection
              │    ├── Meta1                                   #@Retention annotation with Reflection
              │    ├── RepeatAnno                              #@Repeatable annotation
              │    ├── Single                                  #@Single annotation
              │    └── TypeAnnoDemo                            #@Type annotations (@Target(ElementType.*))
              ├── ArityDemo
              │    ├── ArityMethods                            #
              │    └── ArityMethodsWithOverloadingMethod       #
              ├── AssertDemo
              │    └── AssertDemo                              #Keyword 'assert'
              ├── CollectionsDemo
              │    ├── AlgorithmsDemo                          #Implementation of the Collection algorithms
              │    ├── ArrayDemo                               #Implementation of an Array class and it's methods
              │    ├── ArrayDequeDemo                          #Implementation of an ArrayDeque
              │    ├── ArrayListDemo                           #Implementation of an ArrayList
              │    ├── ArrayListToArray                        #ArrayList with a method toArray()
              │    ├── BitSetDemo                              #Implementation of a BitSet
              │    ├── ComparatorDemo                          #The Comparator interface
              │    ├── ComparatorDemo2                         #The Comparator interface
              │    ├── EnumSetDemo                             #Implementation of an EnumSet
              │    ├── HashMapDemo                             #Implementation of a HashMap
              │    ├── HashSetDemo                             #Implementation of a HashSet
              │    ├── HashtableDemo                           #Implementation of a Hashtable
              │    ├── IteratorDemo                            #The Iterator interface
              │    ├── LinkedHashMapDemo                       #Implementation of a LinkedHashMap
              │    ├── LinkedHashSetDemo                       #Implementation of a LinkedHashSet
              │    ├── LinkedListDemo                          #Implementation of a LinkedList
              │    ├── OptionalDemo                            #Implementation of an Optional class
              │    ├── PropertiesDemo                          #Implementation of a Properties class
              │    ├── PropertiesDemo1                         #Properties class with the store() and load() methods
              │    ├── SpliteratorDemo                         #The Spliterator interface
              │    ├── StackDemo                               #Implementation of a Stack class
              │    ├── StringTokenizerDemo                     #Implementation of a StringTokenizer class
              │    ├── TreeMapDemo                             #Implementation of a TreeMap
              │    ├── TreeMapDemo2                            #The interface Comparator with a compareTo() method
              │    ├── TreeMapDemo2A                           #The Comparator with a thenComparing() method and lambda
              │    └── TreeSetDemo                             #Implementation of a TreeSet
              ├── EnumDemo
              │    ├── AskMe                                   #Simple Enum class implementation
              │    ├── EnumDemo                                #Simple Enum class implementation
              │    ├── EnumDemo1                               #implementation of the values() and valuesOf() methods
              │    └── EnumDemo2                               #Enum class with the ordinal(), compareTo(), equal() methods
              ├── GenericDemo
              │    ├── BoundedWildCard                         #Generics with upper boundaries
              │    ├── BoundsDemo                              #Restrictions on generics type and usage of wildcard '<?>'
              │    ├── GenConstrDemo                           #Generic constructors with upper boundaries
              │    ├── GenDemo                                 #Generic type, '<T>'
              │    ├── GenSuperDemo                            #Generic superclass
              │    ├── GenSuperDemo1                           #Generic subclass
              │    ├── HierarchyDemo                           #Generic with operator 'instanceof'
              │    ├── OverrideDemo                            #Override methods with generic
              │    └── SimpGen                                 #Two generic types, '<T, E>'
              ├── InheritanceDemo
              │    ├── InheritanceBoxExample                   #Interaction between superclass and subclasses
              │    ├── SimpleInheritance                       #Interaction between superclass and subclass
              │    └── SimpleOverride                          #Interaction between superclass and subclass
              ├── InterfaceDemo
              │    ├── AskMe                                   #Implementation of an interface with variables
              │    ├── IFExtends                               #Implementation of an interface
              │    ├── IfTest                                  #Implementation of an interface with a stack
              │    ├── IFExtends2                              #Implementation of an interface with a dynamic stack
              │    ├── IFExtends3                              #Implementation of the static with dynamic stack
              │    ├── InterfDemo                              #An interface extends an interface 
              │    └── NestedIfDemo                            #Implementation of the nested interfaces
              ├── JavaLangClasses
              │    ├── Angels                                  #The Math class
              │    ├── ArrrCopyDemo                            #System class with the arraycopy() and getProperty() methods
              │    ├── CharIsDemo                              #The methods of the Character class 
              │    ├── CloneDemo                               #A clone() method
              │    ├── DoubleDemo                              #Simple implementation of a Double class
              │    ├── Elapsed                                 #The methods currentTimeMillis() and nanoTime()
              │    ├── ExecDemo                                #The Runtime and Process classes with a exec() method
              │    ├── ExecDemoFini                            #The Runtime and Process classes with a exec() method
              │    ├── InfNan                                  #Implementation of the isInfinite() and isNaN() methods
              │    ├── MemoryDemo                              #Runtime class with the freeMemory(), totalMemory(), gc() methods
              │    ├── PackageDemo                             #The Package class
              │    ├── ParseDemo                               #Convert String to Integer
              │    ├── ProcessBuilderDemo                      #Implementation of a ProcessBuilder class
              │    ├── RTTI                                    #Class 'Class' with the methods getName() and getConstructor()
              │    └── StringConversions                       #The methods toBinaryString(), toOctalString() and toHexString()
              ├── LambdaDemo
              │    ├── BlockLambdaDemo                         #Lambda block expression (count factorial)
              │    ├── BlockLambdaDemo1                        #Lambda block expression (reverse string)
              │    ├── FunctionalInterDemo                     #Functional interface with Lambda expression
              │    ├── GenericLambdaDemo                       #Lambda block expression with Generic
              │    ├── LambdaDemo                              #Simple lambda expressions
              │    ├── LambdaDemo1                             #Simple lambda expression
              │    ├── LambdaExceptionDemo                     #Lambda expression and exception
              │    └── lambdaAsArgumentDemo                    #Lambda expression as an argument 
              ├── MethodRefDemo
              │    ├── ConstructorRefDemo                      #References on the constructor
              │    ├── GenericMethodRefDemo                    #References on the generic methods
              │    ├── InstanceWithObjectRefDemo               #References on the method instances 
              │    ├── MethodReferDemo                         #Method reference operator '::'
              │    └── UseMethodRef                            #Method reference with Collections Framework
              ├── ReaderDemo
              │    ├── BRRead                                  #BufferedReader with a reader() method
              │    ├── BRReadLines                             #BufferedReader with a  readLine() method
              │    ├── BRReadLines1                            #BufferedReader with a readLine() method
              │    ├── PrintWriterDemo                         #PrintWriter with println() method
              │    └── ShowFile                                #FileInputStream
              ├── ThisDemo
              │    └── MyClass                                 #Overloaded constructors with keyword 'this'
              ├── StringProcessing
              │    ├── AppendDemo                              #StringBuffer with a append() method
              │    ├── DeleteDemo                              #StringBuffer with the delete() and deleteCharAt() methods
              │    ├── EqualsNotEqualsTo                       #Difference between equal() and '=='
              │    ├── IndexOfDemo                             #The methods indexOf() and lastIndexOf()
              │    ├── InsertDemo                              #StringBuffer with a insert() method
              │    ├── ReplaceDemo                             #StringBuffer with a replace() method
              │    ├── ReverseDemo                             #StringBuffer with a reverse() method
              │    ├── SortStrings                             #StringBuffer with a compareTo() method and bubble sort 
              │    ├── StirngJoinDemo                          #StringBuffer with a join() method
              │    ├── StringBufferDemo                        #StringBuffer with the capacity() and length() methods
              │    ├── StringPlace                             #StringBuffer with a substring() method
              │    ├── UseTrim                                 #StringBuffer with a trim() method
              │    └── setCharAtDemo                           #StringBuffer with the setCharAt() and setLength() methods
              ├── ThreadDemo 
              │    ├── CurrentTreadDemo                        #Check main thread
              │    ├── DeadLock                                #Example of the deadlock
              │    ├── DemoJoin                                #Implementation of the isAlive() and join() methods
              │    ├── MultiThreadDemo                         #Implementation of several threads
              │    ├── PC                                      #Implementation of the notify() and wait() methods
              │    ├── SuspendResume                           #Suspend and resume a thread 
              │    ├── Synch                                   #Operator synchronized 
              │    ├── ThreadDemo                              #Interface Runnable and class Thread
              │    └── ThreadGroupDemo                         #Implementation of the ThreadGroup 
              └── hackerrank                                    
                   ├── Currency_Formatter                       #
                   ├── Date_and_Time                            #
                   ├── Day_2_Operators                          #
                   ├── Fibonacci                                #Find n-th Fibonacci number
                   ├── Java_Datatypes                           #
                   ├── Java_End_of_file                         #
                   ├── Java_Loops_I                             #
                   ├── Java_Loops_II                            #
                   ├── Java_Output_Formatting                   #
                   ├── LargestNumberFamily                      #Find the largest number in the family
                   ├── Logical_Op_Table                         #   
                   ├── Sock_Merchant                            #   
                   ├── Static_Initializer_Block                 #
                   ├── Strings                                  #
                   ├── TelnetClient                             #
                   ├── Two_D_Massive                            #
                   └── compareTriplets                          #


# Brief notes

<h4>Abstract</h4>

* The keyword 'abstract' is a non-access modifier. Abstract class working in a similar way as the superclass, so the subclass should implement all methods from abstract class or be abstract. Any class which has more than one abstract method must be initialized as abstract. Abstract classes cannot be used to create objects, so the instance of the not be received by using the keyword 'new'. Abstract methods cannot be static and constructors cannot be abstract. The difference with the interface, that abstract classes can have abstract declared variables, in the interface they should be final.

<h4>Interfaces</h4>

* "One Interface multiple implementations". Interfaces cannot be used to create objects. All methods, variables static, and final (constant) by default. All methods in interface usually have empty methods. The subclass should implement all methods from the interface, but each subclass can implement these methods in a different way. To access the different method implementation through interface (Ex: MyInterface obj = new Class()). Interfaces can be nested in the class then they can be public\private.

<h4>Enum</h4>

* Class 'Enum' - a special type of class, with constant/final variables. There is no way to create a new instance of enum class by using "new". Enum class cannot be a superclass and cannot inherit from other classes, but it working the same as usual class, so there can be initialized constructors, methods, and so on.  

<h4>Generics</h4>

* A generic type can be restricted, by type of class or/and one to many interface types (by using logical operator AND). Keyword
'extends' to set upper boundaries. Keyword 'super' to set lover boundaries. The generic type of method must be initialized before initialization of the returning type of the method. Annotations have few limitations. (1) Cannot create an instance with type 'T'. (2) Cannot create static parameters with type 'T'. (3) Cannot create an instance of massive, where element type determined by type 'T'. (Ex: T vals = new Т[10];).

<h4>Polymorphism</h4>

>When at least a few classes inherit from each other.

<h4>Inheritance</h4>

* Inheritance is used to create hierarchies of the classes. Superclass define common characteristic for all subclasses, this reduces duplication of the  So, each subclass gets characteristics of the superclass and will add its own unique characteristics.

<h4>Annotation</h4>

* There are three types of 'Retention' annotation SOURCE/CLASS/RUNTIME. They change the life-cycle of annotations when the system is run. Class Annotation is super-interface for all annotations of interface.  
@Repeatable allows repeat annotation in one place. The method must contain massive with field 'value'. Annotations have few limitations. (1) one annotation cannot inherit another one; (2) all methods which are declared in annotation must not have parameters; (3) they should return anything, such as (String, int...), except Generic types.

<h4>Lambda</h4>

* The functional interface is an interface with one method. Lambda expressions don't work individually, they implement (define behavior) of 'abstract' method with the return type, which defined in the functional interface. Lambda block is similar to the method body and should have a return statement. Lambda expression cannot be generic, but a functional interface can be generic.  Method reference operator '::' working similar to Lambda expressions. They both just call a method\constructor\ an instance method. Another way of using functional interfaces is to use the default library 'java.util.function.Function'.

<h4>Multithreading</h4>

* Used to achieve asynchronous working of the system elements. The main thread should be finished last.

<h4>Difference between method 'equals()' and operator '==' </h4>

* A method 'equal()' compare symbols from the objects, whereas operator '==' check if two references belong to one instance.

<h4>Class Object</h4>

* Is a superclass for all classes. In a class 'Object' defined methods, such as 'toString()', 'getClass()', 'clone()', equals(), 'wait()' and few more. Other classes just override these methods.

<h4>Collection Framework</h4>
<h5>Interfaces</h5>

* An interface 'Collection' contains all common methods which have all collections.

* Interface 'List' implements an interface 'Collection' and works as a list with index objects. 

* Interface 'Set' implements an interface 'Collection' and define collections which do not allow duplicates.

* Interface 'SortedSet' implements an interface 'Set' and store objects in increasing order. 

* Interface 'Queue' implements an interface 'Collection' and working as a queue (first entered object will be processed the first), so this collection can work just with the first element in the queue. 

* Interface 'Dequeue'implements an interface 'Queue' and can work as queue, with the first object or just with last object.

<h5>Classes</h5>

* Class 'ArrayList' extends class 'AbstractList' and implements an interface 'List', is used for dynamic massive.

* Class 'LinkedList' extends class 'AbstractSequentialList' and implements the interfaces 'List', 'Queue', 'DeQueue'. It stores the values as separate linked objects/nodes with the data and link/pointer(to the next node). Moreover, exist a doubly LinkedList, where each node linked with the previous and next node. The 'LinkedList' extends 'Queue' and 'DeQueue', nodes cannot be accessed directly.

* Class 'HashSet' extends class 'AbstractSet' and implement an interface 'Set', is used to create collections. It stores the values in the hashtable, do not allow duplicate/NULL values, and not sorting values, so they can be displayed random order. HashCode used as the index in the hashtable.

* Class 'LinkedHashSet' extends class 'HashSet', have the same methods, and stores linked hash values in the same order as they were added. Display values in the corresponding order.

* Class 'TreeSet' extends class 'AbstractSet' and implements an interface 'NavigableSet', storing values in the Tree structure in sorted increasing order. Best for storing huge amounts of data, because of the fast execution of the sorted values, do not allow duplicate. For default sorting, values must be comparable.

* Class 'PriorityQueue' extends class 'AbstractQueue' and implements an interface 'Queue', is used to create a queue by the priority. Storing values in incrementing order.

* Class 'ArrayQueue' extends class 'AbstractCollection' and implements an interface 'Deque',  is used to create not limited dynamic massive.

* Class 'EnumSet'  extends class 'AbstractSet' and implement an interface 'Set', is used as special implementation for enumeration type.

* Class 'Stack' implements a standard stack with the rule "Last entered - the first processed". But better to use the 'ArrayDeque' that implements 'Queue, Deque, and Stack'.

<h5>Iterator vs 'for loop'</h5>

* There is no much difference between the 'Iterator' and the 'for loop', 'for-each loop'. The 'For-each loop' is more readable. But the 'For-each loop' does not allow to modify (add/remove) the array, in the iteration process. While an interface 'Iterator' allows. So, if no need to change collection, then the 'for each' is much convenient. 

<h5>Mapping</h5>

* Class 'HashMap', is used to store values by keys in hash-table. Do not allow duplicates and it does not guarantee the order of the values. 

* Class 'ThreeMap', is used to store values by keys in the sorted tree structure. This tree mapping guarantees that all values will be sorted, as key increases.

* Class 'LinkedHashMap' extends a 'HashMap' class, is used to store values in the same order as they were added. 

* Class 'EnumMap' implements an interface 'Map', is used for the keys of the 'Enum' type. 

<h5>Comparator</h5>

* An interface 'Comparator', is used to manipulate the order in collections.