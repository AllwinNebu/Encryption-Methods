# 🔐 Encryption Methods

This repository contains implementations of various classical and modern encryption algorithms using Java and C. It is designed for educational purposes to help understand how different ciphers and encryption techniques work.

## 📚 Contents

### Classical Ciphers
- **Caesar Cipher** (`CaesarCipher.java`) – A substitution cipher that shifts letters in the alphabet.
- **Substitution Cipher** (`SubstituionCipher.java`) – Custom character mapping encryption.
- **XOR Cipher** (`XorCipher.java`) – A simple bitwise XOR operation-based cipher.
- **Hill Cipher** (`hill.c`) – A cipher based on linear algebra and matrix multiplication.

### Modern Encryption Algorithms
- **RC4** (`rc4.java`) – A stream cipher known for its speed and simplicity.
- **RSA** (`rsa.java`) – A public-key cryptographic system for secure data transmission.

### Others
- `bf.java`, `df.java`, `ds.java`, `haash.java` – Additional cipher implementations (to be documented further).
- `Operation.java` – Likely contains utility functions for encryption processes.

## 🚀 Getting Started

### Prerequisites
- Java JDK for `.java` files
- GCC or compatible C compiler for `.c` files

### Compile and Run (Examples)

**Java**
```bash
javac CaesarCipher.java
java CaesarCipher
```

**C**
```bash
gcc hill.c -o hill
./hill
```

## ✅ Recommended Improvements
- Rename `SubstituionCipher.java` to `SubstitutionCipher.java`
- Add comments and documentation to each file
- Organize code into subfolders by algorithm type
- Add sample inputs/outputs for better understanding

## 📜 License
This project is for educational use. No license currently defined — consider adding an MIT or GPL license.

## 👨‍💻 Author
[Allwin Nebu](https://github.com/AllwinNebu)

## ⚠️ Disclaimer
Use of these algorithms should be strictly for learning and authorized testing. This is not production-level cryptography.
