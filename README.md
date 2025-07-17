Spring XML Bean Configuration Demo
This repository demonstrates different ways to configure and inject dependencies in a Spring application using XML-based bean definitions.

Requirements
Java (8 or above)

Maven or Gradle (for building projects)

Spring Framework

Project Structure
src/main/java/com/ram/Alien.java: The main class used for demonstrating dependency injection.

src/main/java/com/ram/Laptop.java: A dependency class.

src/main/java/com/ram/Desktop.java: Another dependency class.

src/main/resources/beans.xml: The Spring XML configuration file (as shown below).

beans.xml Overview
This file demonstrates several forms of bean configuration and injection:

Prototype Scope

Autowiring by Type and Name

Constructor injection (by index, name, and type)

Setter injection

Specifying primary beans

Handling multiple beans of the same type

Each block in the XML file is commented for easy usage. To experiment with a particular injection technique, simply uncomment the relevant section.

Usage
Clone the Repository

bash
git clone <your-repo-url>
cd <repo-directory>
Review and Modify beans.xml

Open src/main/resources/beans.xml.

Uncomment only the injection approach you want to try (one alien bean configuration at a time).

Supporting beans com, desk, and lap are provided for flexible wiring.

Run the Application

Make sure your Spring context loads beans.xml, for example in a test:

java
ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
Alien alien = (Alien) context.getBean("alien");
alien.show();
Adapt as needed for your project structure.

Example: Setter Injection
To use setter injection, uncomment:

xml
<bean id="alien" class="com.example.Alien">
<property name="age" value="21"/>
<property name="laptop" ref="lap"/>
</bean>
...and comment other <bean id="alien"...> blocks.

Example: Constructor Injection by Index
To use constructor injection, uncomment:

xml
<bean id="alien" class="com.example.Alien">
<constructor-arg index="0" ref="lap"/>
<constructor-arg index="1" value="21"/>
</bean>
Supporting Beans
These are available for wiring in all scenarios:

xml
<bean id="com" class="com.example.Laptop" primary="true"/>
<bean id="desk" class="com.example.Desktop"/>
<bean id="lap" class="com.example.Laptop"/>
Tips
Only one <bean id="alien"> should be active at any time.

Add or edit beans as required for advanced scenarios.

For constructor injection by name, ensure you annotate the Java constructor with @ConstructorProperties.