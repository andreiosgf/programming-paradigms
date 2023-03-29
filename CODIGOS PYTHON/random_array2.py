import random
import time

def generate_random_array(size, lower_bound, upper_bound):
    random_array = []
    for _ in range(size):
        random_number = random.randint(lower_bound, upper_bound)
        random_array.append(random_number)
    return random_array

def main():
    size = 10000  # The size of the random array
    lower_bound = 1  # The lower bound of the random integers (inclusive)
    upper_bound = 10000  # The upper bound of the random integers (inclusive)
    started=time.time()
    random_array = generate_random_array(size, lower_bound, upper_bound)
    print(f"Random array of size {size}: {random_array}")
    ordered_random_array=sorted(random_array)
    print(f"ordered_random_array {ordered_random_array}")
    finished=time.time()
    elapsed=finished-started
    print(f"Elapsed time {elapsed} sec")
if __name__ == "__main__":
    main()