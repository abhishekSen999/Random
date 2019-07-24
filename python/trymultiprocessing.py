import multiprocessing
import time
import datetime
def func1():
    while(True):
        ts = time.time()
        st = datetime.datetime.fromtimestamp(ts).strftime('%H:%M:%S')
        print("func 1 after every 2 sec",st,"\n")
        time.sleep(2)

def func2():
    while(True):
        ts = time.time()
        st = datetime.datetime.fromtimestamp(ts).strftime('%H:%M:%S')
        
        print("func 2 after every 4 sec",st,"\n")
        time.sleep(4)
        

if  __name__=="__main__":
    p1=multiprocessing.Process(target=func1,args=())
    p2=multiprocessing.Process(target=func2,args=())
    p1.start()
    p2.start()

    p1.join()
    p2.join() 
    print("end")   


      
