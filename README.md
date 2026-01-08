<div align="center">
  <br />
    <img src="https://img.shields.io/badge/-Java-black?style=for-the-badge&logo=java&logoColor=white&color=E76F00" alt="Java" />
    <img src="https://img.shields.io/badge/-Algorithms-black?style=for-the-badge&logo=leetcode&logoColor=white&color=black" alt="Algorithms" />
    <img src="https://img.shields.io/badge/-Data_Structures-black?style=for-the-badge&logo=codeforces&logoColor=white&color=1F8ACB" alt="Data Structures" />
    <img src="https://img.shields.io/badge/-CLI-black?style=for-the-badge&logo=gnu-bash&logoColor=white&color=4EAA25" alt="CLI" />
  <br />

  <h3 align="center">🗜️ Huffman File Compression & Decompression System</h3>

  <div align="center">
    A <b>lossless file compression system</b> implemented in Java using the Huffman Encoding algorithm. <br />
    Supports text and binary files (.txt, .png, .pdf) with custom bit-level manipulation.
  </div>
</div>

---

## Table of Contents

1.  [Project Overview](#project-overview)
2.  [Key Features](#key-features)
3.  [What is Huffman Encoding?](#what-is-huffman-encoding)
4.  [Project Architecture](#project-architecture)
5.  [Technologies Used](#technologies-used)
6.  [How to Run](#how-to-run-the-project)
7.  [Author](#author)

---

##  Project Overview

This project is a **lossless file compression and decompression system** built from scratch in Java. It utilizes the **Huffman Encoding algorithm** to reduce file sizes by assigning shorter binary codes to frequently occurring bytes and longer codes to less frequent ones.

Unlike simple text-only compressors, this system handles **binary files** (images, PDFs, executables) by implementing custom bit-level input/output streams, ensuring optimal compression without any data loss.

---

## Key Features 

✅ **Lossless Compression**: Reduces file size without losing any data quality. 
✅ **Binary File Support**: Works on `.txt`, `.png`, `.jpg`, `.pdf`, etc.  
✅ **Custom Bit Manipulation**: Implements `BitInputStream` and `BitOutputStream` for precise read/write operations.  
✅ **Exact Restoration**: Automatic decompression guarantees the output file is identical to the source.  
✅ **Command-Line Interface (CLI)**: Simple and efficient terminal-based usage.  
✅ **Interview Ready**: Demonstrates deep understanding of Greedy Algorithms, Heaps, and Trees.

---

##  What is Huffman Encoding?

**Huffman Encoding** is a popular **greedy algorithm** used for lossless data compression.

1.  **Frequency Analysis**: It counts how often each byte appears in the file.
2.  **Tree Construction**: It builds a binary tree where frequent characters are near the top (short paths) and rare characters are at the bottom (long paths).
3.  **Code Generation**: It generates unique binary prefix codes based on the tree paths.

> **Real-world usage:** This algorithm is the core concept behind **ZIP**, **GZIP**, **PNG**, and **JPEG** compression standards.



---

## Project Architecture

```text
HuffmanCompressionJava/
│
├── HuffmanNode.java          # Tree node representation (stores character & frequency)
├── HuffmanTree.java          # Builds the Huffman Tree (Priority Queue implementation)
├── HuffmanEncoder.java       # Generates prefix codes from the tree
├── HuffmanDecoder.java       # Traverses tree to decode compressed bits
├── BitOutputStream.java      # Writes individual bits (buffer management)
├── BitInputStream.java       # Reads individual bits from file
├── FileCompressor.java       # High-level logic for compressing files
├── FileDecompressor.java     # High-level logic for decompressing files
├── Main.java                 # CLI Entry point
│
├── input.txt                 # Sample input file
├── output.huff               # Compressed binary file
└── README.md
```

##  Technologies Used

- **Language:** Java (JDK 8+)
- **Core Concepts:**
  - **Data Structures:** Priority Queue (Min-Heap), Binary Tree, Hash Maps.
  - **Algorithms:** Greedy Algorithms.
  - **System:** File I/O (`FileInputStream` / `FileOutputStream`).
  - **Low-Level:** Bit Manipulation (shifting and masking).
  - **Design:** Object-Oriented Programming (OOP).



##  How to Run the Project

### ✅ Prerequisites
- Java JDK 8 or higher installed.
- Command Prompt / Terminal.

### Step 1: Compile the Project
Open your terminal in the project directory and run:

```bash
javac *.java

```

### Step 2: Compress a File
To compress a file (e.g., input.txt or image.png):

```bash
java Main compress input.txt output.huff
```

Result: Creates a smaller output.huff file.

### Step 3: Decompress the File
To restore the original file from the compressed version:

```bash
java Main decompress output.huff restored_input.txt
```

Result: restored_input.txt will be identical to the original input.txt.

##  Author

**Akash Odedara**

MSc IT | Java Developer | Algorithms Enthusiast

🔗 [LinkedIn](https://www.linkedin.com/in/akashodedara3328)  
📁 [GitHub Projects](https://github.com/Akash3328)