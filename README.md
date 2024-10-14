
# CENG Projects Repository

This repository is created to load all of my projects related to CENG (Computer Engineering) lessons and homework. Additionally, I will upload all my projects here so that everyone can benefit from them.

[Click to see the problem sets](https://drive.google.com/drive/folders/1m0lH5vXbAIGT9aHngYu0tsIFHtyXhX_V)

## Visitor Notice

If you are new to the programming world, the structure and folder organization may seem complex at first. However, you do not need to understand every line of code. This documentation is provided exactly for you! Here, you can see which areas are of interest to you, so let’s dive in.

To contribute to my code, follow the instructions under the "For Contribution" section below.

---

## 1. Folder Structure

In this repository, you will find multiple projects grouped into different folders. Navigate to the `/src/projects` folder to see the various projects organized as separate folders. Each folder represents a single project that is independent of the others and does not import from one another.

---

## 2. Project Structure

Each project has a starting point — a `.java` file named `'<projectname>App'`. This file is similar to the `Main` class in standard Java applications. The project starts execution from this file.

For example, in the `'<projectname>App'` file, you will see something like:

```java
public class '<projectname>App' extends DemoApp
```

Extending the `DemoApp` class is mandatory to designate the main class of the project. After extending it, click the 'Implement methods' option. This will create a method with the signature:

```java
@Override
protected void program(){
}
```

This method works similarly to the `main` method in other Java programs. The backend process begins execution here.

Also, you might see a constructor like this:

```java
public '<projectname>App'() {
    super("Temperature Conversion Program");
}
```

This optional code specifies the project's name.

Lastly, to facilitate input operations with the `Scanner` class, I’ve already included it in the `DemoApp` class. You can use it simply by typing `scanner.<method>()` without needing to create another instance.

---

## 3. Running a Project

In the `Main.java` file, you’ll find code like this:

```java
(new TemperatureConversionApp()).run();
```

This might look a bit complex but it’s equivalent to:

```java
TemperatureConversionApp temperatureConversionApp = new TemperatureConversionApp();
temperatureConversionApp.run();
```

You can run any project this way. Feel free to add your own projects or try out the built-in ones by adding a line like:

```java
(new DollarConversionApp()).run();
```

---

## For Contribution

To contribute to this repository, follow these steps:

1. **Fork the Repository**: Click on the fork button at the top right of this repository. This will create a copy of the project under your GitHub account.

2. **Clone Your Fork**: Clone the repository to your local machine by running the following command:
   
   ```bash
   git clone https://github.com/Dagbfatih/ceng113_lesson_demos.git
   ```

3. **Create a New Branch**: Before making any changes, create a new branch for your feature or fix:
   
   ```bash
   git checkout -b feature/new-feature
   ```

4. **Make Your Changes**: Implement your changes or improvements in the project.

5. **Commit Your Changes**: Once you've made your changes, commit them:
   
   ```bash
   git add .
   git commit -m "Add new feature"
   ```

6. **Push Your Changes**: Push the changes to your forked repository:
   
   ```bash
   git push origin feature/new-feature
   ```

7. **Create a Pull Request**: Go to the original repository and create a Pull Request (PR) from your fork. Describe your changes and wait for them to be reviewed.

---

Feel free to explore and learn from the projects or contribute new features and improvements!
