# Advanced String Operations

This repository contains implementations of advanced string operations in Java, specifically focusing on the Knuth-Morris-Pratt (KMP) algorithm for string pattern matching and Run Length Encoding (RLE) for string compression.

## Table of Contents

- [Overview](#overview)
- [KMP Algorithm](#kmp-algorithm)
- [Run Length Encoding (RLE)](#run-length-encoding-rle)
- [Installation](#installation)
- [Usage](#usage)
- [Complexity Analysis](#complexity-analysis)
## Table of Contents

- [Overview](#overview)
- [RLE Algorithm](#rle-algorithm)
- [Installation](#installation)
- [Usage](#usage)
- [Examples](#examples)
- [Complexity Analysis](#complexity-analysis)

## Overview

This project implements two advanced string operations:

1. **Knuth-Morris-Pratt (KMP) Algorithm**: An efficient algorithm for finding occurrences of a pattern within a text.
2. **Run Length Encoding (RLE)**: A simple form of data compression that reduces the size of a string by representing consecutive characters as a single character followed by its count.

## KMP Algorithm

The KMP algorithm preprocesses the pattern to create a Longest Prefix Suffix (LPS) array, allowing for efficient searching of the pattern in the text.

### Usage

To use the KMP algorithm, call the `KMPSearch` method with the text and pattern:

```java
public static void main(String[] args) {
    String text = "ABABDABACDABABCABAB";
    String pattern = "ABABCABAB";
    KMP.KMPSearch(text, pattern);
}
```
## Run Length Encoding (RLE)
## Overview

Run Length Encoding works by scanning through a string and counting consecutive occurrences of each character. When a different character is encountered, it appends the character and its count to the output string.

### Key Features

- **Compression**: Reduces the size of strings with many consecutive characters.
- **Decompression**: Reconstructs the original string from its encoded form.

## Installation

To run the RLE implementation, ensure you have Java Development Kit (JDK) installed on your system. Follow these steps to set up your environment:
public class RLE {
    // Function to perform Run Length Encoding
    public static String runLengthEncode(String input) {
        // Implementation here
    }

    // Function to perform Run Length Decoding
    public static String runLengthDecode(String input) {
        // Implementation here
    }

    public static void main(String[] args) {
        String input = "AAAABBBCCDAA";
        String encoded = runLengthEncode(input);
        System.out.println("Encoded: " + encoded);
        
        String decoded = runLengthDecode(encoded);
        System.out.println("Decoded: " + decoded);
    }
}


1. Clone this repository:
   ```bash
   git clone https://github.com/Dennis19-2006/Advanced-String-Operations
