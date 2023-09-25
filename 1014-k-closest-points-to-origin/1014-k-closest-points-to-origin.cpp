class Solution {
public:
    class Cord {
    public:
        int id;
        int x;
        int y;
        Cord(int x, int y) { 
            this->x=x; 
            this->y=y; 
        }
        int dist() const{
            return x*x+y*y;
        }
    }; 
    static bool cordCompare(const Cord &a, const Cord &b){
        return a.dist()<b.dist();
    }
    vector<vector<int>> kClosest(vector<vector<int>>& points, int k) {
        priority_queue<Cord, vector<Cord>, decltype(&cordCompare)> heap(cordCompare);
        for (int i = 0; i < k; i++) {
            Cord cord(points[i][0], points[i][1]);
            heap.push(cord);
        }
        for(int i=k;i<points.size();i++){
            Cord cord(points[i][0], points[i][1]);
            if(cord.dist()<heap.top().dist()){
                heap.pop();
                heap.push(cord);
            }
        }
        vector<vector<int>> result;
        while (!heap.empty()) {
            Cord cord = heap.top();
            heap.pop();
            result.push_back({cord.x, cord.y});
        }
        
        return result;
    }
};