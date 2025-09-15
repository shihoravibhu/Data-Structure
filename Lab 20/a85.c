// 85. In an array of 20 elements, arrange 15 different values, which are generated 
// randomly between 1,00,000 to 9,99,999. Use hash function to generate key and 
// linear probing to avoid collision. H(x) = (x mod 18) + 2. Write a program to input 
// and display the final values of array. 

#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <time.h>   // for random seed

#define SIZE 20     // size of hash table

int hashSet[SIZE];

// Initialize hash table with -1 (empty slots)
void init() {
    for (int i = 0; i < SIZE; i++) {
        hashSet[i] = -1;
    }
}

// Hash function: H(x) = (x mod 18) + 2
int hashFunction(int key) {
    return (key % 18) + 2;
}

// Insert a key into hashSet
bool add(int key) {
    int index = hashFunction(key);

    // Case 1: Empty slot → insert
    if (hashSet[index] == -1) {
        hashSet[index] = key;
        return true;
    }
    // Case 2: Duplicate key → do not insert
    else if (hashSet[index] == key) {
        return false;
    }
    // Case 3: Collision → linear probing
    else {
        int i = (index + 1) % SIZE;
        for (int prob = 1; prob < SIZE; prob++) {
            if (hashSet[i] == -1) {       // found empty slot
                hashSet[i] = key;
                return true;
            }
            else if (hashSet[i] == key) { // duplicate found
                return false;
            }
            else {
                i = (i + 1) % SIZE;       // keep probing
            }
        }
    }
    return false; // table full
}

// Check if a key exists in hashSet
bool contains(int key) {
    int index = hashFunction(key);

    if (hashSet[index] == -1) {
        return false;
    }
    else if (hashSet[index] == key) {
        return true;
    }
    else {
        // Linear probing
        int i = (index + 1) % SIZE;
        for (int prob = 1; prob < SIZE; prob++) {
            if (hashSet[i] == -1) {
                return false;  // not found
            }
            else if (hashSet[i] == key) {
                return true;   // found
            }
            else {
                i = (i + 1) % SIZE;
            }
        }
    }
    return false;
}

// Print the hash table
void display() {
    printf("\nFinal Hash Table:\n");
    for (int i = 0; i < SIZE; i++) {
        if (hashSet[i] == -1)
            printf("Index %2d -> EMPTY\n", i);
        else
            printf("Index %2d -> %d\n", i, hashSet[i]);
    }
}

// Main function
int main() {
    srand(time(NULL));   // random seed
    init();

    int count = 0;
    // Insert 15 unique random numbers between 100000 and 999999
    while (count < 15) {
        int num = (rand() % (999999 - 100000 + 1)) + 100000;
        if (add(num)) {
            count++;
        }
    }

    // Example: search for a number
    if (contains(123456)) {
        printf("\n123456 -> Found!\n");
    } else {
        printf("\n123456 -> Not Found!\n");
    }

    // Display final table
    display();

    return 0;
}