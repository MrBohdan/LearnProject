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
              ├── EnumDemo
              │    ├── AskMe                                   #Simple Enum class implementation
              │    ├── EnumDemo                                #Simple Enum class implementation
              │    ├── EnumDemo1                               #implementation of the methods values() and valuesOf() 
              │    └── EnumDemo2                               #Enum class with the methods ordinal(), compareTo() and equal()
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
              │    ├── BRRead                                  #BufferedReader with reader() method
              │    ├── BRReadLines                             #BufferedReader with readLine() method
              │    ├── BRReadLines1                            #BufferedReader with readLine() method
              │    ├── PrintWriterDemo                         #PrintWriter with println() method
              │    └── ShowFile                                #FileInputStream
              ├── ThisDemo
              │    └── MyClass                                 #Overloaded constructors with keyword 'this'
              ├── ThreadDemo 
              │    ├── CurrentTreadDemo                        #Check main thread
              │    ├── DeadLock                                #Example of the deadlock
              │    ├── DemoJoin                                #Implementation of the methods isAlive() and join()
              │    ├── MultiThreadDemo                         #Implementation of several threads
              │    ├── PC                                      #Implementation of the methods notify() and wait()
              │    ├── SuspendResume                           #Suspend and resume a thread 
              │    ├── Synch                                   #Operator synchronized 
              │    └── ThreadDemo                              #Interface Runnable and class Thread
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

>The keyword 'abstract' is a non-access modifier. Abstract class working in a similar way as the superclass, so the subclass should implement all methods from abstract class or be abstract. Any class which has more than one abstract method must be initialized as abstract. Abstract classes cannot be used to create objects, so the instance of the not be received by using the keyword 'new'. Abstract methods cannot be static and constructors cannot be abstract. The difference with the interface, that abstract classes can have abstract declared variables, in the interface they should be final.

<h4>Interfaces</h4>

>"One Interface multiple implementations". Interfaces cannot be used to create objects. All methods, variables static, and final (constant) by default. All methods in interface usually have empty methods. The subclass should implement all methods from the interface, but each subclass can implement these methods in a different way. To access the different method implementation through interface (Ex: MyInterface obj = new Class()). Interfaces can be nested in the class then they can be public\private.

<h4>Enum</h4>

>Enum - a special type of class, with constant/final variables. There is no way to create a new instance of enum class by using "new". Enum class cannot be a superclass and cannot inherit from other classes, but it working the same as usual class, so there can be initialized constructors, methods, and so on.  

<h4>Generics</h4>

>A generic type can be restricted, by type of class or/and one to many interface types (by using logical operator AND). Keyword
'extends' to set upper boundaries. Keyword 'super' to set lover boundaries. The generic type of method must be initialized before initialization of the returning type of the method. Annotations have few limitations. (1) Cannot create an instance with type 'T'. (2) Cannot create static parameters with type 'T'. (3) Cannot create an instance of massive, where element type determined by type 'T'. (Ex: T vals = new Т[10];).

<h4>Polymorphism</h4>

>When at least a few classes inherit from each other.

<h4>Inheritance</h4>

>Inheritance is used to create hierarchies of the classes. Superclass define common characteristic for all subclasses, this reduces duplication of the  So, each subclass gets characteristics of the superclass and will add its own unique characteristics.

<h4>Annotation</h4>

>There are three types of 'Retention' annotation SOURCE/CLASS/RUNTIME. They change the life-cycle of annotations when the system is run. Class Annotation is super-interface for all annotations of interface.  
@Repeatable allows repeat annotation in one place. The method must contain massive with field 'value'. Annotations have few limitations. (1) one annotation cannot inherit another one; (2) all methods which are declared in annotation must not have parameters; (3) they should return anything, such as (String, int...), except Generic types.

<h4>Lambda</h4>

>The functional interface is an interface with one method. Lambda expressions don't work individually, they implement (define behavior) of 'abstract' method with the return type, which defined in the functional interface. Lambda block is similar to the method body and should have a return statement. Lambda expression cannot be generic, but a functional interface can be generic.  Method reference operator '::' working similar to Lambda expressions. They both just call a method\constructor\ an instance method.

<h4>Multithreading</h4>

>Used to achieve asynchronous working of the system elements. The main thread should be finished last.