package com.example.homeworkrecyclerview

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.homeworkrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var doingList:ArrayList<ForDoing>

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        doingList= ArrayList<ForDoing>()
        val java=ForDoing("Java",R.drawable.java,R.drawable.javajava,"Java Interview Questions","Question 1: What is Java?\n" +
                "Answer: Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible. It is a general-purpose programming language intended to let application developers write once, run anywhere (WORA), meaning that compiled Java code can run on all platforms that support Java without the need for recompilation\n\nQuestion 2: Explain the JDK, JRE, and JVM.\n" +
                "Answer:\n" +
                "\n" +
                "JVM (Java Virtual Machine): The JVM is an engine that provides a runtime environment to drive the Java Code or applications. It converts Java bytecode into machine language.\n" +
                "JRE (Java Runtime Environment): JRE is a part of software that is designed to run other software. It contains the set of libraries + other files that JVM uses at runtime.\n" +
                "JDK (Java Development Kit): The JDK is a software development environment used for developing Java applications and applets. It physically exists. It contains JRE + development tools.\n" +
                "\nQuestion 3: What are variables in Java?\n" +
                "Answer: Variables are containers for storing data values. In Java, each variable must be declared with a data type that designates the type and quantity of value it can hold. Java is a statically typed language, meaning variables must be defined before they are used.")
        val kotlin=ForDoing("Kotlin",R.drawable.koti,R.drawable.kotikoti,"Kotlin Interview Questions","1. What is Kotlin?\n" +
                "\n" +
                "Kotlin is a modern programming language developed by JetBrains. It is statically typed and runs on the Java Virtual Machine (JVM). The Kotlin language is designed to be interoperable with Java, so you can use Kotlin code alongside Java code seamlessly. Aside from Android app development, it is also used for server-side and web development.\n\n2.Explain type inference in Kotlin.\n" +
                "\n" +
                "Type inference in Kotlin allows the compiler to automatically determine the type of a variable based on its initialization value. Each time you use a variable, you don’t have to specify its type explicitly.\n\n3.What are nullable types in Kotlin?\n" +
                "\n" +
                "In Kotlin, nullable types allow variables to hold null values in addition to their regular data type values. This is in contrast to non-nullable types, which cannot hold null values by default. By using nullable types, the compiler enforces null safety and reduces the occurrence of null pointer exceptions.")
     val cplus=ForDoing("C++",R.drawable.ikic,R.drawable.cikidetails,"C++ Interview Questions","1. What is C++ and why is it used?\n" +
             "C++ is a statically typed, compiled, general-purpose programming language that supports procedural, object-oriented, and generic programming features. It's widely used for developing complex systems where hardware level manipulation is needed, such as operating systems, game engines, and enterprise software.\n\n2. What are the differences between C and C++?\n" +
             "C is primarily a procedural language, focusing on function-based programming. In contrast, C++ supports both procedural and object-oriented programming, allowing for the use of classes and objects. Additionally, C++ includes features which are not present in C.\n" +
             "\n" +
             "\n" +
             "3. What are the primitive data types in C++?\n" +
             "Primitive data types are built-in or predefined data types and can be used directly by the user to declare variables.")
       val c=ForDoing("C",R.drawable.c,R.drawable.cdetails,"C Interview Questions","1. Why is C called a mid-level programming language?\n" +
               "C has characteristics of both assembly-level i.e. low-level and higher-level languages. So as a result, C is commonly called a middle-level language. Using C, a user can write an operating system as well as create a menu-driven consumer billing system.\n\n2. What is a built-in function in C?\n" +
               "The most commonly used built-in functions in C are scanf(), printf(), strcpy, strlwr, strcmp, strlen, strcat, and many more.\n" +
               "\n" +
               "Built-function is also known as library functions that are provided by the system to make the life of a developer easy by assisting them to do certain commonly used predefined tasks. For example, if you need to print output or your program into the terminal, we use printf() in C.\n" +
               "\n\n" +
               "3. What is a Preprocessor?\n" +
               "A preprocessor is a software program that processes a source file before sending it to be compiled. Inclusion of header files, macro expansions, conditional compilation, and line control are all possible with the preprocessor.\n" +
               "\n")


doingList.add(java)
        doingList.add(kotlin)
        doingList.add(cplus)
        doingList.add(c)


        binding.recyclerView.layoutManager= LinearLayoutManager(this)
        val landmarkAdapter=AdapterClass(doingList)
        binding.recyclerView.adapter=landmarkAdapter


    }
}