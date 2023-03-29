import random

def generate_random_array(size, lower_bound, upper_bound):
    random_array = []
    for _ in range(size):
        random_number = random.randint(lower_bound, upper_bound)
        random_array.append(random_number)
    return random_array

def main():
    size = 10  # The size of the random array
    lower_bound = 1  # The lower bound of the random integers (inclusive)
    upper_bound = 100  # The upper bound of the random integers (inclusive)
    
    random_array = generate_random_array(size, lower_bound, upper_bound)
    print(f"Random array of size {size}: {random_array}")

if __name__ == "__main__":
    main()