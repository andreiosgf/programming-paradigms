def list_sum(numbers):
    total = 0
    for number in numbers:
        total += number
    return total

# Example usage:
numbers = [1, 2, 3, 4, 5]
result = list_sum(numbers)
print(f"The sum of the numbers in the list is: {result}")