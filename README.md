# Learn Project

This project based on the "Java The Complete Reference, 8th Edition" and on the HackeRrank.com exercise / topics.

# Structure of the Project

    └── src
        └── main
           └── java 
              ├── AbstractDemo
              │    ├── AbstractAreas                             #
              │    └── AbstractDemo                              #
              ├── AnnotationDemo
              │    ├── Marker                                    #Annotation Marker  
              │    ├── Meta                                      #@Retention annotation with Reflection
              │    ├── Meta1                                     #@Retention annotation with Reflection
              │    ├── RepeatAnno                                #@Repeatable annotation
              │    ├── Single                                    #@Single annotation
              │    └── TypeAnnoDemo                              #@Type annotations (@Target(ElementType.*))
              ├── ArityDemo
              │    ├── ArityMethods                              #
              │    └── ArityMethodsWithOverloadingMethod         #
              ├── AssertDemo
              │    └── AssertDemo                                #Keyword 'assert'
              ├── EnumDemo
              │    ├── AskMe                                     #
              │    ├── EnumDemo                                  #
              │    ├── EnumDemo1                                 #
              │    └── EnumDemo2                                 #
              ├── GenericDemo
              │    ├── BoundsDemo                                #Restrict a generic type
              │    ├── GenDemo                                   #Generic type, '<T>'
              │    └── SimpGen                                   #Two generic types, '<T, E>'
              ├── InheritanceDemo
              │    ├── InheritanceBoxExample                     #
              │    ├── SimpleInheritance                         #
              │    └── SimpleOverride                            #
              ├── InterfaceDemo
              │    ├── AskMe                                     #
              │    ├── IFExtends                                 #
              │    ├── IfTest                                    #
              │    ├── IFExtends2                                #
              │    ├── IFExtends3                                #
              │    ├── InterfDemo                                #
              │    └── NestedIfDemo                              #
              ├── ReaderDemo
              │    ├── BRRead                                    #BufferedReader with reader() method
              │    ├── BRReadLines                               #BufferedReader with readLine() method
              │    ├── BRReadLines1                              #BufferedReader with readLine() method
              │    ├── PrintWriterDemo                           #PrintWriter with println() method
              │    └── ShowFile                                  #FileInputStream
              ├── ThisDemo
              │    └── MyClass                                   #Overloaded constructors with keyword 'this'
              ├── ThreadDemo 
              │    ├── CurrentTreadDemo                          #
              │    ├── DeadLock                                  #
              │    ├── DemoJoin                                  #
              │    ├── MultiThreadDemo                           #
              │    ├── PC                                        #
              │    ├── SuspendResume                             #
              │    ├── Synch                                     #
              │    └── ThreadDemo                                #
              └── hackerrank
                   ├── Currency_Formatter
                   ├── Date_and_Time
                   ├── Day_2_Operators
                   ├── Fibonacci
                   ├── Java_Datatypes
                   ├── Java_End_of_file
                   ├── Java_Loops_I
                   ├── Java_Loops_II
                   ├── Java_Output_Formatting
                   ├── Logical_Op_Table
                   ├── Sock_Merchant
                   ├── Static_Initializer_Block
                   ├── Strings
                   ├── TelnetClient
                   ├── Two_D_Massive
                   └── compareTriplets   


# Brief notes

<b>Enum</b>

>Enum - a special type of class, with constant/final variables. There is no way to create a new instance of enum class by using "new". Enum class cannot be a superclass and cannot inherit from other class

<b>Generics</b>

>Generic allows using any type of data for the object.  A generic type can be restricted, by type of class or/and one to many interface types (by using logical operator AND).