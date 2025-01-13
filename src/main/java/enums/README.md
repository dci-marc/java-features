# Java Features

## 1. Description

1. **Enum Constants with Properties**: Each enums constant (`RED`, `YELLOW`, `GREEN`) has associated properties, such as `durationInSeconds` and `action`.

2. **Custom Constructor**: The enums has a constructor to initialize the properties for each constant.

3. **Fields and Methods**:
    - Instance fields store the properties of each constant.
    - Getter methods allow access to these properties.

4. **Overriding `toString`**: The `toString` method provides a custom string representation for each constant.

5. **Static Methods**: The `fromAction` method demonstrates how to define a static utility method for enums.

6. **Abstract Methods and Constant-Specific Behavior**:
    - The abstract method `getAdvice` forces each constant to provide its implementation, enabling behavior specific to each constant.
    - Each constant uses an anonymous class to implement `getAdvice`.

7. **Built-in Enum Methods**:
    - `name()`: Returns the name of the enums constant.
    - `values()`: Returns all constants of the enums.

8. **Type Safety**: Enums are type-safe, meaning they can't be instantiated directly or compared with unrelated types.

## 2. Example Output

```
RED (30 seconds): Stop
Advice: Stop immediately.

YELLOW (5 seconds): Caution
Advice: Prepare to stop.

GREEN (60 seconds): Go
Advice: Proceed with caution.

From Action: GREEN (60 seconds): Go
```