class SeatManager {
private:
    int last;
    std::priority_queue<int, std::vector<int>, std::greater<int>> pq;

public:
    SeatManager(int n) : last(0) {}

    int reserve() {
        if (pq.empty()) {
            return ++last;
        } else {
            int seat = pq.top();
            pq.pop();
            return seat;
        }
    }

    void unreserve(int seatNumber) {
        if (seatNumber == last) {
            --last;
        } else {
            pq.push(seatNumber);
        }
    }
};

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager* obj = new SeatManager(n);
 * int param_1 = obj->reserve();
 * obj->unreserve(seatNumber);
 */