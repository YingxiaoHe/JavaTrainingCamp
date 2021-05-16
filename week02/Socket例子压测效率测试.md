### 单线程处理请求
    λ sb -u "http://localhost:8801" -c 40 -N 30
    Starting at 2021/5/15 23:53:04
    [Press C to stop the test]
    
    3       (RPS: 0.6)                      ---------------Finished!----------------
    3       (RPS: 0.7)                      Finished at 2021/5/15 23:53:09 (took 00:00:04.6445203)
    12      (RPS: 2.6)                      Status 200:    16
    
    RPS: 15.6 (requests/second)
    Max: 68ms
    Min: 15ms
    Avg: 48.6ms
    
    50%   below 54ms
    60%   below 54ms
    70%   below 56ms
    80%   below 58ms
    90%   below 67ms
    95%   below 68ms
    98%   below 68ms
    99%   below 68ms
    99.9%   below 68ms

    RPS是15.6req/s，效率非常低

### 每次请求创建一个线程
    λ sb -u "http://localhost:8802" -c 40 -N 30
    Starting at 2021/5/15 23:58:14
    [Press C to stop the test]
    28769   (RPS: 828.6)
    ---------------Finished!----------------
    Finished at 2021/5/15 23:58:49 (took 00:00:34.8551431)
    Status 200:    28105
    Status 303:    664
    
    RPS: 924.4 (requests/second)
    Max: 121ms
    Min: 0ms
    Avg: 1ms
    
    50%   below 1ms
    60%   below 1ms
    70%   below 1ms
    80%   below 1ms
    90%   below 2ms
    95%   below 3ms
    98%   below 5ms
    99%   below 7ms
    99.9%   below 47ms

    RPS是924.4req/s，效率得到了非常明显的提升，提升了将近60倍

### 使用线程池管理请求线程
    λ sb -u "http://localhost:8803" -c 40 -N 30
    Starting at 2021/5/16 0:04:55
    [Press C to stop the test]
    29310   (RPS: 840.9)
    ---------------Finished!----------------
    Finished at 2021/5/16 0:05:30 (took 00:00:35.0633427)
    Status 200:    24405
    Status 303:    4905
    
    RPS: 939.2 (requests/second)
    Max: 104ms
    Min: 0ms
    Avg: 1.1ms
    
    50%   below 0ms
    60%   below 1ms
    70%   below 1ms
    80%   below 2ms
    90%   below 3ms
    95%   below 4ms
    98%   below 6ms
    99%   below 8ms
    99.9%   below 56ms

    比第二个例子稍微好一点