text
<!-- README.md - Dashing Spring Dependency Injection Example -->

<h1 align="center" style="color:#4F8EF7; font-size:2.5em;">
   Spring XML Dependency Injection Playground 
</h1>

<p align="center" style="font-size:1.2em; color:#555;">
  <b>Master classic Spring DI</b> with this easy-to-experiment, interface-driven example featuring XML configuration.<br>
  <i>Swap beans, play with scopes, and learn autowiring – all in one place!</i>
</p>

<hr style="border:1px solid #eaeaea;" />

<h2 style="color:#4F8EF7;">📂 Structure Overview</h2>

src/
main/
java/com/ram/
App.java - Application entry
Alien.java - Spring bean, depends on Computer
Computer.java - Interface for Laptop & Desktop
Laptop.java - Implements Computer
Desktop.java - Implements Computer
resources/
spring.xml - All DI config fun happens here!

text

<h2 style="color:#4F8EF7;">✨ Features</h2>
<ul>
  <li>Shows all core DI types: <b>setter</b>, <b>constructor</b>, <b>autowire by type/name</b>, <b>prototype/singleton scope</b></li>
  <li>Uses interfaces for clean, flexible wiring</li>
  <li>Clear in-code & in-XML comments for easy toggling</li>
  <li>Minimal, focused Java files – perfect for learning Spring's fundamentals</li>
</ul>

<h2 style="color:#4F8EF7;">💡 Usage</h2>

<ol>
  <li>
    <b>Clone this repository:</b><br>
    <pre><code>git clone https://github.com/rakeshullengula56/SpringFramework.git
cd Spring1</code></pre>
  </li>
  <li>
    <b>Open <code>spring.xml</code> and try an injection style!</b><br>
    Uncomment one <code>&lt;bean id="alien" ...&gt;</code> section to experiment.<br>
    <details>
      <summary><b>Example: Setter Injection (By Type)</b> <em>(click to expand)</em></summary>
      <pre>
<code>&lt;bean id="alien" class="com.ram.Alien" autowire="byType"&gt;
    &lt;property name="age" value="21"/&gt;
&lt;/bean&gt;
&lt;bean id="com" class="com.ram.Laptop" primary="true"/&gt;
&lt;bean id="desk" class="com.ram.Desktop"/&gt;
</code>
      </pre>
    </details>
  </li>
  <li>
    <b>Run it:</b><br>
    (Use your favorite IDE or the command line. Make sure <code>spring.xml</code> is on the classpath!)
    <pre>
<code>mvn compile
mvn exec:java -Dexec.mainClass="com.ram.App"</code>
    </pre>
    Or, just run <b>App.java</b> in your IDE. Output will show bean wiring in action!
  </li>
</ol>

<hr style="border-top:1px dashed #bbb;"/>

<h2 style="color:#4F8EF7;">📝 Main Code Files</h2>

<details>
  <summary><b>App.java</b> (entry point)</summary>

package com.ram;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
public static void main(String[] args) {
ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
Alien obj1 = context.getBean("alien", Alien.class);
System.out.println(obj1.getAge());
obj1.code();
}
}

text
</details>

<details>
  <summary><b>Alien.java</b></summary>

package com.ram;

public class Alien {
private int age;
private Computer com; // Interface for flexible injection

text
public Alien() {}

public void setCom(Computer com) { this.com = com; }
public Computer getCom() { return com; }

public void setAge(int age) { this.age = age; }
public int getAge() { return age; }

public void code() {
System.out.println("Coding....");
com.compile();
}
}

text
</details>

<details>
  <summary><b>Computer.java</b></summary>

package com.ram;

public interface Computer {
void compile();
}

text
</details>

<details>
  <summary><b>Laptop.java</b></summary>

package com.ram;

public class Laptop implements Computer {
@Override
public void compile() {
System.out.println("compiling in laptop");
}
}

text
</details>

<details>
  <summary><b>Desktop.java</b></summary>

package com.ram;

public class Desktop implements Computer {
@Override
public void compile() {
System.out.println("compiling in desktop");
}
}

text
</details>

<details>
  <summary><b>spring.xml (main DI config)</b></summary>

<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

text
<!-- === PROTOTYPE SCOPE EXAMPLE === -->
<!-- <bean id="alien1" class="com.ram.Alien" scope="prototype"/> -->

<!-- === SETTER INJECTION - ByType (Recommended!) === -->
<bean id="alien" class="com.ram.Alien" autowire="byType">
    <property name="age" value="21"/>
</bean>

<!-- === AUTOWIRE BY NAME (for multiple Computer beans; disables byType) === -->
<!--
<bean id="alien" class="com.ram.Alien" autowire="byName">
    <property name="age" value="21"/>
    <property name="com" ref="com"/>
</bean>
-->

<!-- === CONSTRUCTOR INJECTION (index/name/type) === -->
<!-- Add suitable constructor in Alien.java to try this! -->

<!-- Supporting beans -->
<bean id="com" class="com.ram.Laptop" primary="true"/>
<bean id="desk" class="com.ram.Desktop"/>
</beans> ``` </details> <hr style="border-top:1px solid #eaeaea;"/> <h2 style="color:#4F8EF7;">💬 Tips & Experiments</h2> <ul> <li>Try changing <b>primary="true"</b> to <b>Desktop</b> to see Alien code on a different system;</li> <li>Switch between <b>singleton</b> and <b>prototype</b> on the Alien bean and print references to see Spring's scope magic!</li> <li>Add constructor injection to <b>Alien.java</b> and play with <b>constructor-arg</b> blocks in XML.</li> </ul> <p align="center" style="color:#4F8EF7;font-size:1.4em;"> 🔥 <b>Experiment. Learn. Master Spring!</b> 🔥 </p> ```