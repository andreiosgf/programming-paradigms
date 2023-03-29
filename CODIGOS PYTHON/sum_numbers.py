import time

def sum_of_numbers(n):
    sum=0
    for i in range(1,n+1):
        sum+=i
    return sum

def main():
    n=100000000
    start_time=time.time()
    sum=sum_of_numbers(n)
    end_time=time.time()
    elapsed=end_time-start_time
    print(f"Sum of numbers {sum}")
    print(f"Time: {elapsed} s")
    
if __name__=="__main__":
    main()