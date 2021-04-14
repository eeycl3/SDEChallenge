# PaytmLabs SDE Challenge

## Coding Question

Write an interface for a data structure that can provide the moving average of the last N elements added, add elements to the structure and get access to the elements. Provide an efficient implementation of the interface for the data structure.

### Minimum Requirements

1. Provide a separate interface (IE `interface`/`trait`) with documentation for the data structure
2. Provide an implementation for the interface
3. Provide any additional explanation about the interface and implementation in a README file.

### Details

An interface called MovingAverage has been provided in coding.movingaverage package.

This interface has three functions:
1. getMovingAverage(Integer n); 

    This method calculates and return moving average of last N elements added
    Assume n is the input, we calculate the last n elements average. 

2. add(T element);
   
    add the element at the end in this data structure(list).
   
3. get(Integer index);
   
   Returns the element at the specified position in this data structure.

More details are in the MovingAverage interface.

## Design Question

Design A Google Analytic like Backend System.
We need to provide Google Analytic like services to our customers. Please provide a high level solution design for the backend system. Feel free to choose any open source tools as you want.

### Requirements

1. Handle large write volume: Billions of write events per day.
2. Handle large read/query volume: Millions of merchants wish to gain insight into their business. Read/Query patterns are time-series related metrics.
3. Provide metrics to customers with at most one hour delay.
4. Run with minimum downtime.
5. Have the ability to reprocess historical data in case of bugs in the processing logic.

### Details
More details see design directory.
