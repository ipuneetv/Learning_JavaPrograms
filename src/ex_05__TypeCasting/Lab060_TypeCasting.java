package ex_05__TypeCasting;

public class Lab060_TypeCasting {
    public static void main(String[] args) {
    long phone_no = 9876543210l;
    //short s = phone_no; // implicit ?
    short s = (short) phone_no; // Explicit Casting - Narrowing
    System.out.println(s);
/*
🧠 Step-by-step Explanation
📌 Step 1: Data Types and Sizes

| Data Type | Size    | Range                                                   |
| --------- | ------- | ------------------------------------------------------- |
| `long`    | 8 bytes | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 |
| `short`   | 2 bytes | -32,768 to 32,767                                       |

* `9876543210` is too large for a `short`, so casting will **overflow** the data.

📌 Step 2: Casting from `long` to `short`

When you do:
java
short s = (short) phone_no;

Java **takes only the last 2 bytes (16 bits)** of the `long` value — this is called **truncation** or **data overflow**.

🔢 Step 3: Understand Binary Truncation

Let’s break down `9876543210L` in binary:

* Binary (64-bit) of `9876543210` = `00000000 00000000 00000010 01010101 11101100 11011001 10100010 10101010`

Now Java will **keep only the last 2 bytes** (16 bits):

```
10100010 10101010
```

This binary is:

```
1010001010101010 → in hexadecimal: 0x16EA
```

But this is a **signed short** — so Java interprets it as a **signed 16-bit integer**:

* Decimal of `0x16EA` = `5866`

So, that's what gets printed.

✅ Final Output:
```java
System.out.println(s); // Output: 5866
```
🧠 Key Learning:
When you **cast a large number to a smaller type**, Java keeps only the **last few bytes**, and the rest is discarded. The remaining bits are interpreted as a new number (can be negative or positive depending on the sign bit).

 */
}
}
