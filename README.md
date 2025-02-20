# Gradle Cleaner Script

## Description
This repository contains a Kotlin script designed to help developers maintain their projects by searching for all `.gradle` directories within a specified directory and deleting their contents. This can be useful for cleaning up build artifacts and dependencies, ensuring a fresh start for builds.

## Features
- **Recursive Directory Search**: The script searches through the specified directory and all its subdirectories to find `.gradle` folders.
- **Content Deletion**: Once a `.gradle` directory is found, the script deletes its contents without removing the directory itself.
- **User-Friendly Output**: Provides clear console output to inform the user of which directories were found and cleaned.

## Usage

### Prerequisites
Ensure you have Kotlin installed on your machine.

### Running the Script

#### Clone the repository:
```bash
git clone https://github.com/your-username/gradle-cleaner-script.git
```

#### Navigate to the project directory:
```bash
cd gradle-cleaner-script
```

#### Open the `Main.kt` file and modify the `startDirectoryPath` variable to the path where you want to start the search:
```kotlin
val startDirectoryPath = "C:\ruta\a\tu\directorio"
```

#### Compile and run the script using Kotlin:
```bash
kotlinc Main.kt -include-runtime -d Main.jar
java -jar Main.jar
```

### Example Output
When you run the script, it will list all the `.gradle` directories found and delete their contents. The output will look like this:
```
.gradle directories found and contents deleted:
C:ruta\directorio\.gradle
C:ruta\directorio\subcarpeta\.gradle
Contents of .gradle directory deleted: C:ruta	u\directorio\.gradle
Contents of .gradle directory deleted: C:ruta\directorio\subcarpeta\.gradle
```

## Contributing
We welcome contributions! Please follow these steps to contribute:

1. Fork the repository.
2. Create a new branch:
    ```bash
    git checkout -b feature-branch
    ```
3. Make your changes and commit them:
    ```bash
    git commit -m "Add new feature"
    ```
4. Push to the branch:
    ```bash
    git push origin feature-branch
    ```
5. Open a pull request.
