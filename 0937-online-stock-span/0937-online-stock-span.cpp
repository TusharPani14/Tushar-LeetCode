class StockSpanner {
public:
    StockSpanner() {
        
    }
    int index=0;
    stack<pair<int, int>> s;
    int next(int price) {
        while(!s.empty() && s.top().first<=price){
            s.pop();
        }
        int span = (s.empty()) ? (index + 1) : (index - s.top().second);
        s.push({price, index});
        index++;
        return span;
    }
};

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner* obj = new StockSpanner();
 * int param_1 = obj->next(price);
 */