from threading import Thread
import sys
import time

class MiniThread(Thread):

    def _init_(self, th_n, m):
        Thread._init_(self)
        self.th_n = th_n
        self.msg = m
      

    def run(self):
        while (self.msg):
            time.sleep(0.000001)
            self.msg -= 1

threads = int(sys.argv[1])
times = int(sys.argv[2])

for i in range(threads,0,-1):
    t = MiniThread(i, times)
    t.start()