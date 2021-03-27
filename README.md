> A person who finds an error is a human being,
> 
> A person who finds a solution for it is a visionary,
>  
> A person who does something about it is an entrepreneur and a person who does it in code is a developer.

# Cylvre - The JVM language

**_CYLVRE IS NOW UNMAINTAINED. THE REASON BEING THAT EVERY FIX INTRODUCED WILL CAUSE MORE FIXES THAT HINDER OTHER FIXES (MEANING NOT MUCH PROGRESS IS DONE). A BETTER VERSION OF IT, [CRYPT](https://github.com/Crypt-Language/Crypt) IS BEING CURRENTLY WORKED ON. CRYPT WILL RECYCLE MOST OF CYLVRE'S SYNTAX. SORRY TO ALL CYLVRE USERS/TESTERS._**

<p align="center"><img src="https://github.com/Cylvre-Language/Cylvre/blob/main/Logo/Cylvre_logo_large.png" alt="logo" width="1000px" height="auto"></img></p>

Hi There! Welcome to Cylvre!

Cylvre (pronounced **Silver**) stands for **CY**ber **L**anguage for **V**irtual **R**untime **E**nvironments. It is an open-source programming language that focuses on simplicity and ease of use while leveraging the power and vast amount of libraries found on the JVM ecosystem. Currently compiles to Java 8 bytecode.

**Want to read how I created Cylvre? Click [here](https://aurumbyte.github.io/Posts/Creating%20Cylvre) for my `github.io` blog post on it.**

### Why another language?

The world didn't need another langauge, I wanted it.


> **NOTE:** *As of now, Cylvre is still pre-alpha due to a few issues with the compiler. These issues will be resolved. New contributors are welcome to help develop this language. (Users and Contributors) Feel free to follow the instructions provided in this README. If you wish to know what works currently, see [Features.md](https://github.com/Cylvre-Language/Cylvre/blob/main/Features.md) for more info*

## Examples

Hello World:

```go
func main(){
  println("Hello, World!");
}
```

A `for` loop with a conditional:

```go
func main(){
  for x (0 to 100) x = 100 ? println("Loop ended (although this only works if the loop goes to 100)");
}
```

## Prerequisites
- JDK 8 or above (I used Java 15 to write Java 8 style code for the compiler)
- Gradle 6.7 
- *All other dependencies will be packaged into the jar file by running* `gradle jar`

## Documentation
Want to know more about Cylvre's syntax? Click the link for the official [Cylvre Docs](https://codeunstable.gitbook.io/cylvre-docs/)!

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

The jar file will be located in the `libs` directory located in the `build` directory.

_Replace '^' with appropriate info._

## Contributing
Contributions are highly valued and extremely welcome! Please see [CONTRIBUTING.md](https://github.com/Cylvre-Language/Cylvre/blob/main/CONTRIBUTING.md) for more details.

If you wish to report a security vulnerability, refer [SECURITY.md](https://github.com/Cylvre-Language/Cylvre/blob/main/SECURITY.md) for more info.

## Versioning
- Before v0.1.0 (pre-alpha)
- v0.1.0 to v0.5.0 (alpha)
- v0.6.0 to v.0.9.0 (beta)

Cylvre will follow the SemVer system of versioning which implies that versions are released in the following order: `major.minor.patch`.

## License
This repository follows the [MIT License](https://github.com/Cylvre-Language/Cylvre/blob/main/LICENSE).

## Creator and Major Contributors
- CodeGlytch (Creator) (formerly CodeUnstable)

## Have any Questions?
Feel free to ask them in the Q&A Discussion [here](https://github.com/Cylvre-Language/Cylvre/discussions/3).

If the compiler still doesn't work, notify me using the community gitter channel given underneath the logo in this readme.

