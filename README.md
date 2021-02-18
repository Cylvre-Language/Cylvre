
> **NOTE:** *As of now, Cylvre is still pre-alpha due to a few issues with the compiler. These issues will be resolved. If you wish to contribute or help with these issues, feel free to follow the instructions provided in this README. If you wish to know what works currently, see [Features.md](https://github.com/Cylvre-Language/Cylvre/blob/main/Features.md)*

# Cylvre - The JVM language

[![Gitter](https://badges.gitter.im/Cylvre/community.svg)](https://gitter.im/Cylvre/community?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge)
![](https://img.shields.io/github/license/Cylvre-Language/Cylvre)
![](https://img.shields.io/maintenance/yes/2021)
![](https://www.travis-ci.com/Cylvre-Language/Cylvre.svg?branch=main)
<!-- ![](https://img.shields.io/github/stars/Cylvre-Language/Cylvre) -->

<p align="center"><img src="https://github.com/Cylvre-Language/Cylvre/blob/main/Logo/Cylvre_logo_large.png" alt="logo" width="1000px" height="auto"></img></p>

Hi There! Welcome to Cylvre!

Cylvre (pronounced **Silver**) stands for **CY**ber **L**anguage for **V**irtual **R**untime **E**nvironments. It is an open-source programming language that focuses on simplicity and ease of use while leveraging the power and vast amount of libraries found on the JVM ecosystem.

**Want to read how I created Cylvre? Click [here](https://sivaxis.github.io/Posts/Creating%20Cylvre) for my `github.io` blog post on it.**  

## Prerequisites
- JDK 8 and above
- Gradle 6.7 
- *All other dependencies will be packaged into the jar file by running* `gradle jar`

## Documentation
Want to know more about Cylvre's syntax? Click the link for the official [Cylvre Docs](https://sivaxis.gitbook.io/cylvre-docs/)!

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
This repository follows the [GNU General Public License v3.0](https://github.com/Cylvre-Language/Cylvre/blob/main/LICENSE).

## Have any Questions?
Feel free to ask them in the Q&A Discussion [here](https://github.com/Cylvre-Language/Cylvre/discussions/3).

