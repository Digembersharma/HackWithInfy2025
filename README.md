# HackWithInfy2025 - Algorithm Solutions

This repository contains solutions for various algorithmic problems focusing on **Greedy Algorithms** and **Dynamic Programming** approaches.

## 📁 Repository Structure

```
HackWithInfy2025/
├── README.md                           # This file
├── overlepping.java                    # Activity Selection Problem (Greedy)
├── overlepping.class                   # Compiled version
├── Question_2.java                     # Knapsack Problem (Incomplete)
├── Question_3.java                     # Coin Change Problem (Greedy)
├── Question_3.class                    # Compiled version
├── question_7.java                     # Coin Change Variant
├── question_7.class                    # Compiled version
└── Dynamic_programing/                 # Dynamic Programming Solutions
    ├── coin_problem.java               # Coin Change (DP Approach)
    ├── coin_problem.class              # Compiled version
    ├── fabonacchi_seriec.java          # Fibonacci Series (DP)
    └── fabonacchi_seriec.class         # Compiled version
```

## 🎯 Problem Solutions

### 1. Activity Selection Problem (`overlepping.java`)

**Algorithm**: Greedy Approach
**Problem**: Given a set of activities with start and end times, find the maximum number of non-overlapping activities.

**Key Features**:

- Sorts activities by end time
- Uses greedy selection strategy
- Interactive input/output
- Shows selected activities

**Time Complexity**: O(n log n)
**Space Complexity**: O(1)

**Usage**:

```bash
javac overlepping.java
java overlepping
```

### 2. Coin Change Problem - Greedy (`Question_3.java`)

**Algorithm**: Greedy Approach
**Problem**: Find minimum number of coins needed to make a given amount.

**Features**:

- Uses standard coin denominations: [1, 2, 5, 10, 20, 50, 100]
- Greedy selection (largest coin first)
- Works optimally for standard coin systems

**Usage**:

```bash
javac Question_3.java
java Question_3
```

### 3. Coin Change Problem - Dynamic Programming (`Dynamic_programing/coin_problem.java`)

**Algorithm**: Dynamic Programming
**Problem**: Find minimum number of coins for any coin system (handles non-standard denominations).

**Features**:

- Bottom-up DP approach
- Handles any coin denomination system
- Returns -1 if amount cannot be made
- More robust than greedy approach

**Usage**:

```bash
cd Dynamic_programing
javac coin_problem.java
java coin_problem
```

### 4. Fibonacci Series (`Dynamic_programing/fabonacchi_seriec.java`)

**Algorithm**: Dynamic Programming
**Problem**: Calculate Fibonacci numbers efficiently.

**Features**:

- Bottom-up DP approach
- O(n) time complexity
- O(n) space complexity
- Includes sequence printing

### 5. Coin Change Variant (`question_7.java`)

**Algorithm**: Greedy Approach
**Problem**: Calculate total coins needed with custom denominations.

**Features**:

- Accepts custom coin denominations
- Single line input format
- Greedy calculation approach

## 🚀 How to Run

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Command line access

### Compilation and Execution

```bash
# For main directory files
javac filename.java
java classname

# For Dynamic Programming files
cd Dynamic_programing
javac filename.java
java classname
```

## 📊 Algorithm Comparison

| Problem                    | Greedy Approach       | Dynamic Programming |
| -------------------------- | --------------------- | ------------------- |
| **Activity Selection**     | ✅ Optimal            | ❌ Overkill         |
| **Coin Change (Standard)** | ✅ Optimal            | ✅ Optimal          |
| **Coin Change (Custom)**   | ❌ May not be optimal | ✅ Always optimal   |
| **Fibonacci**              | ❌ Not applicable     | ✅ Optimal          |

## 🔧 Key Algorithms Implemented

### Greedy Algorithms

1. **Activity Selection**: Sort by end time, select non-overlapping activities
2. **Coin Change**: Always pick the largest possible coin

### Dynamic Programming

1. **Coin Change**: Build solution bottom-up for optimal result
2. **Fibonacci**: Store previous results to avoid recalculation

## 📝 Notes

- **Question_2.java** is incomplete and needs implementation
- All `.class` files are compiled versions of corresponding `.java` files
- Dynamic Programming solutions are more robust but may have higher space complexity
- Greedy solutions are faster but may not always give optimal results

## 🤝 Contributing

Feel free to:

- Complete the incomplete solutions
- Add more test cases
- Optimize existing algorithms
- Add new problem solutions

## 📚 Learning Resources

- **Greedy Algorithms**: Problems where local optimal choices lead to global optimum
- **Dynamic Programming**: Break problems into overlapping subproblems
- **Time/Space Complexity**: Always consider trade-offs between time and space

---

**Author**: Digember Sharma
**Repository**: [HackWithInfy2025](https://github.com/Digembersharma/HackWithInfy2025.git)
**Event**: Hack With Infy 2025
