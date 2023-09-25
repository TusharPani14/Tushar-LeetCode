class MedianFinder {
public:
    priority_queue<double> maxheap;
    priority_queue<double,vector<double> ,greater<double>> minheap;
    MedianFinder() {
        
    }
    
    void addNum(int num) {
        maxheap.push(num);
        if(!maxheap.empty() && !minheap.empty() && maxheap.top() > minheap.top()){
            double temp = maxheap.top();
            maxheap.pop();
            minheap.push(temp);
        }
       if( maxheap.size() > minheap.size() + 1){
            double temp = maxheap.top();
            maxheap.pop();
            minheap.push(temp);
        }

        if( minheap.size() > maxheap.size()+1){
            double temp = minheap.top();
            minheap.pop();
            maxheap.push(temp);
        }
    }
    
    double findMedian() {
        if( maxheap.size() > minheap.size()) return maxheap.top();
        if( minheap.size() > maxheap.size()) return minheap.top();
        return (maxheap.top() + minheap.top())/2;
    }
};

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder* obj = new MedianFinder();
 * obj->addNum(num);
 * double param_2 = obj->findMedian();
 */