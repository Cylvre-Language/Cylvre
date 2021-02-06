> **NOTE:** *As of now, Cylvre is still pre-alpha due to a few issues with the compiler. These issues will be resolved soon. If you still wish to contribute or help with these issues, feel free to follow the instructions provided in this README. If you wish to know what works currently, see [Features.md](https://github.com/Cylvre-Language/Cylvre/blob/main/Features.md)*

# Cylvre - The JVM language

<p align="center"><img src="https://github.com/Cylvre-Language/Cylvre/blob/main/Logo/Cylvre_logo_large.png" alt="logo" width="1000px" height="370px"></img></p>

Hi There! Welcome to Cylvre!

Cylvre (pronounced **Silver**) stands for **CY**ber **L**anguage for **V**irtual **R**untime **E**nvironments. It is an open-source programming language that focuses on simplicity and ease of use while leveraging the power and vast amount of libraries found on the JVM ecosystem.

**Want to read how I created Cylvre? Click [here](https://sivaxis.github.io/Posts/Creating%20Cylvre) for my `github.io` blog post on it.**  

## Prerequisites
- JDK 8 or greater
- Gradle 6.7 
- *All other dependencies will be packaged into the jar file by running* `gradle jar`

## Build and run Cylvre

#### Build
- Clone this repository
- run `gradle build` to build it and `gradle jar` to package it into an executable jar.

### Run Cylvre Programs
#### Compile
```shell 
java -classpath <path to jar file>^ CylvreCompiler.compiler.Forge <path to Cylvre file>^
```

#### Execute
```shell 
java <class file name>^
```

The jar file will be located in the `libs` directory located in the `build` folder.

_Replace '^' with appropriate info._

## Contributing
Contributions are highly valued and extremely welcome! Please see [CONTRIBUTING.md](https://github.com/Cylvre-Language/Cylvre/blob/main/CONTRIBUTING.md) for more details.

## Have any Questions?
Feel free to ask them in the Q&A Discussion [here](https://github.com/Cylvre-Language/Cylvre/discussions/3).
