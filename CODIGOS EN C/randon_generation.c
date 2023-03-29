#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void generate_random_array(int *array, int size, int lower_bound, int upper_bound) {
    for (int i = 0; i < size; i++) {
        array[i] = (rand() % (upper_bound - lower_bound + 1)) + lower_bound;
    }
}

int main() {
    int size = 100000; // The size of the random array
    int lower_bound = 1; // The lower bound of the random integers (inclusive)
    int upper_bound = 100; // The upper bound of the random integers (inclusive)
    
    // Seed the random number generator with the current time
    srand(time(NULL));

    int random_array[size];
    clock_t start_time=clock();
    generate_random_array(random_array, size, lower_bound, upper_bound);

    printf("Random array of size %d:\n", size);
    for (int i = 0; i < size; i++) {
        printf("%d ", random_array[i]);
    }
    printf("\n");
    clock_t time_end=clock();
    double elapsed=(double)(time_end-start_time)/CLOCKS_PER_SEC;
    printf("Elapsed time: %f s\n",elapsed);
    return 0;
}
